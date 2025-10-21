<a id="__pageTop"></a>
# apollo_openapi.apis.tags.instance_management_api.InstanceManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_by_release**](#get_by_release) | **get** /openapi/v1/envs/{env}/releases/{releaseId}/instances | 根据发布版本查询实例（支持分页） (new added)
[**get_by_releases_not_in**](#get_by_releases_not_in) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances_not_in | 查询不在指定发布版本中的实例 (new added)
[**get_instance_count_by_namespace**](#get_instance_count_by_namespace) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances | 获取命名空间下的实例数量 (original openapi)

# **get_by_release**
<a id="get_by_release"></a>
> OpenPageDTOOpenInstanceDTO get_by_release(envrelease_idpagesize)

根据发布版本查询实例（支持分页） (new added)

GET /openapi/v1/envs/{env}/releases/{releaseId}/instances

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import instance_management_api
from apollo_openapi.model.open_page_dto_open_instance_dto import OpenPageDTOOpenInstanceDTO
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'
# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instance_management_api.InstanceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'env': "env_example",
        'releaseId': 1,
    }
    query_params = {
        'page': 0,
        'size': 20,
    }
    try:
        # 根据发布版本查询实例（支持分页） (new added)
        api_response = api_instance.get_by_release(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling InstanceManagementApi->get_by_release: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
page | PageSchema | |
size | SizeSchema | |


# PageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

# SizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
env | EnvSchema | |
releaseId | ReleaseIdSchema | |

# EnvSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# ReleaseIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_by_release.ApiResponseFor200) |

#### get_by_release.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenPageDTOOpenInstanceDTO**](../../models/OpenPageDTOOpenInstanceDTO.md) |  |


### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_by_releases_not_in**
<a id="get_by_releases_not_in"></a>
> [OpenInstanceDTO] get_by_releases_not_in(envapp_idcluster_namenamespace_name)

查询不在指定发布版本中的实例 (new added)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances?excludeReleases=1,2,3

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import instance_management_api
from apollo_openapi.model.open_instance_dto import OpenInstanceDTO
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'
# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instance_management_api.InstanceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'env': "env_example",
        'appId': "appId_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
    }
    try:
        # 查询不在指定发布版本中的实例 (new added)
        api_response = api_instance.get_by_releases_not_in(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling InstanceManagementApi->get_by_releases_not_in: %s\n" % e)

    # example passing only optional values
    path_params = {
        'env': "env_example",
        'appId': "appId_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'excludeReleases': "excludeReleases_example",
    }
    try:
        # 查询不在指定发布版本中的实例 (new added)
        api_response = api_instance.get_by_releases_not_in(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling InstanceManagementApi->get_by_releases_not_in: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
excludeReleases | ExcludeReleasesSchema | | optional


# ExcludeReleasesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
env | EnvSchema | |
appId | AppIdSchema | |
clusterName | ClusterNameSchema | |
namespaceName | NamespaceNameSchema | |

# EnvSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# AppIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# ClusterNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# NamespaceNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_by_releases_not_in.ApiResponseFor200) |

#### get_by_releases_not_in.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenInstanceDTO**]({{complexTypePrefix}}OpenInstanceDTO.md) | [**OpenInstanceDTO**]({{complexTypePrefix}}OpenInstanceDTO.md) | [**OpenInstanceDTO**]({{complexTypePrefix}}OpenInstanceDTO.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_instance_count_by_namespace**
<a id="get_instance_count_by_namespace"></a>
> int get_instance_count_by_namespace(envapp_idcluster_namenamespace_name)

获取命名空间下的实例数量 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import instance_management_api
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apollo_openapi.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'
# Enter a context with an instance of the API client
with apollo_openapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instance_management_api.InstanceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'env': "env_example",
        'appId': "appId_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    try:
        # 获取命名空间下的实例数量 (original openapi)
        api_response = api_instance.get_instance_count_by_namespace(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling InstanceManagementApi->get_instance_count_by_namespace: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
env | EnvSchema | |
appId | AppIdSchema | |
clusterName | ClusterNameSchema | |
namespaceName | NamespaceNameSchema | |

# EnvSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# AppIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# ClusterNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# NamespaceNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_instance_count_by_namespace.ApiResponseFor200) | 成功返回实例数量

#### get_instance_count_by_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)
