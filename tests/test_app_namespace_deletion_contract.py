import unittest
from pathlib import Path

import yaml


SPEC_FILES = (
    "apollo-openapi.yaml",
)

APP_NAMESPACE_PATH = "/openapi/v1/apps/{appId}/appnamespaces/{namespaceName}"
EXCEPTION_RESPONSE = "#/components/schemas/ExceptionResponse"


class AppNamespaceDeletionContractTest(unittest.TestCase):

  def setUp(self):
    self.repo_root = Path(__file__).resolve().parents[1]

  def _load_spec(self, spec_file):
    return yaml.safe_load((self.repo_root / spec_file).read_text(encoding="utf-8"))

  def test_delete_app_namespace_documents_missing_and_incomplete_deletion(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)
      operation = spec["paths"][APP_NAMESPACE_PATH]["delete"]

      with self.subTest(spec=spec_file):
        self.assertEqual("deleteAppNamespace", operation["operationId"])
        self.assertNotIn("content", operation["responses"]["200"])
        for status in ("400", "500"):
          self.assertEqual(
              EXCEPTION_RESPONSE,
              operation["responses"][status]["content"]["application/json"]["schema"]["$ref"],
          )

  def test_delete_app_namespace_takes_an_optional_recovery_flag(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)
      operation = spec["paths"][APP_NAMESPACE_PATH]["delete"]

      with self.subTest(spec=spec_file):
        recovery = next(parameter for parameter in operation["parameters"]
                        if parameter["name"] == "recovery")
        self.assertEqual("query", recovery["in"])
        self.assertFalse(recovery.get("required", False))
        self.assertEqual("boolean", recovery["schema"]["type"])
        self.assertFalse(recovery["schema"]["default"])

  def test_deletion_check_reports_portal_and_environment_status(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)
      operation = spec["paths"][APP_NAMESPACE_PATH + "/deletion-check"]["get"]
      schemas = spec["components"]["schemas"]

      with self.subTest(spec=spec_file):
        self.assertEqual("checkAppNamespaceDeletion", operation["operationId"])
        self.assertEqual(["AppNamespace Management"], operation["tags"])
        self.assertEqual(
            "#/components/schemas/OpenAppNamespaceDeletionCheckDTO",
            operation["responses"]["200"]["content"]["application/json"]["schema"]["$ref"],
        )
        self.assertEqual(
            EXCEPTION_RESPONSE,
            operation["responses"]["403"]["content"]["application/json"]["schema"]["$ref"],
        )

        check = schemas["OpenAppNamespaceDeletionCheckDTO"]["properties"]
        self.assertEqual("boolean", check["existsInPortal"]["type"])
        self.assertEqual(
            "#/components/schemas/OpenAppNamespaceEnvDeletionStatusDTO",
            check["environments"]["items"]["$ref"],
        )
        status = schemas["OpenAppNamespaceEnvDeletionStatusDTO"]["properties"]["status"]
        self.assertEqual(["REMAINING", "ABSENT", "UNREACHABLE", "SKIPPED"], status["enum"])


if __name__ == "__main__":
  unittest.main()
