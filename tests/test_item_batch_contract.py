import unittest
from pathlib import Path

import yaml


SPEC_FILES = (
    "apollo-openapi.yaml",
)

BASE_PATH = (
    "/openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}"
    "/namespaces/{namespaceName}/items"
)


class ItemBatchContractTest(unittest.TestCase):

  def setUp(self):
    self.repo_root = Path(__file__).resolve().parents[1]

  def _load_spec(self, spec_file):
    return yaml.safe_load((self.repo_root / spec_file).read_text(encoding="utf-8"))

  def test_item_batch_paths_use_generated_contract(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)

      with self.subTest(spec=spec_file):
        tag_names = {tag["name"] for tag in spec["tags"]}
        self.assertIn("Item Management", tag_names)

        expected_operations = {
            f"{BASE_PATH}/batch-create": ("post", "batchCreateItems"),
            f"{BASE_PATH}/batch-update": ("put", "batchUpdateItems"),
            f"{BASE_PATH}/batch-delete": ("post", "batchDeleteItems"),
        }
        for path, (method, operation_id) in expected_operations.items():
          operation = spec["paths"][path][method]
          self.assertEqual(operation_id, operation["operationId"])
          self.assertEqual(["Item Management"], operation["tags"])
          self.assertEqual(
              "#/components/schemas/ExceptionResponse",
              operation["responses"]["403"]["content"]["application/json"]["schema"]["$ref"],
          )

          parameter_names = {parameter["name"] for parameter in operation["parameters"]}
          self.assertEqual(
              {"appId", "env", "clusterName", "namespaceName", "operator"},
              parameter_names,
          )
          operator_parameter = next(
              parameter for parameter in operation["parameters"]
              if parameter["name"] == "operator")
          self.assertFalse(operator_parameter["required"])

  def test_batch_create_and_update_accept_item_list(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)

      with self.subTest(spec=spec_file):
        for path, method in (
            (f"{BASE_PATH}/batch-create", "post"),
            (f"{BASE_PATH}/batch-update", "put"),
        ):
          operation = spec["paths"][path][method]
          request_schema = operation["requestBody"]["content"]["application/json"]["schema"]
          self.assertEqual("array", request_schema["type"])
          self.assertEqual(
              "#/components/schemas/OpenItemDTO",
              request_schema["items"]["$ref"],
          )

        update_operation = spec["paths"][f"{BASE_PATH}/batch-update"]["put"]
        self.assertEqual(
            "#/components/schemas/ExceptionResponse",
            update_operation["responses"]["404"]["content"]["application/json"]["schema"][
                "$ref"],
        )

  def test_batch_delete_accepts_key_list(self):
    for spec_file in SPEC_FILES:
      spec = self._load_spec(spec_file)

      with self.subTest(spec=spec_file):
        operation = spec["paths"][f"{BASE_PATH}/batch-delete"]["post"]
        request_schema = operation["requestBody"]["content"]["application/json"]["schema"]
        self.assertEqual("array", request_schema["type"])
        self.assertEqual("string", request_schema["items"]["type"])
        self.assertEqual(
            "#/components/schemas/ExceptionResponse",
            operation["responses"]["404"]["content"]["application/json"]["schema"]["$ref"],
        )


if __name__ == "__main__":
  unittest.main()
