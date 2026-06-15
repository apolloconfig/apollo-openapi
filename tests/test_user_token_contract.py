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
        portal_session_auth = spec["components"]["securitySchemes"]["PortalSessionAuth"]
        self.assertEqual("apiKey", portal_session_auth["type"])
        self.assertEqual("cookie", portal_session_auth["in"])
        self.assertEqual("SESSION", portal_session_auth["name"])

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
        expected_error_responses = {
            ("/openapi/v1/user-tokens", "get"): ("401", "403"),
            ("/openapi/v1/user-tokens", "post"): ("400", "401", "403"),
            ("/openapi/v1/user-tokens/{tokenId}", "delete"): ("401", "403", "404"),
            ("/openapi/v1/user-tokens/{tokenId}/revoke", "post"): ("401", "403", "404"),
            ("/openapi/v1/user-tokens/{tokenId}/rotate", "post"): (
                "400", "401", "403", "404"),
            ("/openapi/v1/user-tokens/capabilities", "get"): ("401", "403"),
            ("/openapi/v1/user-tokens/admin", "get"): ("400", "401", "403"),
            ("/openapi/v1/user-tokens/admin/{tokenId}", "delete"): ("401", "403", "404"),
            ("/openapi/v1/user-tokens/admin/{tokenId}/revoke", "post"): (
                "401", "403", "404"),
        }
        for path, methods in expected_operations.items():
          for method, operation_id in methods:
            operation = spec["paths"][path][method]
            self.assertEqual(operation_id, operation["operationId"])
            self.assertEqual(["Portal Management"], operation["tags"])
            self.assertEqual([{"PortalSessionAuth": []}], operation["security"])
            for status_code in expected_error_responses[(path, method)]:
              self.assertEqual(
                  "#/components/schemas/ExceptionResponse",
                  operation["responses"][status_code]["content"]["application/json"]["schema"][
                      "$ref"],
              )

        list_tokens = spec["paths"]["/openapi/v1/user-tokens"]["get"]
        list_tokens_schema = (
            list_tokens["responses"]["200"]["content"]["application/json"]["schema"])
        self.assertEqual("array", list_tokens_schema["type"])
        self.assertEqual(
            "#/components/schemas/OpenUserTokenSummary",
            list_tokens_schema["items"]["$ref"],
        )
        create_token = spec["paths"]["/openapi/v1/user-tokens"]["post"]
        self.assertEqual(
            "#/components/schemas/OpenCreateUserTokenRequest",
            create_token["requestBody"]["content"]["application/json"]["schema"]["$ref"],
        )
        self.assertEqual(
            "#/components/schemas/OpenCreateUserTokenResponse",
            create_token["responses"]["200"]["content"]["application/json"]["schema"]["$ref"],
        )
        rotate_token = spec["paths"]["/openapi/v1/user-tokens/{tokenId}/rotate"]["post"]
        self.assertEqual(
            "#/components/schemas/OpenRotateUserTokenResponse",
            rotate_token["responses"]["200"]["content"]["application/json"]["schema"]["$ref"],
        )
        capabilities = spec["paths"]["/openapi/v1/user-tokens/capabilities"]["get"]
        self.assertEqual(
            "#/components/schemas/OpenUserTokenCapability",
            capabilities["responses"]["200"]["content"]["application/json"]["schema"]["$ref"],
        )
        admin_list_tokens = spec["paths"]["/openapi/v1/user-tokens/admin"]["get"]
        admin_status_parameter = next(
            parameter for parameter in admin_list_tokens["parameters"]
            if parameter["name"] == "status")
        self.assertEqual(
            ["all", "active", "expired", "revoked"],
            admin_status_parameter["schema"]["enum"],
        )
        self.assertEqual("all", admin_status_parameter["schema"]["default"])
        admin_list_tokens_schema = (
            admin_list_tokens["responses"]["200"]["content"]["application/json"]["schema"])
        self.assertEqual("array", admin_list_tokens_schema["type"])
        self.assertEqual(
            "#/components/schemas/OpenUserTokenSummary",
            admin_list_tokens_schema["items"]["$ref"],
        )

        schemas = spec["components"]["schemas"]
        summary = schemas["OpenUserTokenSummary"]
        self.assertIn("tokenPrefix", summary["required"])
        self.assertEqual("int64", summary["properties"]["id"]["format"])
        self.assertTrue(summary["properties"]["operations"]["uniqueItems"])
        self.assertEqual(0, summary["properties"]["rateLimit"]["minimum"])
        self.assertEqual(
            "#/components/schemas/OpenUserTokenNamespaceScope",
            summary["properties"]["namespaces"]["items"]["$ref"],
        )
        create_request = schemas["OpenCreateUserTokenRequest"]
        self.assertEqual(["name"], create_request["required"])
        self.assertTrue(create_request["properties"]["appIds"]["uniqueItems"])
        create_response = schemas["OpenCreateUserTokenResponse"]
        self.assertEqual(
            "#/components/schemas/OpenUserTokenSummary",
            create_response["allOf"][0]["$ref"],
        )
        self.assertEqual(
            "string",
            create_response["allOf"][1]["properties"]["tokenValue"]["type"],
        )
        capability = schemas["OpenUserTokenCapability"]
        self.assertEqual(
            ["operations", "defaultExpireDays", "maxExpireDays"],
            capability["required"],
        )
        self.assertTrue(capability["properties"]["operations"]["uniqueItems"])

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
