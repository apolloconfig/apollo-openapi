package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ListReleaseBO;
import com.apollo.openapi.server.model.NamespaceReleaseDTO;
import com.apollo.openapi.server.model.OpenReleaseDTO;
import com.apollo.openapi.server.model.OpenapiV1AppsGet401Response;
import com.apollo.openapi.server.model.OpenapiV1EnvsEnvReleasesCompareGet200Response;
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
 * A delegate to be called by the {@link ReleaseManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public interface ReleaseManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active : 获取活跃发布（分页）
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param page  (required)
     * @param size  (required)
     * @return  (status code 200)
     * @see ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet
     */
    default ResponseEntity<List<OpenReleaseDTO>> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesActiveGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all : 获取所有发布（分页）
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param page  (required)
     * @param size  (required)
     * @return  (status code 200)
     * @see ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet
     */
    default ResponseEntity<List<ListReleaseBO>> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesAllGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"baseInfo\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"configurations\" : \"configurations\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"releaseKey\" : \"releaseKey\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"isAbandoned\" : true, \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"namespaceName\" : \"namespaceName\" }, \"items\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ] }, { \"baseInfo\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"configurations\" : \"configurations\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"releaseKey\" : \"releaseKey\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"isAbandoned\" : true, \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"namespaceName\" : \"namespaceName\" }, \"items\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/latest : 获取最新活跃发布
     * 
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return 成功获取最新活跃发布 (status code 200)
     *         or 未找到活跃发布 (status code 404)
     * @see ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet
     */
    default ResponseEntity<OpenReleaseDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesLatestGet(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }";
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
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases : 创建发布
     * 
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param namespaceReleaseDTO  (required)
     * @return 发布创建成功 (status code 200)
     *         or 发布参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ReleaseManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost
     */
    default ResponseEntity<OpenReleaseDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameReleasesPost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        NamespaceReleaseDTO namespaceReleaseDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }";
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
     * GET /openapi/v1/envs/{env}/releases/compare : 对比发布
     * GET /openapi/v1/envs/{env}/releases/compare
     *
     * @param env  (required)
     * @param baseReleaseId  (required)
     * @param toCompareReleaseId  (required)
     * @return  (status code 200)
     * @see ReleaseManagementApi#openapiV1EnvsEnvReleasesCompareGet
     */
    default ResponseEntity<OpenapiV1EnvsEnvReleasesCompareGet200Response> openapiV1EnvsEnvReleasesCompareGet(String env,
        Integer baseReleaseId,
        Integer toCompareReleaseId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"changes\" : [ { \"type\" : \"ADDED\", \"entity\" : { \"firstEntity\" : { \"value\" : \"value\", \"key\" : \"key\" }, \"secondEntity\" : { \"value\" : \"value\", \"key\" : \"key\" } } }, { \"type\" : \"ADDED\", \"entity\" : { \"firstEntity\" : { \"value\" : \"value\", \"key\" : \"key\" }, \"secondEntity\" : { \"value\" : \"value\", \"key\" : \"key\" } } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/releases/{releaseId} : 获取发布详情
     * GET /openapi/v1/envs/{env}/releases/{releaseId}
     *
     * @param env  (required)
     * @param releaseId  (required)
     * @return  (status code 200)
     * @see ReleaseManagementApi#openapiV1EnvsEnvReleasesReleaseIdGet
     */
    default ResponseEntity<OpenReleaseDTO> openapiV1EnvsEnvReleasesReleaseIdGet(String env,
        Integer releaseId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/envs/{env}/releases/{releaseId}/rollback : 回滚发布
     * 
     *
     * @param env  (required)
     * @param releaseId  (required)
     * @param operator  (required)
     * @return  (status code 200)
     * @see ReleaseManagementApi#openapiV1EnvsEnvReleasesReleaseIdRollbackPut
     */
    default ResponseEntity<Object> openapiV1EnvsEnvReleasesReleaseIdRollbackPut(String env,
        Integer releaseId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
