<a id="__pageTop"></a>
# apollo_openapi.apis.tags.namespace_management_api.NamespaceManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_missing_namespaces**](#create_missing_namespaces) | **post** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces | 创建缺失的Namespace (new added)
[**create_namespaces**](#create_namespaces) | **post** /openapi/v1/namespaces | 创建Namespace (new added)
[**delete_namespace**](#delete_namespace) | **delete** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName} | 删除指定的Namespace (new added)
[**find_missing_namespaces**](#find_missing_namespaces) | **get** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces | 查找缺失的Namespace (new added)
[**find_namespace**](#find_namespace) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} | 获取指定的Namespace (original openapi)
[**find_namespace_usage**](#find_namespace_usage) | **get** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/usage | 查询namespace使用情况(new added)
[**find_namespaces**](#find_namespaces) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces | 获取指定集群下的所有Namespace (original openapi)
[**find_public_namespace_for_associated_namespace**](#find_public_namespace_for_associated_namespace) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace | 查询关联Namespace对应的公共Namespace详情 (new added)
[**get_namespaces_release_status**](#get_namespaces_release_status) | **get** /openapi/v1/apps/{appId}/namespaces/releases/status | 获取应用下所有Namespace的发布状态 (new added)

# **create_missing_namespaces**
<a id="create_missing_namespaces"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} create_missing_namespaces(app_idenvcluster_name)

创建缺失的Namespace (new added)

POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
    }
    query_params = {
    }
    try:
        # 创建缺失的Namespace (new added)
        api_response = api_instance.create_missing_namespaces(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->create_missing_namespaces: %s\n" % e)

    # example passing only optional values
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    try:
        # 创建缺失的Namespace (new added)
        api_response = api_instance.create_missing_namespaces(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->create_missing_namespaces: %s\n" % e)
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
operator | OperatorSchema | | optional


# OperatorSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
appId | AppIdSchema | |
env | EnvSchema | |
clusterName | ClusterNameSchema | |

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

# ClusterNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_missing_namespaces.ApiResponseFor200) | 缺失的命名空间创建成功

#### create_missing_namespaces.ApiResponseFor200
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

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **create_namespaces**
<a id="create_namespaces"></a>
> create_namespaces(open_create_namespace_dto)

创建Namespace (new added)

POST /openapi/v1/apps/{appId}/namespaces

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
from apollo_openapi.model.open_create_namespace_dto import OpenCreateNamespaceDTO
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
    }
    body = [
        OpenCreateNamespaceDTO(
            app_id="app_id_example",
            env="env_example",
            cluster_name="cluster_name_example",
            app_namespace_name="app_namespace_name_example",
        )
    ]
    try:
        # 创建Namespace (new added)
        api_response = api_instance.create_namespaces(
            query_params=query_params,
            body=body,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->create_namespaces: %s\n" % e)

    # example passing only optional values
    query_params = {
        'operator': "operator_example",
    }
    body = [
        OpenCreateNamespaceDTO(
            app_id="app_id_example",
            env="env_example",
            cluster_name="cluster_name_example",
            app_namespace_name="app_namespace_name_example",
        )
    ]
    try:
        # 创建Namespace (new added)
        api_response = api_instance.create_namespaces(
            query_params=query_params,
            body=body,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->create_namespaces: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenCreateNamespaceDTO**]({{complexTypePrefix}}OpenCreateNamespaceDTO.md) | [**OpenCreateNamespaceDTO**]({{complexTypePrefix}}OpenCreateNamespaceDTO.md) | [**OpenCreateNamespaceDTO**]({{complexTypePrefix}}OpenCreateNamespaceDTO.md) |  |

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
operator | OperatorSchema | | optional


# OperatorSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_namespaces.ApiResponseFor200) | Namespace创建成功

#### create_namespaces.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete_namespace**
<a id="delete_namespace"></a>
> delete_namespace(app_idenvcluster_namenamespace_name)

删除指定的Namespace (new added)

DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
    }
    try:
        # 删除指定的Namespace (new added)
        api_response = api_instance.delete_namespace(
            path_params=path_params,
            query_params=query_params,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->delete_namespace: %s\n" % e)

    # example passing only optional values
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    try:
        # 删除指定的Namespace (new added)
        api_response = api_instance.delete_namespace(
            path_params=path_params,
            query_params=query_params,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->delete_namespace: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
operator | OperatorSchema | | optional


# OperatorSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
appId | AppIdSchema | |
env | EnvSchema | |
clusterName | ClusterNameSchema | |
namespaceName | NamespaceNameSchema | |

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
200 | [ApiResponseFor200](#delete_namespace.ApiResponseFor200) | 解除关联成功

#### delete_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_missing_namespaces**
<a id="find_missing_namespaces"></a>
> [str] find_missing_namespaces(app_idenvcluster_name)

查找缺失的Namespace (new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
    }
    try:
        # 查找缺失的Namespace (new added)
        api_response = api_instance.find_missing_namespaces(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_missing_namespaces: %s\n" % e)
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
env | EnvSchema | |
clusterName | ClusterNameSchema | |

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

# ClusterNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#find_missing_namespaces.ApiResponseFor200) | 缺失的命名空间名称列表

#### find_missing_namespaces.ApiResponseFor200
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
items | str,  | str,  |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_namespace**
<a id="find_namespace"></a>
> OpenNamespaceDTO find_namespace(app_idenvcluster_namenamespace_name)

获取指定的Namespace (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
from apollo_openapi.model.open_namespace_dto import OpenNamespaceDTO
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'fillItemDetail': True,
    }
    try:
        # 获取指定的Namespace (original openapi)
        api_response = api_instance.find_namespace(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_namespace: %s\n" % e)

    # example passing only optional values
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'fillItemDetail': True,
        'extendInfo': False,
    }
    try:
        # 获取指定的Namespace (original openapi)
        api_response = api_instance.find_namespace(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_namespace: %s\n" % e)
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
fillItemDetail | FillItemDetailSchema | |
extendInfo | ExtendInfoSchema | | optional


# FillItemDetailSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of True

# ExtendInfoSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
appId | AppIdSchema | |
env | EnvSchema | |
clusterName | ClusterNameSchema | |
namespaceName | NamespaceNameSchema | |

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
200 | [ApiResponseFor200](#find_namespace.ApiResponseFor200) |

#### find_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenNamespaceDTO**](../../models/OpenNamespaceDTO.md) |  |


### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_namespace_usage**
<a id="find_namespace_usage"></a>
> [OpenNamespaceUsageDTO] find_namespace_usage(app_idenvcluster_namenamespace_name)

查询namespace使用情况(new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/usage

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
from apollo_openapi.model.open_namespace_usage_dto import OpenNamespaceUsageDTO
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    try:
        # 查询namespace使用情况(new added)
        api_response = api_instance.find_namespace_usage(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_namespace_usage: %s\n" % e)
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
env | EnvSchema | |
clusterName | ClusterNameSchema | |
namespaceName | NamespaceNameSchema | |

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
200 | [ApiResponseFor200](#find_namespace_usage.ApiResponseFor200) | NamespaceUsage查询成功

#### find_namespace_usage.ApiResponseFor200
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
[**OpenNamespaceUsageDTO**]({{complexTypePrefix}}OpenNamespaceUsageDTO.md) | [**OpenNamespaceUsageDTO**]({{complexTypePrefix}}OpenNamespaceUsageDTO.md) | [**OpenNamespaceUsageDTO**]({{complexTypePrefix}}OpenNamespaceUsageDTO.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_namespaces**
<a id="find_namespaces"></a>
> [OpenNamespaceDTO] find_namespaces(app_idenvcluster_name)

获取指定集群下的所有Namespace (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
from apollo_openapi.model.open_namespace_dto import OpenNamespaceDTO
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
    }
    query_params = {
        'fillItemDetail': True,
    }
    try:
        # 获取指定集群下的所有Namespace (original openapi)
        api_response = api_instance.find_namespaces(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_namespaces: %s\n" % e)

    # example passing only optional values
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
    }
    query_params = {
        'fillItemDetail': True,
        'extendInfo': False,
    }
    try:
        # 获取指定集群下的所有Namespace (original openapi)
        api_response = api_instance.find_namespaces(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_namespaces: %s\n" % e)
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
fillItemDetail | FillItemDetailSchema | |
extendInfo | ExtendInfoSchema | | optional


# FillItemDetailSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of True

# ExtendInfoSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
appId | AppIdSchema | |
env | EnvSchema | |
clusterName | ClusterNameSchema | |

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

# ClusterNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#find_namespaces.ApiResponseFor200) |

#### find_namespaces.ApiResponseFor200
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
[**OpenNamespaceDTO**]({{complexTypePrefix}}OpenNamespaceDTO.md) | [**OpenNamespaceDTO**]({{complexTypePrefix}}OpenNamespaceDTO.md) | [**OpenNamespaceDTO**]({{complexTypePrefix}}OpenNamespaceDTO.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_public_namespace_for_associated_namespace**
<a id="find_public_namespace_for_associated_namespace"></a>
> OpenNamespaceDTO find_public_namespace_for_associated_namespace(envapp_idcluster_namenamespace_name)

查询关联Namespace对应的公共Namespace详情 (new added)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
from apollo_openapi.model.open_namespace_dto import OpenNamespaceDTO
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

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
        # 查询关联Namespace对应的公共Namespace详情 (new added)
        api_response = api_instance.find_public_namespace_for_associated_namespace(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_public_namespace_for_associated_namespace: %s\n" % e)

    # example passing only optional values
    path_params = {
        'env': "env_example",
        'appId': "appId_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'extendInfo': False,
    }
    try:
        # 查询关联Namespace对应的公共Namespace详情 (new added)
        api_response = api_instance.find_public_namespace_for_associated_namespace(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->find_public_namespace_for_associated_namespace: %s\n" % e)
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
extendInfo | ExtendInfoSchema | | optional


# ExtendInfoSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

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
200 | [ApiResponseFor200](#find_public_namespace_for_associated_namespace.ApiResponseFor200) | 成功获取关联的公共Namespace详情

#### find_public_namespace_for_associated_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenNamespaceDTO**](../../models/OpenNamespaceDTO.md) |  |


### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_namespaces_release_status**
<a id="get_namespaces_release_status"></a>
> StringToStringBoolMap get_namespaces_release_status(app_id)

获取应用下所有Namespace的发布状态 (new added)

GET /openapi/v1/apps/{appId}/namespaces/releases/status

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import namespace_management_api
from apollo_openapi.model.string_to_string_bool_map import StringToStringBoolMap
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
    api_instance = namespace_management_api.NamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
    }
    try:
        # 获取应用下所有Namespace的发布状态 (new added)
        api_response = api_instance.get_namespaces_release_status(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling NamespaceManagementApi->get_namespaces_release_status: %s\n" % e)
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

# AppIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_namespaces_release_status.ApiResponseFor200) | 成功获取发布状态映射

#### get_namespaces_release_status.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**StringToStringBoolMap**](../../models/StringToStringBoolMap.md) |  |


### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)
