# ClusterManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openapiV1AppsAppIdClustersClusterNameGet**](ClusterManagementApi.md#openapiV1AppsAppIdClustersClusterNameGet) | **GET** /openapi/v1/apps/{appId}/clusters/{clusterName} | 获取指定集群信息 |
| [**openapiV1AppsAppIdClustersPost**](ClusterManagementApi.md#openapiV1AppsAppIdClustersPost) | **POST** /openapi/v1/apps/{appId}/clusters | 创建集群 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete**](ClusterManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} | 删除集群 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet**](ClusterManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches | 获取命名空间分支信息 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet**](ClusterManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} | 获取指定的Namespace |


<a id="openapiV1AppsAppIdClustersClusterNameGet"></a>
# **openapiV1AppsAppIdClustersClusterNameGet**
> OpenClusterDTO openapiV1AppsAppIdClustersClusterNameGet(appId, clusterName)

获取指定集群信息

GET /openapi/v1/apps/{appId}/clusters/{clusterName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterManagementApi apiInstance = new ClusterManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    try {
      OpenClusterDTO result = apiInstance.openapiV1AppsAppIdClustersClusterNameGet(appId, clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#openapiV1AppsAppIdClustersClusterNameGet");
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
| **clusterName** | **String**|  | |

### Return type

[**OpenClusterDTO**](OpenClusterDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取集群信息 |  -  |
| **404** | 集群不存在 |  -  |

<a id="openapiV1AppsAppIdClustersPost"></a>
# **openapiV1AppsAppIdClustersPost**
> OpenClusterDTO openapiV1AppsAppIdClustersPost(appId, openClusterDTO)

创建集群

POST /openapi/v1/apps/{appId}/clusters

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterManagementApi apiInstance = new ClusterManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    OpenClusterDTO openClusterDTO = new OpenClusterDTO(); // OpenClusterDTO | 
    try {
      OpenClusterDTO result = apiInstance.openapiV1AppsAppIdClustersPost(appId, openClusterDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#openapiV1AppsAppIdClustersPost");
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
| **openClusterDTO** | [**OpenClusterDTO**](OpenClusterDTO.md)|  | |

### Return type

[**OpenClusterDTO**](OpenClusterDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 集群创建成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete**
> OpenapiV1AppsGet401Response openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete(env, appId, clusterName)

删除集群

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterManagementApi apiInstance = new ClusterManagementApi(defaultClient);
    String env = "env_example"; // String | 
    String appId = "appId_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete(env, appId, clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete");
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
| **appId** | **String**|  | |
| **clusterName** | **String**|  | |

### Return type

[**OpenapiV1AppsGet401Response**](OpenapiV1AppsGet401Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 集群删除成功 |  -  |
| **400** | 删除失败，集群可能包含配置 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 集群不存在 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet**
> OpenNamespaceDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet(appId, env, clusterName, namespaceName)

获取命名空间分支信息

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterManagementApi apiInstance = new ClusterManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    try {
      OpenNamespaceDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet");
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

[**OpenNamespaceDTO**](OpenNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | 分支不存在 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet**
> OpenNamespaceDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet(appId, env, clusterName, namespaceName, fillItemDetail)

获取指定的Namespace

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterManagementApi apiInstance = new ClusterManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    Boolean fillItemDetail = true; // Boolean | 
    try {
      OpenNamespaceDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet(appId, env, clusterName, namespaceName, fillItemDetail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet");
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
| **fillItemDetail** | **Boolean**|  | |

### Return type

[**OpenNamespaceDTO**](OpenNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

