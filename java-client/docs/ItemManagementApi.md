# ItemManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key删除配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过查询参数获取配置项（支持编码的key） |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key更新配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:batchUpdate | 通过文本批量修改配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:compare | 对比命名空间配置差异 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 获取命名空间下的配置项列表 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 删除配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 获取单个配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 更新配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 创建新的配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:revert | 撤销配置项更改 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:sync | 同步配置项到多个命名空间 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost**](ItemManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:validate | 验证配置文本语法 |


<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete**
> Object openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete(appId, env, clusterName, namespaceName, key, operator)

通过编码的key删除配置项

DELETE /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String key = "key_example"; // String | 
    String operator = "operator_example"; // String | 
    try {
      Object result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete(appId, env, clusterName, namespaceName, key, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete");
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
| **key** | **String**|  | |
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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet**
> OpenItemDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet(appId, env, clusterName, namespaceName, key)

通过查询参数获取配置项（支持编码的key）

GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items?key&#x3D;{key}&amp;encoded&#x3D;{true|false}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String key = "key_example"; // String | 
    try {
      OpenItemDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet(appId, env, clusterName, namespaceName, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet");
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
| **key** | **String**|  | |

### Return type

[**OpenItemDTO**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取配置项（支持编码key） |  -  |
| **404** | 配置项不存在 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut**
> OpenapiV1AppsGet401Response openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO)

通过编码的key更新配置项

PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String key = "key_example"; // String | 
    Boolean createIfNotExists = false; // Boolean | 
    OpenItemDTO openItemDTO = new OpenItemDTO(); // OpenItemDTO | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut");
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
| **key** | **String**|  | |
| **createIfNotExists** | **Boolean**|  | |
| **openItemDTO** | [**OpenItemDTO**](OpenItemDTO.md)|  | |

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
| **200** | 配置项更新成功（编码key） |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 配置项不存在 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut**
> OpenapiV1AppsGet401Response openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut(appId, env, clusterName, namespaceName, namespaceTextModel)

通过文本批量修改配置项

PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:batchUpdate

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    NamespaceTextModel namespaceTextModel = new NamespaceTextModel(); // NamespaceTextModel | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut(appId, env, clusterName, namespaceName, namespaceTextModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut");
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
| **namespaceTextModel** | [**NamespaceTextModel**](NamespaceTextModel.md)|  | |

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
| **200** | 批量更新配置项成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost**
> List&lt;ListItemDiffs&gt; openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost(appId, env, clusterName, namespaceName, namespaceSyncModel)

对比命名空间配置差异

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:compare

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    NamespaceSyncModel namespaceSyncModel = new NamespaceSyncModel(); // NamespaceSyncModel | 
    try {
      List<ListItemDiffs> result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost(appId, env, clusterName, namespaceName, namespaceSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost");
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
| **namespaceSyncModel** | [**NamespaceSyncModel**](NamespaceSyncModel.md)|  | |

### Return type

[**List&lt;ListItemDiffs&gt;**](ListItemDiffs.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功对比命名空间配置差异 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet**
> OpenPageDTOOpenItemDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet(appId, env, clusterName, namespaceName, page, size)

获取命名空间下的配置项列表



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 50; // Integer | 
    try {
      OpenPageDTOOpenItemDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet(appId, env, clusterName, namespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet");
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

[**OpenPageDTOOpenItemDTO**](OpenPageDTOOpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取配置项列表 |  -  |
| **404** | 命名空间不存在 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete**
> Object openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete(appId, env, clusterName, namespaceName, key, operator)

删除配置项

DELETE /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String key = "key_example"; // String | 
    String operator = "operator_example"; // String | 
    try {
      Object result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete(appId, env, clusterName, namespaceName, key, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete");
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
| **key** | **String**|  | |
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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet**
> OpenItemDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet(appId, env, clusterName, namespaceName, key)

获取单个配置项

GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String key = "key_example"; // String | 
    try {
      OpenItemDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet(appId, env, clusterName, namespaceName, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet");
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
| **key** | **String**|  | |

### Return type

[**OpenItemDTO**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取配置项 |  -  |
| **404** | 配置项不存在 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut**
> OpenapiV1AppsGet401Response openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO)

更新配置项

PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String key = "key_example"; // String | 
    Boolean createIfNotExists = false; // Boolean | 
    OpenItemDTO openItemDTO = new OpenItemDTO(); // OpenItemDTO | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut");
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
| **key** | **String**|  | |
| **createIfNotExists** | **Boolean**|  | |
| **openItemDTO** | [**OpenItemDTO**](OpenItemDTO.md)|  | |

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
| **200** | 配置项更新成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 配置项不存在 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost**
> OpenItemDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost(appId, env, clusterName, namespaceName, openItemDTO)

创建新的配置项

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    OpenItemDTO openItemDTO = new OpenItemDTO(); // OpenItemDTO | 
    try {
      OpenItemDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost(appId, env, clusterName, namespaceName, openItemDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost");
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
| **openItemDTO** | [**OpenItemDTO**](OpenItemDTO.md)|  | |

### Return type

[**OpenItemDTO**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 配置项创建成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost**
> OpenapiV1AppsGet401Response openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost(appId, env, clusterName, namespaceName)

撤销配置项更改

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:revert

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost");
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

[**OpenapiV1AppsGet401Response**](OpenapiV1AppsGet401Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 配置项更改撤销成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost**
> OpenapiV1AppsGet401Response openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost(appId, env, clusterName, namespaceName, namespaceSyncModel)

同步配置项到多个命名空间

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:sync

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    NamespaceSyncModel namespaceSyncModel = new NamespaceSyncModel(); // NamespaceSyncModel | 
    try {
      OpenapiV1AppsGet401Response result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost(appId, env, clusterName, namespaceName, namespaceSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost");
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
| **namespaceSyncModel** | [**NamespaceSyncModel**](NamespaceSyncModel.md)|  | |

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
| **200** | 配置项同步成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost**
> OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost(appId, env, clusterName, namespaceName, namespaceTextModel)

验证配置文本语法

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:validate

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ItemManagementApi apiInstance = new ItemManagementApi(defaultClient);
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    NamespaceTextModel namespaceTextModel = new NamespaceTextModel(); // NamespaceTextModel | 
    try {
      OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost(appId, env, clusterName, namespaceName, namespaceTextModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost");
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
| **namespaceTextModel** | [**NamespaceTextModel**](NamespaceTextModel.md)|  | |

### Return type

[**OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response**](OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 配置文本语法验证通过 |  -  |
| **400** | 配置文本语法错误 |  -  |

