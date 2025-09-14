# NamespaceBranchManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branch | 创建命名空间分支 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete) | **DELETE** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} | 删除命名空间分支 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-del-releases | 创建灰度删除发布 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules | 获取分支灰度发布规则 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut) | **PUT** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules | 更新分支灰度发布规则 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet) | **GET** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items | 获取分支下的配置项 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/merge | 合并分支 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch) | **PATCH** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} | 合并分支到主分支 |
| [**openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost**](NamespaceBranchManagementApi.md#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost) | **POST** /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/releases | 创建灰度发布 |


<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost**
> OpenNamespaceDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost(appId, env, clusterName, namespaceName, operator)

创建命名空间分支

POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branch

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
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String operator = "operator_example"; // String | 
    try {
      OpenNamespaceDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost(appId, env, clusterName, namespaceName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost");
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
| **operator** | **String**|  | |

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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete**
> Object openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete(env, appId, clusterName, namespaceName, branchName, operator)

删除命名空间分支

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
    String env = "env_example"; // String | 
    String appId = "appId_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    String operator = "operator_example"; // String | 
    try {
      Object result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete(env, appId, clusterName, namespaceName, branchName, operator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete");
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
| **appId** | **String**|  | |
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |
| **branchName** | **String**|  | |
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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost**
> OpenReleaseDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost(appId, env, clusterName, namespaceName, branchName, namespaceGrayDelReleaseDTO)

创建灰度删除发布



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
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    NamespaceGrayDelReleaseDTO namespaceGrayDelReleaseDTO = new NamespaceGrayDelReleaseDTO(); // NamespaceGrayDelReleaseDTO | 
    try {
      OpenReleaseDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost(appId, env, clusterName, namespaceName, branchName, namespaceGrayDelReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost");
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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet**
> OpenGrayReleaseRuleDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet(appId, env, clusterName, namespaceName, branchName)

获取分支灰度发布规则

GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules

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
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    try {
      OpenGrayReleaseRuleDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet(appId, env, clusterName, namespaceName, branchName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet");
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
| **200** |  |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut**
> Object openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut(appId, env, clusterName, namespaceName, branchName, operator, openGrayReleaseRuleDTO)

更新分支灰度发布规则

PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules

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
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    String operator = "operator_example"; // String | 
    OpenGrayReleaseRuleDTO openGrayReleaseRuleDTO = new OpenGrayReleaseRuleDTO(); // OpenGrayReleaseRuleDTO | 
    try {
      Object result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut(appId, env, clusterName, namespaceName, branchName, operator, openGrayReleaseRuleDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut");
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
| **operator** | **String**|  | |
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
| **200** |  |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet**
> List&lt;OpenItemDTO&gt; openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet(appId, env, clusterName, namespaceName, branchName)

获取分支下的配置项

GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items

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
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    try {
      List<OpenItemDTO> result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet(appId, env, clusterName, namespaceName, branchName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet");
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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost**
> OpenReleaseDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost(appId, env, clusterName, namespaceName, branchName, deleteBranch, namespaceReleaseDTO)

合并分支



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
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    Boolean deleteBranch = true; // Boolean | 
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO | 
    try {
      OpenReleaseDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost(appId, env, clusterName, namespaceName, branchName, deleteBranch, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost");
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
| **deleteBranch** | **Boolean**|  | |
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

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch**
> OpenReleaseDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch(env, appId, clusterName, namespaceName, branchName, deleteBranch, xApolloOperator, namespaceReleaseDTO)

合并分支到主分支

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
    String env = "env_example"; // String | 
    String appId = "appId_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    Boolean deleteBranch = true; // Boolean | 
    String xApolloOperator = "xApolloOperator_example"; // String | 
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO | 
    try {
      OpenReleaseDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch(env, appId, clusterName, namespaceName, branchName, deleteBranch, xApolloOperator, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch");
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
| **appId** | **String**|  | |
| **clusterName** | **String**|  | |
| **namespaceName** | **String**|  | |
| **branchName** | **String**|  | |
| **deleteBranch** | **Boolean**|  | |
| **xApolloOperator** | **String**|  | |
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
| **200** |  |  -  |

<a id="openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost"></a>
# **openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost**
> OpenReleaseDTO openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost(appId, env, clusterName, namespaceName, branchName, namespaceReleaseDTO)

创建灰度发布



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
    String appId = "appId_example"; // String | 
    String env = "env_example"; // String | 
    String clusterName = "clusterName_example"; // String | 
    String namespaceName = "namespaceName_example"; // String | 
    String branchName = "branchName_example"; // String | 
    NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO(); // NamespaceReleaseDTO | 
    try {
      OpenReleaseDTO result = apiInstance.openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost(appId, env, clusterName, namespaceName, branchName, namespaceReleaseDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost");
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
| **200** |  |  -  |

