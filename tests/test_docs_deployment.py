import contextlib
import gzip
import hashlib
import http.server
import importlib.util
import io
import tempfile
import threading
import unittest
from pathlib import Path
from urllib.parse import urlsplit


SCRIPT = Path(__file__).resolve().parents[1] / "scripts" / "verify-docs.py"
SPEC = importlib.util.spec_from_file_location("verify_docs", SCRIPT)
DOCS = importlib.util.module_from_spec(SPEC)
SPEC.loader.exec_module(DOCS)


class DocsDeploymentTest(unittest.TestCase):

  @contextlib.contextmanager
  def server(self, response):
    class Handler(http.server.BaseHTTPRequestHandler):
      def do_GET(self):
        result = response(urlsplit(self.path).path)
        status, body = result[:2]
        self.send_response(status)
        for key, value in (result[2] if len(result) > 2 else {}).items():
          self.send_header(key, value)
        self.end_headers()
        self.wfile.write(body)

      def log_message(self, *args):
        pass

    server = http.server.ThreadingHTTPServer(("127.0.0.1", 0), Handler)
    thread = threading.Thread(target=server.serve_forever, kwargs={"poll_interval": 0.01})
    thread.start()
    try:
      yield f"http://127.0.0.1:{server.server_port}"
    finally:
      server.shutdown()
      server.server_close()
      thread.join()

  def check(self, url, files, timeout=0.2):
    hashes = {path: hashlib.sha256(body).hexdigest() for path, body in files.items()}
    with contextlib.redirect_stdout(io.StringIO()):
      DOCS.verify(url, hashes, timeout=timeout, retry_delay=0.01)

  def test_matching_site_passes(self):
    files = {"versions.html": b"v0.3.12", "index.html": b"latest",
             "v0.3.12/index.html": b"latest"}
    with self.server(lambda path: (200, files[path.lstrip("/")])) as url:
      self.check(url, files)

  def test_stale_successful_http_response_fails(self):
    with self.server(lambda path: (200, b"v0.3.11")) as url:
      with self.assertRaisesRegex(RuntimeError, "did not match"):
        self.check(url, {"versions.html": b"v0.3.12"})

  def test_compressed_content_is_checked_after_decompression(self):
    with self.server(lambda path: (200, gzip.compress(b"v0.3.12"),
                                   {"Content-Encoding": "gzip"})) as url:
      self.check(url, {"versions.html": b"v0.3.12"})

  def test_stale_next_fails_when_release_content_is_current(self):
    files = {"versions.html": b"versions", "index.html": b"release",
             "next/index.html": b"new next"}

    def response(path):
      return 200, b"old next" if path == "/next/index.html" else files[path.lstrip("/")]

    with self.server(response) as url:
      with self.assertRaises(RuntimeError):
        self.check(url, files)

  def test_missing_release_page_fails(self):
    def response(path):
      if path == "/versions.html":
        return 200, b"v0.3.12"
      return 404, b"not found"

    with self.server(response) as url:
      with self.assertRaises(RuntimeError):
        self.check(url, {"versions.html": b"v0.3.12", "v0.3.12/index.html": b"release"})

  def test_retries_until_new_content_is_served(self):
    requests = []

    def response(path):
      requests.append(path)
      return 200, b"old" if len(requests) == 1 else b"new"

    with self.server(response) as url:
      self.check(url, {"versions.html": b"new"})
    self.assertGreaterEqual(len(requests), 2)

  def test_retries_truncated_http_response(self):
    requests = []

    def response(path):
      requests.append(path)
      if len(requests) == 1:
        return 200, b"partial", {"Content-Length": "100"}
      return 200, b"complete"

    with self.server(response) as url:
      self.check(url, {"index.html": b"complete"})
    self.assertGreaterEqual(len(requests), 2)

  def test_manifest_checks_latest_and_older_release_separately(self):
    with tempfile.TemporaryDirectory() as directory:
      site = Path(directory)
      files = {"versions.html": b"versions", "index.html": b"latest",
               "next/index.html": b"unreleased",
               "v0.4.0/index.html": b"latest", "v0.3.12/index.html": b"older"}
      for path, content in files.items():
        target = site / path
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_bytes(content)
      checks = DOCS.manifest(site, ["v0.4.0", "v0.3.12", ""])
      self.assertEqual(set(files), set(checks))
      self.assertEqual(checks["index.html"], checks["v0.4.0/index.html"])
      self.assertNotEqual(checks["index.html"], checks["v0.3.12/index.html"])
      with self.assertRaises(FileNotFoundError):
        DOCS.manifest(site, ["v0.5.0"])


if __name__ == "__main__":
  unittest.main()
