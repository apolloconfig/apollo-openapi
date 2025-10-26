# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from apollo_openapi.paths.openapi_v1_envs import Api

from apollo_openapi.paths import PathValues

path = PathValues.OPENAPI_V1_ENVS
