package com.apollo.openapi.server.api;

import java.util.Map;
import com.apollo.openapi.server.model.MultiResponseEntity;
import com.apollo.openapi.server.model.OpenAppDTO;
import com.apollo.openapi.server.model.OpenCreateAppDTO;
import com.apollo.openapi.server.model.OpenEnvClusterDTO;
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
 * A delegate to be called by the {@link AppManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public interface AppManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/apps : 创建应用 (original openapi)
     * POST /openapi/v1/apps
     *
     * @param openCreateAppDTO  (required)
     * @return 应用创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see AppManagementApi#createApp
     */
    default ResponseEntity<Object> createApp(OpenCreateAppDTO openCreateAppDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/envs/{env} : 在指定环境创建应用(new added)
     * POST /openapi/v1/apps/envs/{env}
     *
     * @param env 环境标识，例如 DEV、FAT、UAT、PROD (required)
     * @param operator 操作人用户名 (required)
     * @param openAppDTO  (required)
     * @return 应用在指定环境创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see AppManagementApi#createAppInEnv
     */
    default ResponseEntity<Object> createAppInEnv(String env,
        String operator,
        OpenAppDTO openAppDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId} : 删除应用(new added)
     * DELETE /openapi/v1/apps/{appId}
     *
     * @param appId 应用ID (required)
     * @param operator 操作人用户名 (required)
     * @return 应用删除成功 (status code 200)
     *         or 权限不足，需要超级管理员权限 (status code 403)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#deleteApp
     */
    default ResponseEntity<Object> deleteApp(String appId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps : 查找应用 (original openapi)
     * POST /openapi/v1/apps
     *
     * @param appIds 查找应用 (optional)
     * @return 成功获取应用列表 (status code 200)
     *         or 未授权访问 (status code 401)
     * @see AppManagementApi#findApps
     */
    default ResponseEntity<List<OpenAppDTO>> findApps(String appIds) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/authorized : 获取当前Consumer授权的应用列表 (original openapi)
     * GET /openapi/v1/apps/authorized
     *
     * @return 成功获取授权应用列表 (status code 200)
     *         or 未授权访问 (status code 401)
     * @see AppManagementApi#findAppsAuthorized
     */
    default ResponseEntity<List<OpenAppDTO>> findAppsAuthorized() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/miss_envs : 查找缺失的环境(new added)
     * GET /openapi/v1/apps/{appId}/miss_envs
     *
     * @param appId 应用ID (required)
     * @return 成功获取应用缺失的环境列表 (status code 200)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#findMissEnvs
     */
    default ResponseEntity<MultiResponseEntity> findMissEnvs(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 200, \"entities\" : [ { \"code\" : 200, \"message\" : \"OK\", \"body\" : \"{}\" }, { \"code\" : 200, \"message\" : \"OK\", \"body\" : \"{}\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId} : 获取单个应用信息(new added)
     * GET /openapi/v1/apps/{appId}
     *
     * @param appId  (required)
     * @return 成功获取应用信息 (status code 200)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#getApp
     */
    default ResponseEntity<OpenAppDTO> getApp(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/navtree : 获取应用导航树(new added)
     * GET /openapi/v1/apps/{appId}/navtree
     *
     * @param appId 应用ID (required)
     * @return 成功获取应用导航树 (status code 200)
     * @see AppManagementApi#getAppNavTree
     */
    default ResponseEntity<MultiResponseEntity> getAppNavTree(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 200, \"entities\" : [ { \"code\" : 200, \"message\" : \"OK\", \"body\" : \"{}\" }, { \"code\" : 200, \"message\" : \"OK\", \"body\" : \"{}\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/by-self : 获取当前Consumer的应用列表（分页）(new added)
     * GET /openapi/v1/apps/by-self
     *
     * @param page 页数 (required)
     * @param size 页大小 (required)
     * @return 成功获取Consumer的应用列表 (status code 200)
     *         or 未授权访问 (status code 401)
     * @see AppManagementApi#getAppsBySelf
     */
    default ResponseEntity<List<OpenAppDTO>> getAppsBySelf(Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envclusters : 获取应用的环境集群信息 (original openapi)
     * GET /openapi/v1/apps/{appId}/envclusters
     *
     * @param appId 应用ID (required)
     * @return 成功获取应用环境集群信息 (status code 200)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#getEnvClusterInfo
     */
    default ResponseEntity<List<OpenEnvClusterDTO>> getEnvClusterInfo(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"env\" : \"env\", \"clusters\" : [ \"clusters\", \"clusters\" ] }, { \"env\" : \"env\", \"clusters\" : [ \"clusters\", \"clusters\" ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/apps/{appId} : 更新应用(new added)
     * PUT /openapi/v1/apps/{appId}
     *
     * @param appId 应用ID (required)
     * @param operator 操作人用户名 (required)
     * @param openAppDTO  (required)
     * @return 应用更新成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see AppManagementApi#updateApp
     */
    default ResponseEntity<OpenAppDTO> updateApp(String appId,
        String operator,
        OpenAppDTO openAppDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
