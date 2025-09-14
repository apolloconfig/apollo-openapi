# flake8: noqa

if __import__("typing").TYPE_CHECKING:
    # import apis into api package
    from apollo_openapi.api.app_management_api import AppManagementApi
    from apollo_openapi.api.cluster_management_api import ClusterManagementApi
    from apollo_openapi.api.instance_management_api import InstanceManagementApi
    from apollo_openapi.api.item_management_api import ItemManagementApi
    from apollo_openapi.api.namespace_branch_management_api import NamespaceBranchManagementApi
    from apollo_openapi.api.namespace_management_api import NamespaceManagementApi
    from apollo_openapi.api.organization_management_api import OrganizationManagementApi
    from apollo_openapi.api.release_management_api import ReleaseManagementApi
    
else:
    from lazy_imports import LazyModule, as_package, load

    load(
        LazyModule(
            *as_package(__file__),
            """# import apis into api package
from apollo_openapi.api.app_management_api import AppManagementApi
from apollo_openapi.api.cluster_management_api import ClusterManagementApi
from apollo_openapi.api.instance_management_api import InstanceManagementApi
from apollo_openapi.api.item_management_api import ItemManagementApi
from apollo_openapi.api.namespace_branch_management_api import NamespaceBranchManagementApi
from apollo_openapi.api.namespace_management_api import NamespaceManagementApi
from apollo_openapi.api.organization_management_api import OrganizationManagementApi
from apollo_openapi.api.release_management_api import ReleaseManagementApi

""",
            name=__name__,
            doc=__doc__,
        )
    )
