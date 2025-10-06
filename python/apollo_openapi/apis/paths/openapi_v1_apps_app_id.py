from apollo_openapi.paths.openapi_v1_apps_app_id.get import ApiForget
from apollo_openapi.paths.openapi_v1_apps_app_id.put import ApiForput
from apollo_openapi.paths.openapi_v1_apps_app_id.delete import ApiFordelete


class OpenapiV1AppsAppId(
    ApiForget,
    ApiForput,
    ApiFordelete,
):
    pass
