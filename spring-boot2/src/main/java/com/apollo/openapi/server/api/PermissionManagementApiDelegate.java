package com.apollo.openapi.server.api;

import java.util.List;
import java.util.Map;
import com.apollo.openapi.server.model.OpenAppRoleUserDTO;
import com.apollo.openapi.server.model.OpenClusterNamespaceRoleUserDTO;
import com.apollo.openapi.server.model.OpenEnvNamespaceRoleUserDTO;
import com.apollo.openapi.server.model.OpenNamespaceRoleUserDTO;
import com.apollo.openapi.server.model.OpenPermissionConditionDTO;
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
 * A delegate to be called by the {@link PermissionManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PermissionManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/system/roles/create-application : 分配建应用角色 (new added)
     *
     *
     * @param operator 操作人用户名 (optional)
     * @param requestBody  (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#addCreateApplicationRoleToUsers
     */
    default ResponseEntity<Void> addCreateApplicationRoleToUsers(String operator,
        List<String> requestBody) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/roles/master : 分配AppMaster (new added)
     *
     *
     * @param appId  (required)
     * @param userId the user which role assign to (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#addManageAppMasterRoleToUser
     */
    default ResponseEntity<Void> addManageAppMasterRoleToUser(String appId,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/roles/{roleType} : 分配应用角色 (new added)
     *
     *
     * @param appId  (required)
     * @param roleType  (required)
     * @param userId the user which role removed from (required)
     * @param operator 操作人用户名 (optional)
     * @param body  (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#assignAppRoleToUser
     */
    default ResponseEntity<Void> assignAppRoleToUser(String appId,
        String roleType,
        String userId,
        String operator,
        String body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/roles/{roleType} : 分配集群Namespace角色 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param roleType  (required)
     * @param userId the user which role assigned to (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#assignClusterNamespaceRoleToUser
     */
    default ResponseEntity<Void> assignClusterNamespaceRoleToUser(String appId,
        String env,
        String clusterName,
        String roleType,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/roles/{roleType} : 分配环境Namespace角色 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param namespaceName  (required)
     * @param roleType  (required)
     * @param userId the user which role assigned to (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#assignNamespaceEnvRoleToUser
     */
    default ResponseEntity<Void> assignNamespaceEnvRoleToUser(String appId,
        String env,
        String namespaceName,
        String roleType,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/namespaces/{namespaceName}/roles/{roleType} : 分配Namespace角色 (new added)
     *
     *
     * @param appId  (required)
     * @param namespaceName  (required)
     * @param roleType  (required)
     * @param userId the user which role assigned to (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#assignNamespaceRoleToUser
     */
    default ResponseEntity<Void> assignNamespaceRoleToUser(String appId,
        String namespaceName,
        String roleType,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/system/roles/create-application : 移除建应用角色 (new added)
     *
     *
     * @param userId  (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#deleteCreateApplicationRoleFromUser
     */
    default ResponseEntity<Void> deleteCreateApplicationRoleFromUser(String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/role-users : 获取应用角色用户 (new added)
     *
     *
     * @param appId  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#getAppRoles
     */
    default ResponseEntity<OpenAppRoleUserDTO> getAppRoles(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"appId\" : \"appId\", \"masterUsers\" : [ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/role-users : 获取集群Namespace用户 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#getClusterNamespaceRoles
     */
    default ResponseEntity<OpenClusterNamespaceRoleUserDTO> getClusterNamespaceRoles(String appId,
        String env,
        String clusterName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"cluster\" : \"cluster\", \"releaseRoleUsers\" : [ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ], \"appId\" : \"appId\", \"modifyRoleUsers\" : [ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ], \"env\" : \"env\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/system/roles/create-application/role-users : 获取建应用用户 (new added)
     *
     *
     * @return  (status code 200)
     * @see PermissionManagementApi#getCreateApplicationRoleUsers
     */
    default ResponseEntity<List<String>> getCreateApplicationRoleUsers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"\", \"\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/role-users : 获取环境Namespace用户 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#getNamespaceEnvRoleUsers
     */
    default ResponseEntity<OpenEnvNamespaceRoleUserDTO> getNamespaceEnvRoleUsers(String appId,
        String env,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"releaseRoleUsers\" : [ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ], \"appId\" : \"appId\", \"modifyRoleUsers\" : [ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ], \"env\" : \"env\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/namespaces/{namespaceName}/role-users : 获取Namespace用户 (new added)
     *
     *
     * @param appId  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#getNamespaceRoles
     */
    default ResponseEntity<OpenNamespaceRoleUserDTO> getNamespaceRoles(String appId,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"releaseRoleUsers\" : [ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ], \"appId\" : \"appId\", \"modifyRoleUsers\" : [ { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 }, { \"name\" : \"name\", \"userId\" : \"userId\", \"email\" : \"email\", \"enabled\" : 0 } ], \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/permissions/{permissionType} : 校验应用权限 (new added)
     *
     *
     * @param appId  (required)
     * @param permissionType  (required)
     * @param userId  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#hasAppPermission
     */
    default ResponseEntity<OpenPermissionConditionDTO> hasAppPermission(String appId,
        String permissionType,
        String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"hasPermission\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/permissions/{permissionType} : 校验集群Namespace权限 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param permissionType  (required)
     * @param userId  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#hasClusterNamespacePermission
     */
    default ResponseEntity<OpenPermissionConditionDTO> hasClusterNamespacePermission(String appId,
        String env,
        String clusterName,
        String permissionType,
        String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"hasPermission\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/system/roles/create-application : 校验建应用权限 (new added)
     *
     *
     * @param userId  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#hasCreateApplicationPermission
     */
    default ResponseEntity<Map<String, Boolean>> hasCreateApplicationPermission(String userId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/permissions/{permissionType} : 校验环境Namespace权限 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param namespaceName  (required)
     * @param permissionType  (required)
     * @param userId  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#hasEnvNamespacePermission
     */
    default ResponseEntity<OpenPermissionConditionDTO> hasEnvNamespacePermission(String appId,
        String env,
        String namespaceName,
        String permissionType,
        String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"hasPermission\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/namespaces/{namespaceName}/permissions/{permissionType} : 校验Namespace权限 (new added)
     *
     *
     * @param appId  (required)
     * @param namespaceName  (required)
     * @param permissionType  (required)
     * @param userId  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#hasNamespacePermission
     */
    default ResponseEntity<OpenPermissionConditionDTO> hasNamespacePermission(String appId,
        String namespaceName,
        String permissionType,
        String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"hasPermission\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/permissions/root : 校验Root权限 (new added)
     *
     *
     * @param userId  (required)
     * @return  (status code 200)
     * @see PermissionManagementApi#hasRootPermission
     */
    default ResponseEntity<OpenPermissionConditionDTO> hasRootPermission(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"hasPermission\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/namespaces/{namespaceName}/permission-init : 初始化应用权限 (new added)
     *
     *
     * @param appId  (required)
     * @param namespaceName  (required)
     * @param operator 操作人用户名 (optional)
     * @return 初始化成功 (status code 200)
     * @see PermissionManagementApi#initAppPermission
     */
    default ResponseEntity<Void> initAppPermission(String appId,
        String namespaceName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/permission-init : 初始化集群Namespace权限 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#initClusterNamespacePermission
     */
    default ResponseEntity<Void> initClusterNamespacePermission(String appId,
        String env,
        String clusterName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/system/role/manage-app-master : 校验AppMaster开关 (new added)
     *
     *
     * @return  (status code 200)
     * @see PermissionManagementApi#isManageAppMasterPermissionEnabled
     */
    default ResponseEntity<Map<String, Boolean>> isManageAppMasterPermissionEnabled() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/roles/{roleType} : 移除应用角色 (new added)
     *
     *
     * @param appId  (required)
     * @param roleType  (required)
     * @param userId the user which role removed from (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#removeAppRoleFromUser
     */
    default ResponseEntity<Void> removeAppRoleFromUser(String appId,
        String roleType,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/roles/{roleType} : 移除集群Namespace角色 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param roleType  (required)
     * @param userId the user which role removed from (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#removeClusterNamespaceRoleFromUser
     */
    default ResponseEntity<Void> removeClusterNamespaceRoleFromUser(String appId,
        String env,
        String clusterName,
        String roleType,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/roles/master : 移除AppMaster (new added)
     *
     *
     * @param appId  (required)
     * @param userId the user which role removed from (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#removeManageAppMasterRoleFromUser
     */
    default ResponseEntity<Void> removeManageAppMasterRoleFromUser(String appId,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/namespaces/{namespaceName}/roles/{roleType} : 移除环境Namespace角色 (new added)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param namespaceName  (required)
     * @param roleType  (required)
     * @param userId the user which role removed from (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#removeNamespaceEnvRoleFromUser
     */
    default ResponseEntity<Void> removeNamespaceEnvRoleFromUser(String appId,
        String env,
        String namespaceName,
        String roleType,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/namespaces/{namespaceName}/roles/{roleType} : 移除Namespace角色 (new added)
     *
     *
     * @param appId  (required)
     * @param namespaceName  (required)
     * @param roleType  (required)
     * @param userId the user which role removed from (required)
     * @param operator 操作人用户名 (optional)
     * @return  (status code 200)
     * @see PermissionManagementApi#removeNamespaceRoleFromUser
     */
    default ResponseEntity<Void> removeNamespaceRoleFromUser(String appId,
        String namespaceName,
        String roleType,
        String userId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
