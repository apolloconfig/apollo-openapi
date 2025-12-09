# NamespaceManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMissingNamespaces**](NamespaceManagementApi.md#createMissingNamespaces) | **POST** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces | 创建缺失的Namespace (new added) |
| [**createNamespaces**](NamespaceManagementApi.md#createNamespaces) | **POST** /openapi/v1/namespaces | 创建Namespace (new added) |
| [**deleteNamespace**](NamespaceManagementApi.md#deleteNamespace) | **DELETE** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName} | 删除指定的Namespace (new added) |
| [**findMissingNamespaces**](NamespaceManagementApi.md#findMissingNamespaces) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces | 查找缺失的Namespace (new added) |
| [**findNamespace**](NamespaceManagementApi.md#findNamespace) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} | 获取指定的Namespace (original openapi) |
| [**findNamespaceUsage**](NamespaceManagementApi.md#findNamespaceUsage) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/usage | 查询namespace使用情况(new added) |
| [**findNamespaces**](NamespaceManagementApi.md#findNamespaces) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces | 获取指定集群下的所有Namespace (original openapi) |
| [**findPublicNamespaceForAssociatedNamespace**](NamespaceManagementApi.md#findPublicNamespaceForAssociatedNamespace) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace | 查询关联Namespace对应的公共Namespace详情 (new added) |
| [**getNamespacesReleaseStatus**](NamespaceManagementApi.md#getNamespacesReleaseStatus) | **GET** /openapi/v1/apps/{appId}/namespaces/releases/status | 获取应用下所有Namespace的发布状态 (new added) |


<a id="createMissingNamespaces"></a>
# **createMissingNamespaces**
> Object createMissingNamespaces(appId, env, clusterName, operator)

创建缺失的Namespace (new added)

POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String operator = "operator_example"; // String | 操作人用户名
    try {
      Object result = apiInstance.createMissingNamespaces(appId, env, clusterName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#createMissingNamespaces");
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
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**| 集群名称 | |
| **operator** | **String**| 操作人用户名 | [optional] |

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
| **200** | 缺失的命名空间创建成功 |  -  |

<a id="createNamespaces"></a>
# **createNamespaces**
> createNamespaces(openCreateNamespaceDTO, operator)

创建Namespace (new added)

POST /openapi/v1/apps/{appId}/namespaces

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    List<OpenCreateNamespaceDTO> openCreateNamespaceDTO = Arrays.asList(); // List<OpenCreateNamespaceDTO> |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.createNamespaces(openCreateNamespaceDTO, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#createNamespaces");
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
| **openCreateNamespaceDTO** | [**List&lt;OpenCreateNamespaceDTO&gt;**](OpenCreateNamespaceDTO.md)|  | |
| **operator** | **String**| 操作人用户名 | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Namespace创建成功 |  -  |

<a id="deleteNamespace"></a>
# **deleteNamespace**
> deleteNamespace(appId, env, clusterName, namespaceName, operator)

删除指定的Namespace (new added)

DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.deleteNamespace(appId, env, clusterName, namespaceName, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#deleteNamespace");
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
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**| 集群名称 | |
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
| **200** | 解除关联成功 |  -  |

<a id="findMissingNamespaces"></a>
# **findMissingNamespaces**
> List&lt;String&gt; findMissingNamespaces(appId, env, clusterName)

查找缺失的Namespace (new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    try {
      List<String> result = apiInstance.findMissingNamespaces(appId, env, clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#findMissingNamespaces");
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
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**| 集群名称 | |

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 缺失的命名空间名称列表 |  -  |

<a id="findNamespace"></a>
# **findNamespace**
> OpenNamespaceDTO findNamespace(appId, env, clusterName, namespaceName, fillItemDetail, extendInfo)

获取指定的Namespace (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    Boolean fillItemDetail = true; // Boolean |
    Boolean extendInfo = false; // Boolean |
    try {
      OpenNamespaceDTO result = apiInstance.findNamespace(appId, env, clusterName, namespaceName, fillItemDetail, extendInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#findNamespace");
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
| **fillItemDetail** | **Boolean**|  | [default to true] |
| **extendInfo** | **Boolean**|  | [optional] [default to false] |

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

<a id="findNamespaceUsage"></a>
# **findNamespaceUsage**
> List&lt;OpenNamespaceUsageDTO&gt; findNamespaceUsage(appId, env, clusterName, namespaceName)

查询namespace使用情况(new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/usage

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    try {
      List<OpenNamespaceUsageDTO> result = apiInstance.findNamespaceUsage(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#findNamespaceUsage");
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
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**| 集群名称 | |
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
| **200** | NamespaceUsage查询成功 |  -  |

<a id="findNamespaces"></a>
# **findNamespaces**
> List&lt;OpenNamespaceDTO&gt; findNamespaces(appId, env, clusterName, fillItemDetail, extendInfo)

获取指定集群下的所有Namespace (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    Boolean fillItemDetail = true; // Boolean |
    Boolean extendInfo = false; // Boolean |
    try {
      List<OpenNamespaceDTO> result = apiInstance.findNamespaces(appId, env, clusterName, fillItemDetail, extendInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#findNamespaces");
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
| **fillItemDetail** | **Boolean**|  | [default to true] |
| **extendInfo** | **Boolean**|  | [optional] [default to false] |

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
| **200** |  |  -  |

<a id="findPublicNamespaceForAssociatedNamespace"></a>
# **findPublicNamespaceForAssociatedNamespace**
> OpenNamespaceDTO findPublicNamespaceForAssociatedNamespace(env, appId, clusterName, namespaceName, extendInfo)

查询关联Namespace对应的公共Namespace详情 (new added)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String env = "env_example"; // String | 环境标识
    String appId = "appId_example"; // String | 应用ID
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 关联Namespace名称
    Boolean extendInfo = false; // Boolean |
    try {
      OpenNamespaceDTO result = apiInstance.findPublicNamespaceForAssociatedNamespace(env, appId, clusterName, namespaceName, extendInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#findPublicNamespaceForAssociatedNamespace");
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
| **namespaceName** | **String**| 关联Namespace名称 | |
| **extendInfo** | **Boolean**|  | [optional] [default to false] |

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
| **200** | 成功获取关联的公共Namespace详情 |  -  |

<a id="getNamespacesReleaseStatus"></a>
# **getNamespacesReleaseStatus**
> Map&lt;String, Map&lt;String, Boolean&gt;&gt; getNamespacesReleaseStatus(appId)

获取应用下所有Namespace的发布状态 (new added)

GET /openapi/v1/apps/{appId}/namespaces/releases/status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceManagementApi apiInstance = new NamespaceManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    try {
      Map<String, Map<String, Boolean>> result = apiInstance.getNamespacesReleaseStatus(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#getNamespacesReleaseStatus");
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

### Return type

[**Map&lt;String, Map&lt;String, Boolean&gt;&gt;**](Map.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取发布状态映射 |  -  |
