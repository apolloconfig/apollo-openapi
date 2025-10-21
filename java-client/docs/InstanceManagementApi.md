# InstanceManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByRelease**](InstanceManagementApi.md#getByRelease) | **GET** /openapi/v1/envs/{env}/releases/{releaseId}/instances | 根据发布版本查询实例（支持分页） (new added) |
| [**getByReleasesNotIn**](InstanceManagementApi.md#getByReleasesNotIn) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances_not_in | 查询不在指定发布版本中的实例 (new added) |
| [**getInstanceCountByNamespace**](InstanceManagementApi.md#getInstanceCountByNamespace) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances | 获取命名空间下的实例数量 (original openapi) |


<a id="getByRelease"></a>
# **getByRelease**
> OpenPageDTOOpenInstanceDTO getByRelease(env, releaseId, page, size)

根据发布版本查询实例（支持分页） (new added)

GET /openapi/v1/envs/{env}/releases/{releaseId}/instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InstanceManagementApi apiInstance = new InstanceManagementApi(defaultClient);
    String env = "env_example"; // String |
    Integer releaseId = 56; // Integer |
    Integer page = 0; // Integer |
    Integer size = 20; // Integer |
    try {
      OpenPageDTOOpenInstanceDTO result = apiInstance.getByRelease(env, releaseId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#getByRelease");
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
| **env** | **String**|  | |
| **releaseId** | **Integer**|  | |
| **page** | **Integer**|  | |
| **size** | **Integer**|  | |

### Return type

[**OpenPageDTOOpenInstanceDTO**](OpenPageDTOOpenInstanceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getByReleasesNotIn"></a>
# **getByReleasesNotIn**
> List&lt;OpenInstanceDTO&gt; getByReleasesNotIn(env, appId, clusterName, namespaceName, excludeReleases)

查询不在指定发布版本中的实例 (new added)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances?excludeReleases&#x3D;1,2,3

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InstanceManagementApi apiInstance = new InstanceManagementApi(defaultClient);
    String env = "env_example"; // String | 环境标识
    String appId = "appId_example"; // String | 应用ID
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String excludeReleases = "excludeReleases_example"; // String | 排除的发布ID列表，用逗号分隔
    try {
      List<OpenInstanceDTO> result = apiInstance.getByReleasesNotIn(env, appId, clusterName, namespaceName, excludeReleases);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#getByReleasesNotIn");
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
| **appId** | **String**| 应用ID | |
| **clusterName** | **String**| 集群名称 | |
| **namespaceName** | **String**| 命名空间名称 | |
| **excludeReleases** | **String**| 排除的发布ID列表，用逗号分隔 | [optional] |

### Return type

[**List&lt;OpenInstanceDTO&gt;**](OpenInstanceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getInstanceCountByNamespace"></a>
# **getInstanceCountByNamespace**
> Integer getInstanceCountByNamespace(env, appId, clusterName, namespaceName)

获取命名空间下的实例数量 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InstanceManagementApi apiInstance = new InstanceManagementApi(defaultClient);
    String env = "env_example"; // String |
    String appId = "appId_example"; // String | 应用ID
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    try {
      Integer result = apiInstance.getInstanceCountByNamespace(env, appId, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#getInstanceCountByNamespace");
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
| **env** | **String**|  | |
| **appId** | **String**| 应用ID | |
| **clusterName** | **String**| 集群名称 | |
| **namespaceName** | **String**| 命名空间名称 | |

### Return type

**Integer**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功返回实例数量 |  -  |
