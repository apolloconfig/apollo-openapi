# NamespaceBranchManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBranch**](NamespaceBranchManagementApi.md#createBranch) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches | 创建命名空间分支 (original openapi) |
| [**deleteBranch**](NamespaceBranchManagementApi.md#deleteBranch) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} | 删除命名空间分支 (original openapi) |
| [**findBranch**](NamespaceBranchManagementApi.md#findBranch) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches | 获取命名空间分支信息 (original openapi) |
| [**getBranchGrayRules**](NamespaceBranchManagementApi.md#getBranchGrayRules) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules | 获取分支灰度发布规则 (original openapi) |
| [**mergeBranch**](NamespaceBranchManagementApi.md#mergeBranch) | **PATCH** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} | 合并分支到主分支 (new added) |
| [**updateBranchRules**](NamespaceBranchManagementApi.md#updateBranchRules) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules | 更新分支灰度发布规则 (original openapi) |


<a id="createBranch"></a>
# **createBranch**
> OpenNamespaceDTO createBranch(appId, env, clusterName, namespaceName, operator)

创建命名空间分支 (original openapi)

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceBranchManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceBranchManagementApi apiInstance = new NamespaceBranchManagementApi(defaultClient);
    String appId = "appId_example"; // String | app标识
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String operator = "operator_example"; // String | 操作人用户名
    try {
      OpenNamespaceDTO result = apiInstance.createBranch(appId, env, clusterName, namespaceName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#createBranch");
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
| **operator** | **String**| 操作人用户名 | |

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
| **200** | 命名空间分支创建成功 |  -  |

<a id="deleteBranch"></a>
# **deleteBranch**
> Object deleteBranch(env, appId, clusterName, namespaceName, branchName, operator)

删除命名空间分支 (original openapi)

DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceBranchManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceBranchManagementApi apiInstance = new NamespaceBranchManagementApi(defaultClient);
    String env = "env_example"; // String | 环境标识
    String appId = "appId_example"; // String | 应用ID
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String branchName = "branchName_example"; // String | 分支名称
    String operator = "operator_example"; // String | 操作人用户名
    try {
      Object result = apiInstance.deleteBranch(env, appId, clusterName, namespaceName, branchName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#deleteBranch");
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
| **namespaceName** | **String**| 命名空间名称 | |
| **branchName** | **String**| 分支名称 | |
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
| **200** | 分支删除成功 |  -  |

<a id="findBranch"></a>
# **findBranch**
> OpenNamespaceDTO findBranch(appId, env, clusterName, namespaceName)

获取命名空间分支信息 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceBranchManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceBranchManagementApi apiInstance = new NamespaceBranchManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    try {
      OpenNamespaceDTO result = apiInstance.findBranch(appId, env, clusterName, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#findBranch");
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
| **200** | 成功获取分支信息 |  -  |
| **404** | 分支不存在 |  -  |

<a id="getBranchGrayRules"></a>
# **getBranchGrayRules**
> OpenGrayReleaseRuleDTO getBranchGrayRules(appId, env, clusterName, namespaceName, branchName)

获取分支灰度发布规则 (original openapi)

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceBranchManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceBranchManagementApi apiInstance = new NamespaceBranchManagementApi(defaultClient);
    String appId = "appId_example"; // String | app标识
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String branchName = "branchName_example"; // String | 分支名称
    try {
      OpenGrayReleaseRuleDTO result = apiInstance.getBranchGrayRules(appId, env, clusterName, namespaceName, branchName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#getBranchGrayRules");
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

### Return type

[**OpenGrayReleaseRuleDTO**](OpenGrayReleaseRuleDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取灰度发布规则 |  -  |

<a id="mergeBranch"></a>
# **mergeBranch**
> OpenReleaseDTO mergeBranch(env, appId, clusterName, namespaceName, branchName, deleteBranch, operator, namespaceReleaseDTO)

合并分支到主分支 (new added)

PATCH /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}  使用 PATCH 方法表示部分更新操作（将分支状态从\&quot;独立\&quot;更新为\&quot;合并\&quot;）

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceBranchManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceBranchManagementApi apiInstance = new NamespaceBranchManagementApi(defaultClient);
    String env = "env_example"; // String | 环境标识
    String appId = "appId_example"; // String | 应用ID
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String branchName = "branchName_example"; // String | 分支名称
    Boolean deleteBranch = true; // Boolean | 合并后是否删除分支（true/false）
    String operator = "operator_example"; // String | 操作人用户名
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO |
    try {
      OpenReleaseDTO result = apiInstance.mergeBranch(env, appId, clusterName, namespaceName, branchName, deleteBranch, operator, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#mergeBranch");
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
| **namespaceName** | **String**| 命名空间名称 | |
| **branchName** | **String**| 分支名称 | |
| **deleteBranch** | **Boolean**| 合并后是否删除分支（true/false） | |
| **operator** | **String**| 操作人用户名 | |
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

<a id="updateBranchRules"></a>
# **updateBranchRules**
> Object updateBranchRules(appId, env, clusterName, namespaceName, branchName, operator, openGrayReleaseRuleDTO)

更新分支灰度发布规则 (original openapi)

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespaceBranchManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NamespaceBranchManagementApi apiInstance = new NamespaceBranchManagementApi(defaultClient);
    String appId = "appId_example"; // String | 应用ID
    String env = "env_example"; // String | 环境标识
    String clusterName = "clusterName_example"; // String | 集群名称
    String namespaceName = "namespaceName_example"; // String | 命名空间名称
    String branchName = "branchName_example"; // String | 分支名称
    String operator = "operator_example"; // String | 操作人用户名
    OpenGrayReleaseRuleDTO openGrayReleaseRuleDTO = new OpenGrayReleaseRuleDTO(); // OpenGrayReleaseRuleDTO |
    try {
      Object result = apiInstance.updateBranchRules(appId, env, clusterName, namespaceName, branchName, operator, openGrayReleaseRuleDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#updateBranchRules");
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
| **operator** | **String**| 操作人用户名 | |
| **openGrayReleaseRuleDTO** | [**OpenGrayReleaseRuleDTO**](OpenGrayReleaseRuleDTO.md)|  | |

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
| **200** | 灰度规则更新成功 |  -  |
