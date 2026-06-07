import subprocess
import unittest
from pathlib import Path


GENERATED_PREFIXES = (
    "java-client/",
    "python/",
    "typescript/",
    "rust/",
    "spring-boot2/",
    "templates/python/",
)


class GenerationWorkflowTest(unittest.TestCase):

  def setUp(self):
    self.repo_root = Path(__file__).resolve().parents[1]

  def test_generated_source_trees_are_not_tracked(self):
    tracked_files = subprocess.check_output(
        ["git", "ls-files"], cwd=self.repo_root, text=True).splitlines()

    tracked_generated_files = [
        path for path in tracked_files
        if path.startswith(GENERATED_PREFIXES)
    ]

    self.assertEqual([], tracked_generated_files)

  def test_generate_script_uses_ignored_portal_generation_output(self):
    generate_script = (self.repo_root / "generate.sh").read_text(encoding="utf-8")
    clean_script = (self.repo_root / "clean.sh").read_text(encoding="utf-8")
    gitignore = (self.repo_root / ".gitignore").read_text(encoding="utf-8")

    self.assertIn("OPENAPI_GENERATOR_VERSION=\"7.20.0\"", generate_script)
    self.assertIn("GENERATED_ROOT=\"build/generated\"", generate_script)
    self.assertIn("PORTAL_OUTPUT_DIR=\"$GENERATED_ROOT/portal\"", generate_script)
    self.assertIn("--verify", generate_script)
    self.assertIn("build/generated/", clean_script)
    self.assertIn("build/generated/", gitignore)
    self.assertNotIn("java-client", clean_script)
    self.assertNotIn("typescript", clean_script)


if __name__ == "__main__":
  unittest.main()
