# InstanceManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByNamespace**](InstanceManagementApi.md#getByNamespace) | **GET** /openapi/v1/envs/{env}/instances/by-namespace | 根据namespaceName查询实例（new added） |
| [**getByRelease**](InstanceManagementApi.md#getByRelease) | **GET** /openapi/v1/envs/{env}/instances/by-release | 根据发布版本查询实例（支持分页） (new added) |
| [**getByReleasesAndNamespaceNotIn**](InstanceManagementApi.md#getByReleasesAndNamespaceNotIn) | **GET** /openapi/v1/envs/{env}/instances/by-namespace-and-releases-not-in | 查询不在指定发布版本中的实例 (new added) |
| [**getInstanceCountByNamespace**](InstanceManagementApi.md#getInstanceCountByNamespace) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances | 获取命名空间下的实例数量 (original openapi) |


<a id="getByNamespace"></a>
# **getByNamespace**
> OpenInstancePageDTO getByNamespace(env, appId, clusterName, namespaceName, page, size, instanceAppId)

根据namespaceName查询实例（new added）

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
    Integer page = 0; // Integer | 页数
    Integer size = 0; // Integer | 页大小
    String instanceAppId = "instanceAppId_example"; // String | Instance表中的AppID
    try {
      OpenInstancePageDTO result = apiInstance.getByNamespace(env, appId, clusterName, namespaceName, page, size, instanceAppId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#getByNamespace");
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
| **page** | **Integer**| 页数 | [default to 0] |
| **size** | **Integer**| 页大小 | [default to 0] |
| **instanceAppId** | **String**| Instance表中的AppID | [optional] |

### Return type

[**OpenInstancePageDTO**](OpenInstancePageDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getByRelease"></a>
# **getByRelease**
> OpenInstancePageDTO getByRelease(env, releaseId, page, size)

根据发布版本查询实例（支持分页） (new added)

GET /openapi/v1/envs/{env}/instances/by-release

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
    Long releaseId = 56L; // Long |
    Integer page = 0; // Integer |
    Integer size = 20; // Integer |
    try {
      OpenInstancePageDTO result = apiInstance.getByRelease(env, releaseId, page, size);
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
| **releaseId** | **Long**|  | |
| **page** | **Integer**|  | |
| **size** | **Integer**|  | |

### Return type

[**OpenInstancePageDTO**](OpenInstancePageDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getByReleasesAndNamespaceNotIn"></a>
# **getByReleasesAndNamespaceNotIn**
> List&lt;OpenInstanceDTO&gt; getByReleasesAndNamespaceNotIn(env, appId, clusterName, namespaceName, releaseIds)

查询不在指定发布版本中的实例 (new added)

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
    String releaseIds = "releaseIds_example"; // String | 排除的发布ID列表，用逗号分隔
    try {
      List<OpenInstanceDTO> result = apiInstance.getByReleasesAndNamespaceNotIn(env, appId, clusterName, namespaceName, releaseIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceManagementApi#getByReleasesAndNamespaceNotIn");
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
| **releaseIds** | **String**| 排除的发布ID列表，用逗号分隔 | |

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
