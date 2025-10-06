# ItemManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpdateItemsByText**](ItemManagementApi.md#batchUpdateItemsByText) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/batchUpdate | 通过文本批量修改配置项 (new added) |
| [**compareItems**](ItemManagementApi.md#compareItems) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/compare | 对比命名空间配置差异 (new added) |
| [**createItem**](ItemManagementApi.md#createItem) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 创建新的配置项 (original openapi) |
| [**deleteItem**](ItemManagementApi.md#deleteItem) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 删除配置项 (original openapi) |
| [**deleteItemByEncodedKey**](ItemManagementApi.md#deleteItemByEncodedKey) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key删除配置项 (original openapi) |
| [**findItemsByNamespace**](ItemManagementApi.md#findItemsByNamespace) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items | 获取命名空间下的配置项列表 (original openapi) |
| [**getBranchItems**](ItemManagementApi.md#getBranchItems) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items | 获取分支下的配置项 (new added) |
| [**getItem**](ItemManagementApi.md#getItem) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 获取单个配置项 (original openapi) |
| [**getItemByEncodedKey**](ItemManagementApi.md#getItemByEncodedKey) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过查询参数获取配置项（支持编码的key） (original openapi) |
| [**revertItems**](ItemManagementApi.md#revertItems) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revert | 撤销配置项更改 (new added) |
| [**syncItems**](ItemManagementApi.md#syncItems) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/sync | 同步配置项到多个命名空间 (new added) |
| [**updateItem**](ItemManagementApi.md#updateItem) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} | 更新配置项 (original openapi) |
| [**updateItemByEncodedKey**](ItemManagementApi.md#updateItemByEncodedKey) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} | 通过编码的key更新配置项 (original openapi) |
| [**validateItems**](ItemManagementApi.md#validateItems) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validate | 验证配置文本语法 (new added) |


<a id="batchUpdateItemsByText"></a>
# **batchUpdateItemsByText**
> Object batchUpdateItemsByText(appId, env, clusterName, namespaceName, operator, openNamespaceTextModel)

通过文本批量修改配置项 (new added)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/batchUpdate:

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
    OpenNamespaceTextModel openNamespaceTextModel = new OpenNamespaceTextModel(); // OpenNamespaceTextModel |
    try {
      Object result = apiInstance.batchUpdateItemsByText(appId, env, clusterName, namespaceName, operator, openNamespaceTextModel);
      System.out.println(result);
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
| **operator** | **String**| 操作人用户名 | |
| **openNamespaceTextModel** | [**OpenNamespaceTextModel**](OpenNamespaceTextModel.md)|  | |

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
| **200** | 批量更新配置项成功 |  -  |
| **403** | 权限不足 |  -  |

<a id="compareItems"></a>
# **compareItems**
> List&lt;OpenItemDiffs&gt; compareItems(appId, env, clusterName, namespaceName, openNamespaceSyncModel)

对比命名空间配置差异 (new added)

POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/compare

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
    OpenNamespaceSyncModel openNamespaceSyncModel = new OpenNamespaceSyncModel(); // OpenNamespaceSyncModel |
    try {
      List<OpenItemDiffs> result = apiInstance.compareItems(appId, env, clusterName, namespaceName, openNamespaceSyncModel);
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
| **openNamespaceSyncModel** | [**OpenNamespaceSyncModel**](OpenNamespaceSyncModel.md)|  | |

### Return type

[**List&lt;OpenItemDiffs&gt;**](OpenItemDiffs.md)

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
> OpenItemDTO createItem(appId, env, clusterName, namespaceName, operator, openItemDTO)

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
    String operator = "operator_example"; // String | 操作人用户名
    OpenItemDTO openItemDTO = new OpenItemDTO(); // OpenItemDTO |
    try {
      OpenItemDTO result = apiInstance.createItem(appId, env, clusterName, namespaceName, operator, openItemDTO);
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
| **operator** | **String**| 操作人用户名 | |
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

<a id="deleteItem"></a>
# **deleteItem**
> Object deleteItem(appId, env, clusterName, namespaceName, key, operator)

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
      Object result = apiInstance.deleteItem(appId, env, clusterName, namespaceName, key, operator);
      System.out.println(result);
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
| **200** | 配置项删除成功 |  -  |

<a id="deleteItemByEncodedKey"></a>
# **deleteItemByEncodedKey**
> Object deleteItemByEncodedKey(appId, env, clusterName, namespaceName, key, operator)

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
      Object result = apiInstance.deleteItemByEncodedKey(appId, env, clusterName, namespaceName, key, operator);
      System.out.println(result);
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

<a id="findItemsByNamespace"></a>
# **findItemsByNamespace**
> OpenPageDTOOpenItemDTO findItemsByNamespace(appId, env, clusterName, namespaceName, page, size)

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
      OpenPageDTOOpenItemDTO result = apiInstance.findItemsByNamespace(appId, env, clusterName, namespaceName, page, size);
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

<a id="getBranchItems"></a>
# **getBranchItems**
> List&lt;OpenItemDTO&gt; getBranchItems(appId, env, clusterName, namespaceName, branchName)

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
      List<OpenItemDTO> result = apiInstance.getBranchItems(appId, env, clusterName, namespaceName, branchName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#getBranchItems");
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
> Object revertItems(appId, env, clusterName, namespaceName, operator)

撤销配置项更改 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revert

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
      Object result = apiInstance.revertItems(appId, env, clusterName, namespaceName, operator);
      System.out.println(result);
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
| **200** | 配置项更改撤销成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="syncItems"></a>
# **syncItems**
> Object syncItems(appId, env, clusterName, namespaceName, operator, openNamespaceSyncModel)

同步配置项到多个命名空间 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/sync:

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
    String operator = "operator_example"; // String | 操作人用户名
    OpenNamespaceSyncModel openNamespaceSyncModel = new OpenNamespaceSyncModel(); // OpenNamespaceSyncModel |
    try {
      Object result = apiInstance.syncItems(appId, env, clusterName, namespaceName, operator, openNamespaceSyncModel);
      System.out.println(result);
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
| **operator** | **String**| 操作人用户名 | |
| **openNamespaceSyncModel** | [**OpenNamespaceSyncModel**](OpenNamespaceSyncModel.md)|  | |

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
| **200** | 配置项同步成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="updateItem"></a>
# **updateItem**
> Object updateItem(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO)

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
    try {
      Object result = apiInstance.updateItem(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO);
      System.out.println(result);
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
| **200** | 配置项更新成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 配置项不存在 |  -  |

<a id="updateItemByEncodedKey"></a>
# **updateItemByEncodedKey**
> Object updateItemByEncodedKey(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO)

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
    try {
      Object result = apiInstance.updateItemByEncodedKey(appId, env, clusterName, namespaceName, key, createIfNotExists, openItemDTO);
      System.out.println(result);
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
| **200** | 配置项更新成功（编码key） |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |
| **404** | 配置项不存在 |  -  |

<a id="validateItems"></a>
# **validateItems**
> Object validateItems(appId, env, clusterName, namespaceName, openNamespaceTextModel)

验证配置文本语法 (new added)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validate

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
      Object result = apiInstance.validateItems(appId, env, clusterName, namespaceName, openNamespaceTextModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemManagementApi#validateItems");
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

**Object**

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
