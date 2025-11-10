package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.OpenAppNamespaceDTO;
import com.apollo.openapi.server.model.OpenNamespaceDTO;
import com.apollo.openapi.server.model.OpenNamespaceLockDTO;
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
 * A delegate to be called by the {@link NamespaceManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface NamespaceManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check : 检查缺失的Namespace (new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @return 缺失的命名空间名称列表 (status code 200)
     * @see NamespaceManagementApi#checkNamespaceIntegrity
     */
    default ResponseEntity<List<String>> checkNamespaceIntegrity(String appId,
        String env,
        String clusterName) {
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
     * POST /openapi/v1/apps/{appId}/appnamespaces : 创建AppNamespace (original openapi)
     * POST /openapi/v1/apps/{appId}/appnamespaces
     *
     * @param appId  (required)
     * @param openAppNamespaceDTO  (required)
     * @return AppNamespace创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see NamespaceManagementApi#createNamespace
     */
    default ResponseEntity<OpenAppNamespaceDTO> createNamespace(String appId,
        OpenAppNamespaceDTO openAppNamespaceDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} : 删除AppNamespace (new added)
     * DELETE /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}
     *
     * @param appId 应用ID (required)
     * @param namespaceName 命名空间名称 (required)
     * @param operator 操作人用户名 (required)
     * @return AppNamespace删除成功 (status code 200)
     * @see NamespaceManagementApi#deleteAppNamespace
     */
    default ResponseEntity<Object> deleteAppNamespace(String appId,
        String namespaceName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links : 删除关联的Namespace (new added)
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/links
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param operator 操作人用户名 (required)
     * @return 解除关联成功 (status code 200)
     * @see NamespaceManagementApi#deleteNamespaceLinks
     */
    default ResponseEntity<Object> deleteNamespaceLinks(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces : 获取指定集群下的所有Namespace (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param fillItemDetail  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#findNamespaces
     */
    default ResponseEntity<List<OpenNamespaceDTO>> findNamespaces(String appId,
        String env,
        String clusterName,
        Boolean fillItemDetail) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} : 获取指定的AppNamespace (new added)
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}
     *
     * @param appId 应用ID (required)
     * @param namespaceName 命名空间名称 (required)
     * @return 成功获取AppNamespace (status code 200)
     * @see NamespaceManagementApi#getAppNamespace
     */
    default ResponseEntity<OpenAppNamespaceDTO> getAppNamespace(String appId,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/appnamespaces : 获取所有公共AppNamespace (new added)
     * GET /openapi/v1/appnamespaces?public&#x3D;true
     *
     * @param publicOnly  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#getAppNamespaces
     */
    default ResponseEntity<List<OpenAppNamespaceDTO>> getAppNamespaces(Boolean publicOnly) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/appnamespaces : 获取指定应用的AppNamespace (new added)
     * GET /openapi/v1/apps/{appId}/appnamespaces
     *
     * @param appId  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#getAppNamespacesByApp
     */
    default ResponseEntity<List<OpenAppNamespaceDTO>> getAppNamespacesByApp(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock : 获取Namespace的锁状态 (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#getNamespaceLock
     */
    default ResponseEntity<OpenNamespaceLockDTO> getNamespaceLock(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lockedBy\" : \"lockedBy\", \"isLocked\" : true, \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/namespaces/releases/status : 获取应用下所有Namespace的发布状态 (new added)
     * GET /openapi/v1/apps/{appId}/namespaces/releases/status
     *
     * @param appId 应用ID (required)
     * @return 成功获取发布状态映射 (status code 200)
     * @see NamespaceManagementApi#getNamespacesReleaseStatus
     */
    default ResponseEntity<Map<String, Map<String, Boolean>>> getNamespacesReleaseStatus(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"projectA\" : { \"featureX\" : true, \"featureY\" : false }, \"projectB\" : { \"darkMode\" : true } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances : 获取公共AppNamespace的所有实例 (new added)
     * GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances
     *
     * @param env 环境标识 (required)
     * @param publicNamespaceName 公共命名空间名称 (required)
     * @param page 页码，从0开始 (required)
     * @param size 每页数量 (required)
     * @return 成功获取实例列表 (status code 200)
     * @see NamespaceManagementApi#getPublicAppNamespaceInstances
     */
    default ResponseEntity<List<OpenNamespaceDTO>> getPublicAppNamespaceInstances(String env,
        String publicNamespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association : 获取关联的公共Namespace (new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @return 成功获取关联的公共Namespace (status code 200)
     * @see NamespaceManagementApi#getPublicNamespaceAssociation
     */
    default ResponseEntity<OpenNamespaceDTO> getPublicNamespaceAssociation(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} : 获取指定的Namespace (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param fillItemDetail  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#loadNamespace
     */
    default ResponseEntity<OpenNamespaceDTO> loadNamespace(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Boolean fillItemDetail) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
