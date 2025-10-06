import typing_extensions

from apollo_openapi.apis.tags import TagValues
from apollo_openapi.apis.tags.app_management_api import AppManagementApi
from apollo_openapi.apis.tags.item_management_api import ItemManagementApi
from apollo_openapi.apis.tags.release_management_api import ReleaseManagementApi
from apollo_openapi.apis.tags.cluster_management_api import ClusterManagementApi
from apollo_openapi.apis.tags.namespace_management_api import NamespaceManagementApi
from apollo_openapi.apis.tags.namespace_namespace_branch_management_api import NamespaceNamespaceBranchManagementApi
from apollo_openapi.apis.tags.instance_management_api import InstanceManagementApi
from apollo_openapi.apis.tags.organization_management_api import OrganizationManagementApi
from apollo_openapi.apis.tags.namespace_branch_management_api import NamespaceBranchManagementApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.APP_MANAGEMENT: AppManagementApi,
        TagValues.ITEM_MANAGEMENT: ItemManagementApi,
        TagValues.RELEASE_MANAGEMENT: ReleaseManagementApi,
        TagValues.CLUSTER_MANAGEMENT: ClusterManagementApi,
        TagValues.NAMESPACE_MANAGEMENT: NamespaceManagementApi,
        TagValues.NAMESPACE_NAMESPACE_BRANCH_MANAGEMENT: NamespaceNamespaceBranchManagementApi,
        TagValues.INSTANCE_MANAGEMENT: InstanceManagementApi,
        TagValues.ORGANIZATION_MANAGEMENT: OrganizationManagementApi,
        TagValues.NAMESPACE_BRANCH_MANAGEMENT: NamespaceBranchManagementApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.APP_MANAGEMENT: AppManagementApi,
        TagValues.ITEM_MANAGEMENT: ItemManagementApi,
        TagValues.RELEASE_MANAGEMENT: ReleaseManagementApi,
        TagValues.CLUSTER_MANAGEMENT: ClusterManagementApi,
        TagValues.NAMESPACE_MANAGEMENT: NamespaceManagementApi,
        TagValues.NAMESPACE_NAMESPACE_BRANCH_MANAGEMENT: NamespaceNamespaceBranchManagementApi,
        TagValues.INSTANCE_MANAGEMENT: InstanceManagementApi,
        TagValues.ORGANIZATION_MANAGEMENT: OrganizationManagementApi,
        TagValues.NAMESPACE_BRANCH_MANAGEMENT: NamespaceBranchManagementApi,
    }
)
