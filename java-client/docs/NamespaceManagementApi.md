# NamespaceManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkNamespaceIntegrity**](NamespaceManagementApi.md#checkNamespaceIntegrity) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check | 检查缺失的Namespace (new added) |
| [**createNamespace**](NamespaceManagementApi.md#createNamespace) | **POST** /openapi/v1/apps/{appId}/appnamespaces | 创建AppNamespace (original openapi) |
| [**deleteAppNamespace**](NamespaceManagementApi.md#deleteAppNamespace) | **DELETE** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 删除AppNamespace (new added) |
| [**deleteNamespaceLinks**](NamespaceManagementApi.md#deleteNamespaceLinks) | **DELETE** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links | 删除关联的Namespace (new added) |
| [**findNamespaces**](NamespaceManagementApi.md#findNamespaces) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces | 获取指定集群下的所有Namespace (original openapi) |
| [**getAppNamespace**](NamespaceManagementApi.md#getAppNamespace) | **GET** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 获取指定的AppNamespace (new added) |
| [**getAppNamespaces**](NamespaceManagementApi.md#getAppNamespaces) | **GET** /openapi/v1/appnamespaces | 获取所有公共AppNamespace (new added) |
| [**getAppNamespacesByApp**](NamespaceManagementApi.md#getAppNamespacesByApp) | **GET** /openapi/v1/apps/{appId}/appnamespaces | 获取指定应用的AppNamespace (new added) |
| [**getNamespaceLock**](NamespaceManagementApi.md#getNamespaceLock) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock | 获取Namespace的锁状态 (original openapi) |
| [**getNamespacesReleaseStatus**](NamespaceManagementApi.md#getNamespacesReleaseStatus) | **GET** /openapi/v1/apps/{appId}/namespaces/releases/status | 获取应用下所有Namespace的发布状态 (new added) |
| [**getPublicAppNamespaceInstances**](NamespaceManagementApi.md#getPublicAppNamespaceInstances) | **GET** /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances | 获取公共AppNamespace的所有实例 (new added) |
| [**getPublicNamespaceAssociation**](NamespaceManagementApi.md#getPublicNamespaceAssociation) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association | 获取关联的公共Namespace (new added) |
| [**loadNamespace**](NamespaceManagementApi.md#loadNamespace) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} | 获取指定的Namespace (original openapi) |


<a id="checkNamespaceIntegrity"></a>
# **checkNamespaceIntegrity**
> List&lt;String&gt; checkNamespaceIntegrity(appId, env, clusterName)

检查缺失的Namespace (new added)

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    try {
      List<String> result = apiInstance.checkNamespaceIntegrity(appId, env, clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#checkNamespaceIntegrity");
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

<a id="createNamespace"></a>
# **createNamespace**
> OpenAppNamespaceDTO createNamespace(appId, openAppNamespaceDTO)

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
      OpenAppNamespaceDTO result = apiInstance.createNamespace(appId, openAppNamespaceDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#createNamespace");
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

<a id="deleteAppNamespace"></a>
# **deleteAppNamespace**
> Object deleteAppNamespace(appId, namespaceName, operator)

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
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String operator = "operator_example"; // String | 操作人用户名
    try {
      Object result = apiInstance.deleteAppNamespace(appId, namespaceName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#deleteAppNamespace");
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
| **operator** | **String**| 操作人用户名 | |

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
| **200** | AppNamespace删除成功 |  -  |

<a id="deleteNamespaceLinks"></a>
# **deleteNamespaceLinks**
> Object deleteNamespaceLinks(appId, env, clusterName, namespaceName, operator)

删除关联的Namespace (new added)

DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links

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
      Object result = apiInstance.deleteNamespaceLinks(appId, env, clusterName, namespaceName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#deleteNamespaceLinks");
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
| **operator** | **String**| 操作人用户名 | |

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
| **200** | 解除关联成功 |  -  |

<a id="findNamespaces"></a>
# **findNamespaces**
> List&lt;OpenNamespaceDTO&gt; findNamespaces(appId, env, clusterName, fillItemDetail)

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
    try {
      List<OpenNamespaceDTO> result = apiInstance.findNamespaces(appId, env, clusterName, fillItemDetail);
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

<a id="getAppNamespace"></a>
# **getAppNamespace**
> OpenAppNamespaceDTO getAppNamespace(appId, namespaceName)

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
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    try {
      OpenAppNamespaceDTO result = apiInstance.getAppNamespace(appId, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#getAppNamespace");
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

<a id="getAppNamespaces"></a>
# **getAppNamespaces**
> List&lt;OpenAppNamespaceDTO&gt; getAppNamespaces(publicOnly)

获取所有公共AppNamespace (new added)

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
      List<OpenAppNamespaceDTO> result = apiInstance.getAppNamespaces(publicOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#getAppNamespaces");
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

<a id="getAppNamespacesByApp"></a>
# **getAppNamespacesByApp**
> List&lt;OpenAppNamespaceDTO&gt; getAppNamespacesByApp(appId)

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
      List<OpenAppNamespaceDTO> result = apiInstance.getAppNamespacesByApp(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#getAppNamespacesByApp");
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

<a id="getNamespaceLock"></a>
# **getNamespaceLock**
> OpenNamespaceLockDTO getNamespaceLock(appId, env, clusterName, namespaceName)

获取Namespace的锁状态 (original openapi)

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
      OpenNamespaceLockDTO result = apiInstance.getNamespaceLock(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#getNamespaceLock");
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
    String publicNamespaceName = "publicNamespaceName_example"; // String | 公共命名空间名称
    Integer page = 0; // Integer | 页码，从0开始
    Integer size = 10; // Integer | 每页数量
    try {
      List<OpenNamespaceDTO> result = apiInstance.getPublicAppNamespaceInstances(env, publicNamespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#getPublicAppNamespaceInstances");
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

<a id="getPublicNamespaceAssociation"></a>
# **getPublicNamespaceAssociation**
> OpenNamespaceDTO getPublicNamespaceAssociation(appId, env, clusterName, namespaceName)

获取关联的公共Namespace (new added)

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    try {
      OpenNamespaceDTO result = apiInstance.getPublicNamespaceAssociation(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#getPublicNamespaceAssociation");
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

[**OpenNamespaceDTO**](OpenNamespaceDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取关联的公共Namespace |  -  |

<a id="loadNamespace"></a>
# **loadNamespace**
> OpenNamespaceDTO loadNamespace(appId, env, clusterName, namespaceName, fillItemDetail)

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
    try {
      OpenNamespaceDTO result = apiInstance.loadNamespace(appId, env, clusterName, namespaceName, fillItemDetail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceManagementApi#loadNamespace");
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
