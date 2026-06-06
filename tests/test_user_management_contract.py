import unittest
from pathlib import Path

import yaml


SPEC_FILES = (
    "apollo-openapi.yaml",
    "java-client/api/openapi.yaml",
    "spring-boot2/src/main/resources/openapi.yaml",
)


class UserManagementContractTest(unittest.TestCase):

  def setUp(self):
    self.repo_root = Path(__file__).resolve().parents[1]

  def _load_spec(self, spec_file):
    return yaml.safe_load((self.repo_root / spec_file).read_text(encoding="utf-8"))

  def test_user_management_tag_renamed_in_all_specs(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)
      tag_names = {tag["name"] for tag in spec["tags"]}

      with self.subTest(spec=spec_file):
        self.assertIn("User Management", tag_names)
        self.assertNotIn("Portal User Management", tag_names)

        operations = (
            spec["paths"]["/openapi/v1/user"]["get"],
            spec["paths"]["/openapi/v1/users"]["get"],
            spec["paths"]["/openapi/v1/users"]["post"],
            spec["paths"]["/openapi/v1/users/{userId}"]["get"],
            spec["paths"]["/openapi/v1/users/enabled"]["put"],
        )
        for operation in operations:
          self.assertEqual(["User Management"], operation["tags"])

  def test_user_management_operations_support_consumer_manage_users_contract(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)

      with self.subTest(spec=spec_file):
        users_by_id = spec["paths"]["/openapi/v1/users/{userId}"]["get"]
        self.assertEqual("getUserByUserId", users_by_id["operationId"])
        user_id_param = self._find_parameter(users_by_id, "userId")
        self.assertEqual("path", user_id_param["in"])
        self.assertTrue(user_id_param["required"])
        self.assertEqual("string", user_id_param["schema"]["type"])
        self.assertEqual(
            "#/components/schemas/OpenUserInfoDTO",
            users_by_id["responses"]["200"]["content"]["application/json"]["schema"]["$ref"],
        )

        create_or_update = spec["paths"]["/openapi/v1/users"]["post"]
        change_enabled = spec["paths"]["/openapi/v1/users/enabled"]["put"]
        for operation in (create_or_update, change_enabled):
          operator_param = self._find_parameter(operation, "operator")
          self.assertEqual("query", operator_param["in"])
          self.assertFalse(operator_param.get("required", False))

  def test_portal_consumer_management_keeps_internal_object_contract(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)
      schemas = spec["components"]["schemas"]

      with self.subTest(spec=spec_file):
        create_consumer = spec["paths"]["/openapi/v1/consumers"]["post"]
        self.assertEqual(
            {"type": "object"},
            create_consumer["requestBody"]["content"]["application/json"]["schema"],
        )
        self.assertEqual(
            {"type": "object"},
            create_consumer["responses"]["200"]["content"]["application/json"]["schema"],
        )

        list_consumers = spec["paths"]["/openapi/v1/consumers"]["get"]
        self.assertEqual(
            {"type": "object"},
            list_consumers["responses"]["200"]["content"]["application/json"]["schema"]["items"],
        )

        consumer_token = spec["paths"]["/openapi/v1/consumer-tokens/by-appId"]["get"]
        self.assertEqual(
            {"type": "object"},
            consumer_token["responses"]["200"]["content"]["application/json"]["schema"],
        )

        self.assertNotIn("OpenConsumerCreateRequestDTO", schemas)
        self.assertNotIn("OpenConsumerInfoDTO", schemas)
        self.assertNotIn("OpenConsumerSummaryDTO", schemas)
        self.assertNotIn("OpenConsumerTokenDTO", schemas)

  def test_spring_server_api_uses_user_management_name(self):
    api_dir = self.repo_root / "spring-boot2/src/main/java/com/apollo/openapi/server/api"

    self.assertTrue((api_dir / "UserManagementApi.java").exists())
    self.assertFalse((api_dir / "PortalUserManagementApi.java").exists())

  def test_java_client_preserves_optional_operator_overloads(self):
    api_file = self.repo_root / (
        "java-client/src/main/java/org/openapitools/client/api/UserManagementApi.java")
    content = api_file.read_text(encoding="utf-8")

    self.assertIn("changeUserEnabled(OpenUserDTO openUserDTO) throws ApiException", content)
    self.assertIn(
        "createOrUpdateUser(OpenUserDTO openUserDTO, Boolean isCreate) throws ApiException",
        content)

  def test_portal_consumer_models_are_not_generated(self):
    model_dir = self.repo_root / "java-client/src/main/java/org/openapitools/client/model"
    spring_model_dir = self.repo_root / (
        "spring-boot2/src/main/java/com/apollo/openapi/server/model")
    for model_name in (
        "OpenConsumerCreateRequestDTO",
        "OpenConsumerInfoDTO",
        "OpenConsumerSummaryDTO",
        "OpenConsumerTokenDTO",
    ):
      with self.subTest(model=model_name):
        self.assertFalse((model_dir / f"{model_name}.java").exists())
        self.assertFalse((spring_model_dir / f"{model_name}.java").exists())

  def _find_parameter(self, operation, name):
    for parameter in operation.get("parameters", ()):
      if parameter.get("name") == name:
        return parameter
    self.fail(f"Parameter {name} not found")


if __name__ == "__main__":
  unittest.main()
