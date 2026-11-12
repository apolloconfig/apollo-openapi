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
    expected_error_statuses = {
        "get": ("400", "403", "404"),
        "delete": ("400", "403", "404"),
    }
    for method, statuses in expected_error_statuses.items():
      with self.subTest(method=method):
        operation = self.operations[method]
        self.assertEqual(["Portal Management"], operation["tags"])
        self.assertEqual([{"PortalSessionAuth": []}], operation["security"])
        for status in statuses:
          self.assertEqual(
              "#/components/schemas/ExceptionResponse",
              operation["responses"][status]["content"]["application/json"]["schema"]["$ref"],
          )
        self.assertIn("超级管理员", operation["description"])
        self.assertIn("Token", operation["description"])
        consumer_id = next(p for p in operation["parameters"] if p["name"] == "consumerId")
        self.assertEqual("path", consumer_id["in"])
        self.assertTrue(consumer_id["required"])
        self.assertEqual("int64", consumer_id["schema"]["format"])
        self.assertEqual(1, consumer_id["schema"]["minimum"])

  def test_operations_document_expired_session_responses_per_auth_mode(self):
    for method in ("get", "delete"):
      with self.subTest(method=method):
        operation = self.operations[method]
        self.assertIn("OIDC", operation["description"])
        responses = operation["responses"]
        self.assertIn("OIDC", responses["401"]["description"])
        redirect = responses["302"]
        self.assertIn("auth", redirect["description"])
        self.assertIn("LDAP", redirect["description"])
        self.assertIn("/signin", redirect["description"])
        self.assertNotIn("content", redirect)
        location = redirect["headers"]["Location"]
        self.assertEqual("string", location["schema"]["type"])
        self.assertIn("/signin", location["description"])

  def test_unauthorized_response_leaves_body_unconstrained(self):
    # 401 有两种来源：未登录时是 ExceptionResponse，OIDC 模式下登录态过期的 401 由
    # sendError 交给容器错误处理，body 不保证是 ExceptionResponse，因此不声明 schema。
    for method in ("get", "delete"):
      with self.subTest(method=method):
        response = self.operations[method]["responses"]["401"]
        self.assertIn("ExceptionResponse", response["description"])
        self.assertIn("sendError", response["description"])
        content = response.get("content", {})
        self.assertNotIn("schema", content.get("application/json", {}))

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

  def test_revoke_is_not_idempotent_and_reports_400_when_binding_is_gone(self):
    operation = self.operations["delete"]
    self.assertIn("不是幂等", operation["description"])
    self.assertIn("400", operation["description"])
    ok = operation["responses"]["200"]["description"]
    self.assertIn("400", ok)
    self.assertNotIn("不重复删除", ok)
    bad_request = operation["responses"]["400"]["description"]
    self.assertIn("重复撤销", bad_request)
    self.assertIn("ExceptionResponse",
                  operation["responses"]["400"]["content"]["application/json"]["schema"]["$ref"])


if __name__ == "__main__":
  unittest.main()
