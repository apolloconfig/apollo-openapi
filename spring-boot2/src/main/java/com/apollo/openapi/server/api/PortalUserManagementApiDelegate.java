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
 * A delegate to be called by the {@link PortalUserManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PortalUserManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /openapi/v1/users/enabled : 修改Portal用户启用状态(new added)
     * PUT /openapi/v1/users/enabled
     *
     * @param openUserDTO  (required)
     * @return 用户状态修改成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see PortalUserManagementApi#changeUserEnabled
     */
    default ResponseEntity<Void> changeUserEnabled(OpenUserDTO openUserDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/users : 创建或更新Portal用户(new added)
     * POST /openapi/v1/users
     *
     * @param openUserDTO  (required)
     * @param isCreate true 表示创建用户，false 表示更新用户 (optional, default to false)
     * @return 用户创建或更新成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see PortalUserManagementApi#createOrUpdateUser
     */
    default ResponseEntity<Void> createOrUpdateUser(OpenUserDTO openUserDTO,
        Boolean isCreate) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/user : 获取当前Portal用户(new added)
     * GET /openapi/v1/user
     *
     * @return 成功获取当前用户 (status code 200)
     *         or 未登录或未授权访问 (status code 401)
     *         or 仅支持Portal用户登录态访问 (status code 403)
     * @see PortalUserManagementApi#getCurrentUser
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
     * GET /openapi/v1/users : 搜索Portal用户(new added)
     * GET /openapi/v1/users
     *
     * @param keyword 用户名、显示名或邮箱关键字 (required)
     * @param includeInactiveUsers 是否包含禁用用户 (optional, default to false)
     * @param offset 偏移量 (optional, default to 0)
     * @param limit 返回数量 (optional, default to 10)
     * @return 成功获取用户列表 (status code 200)
     *         or 未登录或未授权访问 (status code 401)
     *         or 仅支持Portal用户登录态访问 (status code 403)
     * @see PortalUserManagementApi#searchUsers
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
