#!/usr/bin/env python3
"""Compare the published documentation with the files built for deployment."""

import argparse
import hashlib
import json
import sys
import time
import urllib.error
import urllib.parse
import urllib.request
from pathlib import Path


def manifest(site, versions):
  paths = ["versions.html", "index.html"]
  for version in versions:
    if not version:
      continue
    if not version.startswith("v") or "/" in version or "\\" in version:
      raise ValueError(f"Invalid version directory: {version!r}")
    paths.append(f"{version}/index.html")
  return {
      path: hashlib.sha256((site / path).read_bytes()).hexdigest()
      for path in dict.fromkeys(paths)
  }


def verify(url, checks, timeout=300, retry_delay=10):
  if not checks:
    raise ValueError("Expected content checks must not be empty")
  deadline = time.monotonic() + timeout
  while True:
    try:
      for path, expected in checks.items():
        remaining = deadline - time.monotonic()
        if remaining <= 0:
          raise TimeoutError("Verification deadline reached")
        target = (
            f"{url.rstrip('/')}/{urllib.parse.quote(path)}"
            f"?verify={time.time_ns()}"
        )
        request = urllib.request.Request(target, headers={
            "Cache-Control": "no-cache",
            "User-Agent": "Apollo-OpenAPI-deployment-verification",
        })
        with urllib.request.urlopen(request, timeout=min(20, remaining)) as response:
          actual = hashlib.sha256(response.read()).hexdigest()
        if actual != expected:
          raise ValueError(f"{path}: expected SHA-256 {expected}, got {actual}")
      print(f"Verified {len(checks)} published files at {url}", flush=True)
      return
    except (OSError, ValueError) as error:
      if isinstance(error, urllib.error.HTTPError):
        error.close()
      remaining = deadline - time.monotonic()
      if remaining <= 0:
        raise RuntimeError(f"Published documentation did not match: {error}") from error
      print(f"Waiting for published content: {error}", flush=True)
      time.sleep(min(retry_delay, remaining))


def main():
  parser = argparse.ArgumentParser(description=__doc__)
  commands = parser.add_subparsers(dest="command", required=True)
  record = commands.add_parser("manifest")
  record.add_argument("site", type=Path)
  record.add_argument("--version", action="append", default=[])
  check = commands.add_parser("verify")
  check.add_argument("--url", required=True)
  check.add_argument("--checks", required=True)
  check.add_argument("--timeout", type=float, default=300)
  args = parser.parse_args()
  try:
    if args.command == "manifest":
      print("checks=" + json.dumps(manifest(args.site, args.version), separators=(",", ":")))
    else:
      verify(args.url, json.loads(args.checks), timeout=args.timeout)
  except (OSError, ValueError, RuntimeError) as error:
    print(str(error), file=sys.stderr)
    return 1
  return 0


if __name__ == "__main__":
  sys.exit(main())
