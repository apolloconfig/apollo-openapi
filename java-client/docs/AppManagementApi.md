# AppManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApp**](AppManagementApi.md#createApp) | **POST** /openapi/v1/apps | 创建应用 (original openapi) |
| [**createAppInEnv**](AppManagementApi.md#createAppInEnv) | **POST** /openapi/v1/apps/envs/{env} | 在指定环境创建应用(new added) |
| [**deleteApp**](AppManagementApi.md#deleteApp) | **DELETE** /openapi/v1/apps/{appId} | 删除应用(new added) |
| [**findApps**](AppManagementApi.md#findApps) | **GET** /openapi/v1/apps | 查找应用 (original openapi) |
| [**findAppsAuthorized**](AppManagementApi.md#findAppsAuthorized) | **GET** /openapi/v1/apps/authorized | 获取当前Consumer授权的应用列表 (original openapi) |
| [**findMissEnvs**](AppManagementApi.md#findMissEnvs) | **GET** /openapi/v1/apps/{appId}/miss-envs | 查找缺失的环境(new added) |
| [**getApp**](AppManagementApi.md#getApp) | **GET** /openapi/v1/apps/{appId} | 获取单个应用信息(new added) |
| [**getAppsBySelf**](AppManagementApi.md#getAppsBySelf) | **GET** /openapi/v1/apps/by-self | 获取当前Consumer/User的应用列表（分页）(new added) |
| [**getEnvClusterInfo**](AppManagementApi.md#getEnvClusterInfo) | **GET** /openapi/v1/apps/{appId}/env-cluster-info | 获取应用环境集群详情(new added) |
| [**getEnvClusters**](AppManagementApi.md#getEnvClusters) | **GET** /openapi/v1/apps/{appId}/envclusters | 获取应用的环境集群信息 (original openapi) |
| [**updateApp**](AppManagementApi.md#updateApp) | **PUT** /openapi/v1/apps/{appId} | 更新应用(new added) |


<a id="createApp"></a>
# **createApp**
> OpenAppDTO createApp(openCreateAppDTO)

创建应用 (original openapi)

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
    OpenCreateAppDTO openCreateAppDTO = new OpenCreateAppDTO(); // OpenCreateAppDTO |
    try {
      OpenAppDTO result = apiInstance.createApp(openCreateAppDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#createApp");
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
| **openCreateAppDTO** | [**OpenCreateAppDTO**](OpenCreateAppDTO.md)|  | |

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

<a id="createAppInEnv"></a>
# **createAppInEnv**
> createAppInEnv(env, openAppDTO, operator)

在指定环境创建应用(new added)

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
    String env = "env_example"; // String | 环境标识，例如 DEV、FAT、UAT、PROD
    OpenAppDTO openAppDTO = new OpenAppDTO(); // OpenAppDTO |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.createAppInEnv(env, openAppDTO, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#createAppInEnv");
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
| **env** | **String**| 环境标识，例如 DEV、FAT、UAT、PROD | |
| **openAppDTO** | [**OpenAppDTO**](OpenAppDTO.md)|  | |
| **operator** | **String**| 操作人用户名 | [optional] |

### Return type

null (empty response body)

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

<a id="deleteApp"></a>
# **deleteApp**
> deleteApp(appId, operator)

删除应用(new added)

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
    String appId = "appId_example"; // String | 应用ID
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.deleteApp(appId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#deleteApp");
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
| **operator** | **String**| 操作人用户名 | [optional] |

### Return type

null (empty response body)

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

<a id="findApps"></a>
# **findApps**
> List&lt;OpenAppDTO&gt; findApps(appIds)

查找应用 (original openapi)

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
    String appIds = "123"; // String | 查找应用
    try {
      List<OpenAppDTO> result = apiInstance.findApps(appIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#findApps");
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
| **appIds** | **String**| 查找应用 | [optional] |

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
| **200** | 成功获取应用列表 |  -  |
| **401** | 未授权访问 |  -  |

<a id="findAppsAuthorized"></a>
# **findAppsAuthorized**
> List&lt;OpenAppDTO&gt; findAppsAuthorized()

获取当前Consumer授权的应用列表 (original openapi)

GET /openapi/v1/apps/authorized

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
      List<OpenAppDTO> result = apiInstance.findAppsAuthorized();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#findAppsAuthorized");
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
| **200** | 成功获取授权应用列表 |  -  |
| **401** | 未授权访问 |  -  |

<a id="findMissEnvs"></a>
# **findMissEnvs**
> List&lt;OpenMissEnvDTO&gt; findMissEnvs(appId)

查找缺失的环境(new added)

GET /openapi/v1/apps/{appId}/miss-envs

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
    String appId = "appId_example"; // String | 应用ID
    try {
      List<OpenMissEnvDTO> result = apiInstance.findMissEnvs(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#findMissEnvs");
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

[**List&lt;OpenMissEnvDTO&gt;**](OpenMissEnvDTO.md)

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

<a id="getApp"></a>
# **getApp**
> OpenAppDTO getApp(appId)

获取单个应用信息(new added)

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
      OpenAppDTO result = apiInstance.getApp(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#getApp");
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

<a id="getAppsBySelf"></a>
# **getAppsBySelf**
> List&lt;OpenAppDTO&gt; getAppsBySelf(page, size)

获取当前Consumer/User的应用列表（分页）(new added)

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
    Integer page = 56; // Integer | 页数
    Integer size = 56; // Integer | 页大小
    try {
      List<OpenAppDTO> result = apiInstance.getAppsBySelf(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#getAppsBySelf");
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
| **page** | **Integer**| 页数 | |
| **size** | **Integer**| 页大小 | |

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

<a id="getEnvClusterInfo"></a>
# **getEnvClusterInfo**
> List&lt;OpenEnvClusterInfo&gt; getEnvClusterInfo(appId)

获取应用环境集群详情(new added)

/openapi/v1/apps/{appId}/env-cluster-info

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
    String appId = "appId_example"; // String | 应用ID
    try {
      List<OpenEnvClusterInfo> result = apiInstance.getEnvClusterInfo(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#getEnvClusterInfo");
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

[**List&lt;OpenEnvClusterInfo&gt;**](OpenEnvClusterInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取应用环境集群详情 |  -  |

<a id="getEnvClusters"></a>
# **getEnvClusters**
> List&lt;OpenEnvClusterDTO&gt; getEnvClusters(appId)

获取应用的环境集群信息 (original openapi)

GET /openapi/v1/apps/{appId}/envclusters

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
    String appId = "appId_example"; // String | 应用ID
    try {
      List<OpenEnvClusterDTO> result = apiInstance.getEnvClusters(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#getEnvClusters");
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

<a id="updateApp"></a>
# **updateApp**
> updateApp(appId, openAppDTO, operator)

更新应用(new added)

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
    String appId = "appId_example"; // String | 应用ID
    OpenAppDTO openAppDTO = new OpenAppDTO(); // OpenAppDTO |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.updateApp(appId, openAppDTO, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagementApi#updateApp");
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
| **openAppDTO** | [**OpenAppDTO**](OpenAppDTO.md)|  | |
| **operator** | **String**| 操作人用户名 | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 应用更新成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |
