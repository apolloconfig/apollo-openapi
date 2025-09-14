# NamespaceManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openapiV1AppnamespacesGet**](NamespaceManagementApi.md#openapiV1AppnamespacesGet) | **GET** /openapi/v1/appnamespaces | 获取所有公共AppNamespace |
| [**openapiV1AppsAppIdAppnamespacesGet**](NamespaceManagementApi.md#openapiV1AppsAppIdAppnamespacesGet) | **GET** /openapi/v1/apps/{appId}/appnamespaces | 获取指定应用的AppNamespace |
| [**openapiV1AppsAppIdAppnamespacesNamespaceNameGet**](NamespaceManagementApi.md#openapiV1AppsAppIdAppnamespacesNamespaceNameGet) | **GET** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 获取指定的AppNamespace |
| [**openapiV1AppsAppIdAppnamespacesPost**](NamespaceManagementApi.md#openapiV1AppsAppIdAppnamespacesPost) | **POST** /openapi/v1/apps/{appId}/appnamespaces | 创建AppNamespace |
| [**openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet**](NamespaceManagementApi.md#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check | 检查缺失的Namespace |
| [**openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet**](NamespaceManagementApi.md#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association | 获取关联的公共Namespace |
| [**openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet**](NamespaceManagementApi.md#openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet) | **GET** /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances | 获取公共AppNamespace的所有实例 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet**](NamespaceManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces | 获取指定集群下的所有Namespace |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet**](NamespaceManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock | 获取Namespace的锁状态 |


<a id="openapiV1AppnamespacesGet"></a>
# **openapiV1AppnamespacesGet**
> List&lt;OpenAppNamespaceDTO&gt; openapiV1AppnamespacesGet(publicOnly)

获取所有公共AppNamespace

GET /openapi/v1/appnamespaces?public&#x3D;true

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
    Boolean publicOnly = false; // Boolean | 
    try {
      List<OpenAppNamespaceDTO> result = apiInstance.openapiV1AppnamespacesGet(publicOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1AppnamespacesGet");
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
| **publicOnly** | **Boolean**|  | |

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

<a id="openapiV1AppsAppIdAppnamespacesGet"></a>
# **openapiV1AppsAppIdAppnamespacesGet**
> List&lt;OpenAppNamespaceDTO&gt; openapiV1AppsAppIdAppnamespacesGet(appId)

获取指定应用的AppNamespace

GET /openapi/v1/apps/{appId}/appnamespaces

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
    try {
      List<OpenAppNamespaceDTO> result = apiInstance.openapiV1AppsAppIdAppnamespacesGet(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1AppsAppIdAppnamespacesGet");
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

<a id="openapiV1AppsAppIdAppnamespacesNamespaceNameGet"></a>
# **openapiV1AppsAppIdAppnamespacesNamespaceNameGet**
> OpenAppNamespaceDTO openapiV1AppsAppIdAppnamespacesNamespaceNameGet(appId, namespaceName)

获取指定的AppNamespace

GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

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
    String namespaceName = "namespaceName_example"; // String | 
    try {
      OpenAppNamespaceDTO result = apiInstance.openapiV1AppsAppIdAppnamespacesNamespaceNameGet(appId, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1AppsAppIdAppnamespacesNamespaceNameGet");
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
| **namespaceName** | **String**|  | |

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
| **200** |  |  -  |

<a id="openapiV1AppsAppIdAppnamespacesPost"></a>
# **openapiV1AppsAppIdAppnamespacesPost**
> OpenAppNamespaceDTO openapiV1AppsAppIdAppnamespacesPost(appId, openAppNamespaceDTO)

创建AppNamespace

POST /openapi/v1/apps/{appId}/appnamespaces

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
    OpenAppNamespaceDTO openAppNamespaceDTO = new OpenAppNamespaceDTO(); // OpenAppNamespaceDTO | 
    try {
      OpenAppNamespaceDTO result = apiInstance.openapiV1AppsAppIdAppnamespacesPost(appId, openAppNamespaceDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1AppsAppIdAppnamespacesPost");
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

<a id="openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet"></a>
# **openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet**
> List&lt;String&gt; openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet(appId, env, clusterName)

检查缺失的Namespace

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check

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
    try {
      List<String> result = apiInstance.openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet(appId, env, clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet");
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
| **200** |  |  -  |

<a id="openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet"></a>
# **openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet**
> OpenNamespaceDTO openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet(appId, env, clusterName, namespaceName)

获取关联的公共Namespace

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association

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
    try {
      OpenNamespaceDTO result = apiInstance.openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet");
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

<a id="openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet"></a>
# **openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet**
> List&lt;OpenNamespaceDTO&gt; openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet(env, publicNamespaceName, page, size)

获取公共AppNamespace的所有实例

GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances

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
    String env = "env_example"; // String | 
    String publicNamespaceName = "publicNamespaceName_example"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 10; // Integer | 
    try {
      List<OpenNamespaceDTO> result = apiInstance.openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet(env, publicNamespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet");
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
| **publicNamespaceName** | **String**|  | |
| **page** | **Integer**|  | |
| **size** | **Integer**|  | |

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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet**
> List&lt;OpenNamespaceDTO&gt; openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet(appId, env, clusterName, fillItemDetail)

获取指定集群下的所有Namespace

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
    try {
      List<OpenNamespaceDTO> result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet(appId, env, clusterName, fillItemDetail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet");
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
| **fillItemDetail** | **Boolean**|  | |

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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet**
> OpenNamespaceLockDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet(appId, env, clusterName, namespaceName)

获取Namespace的锁状态

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock

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
    try {
      OpenNamespaceLockDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet");
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

[**OpenNamespaceLockDTO**](OpenNamespaceLockDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

