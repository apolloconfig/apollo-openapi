<a id="__pageTop"></a>
# apollo_openapi.apis.tags.portal_user_management_api.PortalUserManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**change_user_enabled**](#change_user_enabled) | **put** /openapi/v1/users/enabled | 修改Portal用户启用状态(new added)
[**create_or_update_user**](#create_or_update_user) | **post** /openapi/v1/users | 创建或更新Portal用户(new added)
[**get_current_user**](#get_current_user) | **get** /openapi/v1/user | 获取当前Portal用户(new added)
[**search_users**](#search_users) | **get** /openapi/v1/users | 搜索Portal用户(new added)

# **change_user_enabled**
<a id="change_user_enabled"></a>
> change_user_enabled(open_user_dto)

修改Portal用户启用状态(new added)

PUT /openapi/v1/users/enabled

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import portal_user_management_api
from apollo_openapi.model.open_user_dto import OpenUserDTO
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
    api_instance = portal_user_management_api.PortalUserManagementApi(api_client)

    # example passing only required values which don't have defaults set
    body = OpenUserDTO(
        username="username_example",
        user_display_name="user_display_name_example",
        password="password_example",
        email="email_example",
        enabled=1,
    )
    try:
        # 修改Portal用户启用状态(new added)
        api_response = api_instance.change_user_enabled(
            body=body,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling PortalUserManagementApi->change_user_enabled: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenUserDTO**](../../models/OpenUserDTO.md) |  |


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#change_user_enabled.ApiResponseFor200) | 用户状态修改成功
400 | [ApiResponseFor400](#change_user_enabled.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#change_user_enabled.ApiResponseFor403) | 权限不足

#### change_user_enabled.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined | N/A
headers | Unset | headers were not defined |

#### change_user_enabled.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ExceptionResponse**](../../models/ExceptionResponse.md) |  |


#### change_user_enabled.ApiResponseFor403
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

# **create_or_update_user**
<a id="create_or_update_user"></a>
> create_or_update_user(open_user_dto)

创建或更新Portal用户(new added)

POST /openapi/v1/users

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import portal_user_management_api
from apollo_openapi.model.open_user_dto import OpenUserDTO
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
    api_instance = portal_user_management_api.PortalUserManagementApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
    }
    body = OpenUserDTO(
        username="username_example",
        user_display_name="user_display_name_example",
        password="password_example",
        email="email_example",
        enabled=1,
    )
    try:
        # 创建或更新Portal用户(new added)
        api_response = api_instance.create_or_update_user(
            query_params=query_params,
            body=body,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling PortalUserManagementApi->create_or_update_user: %s\n" % e)

    # example passing only optional values
    query_params = {
        'isCreate': False,
    }
    body = OpenUserDTO(
        username="username_example",
        user_display_name="user_display_name_example",
        password="password_example",
        email="email_example",
        enabled=1,
    )
    try:
        # 创建或更新Portal用户(new added)
        api_response = api_instance.create_or_update_user(
            query_params=query_params,
            body=body,
        )
    except apollo_openapi.ApiException as e:
        print("Exception when calling PortalUserManagementApi->create_or_update_user: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenUserDTO**](../../models/OpenUserDTO.md) |  |


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
isCreate | IsCreateSchema | | optional


# IsCreateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_or_update_user.ApiResponseFor200) | 用户创建或更新成功
400 | [ApiResponseFor400](#create_or_update_user.ApiResponseFor400) | 请求参数错误
403 | [ApiResponseFor403](#create_or_update_user.ApiResponseFor403) | 权限不足

#### create_or_update_user.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined | N/A
headers | Unset | headers were not defined |

#### create_or_update_user.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ExceptionResponse**](../../models/ExceptionResponse.md) |  |


#### create_or_update_user.ApiResponseFor403
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

# **get_current_user**
<a id="get_current_user"></a>
> OpenUserInfoDTO get_current_user()

获取当前Portal用户(new added)

GET /openapi/v1/user

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import portal_user_management_api
from apollo_openapi.model.exception_response import ExceptionResponse
from apollo_openapi.model.open_user_info_dto import OpenUserInfoDTO
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
    api_instance = portal_user_management_api.PortalUserManagementApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # 获取当前Portal用户(new added)
        api_response = api_instance.get_current_user()
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling PortalUserManagementApi->get_current_user: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_current_user.ApiResponseFor200) | 成功获取当前用户
401 | [ApiResponseFor401](#get_current_user.ApiResponseFor401) | 未登录或未授权访问
403 | [ApiResponseFor403](#get_current_user.ApiResponseFor403) | 仅支持Portal用户登录态访问

#### get_current_user.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OpenUserInfoDTO**](../../models/OpenUserInfoDTO.md) |  |


#### get_current_user.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ExceptionResponse**](../../models/ExceptionResponse.md) |  |


#### get_current_user.ApiResponseFor403
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

# **search_users**
<a id="search_users"></a>
> [OpenUserInfoDTO] search_users(keyword)

搜索Portal用户(new added)

GET /openapi/v1/users

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import portal_user_management_api
from apollo_openapi.model.exception_response import ExceptionResponse
from apollo_openapi.model.open_user_info_dto import OpenUserInfoDTO
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
    api_instance = portal_user_management_api.PortalUserManagementApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'keyword': "keyword_example",
    }
    try:
        # 搜索Portal用户(new added)
        api_response = api_instance.search_users(
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling PortalUserManagementApi->search_users: %s\n" % e)

    # example passing only optional values
    query_params = {
        'keyword': "keyword_example",
        'includeInactiveUsers': False,
        'offset': 0,
        'limit': 10,
    }
    try:
        # 搜索Portal用户(new added)
        api_response = api_instance.search_users(
            query_params=query_params,
        )
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling PortalUserManagementApi->search_users: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
keyword | KeywordSchema | |
includeInactiveUsers | IncludeInactiveUsersSchema | | optional
offset | OffsetSchema | | optional
limit | LimitSchema | | optional


# KeywordSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# IncludeInactiveUsersSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

# OffsetSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 0

# LimitSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 10

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#search_users.ApiResponseFor200) | 成功获取用户列表
401 | [ApiResponseFor401](#search_users.ApiResponseFor401) | 未登录或未授权访问
403 | [ApiResponseFor403](#search_users.ApiResponseFor403) | 仅支持Portal用户登录态访问

#### search_users.ApiResponseFor200
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
[**OpenUserInfoDTO**]({{complexTypePrefix}}OpenUserInfoDTO.md) | [**OpenUserInfoDTO**]({{complexTypePrefix}}OpenUserInfoDTO.md) | [**OpenUserInfoDTO**]({{complexTypePrefix}}OpenUserInfoDTO.md) |  |

#### search_users.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ExceptionResponse**](../../models/ExceptionResponse.md) |  |


#### search_users.ApiResponseFor403
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
