# PermissionManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCreateApplicationRoleToUsers**](PermissionManagementApi.md#addCreateApplicationRoleToUsers) | **POST** /openapi/v1/system/roles/create-application | 分配建应用角色 (new added) |
| [**addManageAppMasterRoleToUser**](PermissionManagementApi.md#addManageAppMasterRoleToUser) | **POST** /openapi/v1/apps/{appId}/roles/master | 分配AppMaster (new added) |
| [**assignAppRoleToUser**](PermissionManagementApi.md#assignAppRoleToUser) | **POST** /openapi/v1/apps/{appId}/roles/{roleType} | 分配应用角色 (new added) |
| [**assignClusterNamespaceRoleToUser**](PermissionManagementApi.md#assignClusterNamespaceRoleToUser) | **POST** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/roles/{roleType} | 分配集群Namespace角色 (new added) |
| [**assignNamespaceEnvRoleToUser**](PermissionManagementApi.md#assignNamespaceEnvRoleToUser) | **POST** /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/roles/{roleType} | 分配环境Namespace角色 (new added) |
| [**assignNamespaceRoleToUser**](PermissionManagementApi.md#assignNamespaceRoleToUser) | **POST** /openapi/v1/apps/{appId}/namespaces/{namespaceName}/roles/{roleType} | 分配Namespace角色 (new added) |
| [**deleteCreateApplicationRoleFromUser**](PermissionManagementApi.md#deleteCreateApplicationRoleFromUser) | **DELETE** /openapi/v1/system/roles/create-application | 移除建应用角色 (new added) |
| [**getAppRoles**](PermissionManagementApi.md#getAppRoles) | **GET** /openapi/v1/apps/{appId}/role-users | 获取应用角色用户 (new added) |
| [**getClusterNamespaceRoles**](PermissionManagementApi.md#getClusterNamespaceRoles) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/role-users | 获取集群Namespace用户 (new added) |
| [**getCreateApplicationRoleUsers**](PermissionManagementApi.md#getCreateApplicationRoleUsers) | **GET** /openapi/v1/system/roles/create-application/role-users | 获取建应用用户 (new added) |
| [**getNamespaceEnvRoleUsers**](PermissionManagementApi.md#getNamespaceEnvRoleUsers) | **GET** /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/role-users | 获取环境Namespace用户 (new added) |
| [**getNamespaceRoles**](PermissionManagementApi.md#getNamespaceRoles) | **GET** /openapi/v1/apps/{appId}/namespaces/{namespaceName}/role-users | 获取Namespace用户 (new added) |
| [**hasAppPermission**](PermissionManagementApi.md#hasAppPermission) | **GET** /openapi/v1/apps/{appId}/permissions/{permissionType} | 校验应用权限 (new added) |
| [**hasClusterNamespacePermission**](PermissionManagementApi.md#hasClusterNamespacePermission) | **GET** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/permissions/{permissionType} | 校验集群Namespace权限 (new added) |
| [**hasCreateApplicationPermission**](PermissionManagementApi.md#hasCreateApplicationPermission) | **GET** /openapi/v1/system/roles/create-application | 校验建应用权限 (new added) |
| [**hasEnvNamespacePermission**](PermissionManagementApi.md#hasEnvNamespacePermission) | **GET** /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/permissions/{permissionType} | 校验环境Namespace权限 (new added) |
| [**hasNamespacePermission**](PermissionManagementApi.md#hasNamespacePermission) | **GET** /openapi/v1/apps/{appId}/namespaces/{namespaceName}/permissions/{permissionType} | 校验Namespace权限 (new added) |
| [**hasRootPermission**](PermissionManagementApi.md#hasRootPermission) | **GET** /openapi/v1/permissions/root | 校验Root权限 (new added) |
| [**initAppPermission**](PermissionManagementApi.md#initAppPermission) | **POST** /openapi/v1/apps/{appId}/namespaces/{namespaceName}/permission-init | 初始化应用权限 (new added) |
| [**initClusterNamespacePermission**](PermissionManagementApi.md#initClusterNamespacePermission) | **POST** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/permission-init | 初始化集群Namespace权限 (new added) |
| [**isManageAppMasterPermissionEnabled**](PermissionManagementApi.md#isManageAppMasterPermissionEnabled) | **GET** /openapi/v1/system/role/manage-app-master | 校验AppMaster开关 (new added) |
| [**removeAppRoleFromUser**](PermissionManagementApi.md#removeAppRoleFromUser) | **DELETE** /openapi/v1/apps/{appId}/roles/{roleType} | 移除应用角色 (new added) |
| [**removeClusterNamespaceRoleFromUser**](PermissionManagementApi.md#removeClusterNamespaceRoleFromUser) | **DELETE** /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/roles/{roleType} | 移除集群Namespace角色 (new added) |
| [**removeManageAppMasterRoleFromUser**](PermissionManagementApi.md#removeManageAppMasterRoleFromUser) | **DELETE** /openapi/v1/apps/{appId}/roles/master | 移除AppMaster (new added) |
| [**removeNamespaceEnvRoleFromUser**](PermissionManagementApi.md#removeNamespaceEnvRoleFromUser) | **DELETE** /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/roles/{roleType} | 移除环境Namespace角色 (new added) |
| [**removeNamespaceRoleFromUser**](PermissionManagementApi.md#removeNamespaceRoleFromUser) | **DELETE** /openapi/v1/apps/{appId}/namespaces/{namespaceName}/roles/{roleType} | 移除Namespace角色 (new added) |


<a id="addCreateApplicationRoleToUsers"></a>
# **addCreateApplicationRoleToUsers**
> addCreateApplicationRoleToUsers(operator, requestBody)

分配建应用角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String operator = "operator_example"; // String | 操作人用户名
    List<String> requestBody = Arrays.asList(); // List<String> |
    try {
      apiInstance.addCreateApplicationRoleToUsers(operator, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#addCreateApplicationRoleToUsers");
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
| **operator** | **String**| 操作人用户名 | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="addManageAppMasterRoleToUser"></a>
# **addManageAppMasterRoleToUser**
> addManageAppMasterRoleToUser(appId, userId, operator)

分配AppMaster (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String userId = "userId_example"; // String | the user which role assign to
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.addManageAppMasterRoleToUser(appId, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#addManageAppMasterRoleToUser");
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
| **userId** | **String**| the user which role assign to | |
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
| **200** |  |  -  |

<a id="assignAppRoleToUser"></a>
# **assignAppRoleToUser**
> assignAppRoleToUser(appId, roleType, userId, operator, body)

分配应用角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role removed from
    String operator = "operator_example"; // String | 操作人用户名
    String body = "body_example"; // String |
    try {
      apiInstance.assignAppRoleToUser(appId, roleType, userId, operator, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#assignAppRoleToUser");
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
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role removed from | |
| **operator** | **String**| 操作人用户名 | [optional] |
| **body** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="assignClusterNamespaceRoleToUser"></a>
# **assignClusterNamespaceRoleToUser**
> assignClusterNamespaceRoleToUser(appId, env, clusterName, roleType, userId, operator)

分配集群Namespace角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role assigned to
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.assignClusterNamespaceRoleToUser(appId, env, clusterName, roleType, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#assignClusterNamespaceRoleToUser");
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
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role assigned to | |
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
| **200** |  |  -  |

<a id="assignNamespaceEnvRoleToUser"></a>
# **assignNamespaceEnvRoleToUser**
> assignNamespaceEnvRoleToUser(appId, env, namespaceName, roleType, userId, operator)

分配环境Namespace角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role assigned to
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.assignNamespaceEnvRoleToUser(appId, env, namespaceName, roleType, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#assignNamespaceEnvRoleToUser");
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
| **namespaceName** | **String**|  | |
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role assigned to | |
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
| **200** |  |  -  |

<a id="assignNamespaceRoleToUser"></a>
# **assignNamespaceRoleToUser**
> assignNamespaceRoleToUser(appId, namespaceName, roleType, userId, operator)

分配Namespace角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role assigned to
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.assignNamespaceRoleToUser(appId, namespaceName, roleType, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#assignNamespaceRoleToUser");
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
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role assigned to | |
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
| **200** |  |  -  |

<a id="deleteCreateApplicationRoleFromUser"></a>
# **deleteCreateApplicationRoleFromUser**
> deleteCreateApplicationRoleFromUser(userId, operator)

移除建应用角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String userId = "userId_example"; // String |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.deleteCreateApplicationRoleFromUser(userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#deleteCreateApplicationRoleFromUser");
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
| **userId** | **String**|  | |
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
| **200** |  |  -  |

<a id="getAppRoles"></a>
# **getAppRoles**
> OpenAppRoleUserDTO getAppRoles(appId)

获取应用角色用户 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    try {
      OpenAppRoleUserDTO result = apiInstance.getAppRoles(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getAppRoles");
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

[**OpenAppRoleUserDTO**](OpenAppRoleUserDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getClusterNamespaceRoles"></a>
# **getClusterNamespaceRoles**
> OpenClusterNamespaceRoleUserDTO getClusterNamespaceRoles(appId, env, clusterName)

获取集群Namespace用户 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    try {
      OpenClusterNamespaceRoleUserDTO result = apiInstance.getClusterNamespaceRoles(appId, env, clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getClusterNamespaceRoles");
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

[**OpenClusterNamespaceRoleUserDTO**](OpenClusterNamespaceRoleUserDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getCreateApplicationRoleUsers"></a>
# **getCreateApplicationRoleUsers**
> List&lt;String&gt; getCreateApplicationRoleUsers()

获取建应用用户 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    try {
      List<String> result = apiInstance.getCreateApplicationRoleUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getCreateApplicationRoleUsers");
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

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getNamespaceEnvRoleUsers"></a>
# **getNamespaceEnvRoleUsers**
> OpenEnvNamespaceRoleUserDTO getNamespaceEnvRoleUsers(appId, env, namespaceName)

获取环境Namespace用户 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    try {
      OpenEnvNamespaceRoleUserDTO result = apiInstance.getNamespaceEnvRoleUsers(appId, env, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getNamespaceEnvRoleUsers");
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
| **namespaceName** | **String**|  | |

### Return type

[**OpenEnvNamespaceRoleUserDTO**](OpenEnvNamespaceRoleUserDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getNamespaceRoles"></a>
# **getNamespaceRoles**
> OpenNamespaceRoleUserDTO getNamespaceRoles(appId, namespaceName)

获取Namespace用户 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    try {
      OpenNamespaceRoleUserDTO result = apiInstance.getNamespaceRoles(appId, namespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getNamespaceRoles");
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

[**OpenNamespaceRoleUserDTO**](OpenNamespaceRoleUserDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="hasAppPermission"></a>
# **hasAppPermission**
> OpenPermissionConditionDTO hasAppPermission(appId, permissionType, userId)

校验应用权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String permissionType = "permissionType_example"; // String |
    String userId = "userId_example"; // String |
    try {
      OpenPermissionConditionDTO result = apiInstance.hasAppPermission(appId, permissionType, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#hasAppPermission");
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
| **permissionType** | **String**|  | |
| **userId** | **String**|  | |

### Return type

[**OpenPermissionConditionDTO**](OpenPermissionConditionDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="hasClusterNamespacePermission"></a>
# **hasClusterNamespacePermission**
> OpenPermissionConditionDTO hasClusterNamespacePermission(appId, env, clusterName, permissionType, userId)

校验集群Namespace权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String permissionType = "permissionType_example"; // String |
    String userId = "userId_example"; // String |
    try {
      OpenPermissionConditionDTO result = apiInstance.hasClusterNamespacePermission(appId, env, clusterName, permissionType, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#hasClusterNamespacePermission");
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
| **permissionType** | **String**|  | |
| **userId** | **String**|  | |

### Return type

[**OpenPermissionConditionDTO**](OpenPermissionConditionDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="hasCreateApplicationPermission"></a>
# **hasCreateApplicationPermission**
> Map&lt;String, Boolean&gt; hasCreateApplicationPermission(userId)

校验建应用权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String userId = "userId_example"; // String |
    try {
      Map<String, Boolean> result = apiInstance.hasCreateApplicationPermission(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#hasCreateApplicationPermission");
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
| **userId** | **String**|  | |

### Return type

**Map&lt;String, Boolean&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="hasEnvNamespacePermission"></a>
# **hasEnvNamespacePermission**
> OpenPermissionConditionDTO hasEnvNamespacePermission(appId, env, namespaceName, permissionType, userId)

校验环境Namespace权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String permissionType = "permissionType_example"; // String |
    String userId = "userId_example"; // String |
    try {
      OpenPermissionConditionDTO result = apiInstance.hasEnvNamespacePermission(appId, env, namespaceName, permissionType, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#hasEnvNamespacePermission");
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
| **namespaceName** | **String**|  | |
| **permissionType** | **String**|  | |
| **userId** | **String**|  | |

### Return type

[**OpenPermissionConditionDTO**](OpenPermissionConditionDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="hasNamespacePermission"></a>
# **hasNamespacePermission**
> OpenPermissionConditionDTO hasNamespacePermission(appId, namespaceName, permissionType, userId)

校验Namespace权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String permissionType = "permissionType_example"; // String |
    String userId = "userId_example"; // String |
    try {
      OpenPermissionConditionDTO result = apiInstance.hasNamespacePermission(appId, namespaceName, permissionType, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#hasNamespacePermission");
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
| **permissionType** | **String**|  | |
| **userId** | **String**|  | |

### Return type

[**OpenPermissionConditionDTO**](OpenPermissionConditionDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="hasRootPermission"></a>
# **hasRootPermission**
> OpenPermissionConditionDTO hasRootPermission(userId)

校验Root权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String userId = "userId_example"; // String |
    try {
      OpenPermissionConditionDTO result = apiInstance.hasRootPermission(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#hasRootPermission");
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
| **userId** | **String**|  | |

### Return type

[**OpenPermissionConditionDTO**](OpenPermissionConditionDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="initAppPermission"></a>
# **initAppPermission**
> initAppPermission(appId, namespaceName, operator)

初始化应用权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.initAppPermission(appId, namespaceName, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#initAppPermission");
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
| **200** | 初始化成功 |  -  |

<a id="initClusterNamespacePermission"></a>
# **initClusterNamespacePermission**
> initClusterNamespacePermission(appId, env, clusterName, operator)

初始化集群Namespace权限 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.initClusterNamespacePermission(appId, env, clusterName, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#initClusterNamespacePermission");
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
| **200** |  |  -  |

<a id="isManageAppMasterPermissionEnabled"></a>
# **isManageAppMasterPermissionEnabled**
> Map&lt;String, Boolean&gt; isManageAppMasterPermissionEnabled()

校验AppMaster开关 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    try {
      Map<String, Boolean> result = apiInstance.isManageAppMasterPermissionEnabled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#isManageAppMasterPermissionEnabled");
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

**Map&lt;String, Boolean&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="removeAppRoleFromUser"></a>
# **removeAppRoleFromUser**
> removeAppRoleFromUser(appId, roleType, userId, operator)

移除应用角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role removed from
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.removeAppRoleFromUser(appId, roleType, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#removeAppRoleFromUser");
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
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role removed from | |
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
| **200** |  |  -  |

<a id="removeClusterNamespaceRoleFromUser"></a>
# **removeClusterNamespaceRoleFromUser**
> removeClusterNamespaceRoleFromUser(appId, env, clusterName, roleType, userId, operator)

移除集群Namespace角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String clusterName = "clusterName_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role removed from
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.removeClusterNamespaceRoleFromUser(appId, env, clusterName, roleType, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#removeClusterNamespaceRoleFromUser");
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
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role removed from | |
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
| **200** |  |  -  |

<a id="removeManageAppMasterRoleFromUser"></a>
# **removeManageAppMasterRoleFromUser**
> removeManageAppMasterRoleFromUser(appId, userId, operator)

移除AppMaster (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String userId = "userId_example"; // String | the user which role removed from
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.removeManageAppMasterRoleFromUser(appId, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#removeManageAppMasterRoleFromUser");
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
| **userId** | **String**| the user which role removed from | |
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
| **200** |  |  -  |

<a id="removeNamespaceEnvRoleFromUser"></a>
# **removeNamespaceEnvRoleFromUser**
> removeNamespaceEnvRoleFromUser(appId, env, namespaceName, roleType, userId, operator)

移除环境Namespace角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String env = "env_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role removed from
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.removeNamespaceEnvRoleFromUser(appId, env, namespaceName, roleType, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#removeNamespaceEnvRoleFromUser");
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
| **namespaceName** | **String**|  | |
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role removed from | |
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
| **200** |  |  -  |

<a id="removeNamespaceRoleFromUser"></a>
# **removeNamespaceRoleFromUser**
> removeNamespaceRoleFromUser(appId, namespaceName, roleType, userId, operator)

移除Namespace角色 (new added)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PermissionManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PermissionManagementApi apiInstance = new PermissionManagementApi(defaultClient);
    String appId = "appId_example"; // String |
    String namespaceName = "namespaceName_example"; // String |
    String roleType = "roleType_example"; // String |
    String userId = "userId_example"; // String | the user which role removed from
    String operator = "operator_example"; // String | 操作人用户名
    try {
      apiInstance.removeNamespaceRoleFromUser(appId, namespaceName, roleType, userId, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#removeNamespaceRoleFromUser");
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
| **roleType** | **String**|  | |
| **userId** | **String**| the user which role removed from | |
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
| **200** |  |  -  |
