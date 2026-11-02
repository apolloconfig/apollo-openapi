import re
import unittest
from pathlib import Path

import yaml


class ConsumerRoleManagementContractTest(unittest.TestCase):

  @classmethod
  def setUpClass(cls):
    repo_root = Path(__file__).resolve().parents[1]
    cls.spec = yaml.safe_load((repo_root / "apollo-openapi.yaml").read_text(encoding="utf-8"))
    cls.operations = cls.spec["paths"]["/openapi/v1/consumers/{consumerId}/roles"]

  def test_operations_require_portal_session_and_document_admin_boundary(self):
    for method in ("get", "delete"):
      with self.subTest(method=method):
        operation = self.operations[method]
        self.assertEqual(["Portal Management"], operation["tags"])
        self.assertEqual([{"PortalSessionAuth": []}], operation["security"])
        self.assertIn("403", operation["responses"])
        self.assertIn("404", operation["responses"])
        self.assertIn("超级管理员", operation["description"])
        self.assertIn("Token", operation["description"])
        consumer_id = next(p for p in operation["parameters"] if p["name"] == "consumerId")
        self.assertEqual("path", consumer_id["in"])
        self.assertTrue(consumer_id["required"])
        self.assertEqual("int64", consumer_id["schema"]["format"])
        self.assertEqual(1, consumer_id["schema"]["minimum"])

  def test_get_roles_returns_explicit_resource_grants(self):
    operation = self.operations["get"]
    self.assertEqual("getConsumerRoles", operation["operationId"])
    response = operation["responses"]["200"]["content"]["application/json"]["schema"]
    self.assertEqual("array", response["type"])
    self.assertEqual("#/components/schemas/OpenConsumerRoleDTO", response["items"]["$ref"])
    self.assertIn("聚合", operation["description"])

  def test_role_model_keeps_plain_string_type_and_nullable_scope(self):
    properties = self.spec["components"]["schemas"]["OpenConsumerRoleDTO"]["properties"]
    self.assertEqual({"type", "appId", "namespaceName", "env"}, set(properties))
    self.assertEqual("string", properties["type"]["type"])
    pattern = re.compile(properties["type"]["pattern"])
    self.assertIsNotNone(pattern.fullmatch("AppRole"))
    self.assertIsNotNone(pattern.fullmatch("NamespaceRole"))
    self.assertIsNone(pattern.fullmatch("ClusterRole"))
    self.assertTrue(properties["namespaceName"]["nullable"])
    self.assertTrue(properties["env"]["nullable"])

  def test_revoke_parameters_select_an_exact_resource_grant(self):
    operation = self.operations["delete"]
    self.assertEqual("revokeConsumerRoles", operation["operationId"])
    parameters = {p["name"]: p for p in operation["parameters"]}
    self.assertEqual({"consumerId", "type", "appId", "namespaceName", "env"}, set(parameters))
    self.assertEqual(["AppRole", "NamespaceRole"], parameters["type"]["schema"]["enum"])
    self.assertTrue(parameters["type"]["required"])
    self.assertTrue(parameters["appId"]["required"])
    self.assertFalse(parameters["namespaceName"]["required"])
    self.assertFalse(parameters["env"]["required"])
    self.assertIn("一个事务", operation["description"])
    self.assertIn("不匹配各环境的独立授权", operation["description"])


if __name__ == "__main__":
  unittest.main()
