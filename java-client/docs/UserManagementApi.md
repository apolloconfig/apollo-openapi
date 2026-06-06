# UserManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeUserEnabled**](UserManagementApi.md#changeUserEnabled) | **PUT** /openapi/v1/users/enabled | 修改用户启用状态(new added) |
| [**createOrUpdateUser**](UserManagementApi.md#createOrUpdateUser) | **POST** /openapi/v1/users | 创建或更新用户(new added) |
| [**getCurrentUser**](UserManagementApi.md#getCurrentUser) | **GET** /openapi/v1/user | 获取当前Portal用户(new added) |
| [**getUserByUserId**](UserManagementApi.md#getUserByUserId) | **GET** /openapi/v1/users/{userId} | 获取指定用户(new added) |
| [**searchUsers**](UserManagementApi.md#searchUsers) | **GET** /openapi/v1/users | 搜索用户(new added) |


<a id="changeUserEnabled"></a>
# **changeUserEnabled**
> changeUserEnabled(openUserDTO, operator)

修改用户启用状态(new added)

PUT /openapi/v1/users/enabled，Portal用户登录态使用当前登录用户作为operator；Consumer Token访问时需要具备ManageUsers权限并传入有效operator

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    OpenUserDTO openUserDTO = new OpenUserDTO(); // OpenUserDTO |
    String operator = "operator_example"; // String | 操作人用户名，Consumer Token访问时必填且必须是已存在用户；Portal用户登录态会忽略该参数
    try {
      apiInstance.changeUserEnabled(openUserDTO, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#changeUserEnabled");
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
| **openUserDTO** | [**OpenUserDTO**](OpenUserDTO.md)|  | |
| **operator** | **String**| 操作人用户名，Consumer Token访问时必填且必须是已存在用户；Portal用户登录态会忽略该参数 | [optional] |

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
| **200** | 用户状态修改成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="createOrUpdateUser"></a>
# **createOrUpdateUser**
> createOrUpdateUser(openUserDTO, isCreate, operator)

创建或更新用户(new added)

POST /openapi/v1/users，Portal用户登录态使用当前登录用户作为operator；Consumer Token访问时需要具备ManageUsers权限并传入有效operator

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    OpenUserDTO openUserDTO = new OpenUserDTO(); // OpenUserDTO |
    Boolean isCreate = false; // Boolean | true 表示创建用户，false 表示更新用户
    String operator = "operator_example"; // String | 操作人用户名，Consumer Token访问时必填且必须是已存在用户；Portal用户登录态会忽略该参数
    try {
      apiInstance.createOrUpdateUser(openUserDTO, isCreate, operator);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#createOrUpdateUser");
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
| **openUserDTO** | [**OpenUserDTO**](OpenUserDTO.md)|  | |
| **isCreate** | **Boolean**| true 表示创建用户，false 表示更新用户 | [optional] [default to false] |
| **operator** | **String**| 操作人用户名，Consumer Token访问时必填且必须是已存在用户；Portal用户登录态会忽略该参数 | [optional] |

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
| **200** | 用户创建或更新成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **403** | 权限不足 |  -  |

<a id="getCurrentUser"></a>
# **getCurrentUser**
> OpenUserInfoDTO getCurrentUser()

获取当前Portal用户(new added)

GET /openapi/v1/user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    try {
      OpenUserInfoDTO result = apiInstance.getCurrentUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getCurrentUser");
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

[**OpenUserInfoDTO**](OpenUserInfoDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取当前用户 |  -  |
| **401** | 未登录或未授权访问 |  -  |
| **403** | 仅支持Portal用户登录态访问 |  -  |

<a id="getUserByUserId"></a>
# **getUserByUserId**
> OpenUserInfoDTO getUserByUserId(userId)

获取指定用户(new added)

GET /openapi/v1/users/{userId}，支持Portal用户登录态或具备ManageUsers权限的Consumer Token访问

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    String userId = "userId_example"; // String | 用户ID
    try {
      OpenUserInfoDTO result = apiInstance.getUserByUserId(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getUserByUserId");
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
| **userId** | **String**| 用户ID | |

### Return type

[**OpenUserInfoDTO**](OpenUserInfoDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取用户 |  -  |
| **400** | 请求参数错误或用户不存在 |  -  |
| **401** | 未登录或未认证 |  -  |
| **403** | 权限不足 |  -  |

<a id="searchUsers"></a>
# **searchUsers**
> List&lt;OpenUserInfoDTO&gt; searchUsers(keyword, includeInactiveUsers, offset, limit)

搜索用户(new added)

GET /openapi/v1/users，支持Portal用户登录态或具备ManageUsers权限的Consumer Token访问

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    String keyword = "keyword_example"; // String | 用户名、显示名或邮箱关键字
    Boolean includeInactiveUsers = false; // Boolean | 是否包含禁用用户
    Integer offset = 0; // Integer | 偏移量
    Integer limit = 10; // Integer | 返回数量
    try {
      List<OpenUserInfoDTO> result = apiInstance.searchUsers(keyword, includeInactiveUsers, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#searchUsers");
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
| **keyword** | **String**| 用户名、显示名或邮箱关键字 | |
| **includeInactiveUsers** | **Boolean**| 是否包含禁用用户 | [optional] [default to false] |
| **offset** | **Integer**| 偏移量 | [optional] [default to 0] |
| **limit** | **Integer**| 返回数量 | [optional] [default to 10] |

### Return type

[**List&lt;OpenUserInfoDTO&gt;**](OpenUserInfoDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功获取用户列表 |  -  |
| **401** | 未登录或未授权访问 |  -  |
| **403** | 权限不足 |  -  |
