# PortalManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFavorite**](PortalManagementApi.md#addFavorite) | **POST** /openapi/v1/favorites | 添加收藏(new added) |
| [**assignRoleToConsumer**](PortalManagementApi.md#assignRoleToConsumer) | **POST** /openapi/v1/consumers/{token}/assign-role | 给消费者授权(new added) |
| [**checkExportAppConfig**](PortalManagementApi.md#checkExportAppConfig) | **HEAD** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export | 检查应用配置导出权限(new added) |
| [**checkSystemHealth**](PortalManagementApi.md#checkSystemHealth) | **GET** /openapi/v1/system-info/health | 检查系统实例健康状态(new added) |
| [**createConsumer**](PortalManagementApi.md#createConsumer) | **POST** /openapi/v1/consumers | 创建开放平台消费者(new added) |
| [**createOrUpdateConfigDBConfig**](PortalManagementApi.md#createOrUpdateConfigDBConfig) | **POST** /openapi/v1/server/envs/{env}/config-db/config | 创建或更新Config DB配置(new added) |
| [**createOrUpdatePortalDBConfig**](PortalManagementApi.md#createOrUpdatePortalDBConfig) | **POST** /openapi/v1/server/portal-db/config | 创建或更新Portal DB配置(new added) |
| [**deleteConfigDBConfig**](PortalManagementApi.md#deleteConfigDBConfig) | **DELETE** /openapi/v1/server/envs/{env}/config-db/config | 删除Config DB配置(new added) |
| [**deleteConsumer**](PortalManagementApi.md#deleteConsumer) | **DELETE** /openapi/v1/consumers/by-appId | 按应用ID删除消费者(new added) |
| [**deleteFavorite**](PortalManagementApi.md#deleteFavorite) | **DELETE** /openapi/v1/favorites/{favoriteId} | 删除收藏(new added) |
| [**deletePortalDBConfig**](PortalManagementApi.md#deletePortalDBConfig) | **DELETE** /openapi/v1/server/portal-db/config | 删除Portal DB配置(new added) |
| [**exportAllConfigs**](PortalManagementApi.md#exportAllConfigs) | **GET** /openapi/v1/configs/export | 导出所有配置(new added) |
| [**exportAppConfig**](PortalManagementApi.md#exportAppConfig) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export | 导出应用配置(new added) |
| [**exportNamespaceItems**](PortalManagementApi.md#exportNamespaceItems) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/export | 导出命名空间配置项(new added) |
| [**findAllConfigDBConfig**](PortalManagementApi.md#findAllConfigDBConfig) | **GET** /openapi/v1/server/envs/{env}/config-db/config/find-all-config | 查询指定环境全部Config DB配置(new added) |
| [**findAllPortalDBConfig**](PortalManagementApi.md#findAllPortalDBConfig) | **GET** /openapi/v1/server/portal-db/config/find-all-config | 查询全部Portal DB配置(new added) |
| [**findAuditDataInfluencesByField**](PortalManagementApi.md#findAuditDataInfluencesByField) | **GET** /openapi/v1/apollo/audit/logs/dataInfluences/field | 查询审计数据影响(new added) |
| [**findAuditLogs**](PortalManagementApi.md#findAuditLogs) | **GET** /openapi/v1/apollo/audit/logs | 查询审计日志(new added) |
| [**findAuditLogsByOpName**](PortalManagementApi.md#findAuditLogsByOpName) | **GET** /openapi/v1/apollo/audit/logs/opName | 按操作名查询审计日志(new added) |
| [**findAuditTraceDetails**](PortalManagementApi.md#findAuditTraceDetails) | **GET** /openapi/v1/apollo/audit/trace | 查询审计链路详情(new added) |
| [**findCommits**](PortalManagementApi.md#findCommits) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/commits | 查询命名空间提交记录(new added) |
| [**findFavorites**](PortalManagementApi.md#findFavorites) | **GET** /openapi/v1/favorites | 查询收藏(new added) |
| [**findReleaseHistoriesByNamespace**](PortalManagementApi.md#findReleaseHistoriesByNamespace) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/releases/histories | 查询命名空间发布历史(new added) |
| [**getAuditProperties**](PortalManagementApi.md#getAuditProperties) | **GET** /openapi/v1/apollo/audit/properties | 获取审计配置(new added) |
| [**getConsumerList**](PortalManagementApi.md#getConsumerList) | **GET** /openapi/v1/consumers | 查询开放平台消费者列表(new added) |
| [**getConsumerTokenByAppId**](PortalManagementApi.md#getConsumerTokenByAppId) | **GET** /openapi/v1/consumer-tokens/by-appId | 按应用ID查询消费者Token(new added) |
| [**getPageSettings**](PortalManagementApi.md#getPageSettings) | **GET** /openapi/v1/page-settings | 获取Portal页面配置(new added) |
| [**getSystemInfo**](PortalManagementApi.md#getSystemInfo) | **GET** /openapi/v1/system-info | 获取系统信息(new added) |
| [**importAllConfigs**](PortalManagementApi.md#importAllConfigs) | **POST** /openapi/v1/configs/import | 导入所有配置(new added) |
| [**importAppConfig**](PortalManagementApi.md#importAppConfig) | **POST** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/import | 导入应用配置(new added) |
| [**importConfig**](PortalManagementApi.md#importConfig) | **POST** /openapi/v1/import | 导入配置兼容入口(new added) |
| [**importNamespaceItems**](PortalManagementApi.md#importNamespaceItems) | **POST** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/import | 导入命名空间配置项(new added) |
| [**searchAppsByAppIdOrName**](PortalManagementApi.md#searchAppsByAppIdOrName) | **GET** /openapi/v1/apps/search/by-appid-or-name | 按应用ID或名称搜索应用(new added) |
| [**searchAuditLogs**](PortalManagementApi.md#searchAuditLogs) | **GET** /openapi/v1/apollo/audit/logs/by-name-or-type-or-operator | 搜索审计日志(new added) |
| [**searchItemInfoByKeyOrValue**](PortalManagementApi.md#searchItemInfoByKeyOrValue) | **GET** /openapi/v1/global-search/item-info/by-key-or-value | 按Key或Value全局搜索配置(new added) |
| [**topFavorite**](PortalManagementApi.md#topFavorite) | **PUT** /openapi/v1/favorites/{favoriteId} | 收藏置顶(new added) |


<a id="addFavorite"></a>
# **addFavorite**
> Object addFavorite(body)

添加收藏(new added)

POST /openapi/v1/favorites

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    Object body = null; // Object |
    try {
      Object result = apiInstance.addFavorite(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#addFavorite");
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
| **body** | **Object**|  | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功添加收藏 |  -  |

<a id="assignRoleToConsumer"></a>
# **assignRoleToConsumer**
> List&lt;Object&gt; assignRoleToConsumer(token, type, body, envs)

给消费者授权(new added)

POST /openapi/v1/consumers/{token}/assign-role

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String token = "token_example"; // String |
    String type = "type_example"; // String |
    Object body = null; // Object |
    String envs = "envs_example"; // String |
    try {
      List<Object> result = apiInstance.assignRoleToConsumer(token, type, body, envs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#assignRoleToConsumer");
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
| **token** | **String**|  | |
| **type** | **String**|  | |
| **body** | **Object**|  | |
| **envs** | **String**|  | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功授权 |  -  |

<a id="checkExportAppConfig"></a>
# **checkExportAppConfig**
> checkExportAppConfig(appId, env, clusterName)

检查应用配置导出权限(new added)

HEAD /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    try {
      apiInstance.checkExportAppConfig(appId, env, clusterName);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#checkExportAppConfig");
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

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 可导出 |  -  |

<a id="checkSystemHealth"></a>
# **checkSystemHealth**
> Object checkSystemHealth(instanceId)

检查系统实例健康状态(new added)

GET /openapi/v1/system-info/health

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String instanceId = "instanceId_example"; // String |
    try {
      Object result = apiInstance.checkSystemHealth(instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#checkSystemHealth");
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
| **instanceId** | **String**|  | |

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
| **200** | 成功获取健康状态 |  -  |

<a id="createConsumer"></a>
# **createConsumer**
> Object createConsumer(body, expires)

创建开放平台消费者(new added)

POST /openapi/v1/consumers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    Object body = null; // Object |
    String expires = "expires_example"; // String |
    try {
      Object result = apiInstance.createConsumer(body, expires);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#createConsumer");
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
| **body** | **Object**|  | |
| **expires** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功创建消费者 |  -  |

<a id="createOrUpdateConfigDBConfig"></a>
# **createOrUpdateConfigDBConfig**
> Object createOrUpdateConfigDBConfig(env, body)

创建或更新Config DB配置(new added)

POST /openapi/v1/server/envs/{env}/config-db/config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String env = "env_example"; // String |
    Object body = null; // Object |
    try {
      Object result = apiInstance.createOrUpdateConfigDBConfig(env, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#createOrUpdateConfigDBConfig");
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
| **body** | **Object**|  | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功创建或更新配置 |  -  |

<a id="createOrUpdatePortalDBConfig"></a>
# **createOrUpdatePortalDBConfig**
> Object createOrUpdatePortalDBConfig(body)

创建或更新Portal DB配置(new added)

POST /openapi/v1/server/portal-db/config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    Object body = null; // Object |
    try {
      Object result = apiInstance.createOrUpdatePortalDBConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#createOrUpdatePortalDBConfig");
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
| **body** | **Object**|  | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功创建或更新配置 |  -  |

<a id="deleteConfigDBConfig"></a>
# **deleteConfigDBConfig**
> deleteConfigDBConfig(env, key, cluster)

删除Config DB配置(new added)

DELETE /openapi/v1/server/envs/{env}/config-db/config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String env = "env_example"; // String |
    String key = "key_example"; // String |
    String cluster = "cluster_example"; // String |
    try {
      apiInstance.deleteConfigDBConfig(env, key, cluster);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#deleteConfigDBConfig");
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
| **key** | **String**|  | |
| **cluster** | **String**|  | |

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
| **200** | 成功删除配置 |  -  |

<a id="deleteConsumer"></a>
# **deleteConsumer**
> deleteConsumer(appId)

按应用ID删除消费者(new added)

DELETE /openapi/v1/consumers/by-appId

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    try {
      apiInstance.deleteConsumer(appId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#deleteConsumer");
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

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功删除消费者 |  -  |

<a id="deleteFavorite"></a>
# **deleteFavorite**
> deleteFavorite(favoriteId)

删除收藏(new added)

DELETE /openapi/v1/favorites/{favoriteId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    Long favoriteId = 56L; // Long |
    try {
      apiInstance.deleteFavorite(favoriteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#deleteFavorite");
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
| **favoriteId** | **Long**|  | |

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
| **200** | 成功删除收藏 |  -  |

<a id="deletePortalDBConfig"></a>
# **deletePortalDBConfig**
> deletePortalDBConfig(key)

删除Portal DB配置(new added)

DELETE /openapi/v1/server/portal-db/config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String key = "key_example"; // String |
    try {
      apiInstance.deletePortalDBConfig(key);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#deletePortalDBConfig");
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
| **key** | **String**|  | |

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
| **200** | 成功删除配置 |  -  |

<a id="exportAllConfigs"></a>
# **exportAllConfigs**
> File exportAllConfigs(envs)

导出所有配置(new added)

GET /openapi/v1/configs/export

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String envs = "envs_example"; // String |
    try {
      File result = apiInstance.exportAllConfigs(envs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#exportAllConfigs");
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
| **envs** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功导出配置 |  -  |

<a id="exportAppConfig"></a>
# **exportAppConfig**
> File exportAppConfig(appId, env, clusterName)

导出应用配置(new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    try {
      File result = apiInstance.exportAppConfig(appId, env, clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#exportAppConfig");
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

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功导出应用配置 |  -  |

<a id="exportNamespaceItems"></a>
# **exportNamespaceItems**
> File exportNamespaceItems(appId, env, clusterName, namespaceName)

导出命名空间配置项(new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/export

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    try {
      File result = apiInstance.exportNamespaceItems(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#exportNamespaceItems");
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

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功导出命名空间配置项 |  -  |

<a id="findAllConfigDBConfig"></a>
# **findAllConfigDBConfig**
> List&lt;Object&gt; findAllConfigDBConfig(env)

查询指定环境全部Config DB配置(new added)

GET /openapi/v1/server/envs/{env}/config-db/config/find-all-config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String env = "env_example"; // String |
    try {
      List<Object> result = apiInstance.findAllConfigDBConfig(env);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findAllConfigDBConfig");
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

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取配置列表 |  -  |

<a id="findAllPortalDBConfig"></a>
# **findAllPortalDBConfig**
> List&lt;Object&gt; findAllPortalDBConfig()

查询全部Portal DB配置(new added)

GET /openapi/v1/server/portal-db/config/find-all-config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    try {
      List<Object> result = apiInstance.findAllPortalDBConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findAllPortalDBConfig");
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

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取配置列表 |  -  |

<a id="findAuditDataInfluencesByField"></a>
# **findAuditDataInfluencesByField**
> List&lt;Object&gt; findAuditDataInfluencesByField(entityName, entityId, fieldName, page, size)

查询审计数据影响(new added)

GET /openapi/v1/apollo/audit/logs/dataInfluences/field

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String entityName = "entityName_example"; // String |
    String entityId = "entityId_example"; // String |
    String fieldName = "fieldName_example"; // String |
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    try {
      List<Object> result = apiInstance.findAuditDataInfluencesByField(entityName, entityId, fieldName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findAuditDataInfluencesByField");
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
| **entityName** | **String**|  | |
| **entityId** | **String**|  | |
| **fieldName** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取审计数据影响 |  -  |

<a id="findAuditLogs"></a>
# **findAuditLogs**
> List&lt;Object&gt; findAuditLogs(page, size)

查询审计日志(new added)

GET /openapi/v1/apollo/audit/logs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    try {
      List<Object> result = apiInstance.findAuditLogs(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findAuditLogs");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取审计日志 |  -  |

<a id="findAuditLogsByOpName"></a>
# **findAuditLogsByOpName**
> List&lt;Object&gt; findAuditLogsByOpName(opName, page, size, startDate, endDate)

按操作名查询审计日志(new added)

GET /openapi/v1/apollo/audit/logs/opName

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String opName = "opName_example"; // String |
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    String startDate = "startDate_example"; // String |
    String endDate = "endDate_example"; // String |
    try {
      List<Object> result = apiInstance.findAuditLogsByOpName(opName, page, size, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findAuditLogsByOpName");
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
| **opName** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取审计日志 |  -  |

<a id="findAuditTraceDetails"></a>
# **findAuditTraceDetails**
> List&lt;Object&gt; findAuditTraceDetails(traceId)

查询审计链路详情(new added)

GET /openapi/v1/apollo/audit/trace

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String traceId = "traceId_example"; // String |
    try {
      List<Object> result = apiInstance.findAuditTraceDetails(traceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findAuditTraceDetails");
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
| **traceId** | **String**|  | |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取审计链路详情 |  -  |

<a id="findCommits"></a>
# **findCommits**
> List&lt;Object&gt; findCommits(appId, env, clusterName, namespaceName, key, page, size)

查询命名空间提交记录(new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/commits

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String key = "key_example"; // String |
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    try {
      List<Object> result = apiInstance.findCommits(appId, env, clusterName, namespaceName, key, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findCommits");
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
| **key** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取提交记录 |  -  |

<a id="findFavorites"></a>
# **findFavorites**
> List&lt;Object&gt; findFavorites(userId, appId, page, size)

查询收藏(new added)

GET /openapi/v1/favorites

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String userId = "userId_example"; // String |
    String appId = "appId_example"; // String |
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    try {
      List<Object> result = apiInstance.findFavorites(userId, appId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findFavorites");
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
| **userId** | **String**|  | [optional] |
| **appId** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取收藏 |  -  |

<a id="findReleaseHistoriesByNamespace"></a>
# **findReleaseHistoriesByNamespace**
> List&lt;Object&gt; findReleaseHistoriesByNamespace(appId, env, clusterName, namespaceName, page, size)

查询命名空间发布历史(new added)

GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/releases/histories

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    try {
      List<Object> result = apiInstance.findReleaseHistoriesByNamespace(appId, env, clusterName, namespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#findReleaseHistoriesByNamespace");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取发布历史 |  -  |

<a id="getAuditProperties"></a>
# **getAuditProperties**
> Object getAuditProperties()

获取审计配置(new added)

GET /openapi/v1/apollo/audit/properties

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    try {
      Object result = apiInstance.getAuditProperties();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#getAuditProperties");
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

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取审计配置 |  -  |

<a id="getConsumerList"></a>
# **getConsumerList**
> List&lt;Object&gt; getConsumerList(page, size)

查询开放平台消费者列表(new added)

GET /openapi/v1/consumers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    try {
      List<Object> result = apiInstance.getConsumerList(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#getConsumerList");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取消费者列表 |  -  |

<a id="getConsumerTokenByAppId"></a>
# **getConsumerTokenByAppId**
> Object getConsumerTokenByAppId(appId)

按应用ID查询消费者Token(new added)

GET /openapi/v1/consumer-tokens/by-appId

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    try {
      Object result = apiInstance.getConsumerTokenByAppId(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#getConsumerTokenByAppId");
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

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取消费者Token |  -  |

<a id="getPageSettings"></a>
# **getPageSettings**
> Object getPageSettings()

获取Portal页面配置(new added)

GET /openapi/v1/page-settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    try {
      Object result = apiInstance.getPageSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#getPageSettings");
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

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取页面配置 |  -  |

<a id="getSystemInfo"></a>
# **getSystemInfo**
> Object getSystemInfo()

获取系统信息(new added)

GET /openapi/v1/system-info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    try {
      Object result = apiInstance.getSystemInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#getSystemInfo");
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

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取系统信息 |  -  |

<a id="importAllConfigs"></a>
# **importAllConfigs**
> importAllConfigs(envs, conflictAction, _file)

导入所有配置(new added)

POST /openapi/v1/configs/import

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String envs = "envs_example"; // String |
    String conflictAction = "ignore"; // String |
    File _file = new File("/path/to/file"); // File |
    try {
      apiInstance.importAllConfigs(envs, conflictAction, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#importAllConfigs");
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
| **envs** | **String**|  | |
| **conflictAction** | **String**|  | [optional] [default to ignore] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 导入成功 |  -  |

<a id="importAppConfig"></a>
# **importAppConfig**
> importAppConfig(appId, env, clusterName, conflictAction, _file)

导入应用配置(new added)

POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/import

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String conflictAction = "ignore"; // String |
    File _file = new File("/path/to/file"); // File |
    try {
      apiInstance.importAppConfig(appId, env, clusterName, conflictAction, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#importAppConfig");
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
| **conflictAction** | **String**|  | [optional] [default to ignore] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 导入成功 |  -  |

<a id="importConfig"></a>
# **importConfig**
> importConfig(envs, conflictAction, _file)

导入配置兼容入口(new added)

POST /openapi/v1/import

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String envs = "envs_example"; // String |
    String conflictAction = "ignore"; // String |
    File _file = new File("/path/to/file"); // File |
    try {
      apiInstance.importConfig(envs, conflictAction, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#importConfig");
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
| **envs** | **String**|  | |
| **conflictAction** | **String**|  | [optional] [default to ignore] |
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 导入成功 |  -  |

<a id="importNamespaceItems"></a>
# **importNamespaceItems**
> importNamespaceItems(appId, env, clusterName, namespaceName, _file)

导入命名空间配置项(new added)

POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/import

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    File _file = new File("/path/to/file"); // File |
    try {
      apiInstance.importNamespaceItems(appId, env, clusterName, namespaceName, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#importNamespaceItems");
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
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 导入成功 |  -  |

<a id="searchAppsByAppIdOrName"></a>
# **searchAppsByAppIdOrName**
> Object searchAppsByAppIdOrName(query, page, size)

按应用ID或名称搜索应用(new added)

GET /openapi/v1/apps/search/by-appid-or-name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String query = "query_example"; // String |
    Integer page = 0; // Integer |
    Integer size = 20; // Integer |
    try {
      Object result = apiInstance.searchAppsByAppIdOrName(query, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#searchAppsByAppIdOrName");
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
| **query** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |

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
| **200** | 成功搜索应用 |  -  |

<a id="searchAuditLogs"></a>
# **searchAuditLogs**
> List&lt;Object&gt; searchAuditLogs(query, page, size)

搜索审计日志(new added)

GET /openapi/v1/apollo/audit/logs/by-name-or-type-or-operator

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String query = "query_example"; // String |
    Integer page = 0; // Integer |
    Integer size = 10; // Integer |
    try {
      List<Object> result = apiInstance.searchAuditLogs(query, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#searchAuditLogs");
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
| **query** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功搜索审计日志 |  -  |

<a id="searchItemInfoByKeyOrValue"></a>
# **searchItemInfoByKeyOrValue**
> Object searchItemInfoByKeyOrValue(key, value)

按Key或Value全局搜索配置(new added)

GET /openapi/v1/global-search/item-info/by-key-or-value

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    String key = ""; // String |
    String value = ""; // String |
    try {
      Object result = apiInstance.searchItemInfoByKeyOrValue(key, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#searchItemInfoByKeyOrValue");
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
| **key** | **String**|  | [optional] [default to ] |
| **value** | **String**|  | [optional] [default to ] |

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
| **200** | 成功搜索配置 |  -  |

<a id="topFavorite"></a>
# **topFavorite**
> topFavorite(favoriteId)

收藏置顶(new added)

PUT /openapi/v1/favorites/{favoriteId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PortalManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PortalManagementApi apiInstance = new PortalManagementApi(defaultClient);
    Long favoriteId = 56L; // Long |
    try {
      apiInstance.topFavorite(favoriteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortalManagementApi#topFavorite");
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
| **favoriteId** | **Long**|  | |

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
| **200** | 成功置顶收藏 |  -  |
