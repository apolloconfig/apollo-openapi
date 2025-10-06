<a id="__pageTop"></a>
# apollo_openapi.apis.tags.item_management_api.ItemManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_update_items_by_text**](#batch_update_items_by_text) | **put** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/batchUpdate | 通过文本批量修改配置项 (new added)
[**compare_items**](#compare_items) | **post** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/compare | 对比命名空间配置差异 (new added)
[**create_item**](#create_item) | **post** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 创建新的配置项 (original openapi)
[**delete_item**](#delete_item) | **delete** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 删除配置项 (original openapi)
[**delete_item_by_encoded_key**](#delete_item_by_encoded_key) | **delete** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key删除配置项 (original openapi)
[**find_items_by_namespace**](#find_items_by_namespace) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 获取命名空间下的配置项列表 (original openapi)
[**get_branch_items**](#get_branch_items) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items | 获取分支下的配置项 (new added)
[**get_item**](#get_item) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 获取单个配置项 (original openapi)
[**get_item_by_encoded_key**](#get_item_by_encoded_key) | **get** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过查询参数获取配置项（支持编码的key） (original openapi)
[**revert_items**](#revert_items) | **post** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revert | 撤销配置项更改 (new added)
[**sync_items**](#sync_items) | **post** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/sync | 同步配置项到多个命名空间 (new added)
[**update_item**](#update_item) | **put** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 更新配置项 (original openapi)
[**update_item_by_encoded_key**](#update_item_by_encoded_key) | **put** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key更新配置项 (original openapi)
[**validate_items**](#validate_items) | **post** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validate | 验证配置文本语法 (new added)

# **batch_update_items_by_text**
<a id="batch_update_items_by_text"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} batch_update_items_by_text(app_idenvcluster_namenamespace_nameoperatoropen_namespace_text_model)

通过文本批量修改配置项 (new added)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/batchUpdate:

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.exception_response import ExceptionResponse
from apollo_openapi.model.open_namespace_text_model import OpenNamespaceTextModel
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    body = OpenNamespaceTextModel(
        app_id="app_id_example",
        env="env_example",
        cluster_name="cluster_name_example",
        namespace_name="namespace_name_example",
        namespace_id=1,
        format="format_example",
        config_text="config_text_example",
        operator="operator_example",
    )
    try:
        # 通过文本批量修改配置项 (new added)
        api_response = api_instance.batch_update_items_by_text(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->batch_update_items_by_text: %s\n" % e)
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
[**OpenNamespaceTextModel**](../../models/OpenNamespaceTextModel.md) |  |


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
200 | [ApiResponseFor200](#batch_update_items_by_text.ApiResponseFor200) | 批量更新配置项成功
403 | [ApiResponseFor403](#batch_update_items_by_text.ApiResponseFor403) | 权限不足

#### batch_update_items_by_text.ApiResponseFor200
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

#### batch_update_items_by_text.ApiResponseFor403
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

# **compare_items**
<a id="compare_items"></a>
> [OpenItemDiffs] compare_items(app_idenvcluster_namenamespace_nameopen_namespace_sync_model)

对比命名空间配置差异 (new added)

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/compare

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_item_diffs import OpenItemDiffs
from apollo_openapi.model.open_namespace_sync_model import OpenNamespaceSyncModel
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    body = OpenNamespaceSyncModel(
        sync_to_namespaces=[
            OpenNamespaceIdentifier(
                app_id="app_id_example",
                env="env_example",
                cluster_name="cluster_name_example",
                namespace_name="namespace_name_example",
            )
        ],
        sync_items=[
            OpenItemDTO(
                data_change_created_by="data_change_created_by_example",
                data_change_last_modified_by="data_change_last_modified_by_example",
                data_change_created_time="2025-09-29T12:34:56Z",
                data_change_last_modified_time="2025-09-29T12:34:56Z",
                key="key_example",
                type=1,
                value="value_example",
                comment="comment_example",
            )
        ],
    )
    try:
        # 对比命名空间配置差异 (new added)
        api_response = api_instance.compare_items(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->compare_items: %s\n" % e)
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
[**OpenNamespaceSyncModel**](../../models/OpenNamespaceSyncModel.md) |  |


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
200 | [ApiResponseFor200](#compare_items.ApiResponseFor200) | 成功对比命名空间配置差异

#### compare_items.ApiResponseFor200
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
[**OpenItemDiffs**]({{complexTypePrefix}}OpenItemDiffs.md) | [**OpenItemDiffs**]({{complexTypePrefix}}OpenItemDiffs.md) | [**OpenItemDiffs**]({{complexTypePrefix}}OpenItemDiffs.md) |  |

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **create_item**
<a id="create_item"></a>
> OpenItemDTO create_item(app_idenvcluster_namenamespace_nameoperatoropen_item_dto)

创建新的配置项 (original openapi)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_item_dto import OpenItemDTO
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    body = OpenItemDTO(
        data_change_created_by="data_change_created_by_example",
        data_change_last_modified_by="data_change_last_modified_by_example",
        data_change_created_time="2025-09-29T12:34:56Z",
        data_change_last_modified_time="2025-09-29T12:34:56Z",
        key="key_example",
        type=1,
        value="value_example",
        comment="comment_example",
    )
    try:
        # 创建新的配置项 (original openapi)
        api_response = api_instance.create_item(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->create_item: %s\n" % e)
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
[**OpenItemDTO**](../../models/OpenItemDTO.md) |  |


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
200 | [ApiResponseFor200](#create_item.ApiResponseFor200) | 配置项创建成功
400 | [ApiResponseFor400](#create_item.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#create_item.ApiResponseFor403) | 权限不足

#### create_item.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenItemDTO**](../../models/OpenItemDTO.md) |  |


#### create_item.ApiResponseFor400
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

#### create_item.ApiResponseFor403
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

# **delete_item**
<a id="delete_item"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} delete_item(app_idenvcluster_namenamespace_namekeyoperator)

删除配置项 (original openapi)

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
        'key': "key_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    try:
        # 删除配置项 (original openapi)
        api_response = api_instance.delete_item(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->delete_item: %s\n" % e)
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
appId | AppIdSchema | |
env | EnvSchema | |
clusterName | ClusterNameSchema | |
namespaceName | NamespaceNameSchema | |
key | KeySchema | |

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

# KeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#delete_item.ApiResponseFor200) | 配置项删除成功

#### delete_item.ApiResponseFor200
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

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete_item_by_encoded_key**
<a id="delete_item_by_encoded_key"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} delete_item_by_encoded_key(app_idenvcluster_namenamespace_namekeyoperator)

通过编码的key删除配置项 (original openapi)

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
        'key': "key_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    try:
        # 通过编码的key删除配置项 (original openapi)
        api_response = api_instance.delete_item_by_encoded_key(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->delete_item_by_encoded_key: %s\n" % e)
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
appId | AppIdSchema | |
env | EnvSchema | |
clusterName | ClusterNameSchema | |
namespaceName | NamespaceNameSchema | |
key | KeySchema | |

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

# KeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#delete_item_by_encoded_key.ApiResponseFor200) |

#### delete_item_by_encoded_key.ApiResponseFor200
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

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_items_by_namespace**
<a id="find_items_by_namespace"></a>
> OpenPageDTOOpenItemDTO find_items_by_namespace(app_idenvcluster_namenamespace_namepagesize)

获取命名空间下的配置项列表 (original openapi)

获取指定命名空间的配置项列表，支持分页

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_page_dto_open_item_dto import OpenPageDTOOpenItemDTO
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'page': 0,
        'size': 50,
    }
    try:
        # 获取命名空间下的配置项列表 (original openapi)
        api_response = api_instance.find_items_by_namespace(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->find_items_by_namespace: %s\n" % e)
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
200 | [ApiResponseFor200](#find_items_by_namespace.ApiResponseFor200) | 成功获取配置项列表
404 | [ApiResponseFor404](#find_items_by_namespace.ApiResponseFor404) | 命名空间不存在

#### find_items_by_namespace.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenPageDTOOpenItemDTO**](../../models/OpenPageDTOOpenItemDTO.md) |  |


#### find_items_by_namespace.ApiResponseFor404
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

# **get_branch_items**
<a id="get_branch_items"></a>
> [OpenItemDTO] get_branch_items(app_idenvcluster_namenamespace_namebranch_name)

获取分支下的配置项 (new added)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items:

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_item_dto import OpenItemDTO
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
        'branchName': "branchName_example",
    }
    try:
        # 获取分支下的配置项 (new added)
        api_response = api_instance.get_branch_items(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->get_branch_items: %s\n" % e)
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
branchName | BranchNameSchema | |

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

# BranchNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_branch_items.ApiResponseFor200) | 成功获取分支下的配置项列表
404 | [ApiResponseFor404](#get_branch_items.ApiResponseFor404) | 分支不存在

#### get_branch_items.ApiResponseFor200
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
[**OpenItemDTO**]({{complexTypePrefix}}OpenItemDTO.md) | [**OpenItemDTO**]({{complexTypePrefix}}OpenItemDTO.md) | [**OpenItemDTO**]({{complexTypePrefix}}OpenItemDTO.md) |  |

#### get_branch_items.ApiResponseFor404
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

# **get_item**
<a id="get_item"></a>
> OpenItemDTO get_item(app_idenvcluster_namenamespace_namekey)

获取单个配置项 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_item_dto import OpenItemDTO
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
        'key': "key_example",
    }
    try:
        # 获取单个配置项 (original openapi)
        api_response = api_instance.get_item(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->get_item: %s\n" % e)
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
key | KeySchema | |

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

# KeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_item.ApiResponseFor200) | 成功获取配置项
404 | [ApiResponseFor404](#get_item.ApiResponseFor404) | 配置项不存在

#### get_item.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenItemDTO**](../../models/OpenItemDTO.md) |  |


#### get_item.ApiResponseFor404
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

# **get_item_by_encoded_key**
<a id="get_item_by_encoded_key"></a>
> OpenItemDTO get_item_by_encoded_key(app_idenvcluster_namenamespace_namekey)

通过查询参数获取配置项（支持编码的key） (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_item_dto import OpenItemDTO
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
        'key': "key_example",
    }
    try:
        # 通过查询参数获取配置项（支持编码的key） (original openapi)
        api_response = api_instance.get_item_by_encoded_key(
            path_params=path_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->get_item_by_encoded_key: %s\n" % e)
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
key | KeySchema | |

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

# KeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_item_by_encoded_key.ApiResponseFor200) | 成功获取配置项（支持编码key）
404 | [ApiResponseFor404](#get_item_by_encoded_key.ApiResponseFor404) | 配置项不存在

#### get_item_by_encoded_key.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenItemDTO**](../../models/OpenItemDTO.md) |  |


#### get_item_by_encoded_key.ApiResponseFor404
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

# **revert_items**
<a id="revert_items"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} revert_items(app_idenvcluster_namenamespace_nameoperator)

撤销配置项更改 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revert

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
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
        # 撤销配置项更改 (new added)
        api_response = api_instance.revert_items(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->revert_items: %s\n" % e)
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
200 | [ApiResponseFor200](#revert_items.ApiResponseFor200) | 配置项更改撤销成功
400 | [ApiResponseFor400](#revert_items.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#revert_items.ApiResponseFor403) | 权限不足

#### revert_items.ApiResponseFor200
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

#### revert_items.ApiResponseFor400
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

#### revert_items.ApiResponseFor403
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

# **sync_items**
<a id="sync_items"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} sync_items(app_idenvcluster_namenamespace_nameoperatoropen_namespace_sync_model)

同步配置项到多个命名空间 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/sync:

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_namespace_sync_model import OpenNamespaceSyncModel
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    query_params = {
        'operator': "operator_example",
    }
    body = OpenNamespaceSyncModel(
        sync_to_namespaces=[
            OpenNamespaceIdentifier(
                app_id="app_id_example",
                env="env_example",
                cluster_name="cluster_name_example",
                namespace_name="namespace_name_example",
            )
        ],
        sync_items=[
            OpenItemDTO(
                data_change_created_by="data_change_created_by_example",
                data_change_last_modified_by="data_change_last_modified_by_example",
                data_change_created_time="2025-09-29T12:34:56Z",
                data_change_last_modified_time="2025-09-29T12:34:56Z",
                key="key_example",
                type=1,
                value="value_example",
                comment="comment_example",
            )
        ],
    )
    try:
        # 同步配置项到多个命名空间 (new added)
        api_response = api_instance.sync_items(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->sync_items: %s\n" % e)
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
[**OpenNamespaceSyncModel**](../../models/OpenNamespaceSyncModel.md) |  |


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
200 | [ApiResponseFor200](#sync_items.ApiResponseFor200) | 配置项同步成功
400 | [ApiResponseFor400](#sync_items.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#sync_items.ApiResponseFor403) | 权限不足

#### sync_items.ApiResponseFor200
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

#### sync_items.ApiResponseFor400
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

#### sync_items.ApiResponseFor403
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

# **update_item**
<a id="update_item"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} update_item(app_idenvcluster_namenamespace_namekeyopen_item_dto)

更新配置项 (original openapi)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_item_dto import OpenItemDTO
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
        'key': "key_example",
    }
    query_params = {
        'createIfNotExists': False,
    }
    body = OpenItemDTO(
        data_change_created_by="data_change_created_by_example",
        data_change_last_modified_by="data_change_last_modified_by_example",
        data_change_created_time="2025-09-29T12:34:56Z",
        data_change_last_modified_time="2025-09-29T12:34:56Z",
        key="key_example",
        type=1,
        value="value_example",
        comment="comment_example",
    )
    try:
        # 更新配置项 (original openapi)
        api_response = api_instance.update_item(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->update_item: %s\n" % e)
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
[**OpenItemDTO**](../../models/OpenItemDTO.md) |  |


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
createIfNotExists | CreateIfNotExistsSchema | |


# CreateIfNotExistsSchema

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
key | KeySchema | |

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

# KeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#update_item.ApiResponseFor200) | 配置项更新成功
400 | [ApiResponseFor400](#update_item.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#update_item.ApiResponseFor403) | 权限不足
404 | [ApiResponseFor404](#update_item.ApiResponseFor404) | 配置项不存在

#### update_item.ApiResponseFor200
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

#### update_item.ApiResponseFor400
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

#### update_item.ApiResponseFor403
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

#### update_item.ApiResponseFor404
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

# **update_item_by_encoded_key**
<a id="update_item_by_encoded_key"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} update_item_by_encoded_key(app_idenvcluster_namenamespace_namekeyopen_item_dto)

通过编码的key更新配置项 (original openapi)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.open_item_dto import OpenItemDTO
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
        'key': "key_example",
    }
    query_params = {
        'createIfNotExists': False,
    }
    body = OpenItemDTO(
        data_change_created_by="data_change_created_by_example",
        data_change_last_modified_by="data_change_last_modified_by_example",
        data_change_created_time="2025-09-29T12:34:56Z",
        data_change_last_modified_time="2025-09-29T12:34:56Z",
        key="key_example",
        type=1,
        value="value_example",
        comment="comment_example",
    )
    try:
        # 通过编码的key更新配置项 (original openapi)
        api_response = api_instance.update_item_by_encoded_key(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->update_item_by_encoded_key: %s\n" % e)
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
[**OpenItemDTO**](../../models/OpenItemDTO.md) |  |


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
createIfNotExists | CreateIfNotExistsSchema | |


# CreateIfNotExistsSchema

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
key | KeySchema | |

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

# KeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#update_item_by_encoded_key.ApiResponseFor200) | 配置项更新成功（编码key）
400 | [ApiResponseFor400](#update_item_by_encoded_key.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#update_item_by_encoded_key.ApiResponseFor403) | 权限不足
404 | [ApiResponseFor404](#update_item_by_encoded_key.ApiResponseFor404) | 配置项不存在

#### update_item_by_encoded_key.ApiResponseFor200
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

#### update_item_by_encoded_key.ApiResponseFor400
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

#### update_item_by_encoded_key.ApiResponseFor403
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

#### update_item_by_encoded_key.ApiResponseFor404
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

# **validate_items**
<a id="validate_items"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} validate_items(app_idenvcluster_namenamespace_nameopen_namespace_text_model)

验证配置文本语法 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validate

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import item_management_api
from apollo_openapi.model.exception_response import ExceptionResponse
from apollo_openapi.model.open_namespace_text_model import OpenNamespaceTextModel
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
    api_instance = item_management_api.ItemManagementApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'appId': "appId_example",
        'env': "env_example",
        'clusterName': "clusterName_example",
        'namespaceName': "namespaceName_example",
    }
    body = OpenNamespaceTextModel(
        app_id="app_id_example",
        env="env_example",
        cluster_name="cluster_name_example",
        namespace_name="namespace_name_example",
        namespace_id=1,
        format="format_example",
        config_text="config_text_example",
        operator="operator_example",
    )
    try:
        # 验证配置文本语法 (new added)
        api_response = api_instance.validate_items(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling ItemManagementApi->validate_items: %s\n" % e)
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
[**OpenNamespaceTextModel**](../../models/OpenNamespaceTextModel.md) |  |


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
200 | [ApiResponseFor200](#validate_items.ApiResponseFor200) | 配置文本语法验证通过
400 | [ApiResponseFor400](#validate_items.ApiResponseFor400) | 配置文本语法错误

#### validate_items.ApiResponseFor200
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

#### validate_items.ApiResponseFor400
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

### Authorization

[ApiKeyAuth](../../../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)
