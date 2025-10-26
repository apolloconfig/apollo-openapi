# ClusterManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCluster**](ClusterManagementApi.md#createCluster) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters | 创建集群 (original openapi) |
| [**deleteCluster**](ClusterManagementApi.md#deleteCluster) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} | 删除集群 (new added) |
| [**getCluster**](ClusterManagementApi.md#getCluster) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} | 获取指定集群信息 (original openapi) |


<a id="createCluster"></a>
# **createCluster**
> OpenClusterDTO createCluster(appId, env, openClusterDTO)

创建集群 (original openapi)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String |
    OpenClusterDTO openClusterDTO = new OpenClusterDTO(); // OpenClusterDTO |
    try {
      OpenClusterDTO result = apiInstance.createCluster(appId, env, openClusterDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#createCluster");
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
| **env** | **String**|  | |
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

<a id="deleteCluster"></a>
# **deleteCluster**
> Object deleteCluster(env, appId, clusterName, operator)

删除集群 (new added)

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
    String operator = "operator_example"; // String | 操作人用户名，openapi外部调用时需传入
    try {
      Object result = apiInstance.deleteCluster(env, appId, clusterName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#deleteCluster");
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
| **operator** | **String**| 操作人用户名，openapi外部调用时需传入 | [optional] |

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
| **200** | 集群删除成功 |  -  |
| **400** | 删除失败，集群可能包含配置 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 集群不存在 |  -  |

<a id="getCluster"></a>
# **getCluster**
> OpenClusterDTO getCluster(appId, clusterName, env)

获取指定集群信息 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}

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
    String env = "env_example"; // String |
    try {
      OpenClusterDTO result = apiInstance.getCluster(appId, clusterName, env);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterManagementApi#getCluster");
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
| **env** | **String**|  | |

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
