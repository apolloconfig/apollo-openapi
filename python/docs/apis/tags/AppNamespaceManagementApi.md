<a id="__pageTop"></a>
# apollo_openapi.apis.tags.app_namespace_management_api.AppNamespaceManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_app_namespace**](#create_app_namespace) | **post** /openapi/v1/apps/{appId}/appnamespaces | 创建AppNamespace (original openapi)
[**delete_app_namespace**](#delete_app_namespace) | **delete** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 删除AppNamespace (new added)
[**find_app_namespace**](#find_app_namespace) | **get** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 获取指定的AppNamespace (new added)
[**find_app_namespace_usage**](#find_app_namespace_usage) | **get** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}/usage | 查询appnamespace使用情况(new added)
[**get_app_namespaces**](#get_app_namespaces) | **get** /openapi/v1/appnamespaces | 获取所有公共AppNamespace (new added)
[**get_app_namespaces_by_app_id**](#get_app_namespaces_by_app_id) | **get** /openapi/v1/apps/{appId}/appnamespaces | 获取指定应用的AppNamespace (new added)
[**get_public_app_namespace_instances**](#get_public_app_namespace_instances) | **get** /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances | 获取公共AppNamespace的所有实例 (new added)

# **create_app_namespace**
<a id="create_app_namespace"></a>
> OpenAppNamespaceDTO create_app_namespace(app_idopen_app_namespace_dto)

创建AppNamespace (original openapi)

POST /openapi/v1/apps/{appId}/appnamespaces

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import app_namespace_management_api
from apollo_openapi.model.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = app_namespace_management_api.AppNamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
    }
    query_params = {
    }
    body = OpenAppNamespaceDTO(
        data_change_created_by="data_change_created_by_example",
        data_change_last_modified_by="data_change_last_modified_by_example",
        data_change_created_time="2025-09-29T12:34:56Z",
        data_change_last_modified_time="2025-09-29T12:34:56Z",
        name="name_example",
        app_id="app_id_example",
        format="format_example",
        is_public=True,
        append_namespace_prefix=True,
        comment="comment_example",
    )
    try:
        # 创建AppNamespace (original openapi)
        api_response = api_instance.create_app_namespace(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->create_app_namespace: %s\n" % e)

    # example passing only optional values
    path_params = {
        'appId': "appId_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    body = OpenAppNamespaceDTO(
        data_change_created_by="data_change_created_by_example",
        data_change_last_modified_by="data_change_last_modified_by_example",
        data_change_created_time="2025-09-29T12:34:56Z",
        data_change_last_modified_time="2025-09-29T12:34:56Z",
        name="name_example",
        app_id="app_id_example",
        format="format_example",
        is_public=True,
        append_namespace_prefix=True,
        comment="comment_example",
    )
    try:
        # 创建AppNamespace (original openapi)
        api_response = api_instance.create_app_namespace(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->create_app_namespace: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
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
[**OpenAppNamespaceDTO**](../../models/OpenAppNamespaceDTO.md) |  |


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

# AppIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_app_namespace.ApiResponseFor200) | AppNamespace创建成功
400 | [ApiResponseFor400](#create_app_namespace.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#create_app_namespace.ApiResponseFor403) | 权限不足

#### create_app_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenAppNamespaceDTO**](../../models/OpenAppNamespaceDTO.md) |  |


#### create_app_namespace.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ExceptionResponse**](../../models/ExceptionResponse.md) |  |


#### create_app_namespace.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ExceptionResponse**](../../models/ExceptionResponse.md) |  |


### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete_app_namespace**
<a id="delete_app_namespace"></a>
> delete_app_namespace(app_idnamespace_name)

删除AppNamespace (new added)

DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import app_namespace_management_api
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
    api_instance = app_namespace_management_api.AppNamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
    }
    try:
        # 删除AppNamespace (new added)
        api_response = api_instance.delete_app_namespace(
            path_params=path_params,
            query_params=query_params,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->delete_app_namespace: %s\n" % e)

    # example passing only optional values
    path_params = {
        'appId': "appId_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    try:
        # 删除AppNamespace (new added)
        api_response = api_instance.delete_app_namespace(
            path_params=path_params,
            query_params=query_params,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->delete_app_namespace: %s\n" % e)
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
namespaceName | NamespaceNameSchema | |

# AppIdSchema

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
200 | [ApiResponseFor200](#delete_app_namespace.ApiResponseFor200) | AppNamespace删除成功

#### delete_app_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_app_namespace**
<a id="find_app_namespace"></a>
> OpenAppNamespaceDTO find_app_namespace(app_idnamespace_name)

获取指定的AppNamespace (new added)

GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import app_namespace_management_api
from apollo_openapi.model.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = app_namespace_management_api.AppNamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
    }
    try:
        # 获取指定的AppNamespace (new added)
        api_response = api_instance.find_app_namespace(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->find_app_namespace: %s\n" % e)

    # example passing only optional values
    path_params = {
        'appId': "appId_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'extendInfo': False,
    }
    try:
        # 获取指定的AppNamespace (new added)
        api_response = api_instance.find_app_namespace(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->find_app_namespace: %s\n" % e)
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
appId | AppIdSchema | |
namespaceName | NamespaceNameSchema | |

# AppIdSchema

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
200 | [ApiResponseFor200](#find_app_namespace.ApiResponseFor200) | 成功获取AppNamespace

#### find_app_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenAppNamespaceDTO**](../../models/OpenAppNamespaceDTO.md) |  |


### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_app_namespace_usage**
<a id="find_app_namespace_usage"></a>
> [OpenNamespaceUsageDTO] find_app_namespace_usage(app_idnamespace_name)

查询appnamespace使用情况(new added)

GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}/usage

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import app_namespace_management_api
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
    api_instance = app_namespace_management_api.AppNamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'namespaceName': "namespaceName_example",
    }
    try:
        # 查询appnamespace使用情况(new added)
        api_response = api_instance.find_app_namespace_usage(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->find_app_namespace_usage: %s\n" % e)
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
namespaceName | NamespaceNameSchema | |

# AppIdSchema

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
200 | [ApiResponseFor200](#find_app_namespace_usage.ApiResponseFor200) | AppNamespaceUsage查询成功

#### find_app_namespace_usage.ApiResponseFor200
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

# **get_app_namespaces**
<a id="get_app_namespaces"></a>
> [OpenAppNamespaceDTO] get_app_namespaces()

获取所有公共AppNamespace (new added)

GET /openapi/v1/appnamespaces/public

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import app_namespace_management_api
from apollo_openapi.model.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = app_namespace_management_api.AppNamespaceManagementApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # 获取所有公共AppNamespace (new added)
        api_response = api_instance.get_app_namespaces()
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->get_app_namespaces: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_app_namespaces.ApiResponseFor200) |

#### get_app_namespaces.ApiResponseFor200
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
[**OpenAppNamespaceDTO**]({{complexTypePrefix}}OpenAppNamespaceDTO.md) | [**OpenAppNamespaceDTO**]({{complexTypePrefix}}OpenAppNamespaceDTO.md) | [**OpenAppNamespaceDTO**]({{complexTypePrefix}}OpenAppNamespaceDTO.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_app_namespaces_by_app_id**
<a id="get_app_namespaces_by_app_id"></a>
> [OpenAppNamespaceDTO] get_app_namespaces_by_app_id(app_id)

获取指定应用的AppNamespace (new added)

GET /openapi/v1/apps/{appId}/appnamespaces

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import app_namespace_management_api
from apollo_openapi.model.open_app_namespace_dto import OpenAppNamespaceDTO
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
    api_instance = app_namespace_management_api.AppNamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
    }
    try:
        # 获取指定应用的AppNamespace (new added)
        api_response = api_instance.get_app_namespaces_by_app_id(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->get_app_namespaces_by_app_id: %s\n" % e)
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
200 | [ApiResponseFor200](#get_app_namespaces_by_app_id.ApiResponseFor200) |

#### get_app_namespaces_by_app_id.ApiResponseFor200
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
[**OpenAppNamespaceDTO**]({{complexTypePrefix}}OpenAppNamespaceDTO.md) | [**OpenAppNamespaceDTO**]({{complexTypePrefix}}OpenAppNamespaceDTO.md) | [**OpenAppNamespaceDTO**]({{complexTypePrefix}}OpenAppNamespaceDTO.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_public_app_namespace_instances**
<a id="get_public_app_namespace_instances"></a>
> [OpenNamespaceDTO] get_public_app_namespace_instances(envpublic_namespace_namepagesize)

获取公共AppNamespace的所有实例 (new added)

GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import app_namespace_management_api
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
    api_instance = app_namespace_management_api.AppNamespaceManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'env': "env_example",
        'publicNamespaceName': "publicNamespaceName_example",
    }
    query_params = {
        'page': 0,
        'size': 10,
    }
    try:
        # 获取公共AppNamespace的所有实例 (new added)
        api_response = api_instance.get_public_app_namespace_instances(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling AppNamespaceManagementApi->get_public_app_namespace_instances: %s\n" % e)
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
publicNamespaceName | PublicNamespaceNameSchema | |

# EnvSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# PublicNamespaceNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_public_app_namespace_instances.ApiResponseFor200) | 成功获取实例列表

#### get_public_app_namespace_instances.ApiResponseFor200
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
