# OrganizationManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrganization**](OrganizationManagementApi.md#getOrganization) | **GET** /openapi/v1/organizations | 获取所有组织信息 (original openapi) |


<a id="getOrganization"></a>
# **getOrganization**
> List&lt;OpenOrganizationDto&gt; getOrganization()

获取所有组织信息 (original openapi)

GET /openapi/v1/organizations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    OrganizationManagementApi apiInstance = new OrganizationManagementApi(defaultClient);
    try {
      List<OpenOrganizationDto> result = apiInstance.getOrganization();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationManagementApi#getOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OpenOrganizationDto&gt;**](OpenOrganizationDto.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取组织列表 |  -  |
| **401** | 未授权访问 |  -  |
