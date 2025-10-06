<a id="__pageTop"></a>
# apollo_openapi.apis.tags.organization_management_api.OrganizationManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_organization**](#get_organization) | **get** /openapi/v1/organizations | 获取所有组织信息 (original openapi)

# **get_organization**
<a id="get_organization"></a>
> [OpenOrganizationDto] get_organization()

获取所有组织信息 (original openapi)

GET /openapi/v1/organizations

### Example

* Api Key Authentication (ApiKeyAuth):
```python
import apollo_openapi
from apollo_openapi.apis.tags import organization_management_api
from apollo_openapi.model.exception_response import ExceptionResponse
from apollo_openapi.model.open_organization_dto import OpenOrganizationDto
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
    api_instance = organization_management_api.OrganizationManagementApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # 获取所有组织信息 (original openapi)
        api_response = api_instance.get_organization()
        pprint(api_response)
    except apollo_openapi.ApiException as e:
        print("Exception when calling OrganizationManagementApi->get_organization: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_organization.ApiResponseFor200) | 成功获取组织列表
401 | [ApiResponseFor401](#get_organization.ApiResponseFor401) | 未授权访问

#### get_organization.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

组织列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 组织列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenOrganizationDto**]({{complexTypePrefix}}OpenOrganizationDto.md) | [**OpenOrganizationDto**]({{complexTypePrefix}}OpenOrganizationDto.md) | [**OpenOrganizationDto**]({{complexTypePrefix}}OpenOrganizationDto.md) |  |

#### get_organization.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson

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
