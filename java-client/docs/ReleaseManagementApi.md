# ReleaseManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGrayDelRelease**](ReleaseManagementApi.md#createGrayDelRelease) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-del-releases | 创建灰度删除发布 (original openapi) |
| [**createGrayRelease**](ReleaseManagementApi.md#createGrayRelease) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/releases | 创建灰度发布 (original openapi) |
| [**createRelease**](ReleaseManagementApi.md#createRelease) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases | 创建发布 (original openapi) |
| [**findActiveReleases**](ReleaseManagementApi.md#findActiveReleases) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active | 获取活跃发布（分页） (new added) |
| [**findAllReleases**](ReleaseManagementApi.md#findAllReleases) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all | 获取所有发布（分页） (new added) |
| [**getReleaseById**](ReleaseManagementApi.md#getReleaseById) | **GET** /openapi/v1/envs/{env}/releases/{releaseId} | 获取发布详情 (new added) |
| [**loadLatestActiveRelease**](ReleaseManagementApi.md#loadLatestActiveRelease) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/latest | 获取最新活跃发布 (original openapi) |
| [**merge**](ReleaseManagementApi.md#merge) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/merge | 合并分支 (original openapi) |
| [**rollback**](ReleaseManagementApi.md#rollback) | **PUT** /openapi/v1/envs/{env}/releases/{releaseId}/rollback | 回滚发布 (original openapi) |


<a id="createGrayDelRelease"></a>
# **createGrayDelRelease**
> OpenReleaseDTO createGrayDelRelease(appId, env, clusterName, namespaceName, branchName, namespaceGrayDelReleaseDTO)

创建灰度删除发布 (original openapi)



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
    String branchName = "branchName_example"; // String |
    NamespaceGrayDelReleaseDTO namespaceGrayDelReleaseDTO = new NamespaceGrayDelReleaseDTO(); // NamespaceGrayDelReleaseDTO |
    try {
      OpenReleaseDTO result = apiInstance.createGrayDelRelease(appId, env, clusterName, namespaceName, branchName, namespaceGrayDelReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#createGrayDelRelease");
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
| **branchName** | **String**|  | |
| **namespaceGrayDelReleaseDTO** | [**NamespaceGrayDelReleaseDTO**](NamespaceGrayDelReleaseDTO.md)|  | |

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
| **200** |  |  -  |

<a id="createGrayRelease"></a>
# **createGrayRelease**
> OpenReleaseDTO createGrayRelease(appId, env, clusterName, namespaceName, branchName, namespaceReleaseDTO)

创建灰度发布 (original openapi)

创建灰度发布

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
    String appId = "appId_example"; // String | app标识
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String branchName = "branchName_example"; // String | 分支名称
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO |
    try {
      OpenReleaseDTO result = apiInstance.createGrayRelease(appId, env, clusterName, namespaceName, branchName, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#createGrayRelease");
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
| **appId** | **String**| app标识 | |
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**| 集群名称 | |
| **namespaceName** | **String**| 命名空间名称 | |
| **branchName** | **String**| 分支名称 | |
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
| **200** | 灰度发布创建成功 |  -  |

<a id="createRelease"></a>
# **createRelease**
> OpenReleaseDTO createRelease(appId, env, clusterName, namespaceName, namespaceReleaseDTO)

创建发布 (original openapi)

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
    String appId = "appId_example"; // String | app标识
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String |
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO |
    try {
      OpenReleaseDTO result = apiInstance.createRelease(appId, env, clusterName, namespaceName, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#createRelease");
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
| **appId** | **String**| app标识 | |
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**|  | |
| **namespaceName** | **String**| 命名空间名称 | |
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

<a id="findActiveReleases"></a>
# **findActiveReleases**
> List&lt;OpenReleaseDTO&gt; findActiveReleases(appId, env, clusterName, namespaceName, page, size)

获取活跃发布（分页） (new added)

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    Integer page = 0; // Integer | 页码，从0开始
    Integer size = 5; // Integer | 每页数量
    try {
      List<OpenReleaseDTO> result = apiInstance.findActiveReleases(appId, env, clusterName, namespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#findActiveReleases");
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
| **page** | **Integer**| 页码，从0开始 | |
| **size** | **Integer**| 每页数量 | |

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
| **200** | 成功获取活跃发布列表 |  -  |

<a id="findAllReleases"></a>
# **findAllReleases**
> List&lt;OpenReleaseBO&gt; findAllReleases(appId, env, clusterName, namespaceName, page, size)

获取所有发布（分页） (new added)

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    Integer page = 0; // Integer | 页码，从0开始
    Integer size = 5; // Integer | 每页数量
    try {
      List<OpenReleaseBO> result = apiInstance.findAllReleases(appId, env, clusterName, namespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#findAllReleases");
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
| **page** | **Integer**| 页码，从0开始 | |
| **size** | **Integer**| 每页数量 | |

### Return type

[**List&lt;OpenReleaseBO&gt;**](OpenReleaseBO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取发布列表 |  -  |

<a id="getReleaseById"></a>
# **getReleaseById**
> OpenReleaseDTO getReleaseById(env, releaseId)

获取发布详情 (new added)

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
    String env = "env_example"; // String | 环境标识
    Integer releaseId = 56; // Integer | 发布ID
    try {
      OpenReleaseDTO result = apiInstance.getReleaseById(env, releaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#getReleaseById");
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
| **releaseId** | **Integer**| 发布ID | |

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
| **200** | 成功获取发布详情 |  -  |

<a id="loadLatestActiveRelease"></a>
# **loadLatestActiveRelease**
> OpenReleaseDTO loadLatestActiveRelease(appId, env, clusterName, namespaceName)

获取最新活跃发布 (original openapi)

查询命名空间最新活跃发布

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    try {
      OpenReleaseDTO result = apiInstance.loadLatestActiveRelease(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#loadLatestActiveRelease");
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

<a id="merge"></a>
# **merge**
> OpenReleaseDTO merge(appId, env, clusterName, namespaceName, branchName, deleteBranch, namespaceReleaseDTO)

合并分支 (original openapi)

合并灰度分支并可选择删除分支

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String branchName = "branchName_example"; // String | 分支名称
    Boolean deleteBranch = true; // Boolean | 合并后是否删除分支（true/false）
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO |
    try {
      OpenReleaseDTO result = apiInstance.merge(appId, env, clusterName, namespaceName, branchName, deleteBranch, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#merge");
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
| **branchName** | **String**| 分支名称 | |
| **deleteBranch** | **Boolean**| 合并后是否删除分支（true/false） | |
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
| **200** | 分支合并成功 |  -  |
| **400** | 合并参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="rollback"></a>
# **rollback**
> Object rollback(env, releaseId, operator)

回滚发布 (original openapi)

回滚到指定的发布版本

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
    String env = "env_example"; // String | 环境标识
    Long releaseId = 56L; // Long | 发布ID
    String operator = "operator_example"; // String | 操作人用户名
    try {
      Object result = apiInstance.rollback(env, releaseId, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleaseManagementApi#rollback");
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
| **releaseId** | **Long**| 发布ID | |
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
| **200** | 发布回滚成功 |  -  |
