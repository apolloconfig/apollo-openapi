package com.apollo.openapi.server.api;

import java.util.Map;
import com.apollo.openapi.server.model.OpenAppDTO;
import com.apollo.openapi.server.model.OpenEnvClusterDTO;
import com.apollo.openapi.server.model.OpenEnvClusterInfo;
import com.apollo.openapi.server.model.OpenapiV1AppsGet401Response;
import com.apollo.openapi.server.model.OpenapiV1AppsPost400Response;
import com.apollo.openapi.server.model.OpenapiV1AppsPostRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link AppManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-25T00:40:29.983824+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public interface AppManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} : 删除AppNamespace
     * DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}
     *
     * @param appId 应用ID (required)
     * @param namespaceName 命名空间名称 (required)
     * @return AppNamespace删除成功 (status code 200)
     * @see AppManagementApi#openapiV1AppsAppIdAppnamespacesNamespaceNameDelete
     */
    default ResponseEntity<Object> openapiV1AppsAppIdAppnamespacesNamespaceNameDelete(String appId,
        String namespaceName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId} : 删除应用
     * DELETE /openapi/v1/apps/{appId}
     *
     * @param appId 应用ID (required)
     * @return 应用删除成功 (status code 200)
     *         or 权限不足，需要超级管理员权限 (status code 403)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#openapiV1AppsAppIdDelete
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1AppsAppIdDelete(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envclusters : 获取应用的环境集群信息
     * GET /openapi/v1/apps/{appId}/envclusters
     *
     * @param appId 应用ID (required)
     * @return 成功获取应用环境集群信息 (status code 200)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#openapiV1AppsAppIdEnvclustersGet
     */
    default ResponseEntity<List<OpenEnvClusterDTO>> openapiV1AppsAppIdEnvclustersGet(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"env\" : \"env\", \"clusters\" : [ \"clusters\", \"clusters\" ] }, { \"env\" : \"env\", \"clusters\" : [ \"clusters\", \"clusters\" ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links : 删除关联的Namespace
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @return 解除关联成功 (status code 200)
     * @see AppManagementApi#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete
     */
    default ResponseEntity<Object> openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNameLinksDelete(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId} : 获取单个应用信息
     * GET /openapi/v1/apps/{appId}
     *
     * @param appId 应用ID (required)
     * @return 成功获取应用信息 (status code 200)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#openapiV1AppsAppIdGet
     */
    default ResponseEntity<OpenAppDTO> openapiV1AppsAppIdGet(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/miss_envs : 查找缺失的环境
     * GET /openapi/v1/apps/{appId}/miss_envs
     *
     * @param appId 应用ID (required)
     * @return 成功获取应用缺失的环境列表 (status code 200)
     *         or 应用不存在 (status code 404)
     * @see AppManagementApi#openapiV1AppsAppIdMissEnvsGet
     */
    default ResponseEntity<List<String>> openapiV1AppsAppIdMissEnvsGet(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"\", \"\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/namespaces/releases/status : 获取应用下所有Namespace的发布状态
     * GET /openapi/v1/apps/{appId}/namespaces/releases/status
     *
     * @param appId 应用ID (required)
     * @return 成功获取发布状态映射 (status code 200)
     * @see AppManagementApi#openapiV1AppsAppIdNamespacesReleasesStatusGet
     */
    default ResponseEntity<Map<String, Map<String, Boolean>>> openapiV1AppsAppIdNamespacesReleasesStatusGet(String appId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/navtree : 获取应用导航树
     * GET /openapi/v1/apps/{appId}/navtree
     *
     * @param appId 应用ID (required)
     * @return 成功获取应用导航树 (status code 200)
     * @see AppManagementApi#openapiV1AppsAppIdNavtreeGet
     */
    default ResponseEntity<List<OpenEnvClusterInfo>> openapiV1AppsAppIdNavtreeGet(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"env\" : \"env\", \"clusters\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ] }, { \"env\" : \"env\", \"clusters\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/apps/{appId} : 更新应用
     * PUT /openapi/v1/apps/{appId}
     *
     * @param appId 应用ID (required)
     * @param openAppDTO  (required)
     * @return 应用更新成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see AppManagementApi#openapiV1AppsAppIdPut
     */
    default ResponseEntity<OpenAppDTO> openapiV1AppsAppIdPut(String appId,
        OpenAppDTO openAppDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/by-self : 获取当前Consumer的应用列表（分页）
     * GET /openapi/v1/apps/by-self
     *
     * @return 成功获取Consumer的应用列表 (status code 200)
     *         or 未授权访问 (status code 401)
     * @see AppManagementApi#openapiV1AppsBySelfGet
     */
    default ResponseEntity<List<OpenAppDTO>> openapiV1AppsBySelfGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/envs/{env} : 在指定环境创建应用
     * POST /openapi/v1/apps/envs/{env}
     *
     * @param env 环境标识，例如 DEV、FAT、UAT、PROD (required)
     * @param openAppDTO  (required)
     * @return 应用在指定环境创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see AppManagementApi#openapiV1AppsEnvsEnvPost
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1AppsEnvsEnvPost(String env,
        OpenAppDTO openAppDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps : 获取当前Consumer授权的应用列表
     * GET /openapi/v1/apps/authorized
     *
     * @param authorized 是否只返回授权的应用 (optional)
     * @return 成功获取授权应用列表 (status code 200)
     *         or 未授权访问 (status code 401)
     * @see AppManagementApi#openapiV1AppsGet
     */
    default ResponseEntity<List<OpenAppDTO>> openapiV1AppsGet(String authorized) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps : 创建应用
     * POST /openapi/v1/apps
     *
     * @param openapiV1AppsPostRequest  (required)
     * @return 应用创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see AppManagementApi#openapiV1AppsPost
     */
    default ResponseEntity<OpenAppDTO> openapiV1AppsPost(OpenapiV1AppsPostRequest openapiV1AppsPostRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"orgName\" : \"orgName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"ownerName\" : \"ownerName\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"orgId\" : \"orgId\", \"ownerEmail\" : \"ownerEmail\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"exception\" : \"exception\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
