# AppNamespaceManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppNamespace**](AppNamespaceManagementApi.md#createAppNamespace) | **POST** /openapi/v1/apps/{appId}/appnamespaces | 创建AppNamespace (original openapi) |
| [**deleteAppNamespace**](AppNamespaceManagementApi.md#deleteAppNamespace) | **DELETE** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 删除AppNamespace (new added) |
| [**findAppNamespace**](AppNamespaceManagementApi.md#findAppNamespace) | **GET** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 获取指定的AppNamespace (new added) |
| [**findAppNamespaceUsage**](AppNamespaceManagementApi.md#findAppNamespaceUsage) | **GET** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}/usage | 查询appnamespace使用情况(new added) |
| [**getAppNamespaces**](AppNamespaceManagementApi.md#getAppNamespaces) | **GET** /openapi/v1/appnamespaces | 获取所有公共AppNamespace (new added) |
| [**getAppNamespacesByAppId**](AppNamespaceManagementApi.md#getAppNamespacesByAppId) | **GET** /openapi/v1/apps/{appId}/appnamespaces | 获取指定应用的AppNamespace (new added) |
| [**getPublicAppNamespaceInstances**](AppNamespaceManagementApi.md#getPublicAppNamespaceInstances) | **GET** /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances | 获取公共AppNamespace的所有实例 (new added) |


<a id="createAppNamespace"></a>
# **createAppNamespace**
> OpenAppNamespaceDTO createAppNamespace(appId, openAppNamespaceDTO, operator)

创建AppNamespace (original openapi)

POST /openapi/v1/apps/{appId}/appnamespaces

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppNamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppNamespaceManagementApi apiInstance = new AppNamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    OpenAppNamespaceDTO openAppNamespaceDTO = new OpenAppNamespaceDTO(); // OpenAppNamespaceDTO |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      OpenAppNamespaceDTO result = apiInstance.createAppNamespace(appId, openAppNamespaceDTO, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppNamespaceManagementApi#createAppNamespace");
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
| **openAppNamespaceDTO** | [**OpenAppNamespaceDTO**](OpenAppNamespaceDTO.md)|  | |
| **operator** | **String**| 操作人用户名 | [optional] |

### Return type

[**OpenAppNamespaceDTO**](OpenAppNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AppNamespace创建成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="deleteAppNamespace"></a>
# **deleteAppNamespace**
> deleteAppNamespace(appId, namespaceName, operator)

删除AppNamespace (new added)

DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppNamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppNamespaceManagementApi apiInstance = new AppNamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.deleteAppNamespace(appId, namespaceName, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppNamespaceManagementApi#deleteAppNamespace");
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
| **appId** | **String**| 应用ID | |
| **namespaceName** | **String**| 命名空间名称 | |
| **operator** | **String**| 操作人用户名 | [optional] |

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
| **200** | AppNamespace删除成功 |  -  |

<a id="findAppNamespace"></a>
# **findAppNamespace**
> OpenAppNamespaceDTO findAppNamespace(appId, namespaceName, extendInfo)

获取指定的AppNamespace (new added)

GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppNamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppNamespaceManagementApi apiInstance = new AppNamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    Boolean extendInfo = false; // Boolean |
    try {
      OpenAppNamespaceDTO result = apiInstance.findAppNamespace(appId, namespaceName, extendInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppNamespaceManagementApi#findAppNamespace");
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
| **appId** | **String**| 应用ID | |
| **namespaceName** | **String**| 命名空间名称 | |
| **extendInfo** | **Boolean**|  | [optional] [default to false] |

### Return type

[**OpenAppNamespaceDTO**](OpenAppNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取AppNamespace |  -  |

<a id="findAppNamespaceUsage"></a>
# **findAppNamespaceUsage**
> List&lt;OpenNamespaceUsageDTO&gt; findAppNamespaceUsage(appId, namespaceName)

查询appnamespace使用情况(new added)

GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}/usage

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppNamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppNamespaceManagementApi apiInstance = new AppNamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    try {
      List<OpenNamespaceUsageDTO> result = apiInstance.findAppNamespaceUsage(appId, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppNamespaceManagementApi#findAppNamespaceUsage");
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
| **appId** | **String**| 应用ID | |
| **namespaceName** | **String**| 命名空间名称 | |

### Return type

[**List&lt;OpenNamespaceUsageDTO&gt;**](OpenNamespaceUsageDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AppNamespaceUsage查询成功 |  -  |

<a id="getAppNamespaces"></a>
# **getAppNamespaces**
> List&lt;OpenAppNamespaceDTO&gt; getAppNamespaces()

获取所有公共AppNamespace (new added)

GET /openapi/v1/appnamespaces/public

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppNamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppNamespaceManagementApi apiInstance = new AppNamespaceManagementApi(defaultClient);
    try {
      List<OpenAppNamespaceDTO> result = apiInstance.getAppNamespaces();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppNamespaceManagementApi#getAppNamespaces");
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

[**List&lt;OpenAppNamespaceDTO&gt;**](OpenAppNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getAppNamespacesByAppId"></a>
# **getAppNamespacesByAppId**
> List&lt;OpenAppNamespaceDTO&gt; getAppNamespacesByAppId(appId)

获取指定应用的AppNamespace (new added)

GET /openapi/v1/apps/{appId}/appnamespaces

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppNamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppNamespaceManagementApi apiInstance = new AppNamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    try {
      List<OpenAppNamespaceDTO> result = apiInstance.getAppNamespacesByAppId(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppNamespaceManagementApi#getAppNamespacesByAppId");
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

### Return type

[**List&lt;OpenAppNamespaceDTO&gt;**](OpenAppNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getPublicAppNamespaceInstances"></a>
# **getPublicAppNamespaceInstances**
> List&lt;OpenNamespaceDTO&gt; getPublicAppNamespaceInstances(env, publicNamespaceName, page, size)

获取公共AppNamespace的所有实例 (new added)

GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppNamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppNamespaceManagementApi apiInstance = new AppNamespaceManagementApi(defaultClient);
    String env = "env_example"; // String | 环境标识
    String publicNamespaceName = "publicNamespaceName_example"; // String | 公共命名空间名称
    Integer page = 0; // Integer | 页码，从0开始
    Integer size = 10; // Integer | 每页数量
    try {
      List<OpenNamespaceDTO> result = apiInstance.getPublicAppNamespaceInstances(env, publicNamespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppNamespaceManagementApi#getPublicAppNamespaceInstances");
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
| **env** | **String**| 环境标识 | |
| **publicNamespaceName** | **String**| 公共命名空间名称 | |
| **page** | **Integer**| 页码，从0开始 | |
| **size** | **Integer**| 每页数量 | |

### Return type

[**List&lt;OpenNamespaceDTO&gt;**](OpenNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取实例列表 |  -  |
