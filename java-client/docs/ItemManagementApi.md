# ItemManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpdateItemsByText**](ItemManagementApi.md#batchUpdateItemsByText) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 通过文本批量修改配置项 (new added) |
| [**compareItems**](ItemManagementApi.md#compareItems) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/diff | 对比命名空间配置差异 (new added) |
| [**createItem**](ItemManagementApi.md#createItem) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 创建新的配置项 (original openapi) |
| [**deleteItem**](ItemManagementApi.md#deleteItem) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 删除配置项 (original openapi) |
| [**deleteItemByEncodedKey**](ItemManagementApi.md#deleteItemByEncodedKey) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key删除配置项 (original openapi) |
| [**findBranchItems**](ItemManagementApi.md#findBranchItems) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items | 获取分支下的配置项 (new added) |
| [**findItemsByNamespace**](ItemManagementApi.md#findItemsByNamespace) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 获取命名空间下的配置项列表 (original openapi) |
| [**getItem**](ItemManagementApi.md#getItem) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 获取单个配置项 (original openapi) |
| [**getItemByEncodedKey**](ItemManagementApi.md#getItemByEncodedKey) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过查询参数获取配置项（支持编码的key） (original openapi) |
| [**revertItems**](ItemManagementApi.md#revertItems) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revocation | 撤销配置项更改 (new added) |
| [**syncItems**](ItemManagementApi.md#syncItems) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/synchronize | 同步配置项到多个命名空间 (new added) |
| [**syntaxCheck**](ItemManagementApi.md#syntaxCheck) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validation | 验证配置文本语法 (new added) |
| [**updateItem**](ItemManagementApi.md#updateItem) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 更新配置项 (original openapi) |
| [**updateItemByEncodedKey**](ItemManagementApi.md#updateItemByEncodedKey) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key更新配置项 (original openapi) |


<a id="batchUpdateItemsByText"></a>
# **batchUpdateItemsByText**
> batchUpdateItemsByText(appId, env, clusterName, namespaceName, openNamespaceTextModel, operator)

通过文本批量修改配置项 (new added)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:

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
    OpenNamespaceTextModel openNamespaceTextModel = new OpenNamespaceTextModel(); // OpenNamespaceTextModel |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.batchUpdateItemsByText(appId, env, clusterName, namespaceName, openNamespaceTextModel, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#batchUpdateItemsByText");
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
| **openNamespaceTextModel** | [**OpenNamespaceTextModel**](OpenNamespaceTextModel.md)|  | |
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
| **200** | 批量更新配置项成功 |  -  |
| **403** | 权限不足 |  -  |

<a id="compareItems"></a>
# **compareItems**
> List&lt;OpenItemDiffDTO&gt; compareItems(appId, env, clusterName, namespaceName, openNamespaceSyncDTO)

对比命名空间配置差异 (new added)

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/diff

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    OpenNamespaceSyncDTO openNamespaceSyncDTO = new OpenNamespaceSyncDTO(); // OpenNamespaceSyncDTO |
    try {
      List<OpenItemDiffDTO> result = apiInstance.compareItems(appId, env, clusterName, namespaceName, openNamespaceSyncDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#compareItems");
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
| **openNamespaceSyncDTO** | [**OpenNamespaceSyncDTO**](OpenNamespaceSyncDTO.md)|  | |

### Return type

[**List&lt;OpenItemDiffDTO&gt;**](OpenItemDiffDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功对比命名空间配置差异 |  -  |

<a id="createItem"></a>
# **createItem**
> OpenItemDTO createItem(appId, env, clusterName, namespaceName, openItemDTO, operator)

创建新的配置项 (original openapi)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    OpenItemDTO openItemDTO = new OpenItemDTO(); // OpenItemDTO |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      OpenItemDTO result = apiInstance.createItem(appId, env, clusterName, namespaceName, openItemDTO, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#createItem");
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
| **openItemDTO** | [**OpenItemDTO**](OpenItemDTO.md)|  | |
| **operator** | **String**| 操作人用户名 | [optional] |

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

<a id="deleteItem"></a>
# **deleteItem**
> deleteItem(appId, env, clusterName, namespaceName, key, operator)

删除配置项 (original openapi)

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String key = "key_example"; // String | 配置项键名
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.deleteItem(appId, env, clusterName, namespaceName, key, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#deleteItem");
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
| **key** | **String**| 配置项键名 | |
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
| **200** | 配置项删除成功 |  -  |

<a id="deleteItemByEncodedKey"></a>
# **deleteItemByEncodedKey**
> deleteItemByEncodedKey(appId, env, clusterName, namespaceName, key, operator)

通过编码的key删除配置项 (original openapi)

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

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
      apiInstance.deleteItemByEncodedKey(appId, env, clusterName, namespaceName, key, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#deleteItemByEncodedKey");
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

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="findBranchItems"></a>
# **findBranchItems**
> List&lt;OpenItemDTO&gt; findBranchItems(appId, env, clusterName, namespaceName, branchName)

获取分支下的配置项 (new added)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items:

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String branchName = "branchName_example"; // String | 分支名称
    try {
      List<OpenItemDTO> result = apiInstance.findBranchItems(appId, env, clusterName, namespaceName, branchName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#findBranchItems");
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

### Return type

[**List&lt;OpenItemDTO&gt;**](OpenItemDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取分支下的配置项列表 |  -  |
| **404** | 分支不存在 |  -  |

<a id="findItemsByNamespace"></a>
# **findItemsByNamespace**
> OpenItemPageDTO findItemsByNamespace(appId, env, clusterName, namespaceName, page, size)

获取命名空间下的配置项列表 (original openapi)

获取指定命名空间的配置项列表，支持分页

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    Integer page = 0; // Integer | 页码，从0开始
    Integer size = 50; // Integer | 每页数量
    try {
      OpenItemPageDTO result = apiInstance.findItemsByNamespace(appId, env, clusterName, namespaceName, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#findItemsByNamespace");
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

[**OpenItemPageDTO**](OpenItemPageDTO.md)

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

<a id="getItem"></a>
# **getItem**
> OpenItemDTO getItem(appId, env, clusterName, namespaceName, key)

获取单个配置项 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String key = "key_example"; // String | 配置项键名
    try {
      OpenItemDTO result = apiInstance.getItem(appId, env, clusterName, namespaceName, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#getItem");
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
| **key** | **String**| 配置项键名 | |

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

<a id="getItemByEncodedKey"></a>
# **getItemByEncodedKey**
> OpenItemDTO getItemByEncodedKey(appId, env, clusterName, namespaceName, key)

通过查询参数获取配置项（支持编码的key） (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

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
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String key = "key_example"; // String | 配置项键名（需要URL编码）
    try {
      OpenItemDTO result = apiInstance.getItemByEncodedKey(appId, env, clusterName, namespaceName, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#getItemByEncodedKey");
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
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**| 集群名称 | |
| **namespaceName** | **String**| 命名空间名称 | |
| **key** | **String**| 配置项键名（需要URL编码） | |

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

<a id="revertItems"></a>
# **revertItems**
> revertItems(appId, env, clusterName, namespaceName, operator)

撤销配置项更改 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revocation

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
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.revertItems(appId, env, clusterName, namespaceName, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#revertItems");
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
| **200** | 配置项更改撤销成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="syncItems"></a>
# **syncItems**
> syncItems(appId, env, clusterName, namespaceName, openNamespaceSyncDTO, operator)

同步配置项到多个命名空间 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/synchronize:

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    OpenNamespaceSyncDTO openNamespaceSyncDTO = new OpenNamespaceSyncDTO(); // OpenNamespaceSyncDTO |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.syncItems(appId, env, clusterName, namespaceName, openNamespaceSyncDTO, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#syncItems");
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
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |
| **openNamespaceSyncDTO** | [**OpenNamespaceSyncDTO**](OpenNamespaceSyncDTO.md)|  | |
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
| **200** | 配置项同步成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="syntaxCheck"></a>
# **syntaxCheck**
> syntaxCheck(appId, env, clusterName, namespaceName, openNamespaceTextModel)

验证配置文本语法 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validation

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
    OpenNamespaceTextModel openNamespaceTextModel = new OpenNamespaceTextModel(); // OpenNamespaceTextModel |
    try {
      apiInstance.syntaxCheck(appId, env, clusterName, namespaceName, openNamespaceTextModel);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#syntaxCheck");
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
| **openNamespaceTextModel** | [**OpenNamespaceTextModel**](OpenNamespaceTextModel.md)|  | |

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
| **200** | 配置文本语法验证通过 |  -  |
| **400** | 配置文本语法错误 |  -  |

<a id="updateItem"></a>
# **updateItem**
> updateItem(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO, operator)

更新配置项 (original openapi)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}

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
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String key = "key_example"; // String |
    Boolean createIfNotExists = false; // Boolean |
    OpenItemDTO openItemDTO = new OpenItemDTO(); // OpenItemDTO |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.updateItem(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#updateItem");
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
| **env** | **String**| 环境标识 | |
| **clusterName** | **String**| 集群名称 | |
| **namespaceName** | **String**| 命名空间名称 | |
| **key** | **String**|  | |
| **createIfNotExists** | **Boolean**|  | [default to false] |
| **openItemDTO** | [**OpenItemDTO**](OpenItemDTO.md)|  | |
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
| **200** | 配置项更新成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 配置项不存在 |  -  |

<a id="updateItemByEncodedKey"></a>
# **updateItemByEncodedKey**
> updateItemByEncodedKey(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO, operator)

通过编码的key更新配置项 (original openapi)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}

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
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String key = "key_example"; // String | 配置项键名（需要URL编码）
    Boolean createIfNotExists = false; // Boolean | 若不存在则创建（true/false）
    OpenItemDTO openItemDTO = new OpenItemDTO(); // OpenItemDTO |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.updateItemByEncodedKey(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#updateItemByEncodedKey");
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
| **key** | **String**| 配置项键名（需要URL编码） | |
| **createIfNotExists** | **Boolean**| 若不存在则创建（true/false） | [default to false] |
| **openItemDTO** | [**OpenItemDTO**](OpenItemDTO.md)|  | |
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
| **200** | 配置项更新成功（编码key） |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 配置项不存在 |  -  |
