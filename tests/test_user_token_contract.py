import unittest
from pathlib import Path

import yaml


SPEC_FILES = (
    "apollo-openapi.yaml",
)


class UserTokenContractTest(unittest.TestCase):

  def setUp(self):
    self.repo_root = Path(__file__).resolve().parents[1]

  def _load_spec(self, spec_file):
    return yaml.safe_load((self.repo_root / spec_file).read_text(encoding="utf-8"))

  def test_user_token_management_paths_use_generated_contract(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)

      with self.subTest(spec=spec_file):
        tag_names = {tag["name"] for tag in spec["tags"]}
        self.assertIn("User Token Management", tag_names)

        expected_operations = {
            "/openapi/v1/user-tokens/current": "getCurrentUserToken",
            "/openapi/v1/user-tokens/current/capabilities":
                "getCurrentUserTokenCapabilities",
            "/openapi/v1/user-tokens/whoami": "getCurrentUserTokenWhoami",
        }
        for path, operation_id in expected_operations.items():
          operation = spec["paths"][path]["get"]
          self.assertEqual(operation_id, operation["operationId"])
          self.assertEqual(["User Token Management"], operation["tags"])
          self.assertEqual(
              "#/components/schemas/OpenUserTokenCurrentCapability",
              operation["responses"]["200"]["content"]["application/json"]["schema"]["$ref"],
          )

  def test_portal_user_token_management_paths_use_portal_management_contract(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)

      with self.subTest(spec=spec_file):
        expected_operations = {
            "/openapi/v1/user-tokens": (("get", "listUserTokens"), ("post", "createUserToken")),
            "/openapi/v1/user-tokens/{tokenId}": (("delete", "deleteUserToken"),),
            "/openapi/v1/user-tokens/{tokenId}/revoke": (("post", "revokeUserToken"),),
            "/openapi/v1/user-tokens/{tokenId}/rotate": (("post", "rotateUserToken"),),
            "/openapi/v1/user-tokens/capabilities": (
                ("get", "getUserTokenCapabilities"),),
            "/openapi/v1/user-tokens/admin": (("get", "adminListUserTokens"),),
            "/openapi/v1/user-tokens/admin/{tokenId}": (
                ("delete", "adminDeleteUserToken"),),
            "/openapi/v1/user-tokens/admin/{tokenId}/revoke": (
                ("post", "adminRevokeUserToken"),),
        }
        for path, methods in expected_operations.items():
          for method, operation_id in methods:
            operation = spec["paths"][path][method]
            self.assertEqual(operation_id, operation["operationId"])
            self.assertEqual(["Portal Management"], operation["tags"])

        list_tokens = spec["paths"]["/openapi/v1/user-tokens"]["get"]
        self.assertEqual(
            {"type": "object"},
            list_tokens["responses"]["200"]["content"]["application/json"]["schema"]["items"],
        )
        create_token = spec["paths"]["/openapi/v1/user-tokens"]["post"]
        self.assertEqual(
            {"type": "object"},
            create_token["requestBody"]["content"]["application/json"]["schema"],
        )
        self.assertEqual(
            {"type": "object"},
            create_token["responses"]["200"]["content"]["application/json"]["schema"],
        )

  def test_user_token_current_capability_schema_matches_portal_response(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)
      schemas = spec["components"]["schemas"]

      with self.subTest(spec=spec_file):
        self.assertEqual(
            [
                "authType",
                "userId",
                "tokenId",
                "tokenName",
                "tokenPrefix",
                "rateLimit",
                "expires",
                "dataChangeCreatedTime",
                "denyAll",
                "allOperations",
                "operations",
                "allApps",
                "appIds",
                "allEnvs",
                "envs",
                "allNamespaces",
                "namespaces",
                "actions",
            ],
            schemas["OpenUserTokenCurrentCapability"]["required"],
        )
        capability = schemas["OpenUserTokenCurrentCapability"]["properties"]
        self.assertEqual("integer", capability["tokenId"]["type"])
        self.assertEqual("int64", capability["tokenId"]["format"])
        self.assertEqual("date-time", capability["expires"]["format"])
        self.assertTrue(capability["operations"]["uniqueItems"])
        self.assertTrue(capability["appIds"]["uniqueItems"])
        self.assertTrue(capability["envs"]["uniqueItems"])
        self.assertEqual(
            "#/components/schemas/OpenUserTokenNamespaceScope",
            capability["namespaces"]["items"]["$ref"],
        )
        self.assertEqual(
            "#/components/schemas/OpenUserTokenOpenApiAction",
            capability["actions"]["items"]["$ref"],
        )


if __name__ == "__main__":
  unittest.main()
