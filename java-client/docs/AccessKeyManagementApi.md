# AccessKeyManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccessKey**](AccessKeyManagementApi.md#createAccessKey) | **POST** /openapi/v1/apps/{appId}/envs/{env}/accesskeys | 创建AccessKey |
| [**deleteAccessKey**](AccessKeyManagementApi.md#deleteAccessKey) | **DELETE** /openapi/v1/apps/{appId}/envs/{env}/accesskeys/{accessKeyId} | 删除AccessKey |
| [**disableAccessKey**](AccessKeyManagementApi.md#disableAccessKey) | **PUT** /openapi/v1/apps/{appId}/envs/{env}/accesskeys/{accessKeyId}/deactivation | 禁用AccessKey |
| [**enableAccessKey**](AccessKeyManagementApi.md#enableAccessKey) | **PUT** /openapi/v1/apps/{appId}/envs/{env}/accesskeys/{accessKeyId}/activation | 启用AccessKey |
| [**findAccessKeys**](AccessKeyManagementApi.md#findAccessKeys) | **GET** /openapi/v1/apps/{appId}/envs/{env}/accesskeys | 查找AccessKey |


<a id="createAccessKey"></a>
# **createAccessKey**
> OpenAccessKeyDTO createAccessKey(appId, env, operator)

创建AccessKey



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AccessKeyManagementApi apiInstance = new AccessKeyManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String operator = "operator_example"; // String |
    try {
      OpenAccessKeyDTO result = apiInstance.createAccessKey(appId, env, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyManagementApi#createAccessKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **env** | **String**|  | |
| **operator** | **String**|  | [optional] |

### Return type

[**OpenAccessKeyDTO**](OpenAccessKeyDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="deleteAccessKey"></a>
# **deleteAccessKey**
> deleteAccessKey(appId, env, accessKeyId, operator)

删除AccessKey



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AccessKeyManagementApi apiInstance = new AccessKeyManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    Long accessKeyId = 56L; // Long |
    String operator = "operator_example"; // String |
    try {
      apiInstance.deleteAccessKey(appId, env, accessKeyId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyManagementApi#deleteAccessKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **env** | **String**|  | |
| **accessKeyId** | **Long**|  | |
| **operator** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="disableAccessKey"></a>
# **disableAccessKey**
> disableAccessKey(appId, env, accessKeyId)

禁用AccessKey



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AccessKeyManagementApi apiInstance = new AccessKeyManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    Long accessKeyId = 56L; // Long |
    try {
      apiInstance.disableAccessKey(appId, env, accessKeyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyManagementApi#disableAccessKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **env** | **String**|  | |
| **accessKeyId** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="enableAccessKey"></a>
# **enableAccessKey**
> enableAccessKey(appId, env, accessKeyId, mode)

启用AccessKey



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AccessKeyManagementApi apiInstance = new AccessKeyManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    Long accessKeyId = 56L; // Long |
    Integer mode = 0; // Integer |
    try {
      apiInstance.enableAccessKey(appId, env, accessKeyId, mode);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyManagementApi#enableAccessKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **env** | **String**|  | |
| **accessKeyId** | **Long**|  | |
| **mode** | **Integer**|  | [optional] [default to 0] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="findAccessKeys"></a>
# **findAccessKeys**
> List&lt;OpenAccessKeyDTO&gt; findAccessKeys(appId, env)

查找AccessKey



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AccessKeyManagementApi apiInstance = new AccessKeyManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    try {
      List<OpenAccessKeyDTO> result = apiInstance.findAccessKeys(appId, env);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyManagementApi#findAccessKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **env** | **String**|  | |

### Return type

[**List&lt;OpenAccessKeyDTO&gt;**](OpenAccessKeyDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
