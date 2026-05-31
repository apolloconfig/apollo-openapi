import unittest
from pathlib import Path

import yaml


AUDIT_DISPLAY_NAME_SCHEMAS = (
    "OpenAppDTO",
    "OpenClusterDTO",
    "OpenNamespaceDTO",
    "OpenAppNamespaceDTO",
    "OpenReleaseDTO",
    "OpenItemDTO",
)

AUDIT_DISPLAY_NAME_FIELDS = (
    "dataChangeCreatedByDisplayName",
    "dataChangeLastModifiedByDisplayName",
)


class AuditDisplayNameFieldsTest(unittest.TestCase):

  @classmethod
  def setUpClass(cls):
    spec_path = Path(__file__).resolve().parents[1] / "apollo-openapi.yaml"
    cls.spec = yaml.safe_load(spec_path.read_text())
    cls.schemas = cls.spec["components"]["schemas"]

  def test_base_dto_compatible_schemas_expose_optional_display_name_fields(self):
    for schema_name in AUDIT_DISPLAY_NAME_SCHEMAS:
      with self.subTest(schema=schema_name):
        schema = self.schemas[schema_name]
        properties = schema["properties"]
        required = set(schema.get("required", ()))

        for field_name in AUDIT_DISPLAY_NAME_FIELDS:
          self.assertIn(field_name, properties)
          self.assertEqual("string", properties[field_name]["type"])
          self.assertNotIn(field_name, required)


if __name__ == "__main__":
  unittest.main()
