<a id="__pageTop"></a>
# apollo_openapi.apis.tags.cluster_management_api.ClusterManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_cluster**](#create_cluster) | **post** /openapi/v1/envs/{env}/apps/{appId}/clusters | 创建集群 (original openapi)
[**delete_cluster**](#delete_cluster) | **delete** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} | 删除集群 (new added)
[**get_cluster**](#get_cluster) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} | 获取指定集群信息 (original openapi)

# **create_cluster**
<a id="create_cluster"></a>
> OpenClusterDTO create_cluster(app_idenvopen_cluster_dto)

创建集群 (original openapi)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import cluster_management_api
from apollo_openapi.model.open_cluster_dto import OpenClusterDTO
from apollo_openapi.model.exception_response import ExceptionResponse
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
    api_instance = cluster_management_api.ClusterManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
    }
    body = OpenClusterDTO(
        data_change_created_by="data_change_created_by_example",
        data_change_last_modified_by="data_change_last_modified_by_example",
        data_change_created_time="2025-09-29T12:34:56Z",
        data_change_last_modified_time="2025-09-29T12:34:56Z",
        name="name_example",
        app_id="app_id_example",
    )
    try:
        # 创建集群 (original openapi)
        api_response = api_instance.create_cluster(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ClusterManagementApi->create_cluster: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenClusterDTO**](../../models/OpenClusterDTO.md) |  |


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
appId | AppIdSchema | |
env | EnvSchema | |

# AppIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# EnvSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_cluster.ApiResponseFor200) | 集群创建成功
400 | [ApiResponseFor400](#create_cluster.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#create_cluster.ApiResponseFor403) | 权限不足

#### create_cluster.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenClusterDTO**](../../models/OpenClusterDTO.md) |  |


#### create_cluster.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ExceptionResponse]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) |  |

#### create_cluster.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ExceptionResponse]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete_cluster**
<a id="delete_cluster"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} delete_cluster(envapp_idcluster_nameoperator)

删除集群 (new added)

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import cluster_management_api
from apollo_openapi.model.exception_response import ExceptionResponse
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
    api_instance = cluster_management_api.ClusterManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'env': "env_example",
        'appId': "appId_example",
        'clusterName': "clusterName_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    try:
        # 删除集群 (new added)
        api_response = api_instance.delete_cluster(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ClusterManagementApi->delete_cluster: %s\n" % e)
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
operator | OperatorSchema | |


# OperatorSchema

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

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#delete_cluster.ApiResponseFor200) | 集群删除成功
400 | [ApiResponseFor400](#delete_cluster.ApiResponseFor400) | 删除失败，集群可能包含配置
403 | [ApiResponseFor403](#delete_cluster.ApiResponseFor403) | 权限不足
404 | [ApiResponseFor404](#delete_cluster.ApiResponseFor404) | 集群不存在

#### delete_cluster.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

#### delete_cluster.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ExceptionResponse]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) |  |

#### delete_cluster.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ExceptionResponse]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) |  |

#### delete_cluster.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ExceptionResponse]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_cluster**
<a id="get_cluster"></a>
> OpenClusterDTO get_cluster(app_idcluster_nameenv)

获取指定集群信息 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import cluster_management_api
from apollo_openapi.model.open_cluster_dto import OpenClusterDTO
from apollo_openapi.model.exception_response import ExceptionResponse
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
    api_instance = cluster_management_api.ClusterManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'clusterName': "clusterName_example",
        'env': "env_example",
    }
    try:
        # 获取指定集群信息 (original openapi)
        api_response = api_instance.get_cluster(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ClusterManagementApi->get_cluster: %s\n" % e)
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
appId | AppIdSchema | |
clusterName | ClusterNameSchema | |
env | EnvSchema | |

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

# EnvSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_cluster.ApiResponseFor200) | 成功获取集群信息
404 | [ApiResponseFor404](#get_cluster.ApiResponseFor404) | 集群不存在

#### get_cluster.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenClusterDTO**](../../models/OpenClusterDTO.md) |  |


#### get_cluster.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ExceptionResponse]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) | [**ExceptionResponse**]({{complexTypePrefix}}ExceptionResponse.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)
