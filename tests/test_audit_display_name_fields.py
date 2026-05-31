import unittest
from pathlib import Path

import yaml


AUDIT_DISPLAY_NAME_SCHEMAS = (
    "OpenAppDTO",
    "OpenClusterDTO",
    "OpenNamespaceDTO",
    "OpenAppNamespaceDTO",
    "OpenGrayReleaseRuleDTO",
    "OpenReleaseDTO",
    "OpenItemDTO",
)

AUDIT_DISPLAY_NAME_FIELDS = (
    "dataChangeCreatedByDisplayName",
    "dataChangeLastModifiedByDisplayName",
)

SPEC_FILES = (
    "apollo-openapi.yaml",
    "java-client/api/openapi.yaml",
    "spring-boot2/src/main/resources/openapi.yaml",
)


class AuditDisplayNameFieldsTest(unittest.TestCase):

  def test_base_dto_compatible_schemas_expose_optional_display_name_fields(self):
    repo_root = Path(__file__).resolve().parents[1]

    for spec_file in SPEC_FILES:
      spec = yaml.safe_load((repo_root / spec_file).read_text())
      schemas = spec["components"]["schemas"]

      for schema_name in AUDIT_DISPLAY_NAME_SCHEMAS:
        with self.subTest(spec=spec_file, schema=schema_name):
          schema = schemas[schema_name]
          properties = schema["properties"]
          required = set(schema.get("required", ()))

          for field_name in AUDIT_DISPLAY_NAME_FIELDS:
            self.assertIn(field_name, properties)
            self.assertEqual("string", properties[field_name]["type"])
            self.assertNotIn(field_name, required)

  def test_open_item_exposes_optional_line_num(self):
    repo_root = Path(__file__).resolve().parents[1]

    for spec_file in SPEC_FILES:
      spec = yaml.safe_load((repo_root / spec_file).read_text())
      open_item_schema = spec["components"]["schemas"]["OpenItemDTO"]
      properties = open_item_schema["properties"]
      required = set(open_item_schema.get("required", ()))

      with self.subTest(spec=spec_file):
        self.assertIn("lineNum", properties)
        self.assertEqual("integer", properties["lineNum"]["type"])
        self.assertNotIn("lineNum", required)


if __name__ == "__main__":
  unittest.main()
