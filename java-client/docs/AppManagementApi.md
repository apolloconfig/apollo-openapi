# AppManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openapiV1AppsAppIdAppnamespacesNamespaceNameDelete**](AppManagementApi.md#openapiV1AppsAppIdAppnamespacesNamespaceNameDelete) | **DELETE** /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} | 删除AppNamespace |
| [**openapiV1AppsAppIdDelete**](AppManagementApi.md#openapiV1AppsAppIdDelete) | **DELETE** /openapi/v1/apps/{appId} | 删除应用 |
| [**openapiV1AppsAppIdEnvClustersGet**](AppManagementApi.md#openapiV1AppsAppIdEnvClustersGet) | **GET** /openapi/v1/apps/{appId}/env-clusters | 获取应用的环境集群信息 |
| [**openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete**](AppManagementApi.md#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete) | **DELETE** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links | 删除关联的Namespace |
| [**openapiV1AppsAppIdGet**](AppManagementApi.md#openapiV1AppsAppIdGet) | **GET** /openapi/v1/apps/{appId} | 获取单个应用信息 |
| [**openapiV1AppsAppIdMissEnvsGet**](AppManagementApi.md#openapiV1AppsAppIdMissEnvsGet) | **GET** /openapi/v1/apps/{appId}/miss_envs | 查找缺失的环境 |
| [**openapiV1AppsAppIdNamespacesReleasesStatusGet**](AppManagementApi.md#openapiV1AppsAppIdNamespacesReleasesStatusGet) | **GET** /openapi/v1/apps/{appId}/namespaces/releases/status | 获取应用下所有Namespace的发布状态 |
| [**openapiV1AppsAppIdNavtreeGet**](AppManagementApi.md#openapiV1AppsAppIdNavtreeGet) | **GET** /openapi/v1/apps/{appId}/navtree | 获取应用导航树 |
| [**openapiV1AppsAppIdPut**](AppManagementApi.md#openapiV1AppsAppIdPut) | **PUT** /openapi/v1/apps/{appId} | 更新应用 |
| [**openapiV1AppsBySelfGet**](AppManagementApi.md#openapiV1AppsBySelfGet) | **GET** /openapi/v1/apps/by-self | 获取当前Consumer的应用列表（分页） |
| [**openapiV1AppsEnvsEnvPost**](AppManagementApi.md#openapiV1AppsEnvsEnvPost) | **POST** /openapi/v1/apps/envs/{env} | 在指定环境创建应用 |
| [**openapiV1AppsGet**](AppManagementApi.md#openapiV1AppsGet) | **GET** /openapi/v1/apps | 获取当前Consumer授权的应用列表 |
| [**openapiV1AppsPost**](AppManagementApi.md#openapiV1AppsPost) | **POST** /openapi/v1/apps | 创建应用 |


<a id="openapiV1AppsAppIdAppnamespacesNamespaceNameDelete"></a>
# **openapiV1AppsAppIdAppnamespacesNamespaceNameDelete**
> Object openapiV1AppsAppIdAppnamespacesNamespaceNameDelete(appId, namespaceName)

删除AppNamespace

DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    try {
      Object result = apiInstance.openapiV1AppsAppIdAppnamespacesNamespaceNameDelete(appId, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdAppnamespacesNamespaceNameDelete");
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

<a id="openapiV1AppsAppIdDelete"></a>
# **openapiV1AppsAppIdDelete**
> OpenapiV1AppsGet401Response openapiV1AppsAppIdDelete(appId)

删除应用

DELETE /openapi/v1/apps/{appId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1AppsAppIdDelete(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdDelete");
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

[**OpenapiV1AppsGet401Response**](OpenapiV1AppsGet401Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 应用删除成功 |  -  |
| **403** | 权限不足，需要超级管理员权限 |  -  |
| **404** | 应用不存在 |  -  |

<a id="openapiV1AppsAppIdEnvClustersGet"></a>
# **openapiV1AppsAppIdEnvClustersGet**
> List&lt;OpenEnvClusterDTO&gt; openapiV1AppsAppIdEnvClustersGet(appId)

获取应用的环境集群信息

GET /openapi/v1/apps/{appId}/env-clusters

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<OpenEnvClusterDTO> result = apiInstance.openapiV1AppsAppIdEnvClustersGet(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdEnvClustersGet");
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

[**List&lt;OpenEnvClusterDTO&gt;**](OpenEnvClusterDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取应用环境集群信息 |  -  |
| **404** | 应用不存在 |  -  |

<a id="openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete"></a>
# **openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete**
> Object openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete(appId, env, clusterName, namespaceName)

删除关联的Namespace

DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    try {
      Object result = apiInstance.openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete");
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

<a id="openapiV1AppsAppIdGet"></a>
# **openapiV1AppsAppIdGet**
> OpenAppDTO openapiV1AppsAppIdGet(appId)

获取单个应用信息

GET /openapi/v1/apps/{appId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      OpenAppDTO result = apiInstance.openapiV1AppsAppIdGet(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdGet");
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

[**OpenAppDTO**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取应用信息 |  -  |
| **404** | 应用不存在 |  -  |

<a id="openapiV1AppsAppIdMissEnvsGet"></a>
# **openapiV1AppsAppIdMissEnvsGet**
> List&lt;String&gt; openapiV1AppsAppIdMissEnvsGet(appId)

查找缺失的环境

GET /openapi/v1/apps/{appId}/miss_envs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<String> result = apiInstance.openapiV1AppsAppIdMissEnvsGet(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdMissEnvsGet");
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

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取应用缺失的环境列表 |  -  |
| **404** | 应用不存在 |  -  |

<a id="openapiV1AppsAppIdNamespacesReleasesStatusGet"></a>
# **openapiV1AppsAppIdNamespacesReleasesStatusGet**
> Map&lt;String, Map&lt;String, Boolean&gt;&gt; openapiV1AppsAppIdNamespacesReleasesStatusGet(appId)

获取应用下所有Namespace的发布状态

GET /openapi/v1/apps/{appId}/namespaces/releases/status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      Map<String, Map<String, Boolean>> result = apiInstance.openapiV1AppsAppIdNamespacesReleasesStatusGet(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdNamespacesReleasesStatusGet");
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

[**Map&lt;String, Map&lt;String, Boolean&gt;&gt;**](Map.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="openapiV1AppsAppIdNavtreeGet"></a>
# **openapiV1AppsAppIdNavtreeGet**
> List&lt;EnvClusterInfo&gt; openapiV1AppsAppIdNavtreeGet(appId)

获取应用导航树

GET /openapi/v1/apps/{appId}/navtree

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<EnvClusterInfo> result = apiInstance.openapiV1AppsAppIdNavtreeGet(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdNavtreeGet");
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

[**List&lt;EnvClusterInfo&gt;**](EnvClusterInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取应用导航树 |  -  |

<a id="openapiV1AppsAppIdPut"></a>
# **openapiV1AppsAppIdPut**
> OpenAppDTO openapiV1AppsAppIdPut(appId, openAppDTO)

更新应用

PUT /openapi/v1/apps/{appId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    OpenAppDTO openAppDTO = new OpenAppDTO(); // OpenAppDTO | 
    try {
      OpenAppDTO result = apiInstance.openapiV1AppsAppIdPut(appId, openAppDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsAppIdPut");
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
| **openAppDTO** | [**OpenAppDTO**](OpenAppDTO.md)|  | |

### Return type

[**OpenAppDTO**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1AppsBySelfGet"></a>
# **openapiV1AppsBySelfGet**
> List&lt;OpenAppDTO&gt; openapiV1AppsBySelfGet()

获取当前Consumer的应用列表（分页）

GET /openapi/v1/apps/by-self

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    try {
      List<OpenAppDTO> result = apiInstance.openapiV1AppsBySelfGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsBySelfGet");
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

[**List&lt;OpenAppDTO&gt;**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取Consumer的应用列表 |  -  |
| **401** | 未授权访问 |  -  |

<a id="openapiV1AppsEnvsEnvPost"></a>
# **openapiV1AppsEnvsEnvPost**
> OpenapiV1AppsGet401Response openapiV1AppsEnvsEnvPost(env, openAppDTO)

在指定环境创建应用

POST /openapi/v1/apps/envs/{env}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String env = "env_example"; // String | 
    OpenAppDTO openAppDTO = new OpenAppDTO(); // OpenAppDTO | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1AppsEnvsEnvPost(env, openAppDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsEnvsEnvPost");
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
| **openAppDTO** | [**OpenAppDTO**](OpenAppDTO.md)|  | |

### Return type

[**OpenapiV1AppsGet401Response**](OpenapiV1AppsGet401Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 应用在指定环境创建成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1AppsGet"></a>
# **openapiV1AppsGet**
> List&lt;OpenAppDTO&gt; openapiV1AppsGet(authorized)

获取当前Consumer授权的应用列表

GET /openapi/v1/apps?authorized&#x3D;true

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    String authorized = "true"; // String | 是否只返回授权的应用
    try {
      List<OpenAppDTO> result = apiInstance.openapiV1AppsGet(authorized);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsGet");
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
| **authorized** | **String**| 是否只返回授权的应用 | [optional] |

### Return type

[**List&lt;OpenAppDTO&gt;**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取授权应用列表 |  -  |
| **401** | 未授权访问 |  -  |

<a id="openapiV1AppsPost"></a>
# **openapiV1AppsPost**
> OpenAppDTO openapiV1AppsPost(openapiV1AppsPostRequest)

创建应用

POST /openapi/v1/apps

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AppManagementApi apiInstance = new AppManagementApi(defaultClient);
    OpenapiV1AppsPostRequest openapiV1AppsPostRequest = new OpenapiV1AppsPostRequest(); // OpenapiV1AppsPostRequest | 
    try {
      OpenAppDTO result = apiInstance.openapiV1AppsPost(openapiV1AppsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#openapiV1AppsPost");
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
| **openapiV1AppsPostRequest** | [**OpenapiV1AppsPostRequest**](OpenapiV1AppsPostRequest.md)|  | |

### Return type

[**OpenAppDTO**](OpenAppDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 应用创建成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

