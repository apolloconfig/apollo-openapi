# ReleaseManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet**](ReleaseManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active | 获取活跃发布（分页） |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet**](ReleaseManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all | 获取所有发布（分页） |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet**](ReleaseManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/latest | 获取最新活跃发布 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost**](ReleaseManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases | 创建发布 |
| [**openapiV1EnvsEnvReleasesCompareGet**](ReleaseManagementApi.md#openapiV1EnvsEnvReleasesCompareGet) | **GET** /openapi/v1/envs/{env}/releases/compare | 对比发布 |
| [**openapiV1EnvsEnvReleasesReleaseIdGet**](ReleaseManagementApi.md#openapiV1EnvsEnvReleasesReleaseIdGet) | **GET** /openapi/v1/envs/{env}/releases/{releaseId} | 获取发布详情 |
| [**openapiV1EnvsEnvReleasesReleaseIdRollbackPut**](ReleaseManagementApi.md#openapiV1EnvsEnvReleasesReleaseIdRollbackPut) | **PUT** /openapi/v1/envs/{env}/releases/{releaseId}/rollback | 回滚发布 |


<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet**
> List&lt;OpenReleaseDTO&gt; openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet(appId, env, clusterName, namespaceName, page, size)

获取活跃发布（分页）

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReleaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ReleaseManagementApi apiInstance = new ReleaseManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 5; // Integer | 
    try {
      List<OpenReleaseDTO> result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet(appId, env, clusterName, namespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet");
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
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |
| **page** | **Integer**|  | |
| **size** | **Integer**|  | |

### Return type

[**List&lt;OpenReleaseDTO&gt;**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet**
> List&lt;ListReleaseBO&gt; openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet(appId, env, clusterName, namespaceName, page, size)

获取所有发布（分页）

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReleaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ReleaseManagementApi apiInstance = new ReleaseManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 5; // Integer | 
    try {
      List<ListReleaseBO> result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet(appId, env, clusterName, namespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet");
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
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |
| **page** | **Integer**|  | |
| **size** | **Integer**|  | |

### Return type

[**List&lt;ListReleaseBO&gt;**](ListReleaseBO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet**
> OpenReleaseDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet(appId, env, clusterName, namespaceName)

获取最新活跃发布



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReleaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ReleaseManagementApi apiInstance = new ReleaseManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    try {
      OpenReleaseDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet");
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
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |

### Return type

[**OpenReleaseDTO**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取最新活跃发布 |  -  |
| **404** | 未找到活跃发布 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost**
> OpenReleaseDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost(appId, env, clusterName, namespaceName, namespaceReleaseDTO)

创建发布



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReleaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ReleaseManagementApi apiInstance = new ReleaseManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO | 
    try {
      OpenReleaseDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost(appId, env, clusterName, namespaceName, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost");
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
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |
| **namespaceReleaseDTO** | [**NamespaceReleaseDTO**](NamespaceReleaseDTO.md)|  | |

### Return type

[**OpenReleaseDTO**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 发布创建成功 |  -  |
| **400** | 发布参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1EnvsEnvReleasesCompareGet"></a>
# **openapiV1EnvsEnvReleasesCompareGet**
> OpenapiV1EnvsEnvReleasesCompareGet200Response openapiV1EnvsEnvReleasesCompareGet(env, baseReleaseId, toCompareReleaseId)

对比发布

GET /openapi/v1/envs/{env}/releases/compare

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReleaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ReleaseManagementApi apiInstance = new ReleaseManagementApi(defaultClient);
    String env = "env_example"; // String | 
    Integer baseReleaseId = 56; // Integer | 
    Integer toCompareReleaseId = 56; // Integer | 
    try {
      OpenapiV1EnvsEnvReleasesCompareGet200Response result = apiInstance.openapiV1EnvsEnvReleasesCompareGet(env, baseReleaseId, toCompareReleaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#openapiV1EnvsEnvReleasesCompareGet");
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
| **baseReleaseId** | **Integer**|  | |
| **toCompareReleaseId** | **Integer**|  | |

### Return type

[**OpenapiV1EnvsEnvReleasesCompareGet200Response**](OpenapiV1EnvsEnvReleasesCompareGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="openapiV1EnvsEnvReleasesReleaseIdGet"></a>
# **openapiV1EnvsEnvReleasesReleaseIdGet**
> OpenReleaseDTO openapiV1EnvsEnvReleasesReleaseIdGet(env, releaseId)

获取发布详情

GET /openapi/v1/envs/{env}/releases/{releaseId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReleaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ReleaseManagementApi apiInstance = new ReleaseManagementApi(defaultClient);
    String env = "env_example"; // String | 
    Integer releaseId = 56; // Integer | 
    try {
      OpenReleaseDTO result = apiInstance.openapiV1EnvsEnvReleasesReleaseIdGet(env, releaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#openapiV1EnvsEnvReleasesReleaseIdGet");
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

### Return type

[**OpenReleaseDTO**](OpenReleaseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="openapiV1EnvsEnvReleasesReleaseIdRollbackPut"></a>
# **openapiV1EnvsEnvReleasesReleaseIdRollbackPut**
> Object openapiV1EnvsEnvReleasesReleaseIdRollbackPut(env, releaseId, operator)

回滚发布



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReleaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ReleaseManagementApi apiInstance = new ReleaseManagementApi(defaultClient);
    String env = "env_example"; // String | 
    Integer releaseId = 56; // Integer | 
    String operator = "operator_example"; // String | 
    try {
      Object result = apiInstance.openapiV1EnvsEnvReleasesReleaseIdRollbackPut(env, releaseId, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#openapiV1EnvsEnvReleasesReleaseIdRollbackPut");
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
| **operator** | **String**|  | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

