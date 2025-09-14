package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.OpenClusterDTO;
import com.apollo.openapi.server.model.OpenNamespaceDTO;
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
 * A delegate to be called by the {@link ClusterManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public interface ClusterManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/apps/{appId}/clusters/{clusterName} : 获取指定集群信息
     * GET /openapi/v1/apps/{appId}/clusters/{clusterName}
     *
     * @param appId  (required)
     * @param clusterName  (required)
     * @return 成功获取集群信息 (status code 200)
     *         or 集群不存在 (status code 404)
     * @see ClusterManagementApi#openapiV1AppsAppIdClustersClusterNameGet
     */
    default ResponseEntity<OpenClusterDTO> openapiV1AppsAppIdClustersClusterNameGet(String appId,
        String clusterName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }";
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
     * POST /openapi/v1/apps/{appId}/clusters : 创建集群
     * POST /openapi/v1/apps/{appId}/clusters
     *
     * @param appId  (required)
     * @param openClusterDTO  (required)
     * @return 集群创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ClusterManagementApi#openapiV1AppsAppIdClustersPost
     */
    default ResponseEntity<OpenClusterDTO> openapiV1AppsAppIdClustersPost(String appId,
        OpenClusterDTO openClusterDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }";
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
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} : 删除集群
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}
     *
     * @param env  (required)
     * @param appId  (required)
     * @param clusterName  (required)
     * @return 集群删除成功 (status code 200)
     *         or 删除失败，集群可能包含配置 (status code 400)
     *         or 权限不足 (status code 403)
     *         or 集群不存在 (status code 404)
     * @see ClusterManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1EnvsEnvAppsAppIdClustersClusterNameDelete(String env,
        String appId,
        String clusterName) {
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
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches : 获取命名空间分支信息
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     *         or 分支不存在 (status code 404)
     * @see ClusterManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet
     */
    default ResponseEntity<OpenNamespaceDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesGet(String appId,
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
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} : 获取指定的Namespace
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param fillItemDetail  (required)
     * @return  (status code 200)
     * @see ClusterManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet
     */
    default ResponseEntity<OpenNamespaceDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Boolean fillItemDetail) {
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

}
