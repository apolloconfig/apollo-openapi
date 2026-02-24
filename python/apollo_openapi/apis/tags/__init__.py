# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from apollo_openapi.apis.tag_to_api import tag_to_api

import enum


class TagValues(str, enum.Enum):
    APP_MANAGEMENT = "App Management"
    ITEM_MANAGEMENT = "Item Management"
    RELEASE_MANAGEMENT = "Release Management"
    CLUSTER_MANAGEMENT = "Cluster Management"
    NAMESPACE_MANAGEMENT = "Namespace Management"
    APP_NAMESPACE_MANAGEMENT = "AppNamespace Management"
    NAMESPACE_LOCK_MANAGEMENT = "Namespace Lock Management"
    NAMESPACE_BRANCH_MANAGEMENT = "Namespace Branch Management"
    INSTANCE_MANAGEMENT = "Instance Management"
    ORGANIZATION_MANAGEMENT = "Organization Management"
    ENVIRONMENT_MANAGEMENT = "Environment Management"
    PERMISSION_MANAGEMENT = "Permission Management"
    ACCESS_KEY_MANAGEMENT = "AccessKey Management"
