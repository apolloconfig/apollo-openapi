package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.OpenAppNamespaceDTO;
import com.apollo.openapi.server.model.OpenNamespaceDTO;
import com.apollo.openapi.server.model.OpenNamespaceLockDTO;
import com.apollo.openapi.server.model.OpenapiV1AppsGet401Response;
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
 * A delegate to be called by the {@link NamespaceManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public interface NamespaceManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/appnamespaces : 获取所有公共AppNamespace
     * GET /openapi/v1/appnamespaces?public&#x3D;true
     *
     * @param publicOnly  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1AppnamespacesGet
     */
    default ResponseEntity<List<OpenAppNamespaceDTO>> openapiV1AppnamespacesGet(Boolean publicOnly) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/appnamespaces : 获取指定应用的AppNamespace
     * GET /openapi/v1/apps/{appId}/appnamespaces
     *
     * @param appId  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1AppsAppIdAppnamespacesGet
     */
    default ResponseEntity<List<OpenAppNamespaceDTO>> openapiV1AppsAppIdAppnamespacesGet(String appId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} : 获取指定的AppNamespace
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}
     *
     * @param appId  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1AppsAppIdAppnamespacesNamespaceNameGet
     */
    default ResponseEntity<OpenAppNamespaceDTO> openapiV1AppsAppIdAppnamespacesNamespaceNameGet(String appId,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/appnamespaces : 创建AppNamespace
     * POST /openapi/v1/apps/{appId}/appnamespaces
     *
     * @param appId  (required)
     * @param openAppNamespaceDTO  (required)
     * @return AppNamespace创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see NamespaceManagementApi#openapiV1AppsAppIdAppnamespacesPost
     */
    default ResponseEntity<OpenAppNamespaceDTO> openapiV1AppsAppIdAppnamespacesPost(String appId,
        OpenAppNamespaceDTO openAppNamespaceDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appendNamespacePrefix\" : true, \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }";
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
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check : 检查缺失的Namespace
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet
     */
    default ResponseEntity<List<String>> openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesIntegrityCheckGet(String appId,
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
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association : 获取关联的公共Namespace
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/public-association
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet
     */
    default ResponseEntity<OpenNamespaceDTO> openapiV1AppsAppIdEnvsEnvClustersClusterNameNamespacesNamespaceNamePublicAssociationGet(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances : 获取公共AppNamespace的所有实例
     * GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances
     *
     * @param env  (required)
     * @param publicNamespaceName  (required)
     * @param page  (required)
     * @param size  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet
     */
    default ResponseEntity<List<OpenNamespaceDTO>> openapiV1EnvsEnvAppnamespacesPublicNamespaceNameInstancesGet(String env,
        String publicNamespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces : 获取指定集群下的所有Namespace
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param fillItemDetail  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet
     */
    default ResponseEntity<List<OpenNamespaceDTO>> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesGet(String appId,
        String env,
        String clusterName,
        Boolean fillItemDetail) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock : 获取Namespace的锁状态
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see NamespaceManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet
     */
    default ResponseEntity<OpenNamespaceLockDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameLockGet(String appId,
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

}
