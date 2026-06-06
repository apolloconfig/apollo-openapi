package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.OpenUserDTO;
import com.apollo.openapi.server.model.OpenUserInfoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link UserManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface UserManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /openapi/v1/users/enabled : 修改用户启用状态(new added)
     * PUT /openapi/v1/users/enabled，Portal用户登录态使用当前登录用户作为operator；Consumer Token访问时需要具备ManageUsers权限并传入有效operator
     *
     * @param openUserDTO  (required)
     * @param operator 操作人用户名，Consumer Token访问时必填且必须是已存在用户；Portal用户登录态会忽略该参数 (optional)
     * @return 用户状态修改成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see UserManagementApi#changeUserEnabled
     */
    default ResponseEntity<Void> changeUserEnabled(OpenUserDTO openUserDTO,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/users : 创建或更新用户(new added)
     * POST /openapi/v1/users，Portal用户登录态使用当前登录用户作为operator；Consumer Token访问时需要具备ManageUsers权限并传入有效operator
     *
     * @param openUserDTO  (required)
     * @param isCreate true 表示创建用户，false 表示更新用户 (optional, default to false)
     * @param operator 操作人用户名，Consumer Token访问时必填且必须是已存在用户；Portal用户登录态会忽略该参数 (optional)
     * @return 用户创建或更新成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see UserManagementApi#createOrUpdateUser
     */
    default ResponseEntity<Void> createOrUpdateUser(OpenUserDTO openUserDTO,
        Boolean isCreate,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/user : 获取当前Portal用户(new added)
     * GET /openapi/v1/user
     *
     * @return 成功获取当前用户 (status code 200)
     *         or 未登录或未授权访问 (status code 401)
     *         or 仅支持Portal用户登录态访问 (status code 403)
     * @see UserManagementApi#getCurrentUser
     */
    default ResponseEntity<OpenUserInfoDTO> getCurrentUser() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/users/{userId} : 获取指定用户(new added)
     * GET /openapi/v1/users/{userId}，支持Portal用户登录态或具备ManageUsers权限的Consumer Token访问
     *
     * @param userId 用户ID (required)
     * @return 成功获取用户 (status code 200)
     *         or 请求参数错误或用户不存在 (status code 400)
     *         or 权限不足 (status code 403)
     * @see UserManagementApi#getUserByUserId
     */
    default ResponseEntity<OpenUserInfoDTO> getUserByUserId(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/users : 搜索用户(new added)
     * GET /openapi/v1/users，支持Portal用户登录态或具备ManageUsers权限的Consumer Token访问
     *
     * @param keyword 用户名、显示名或邮箱关键字 (required)
     * @param includeInactiveUsers 是否包含禁用用户 (optional, default to false)
     * @param offset 偏移量 (optional, default to 0)
     * @param limit 返回数量 (optional, default to 10)
     * @return 成功获取用户列表 (status code 200)
     *         or 未登录或未授权访问 (status code 401)
     *         or 权限不足 (status code 403)
     * @see UserManagementApi#searchUsers
     */
    default ResponseEntity<List<OpenUserInfoDTO>> searchUsers(String keyword,
        Boolean includeInactiveUsers,
        Integer offset,
        Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
