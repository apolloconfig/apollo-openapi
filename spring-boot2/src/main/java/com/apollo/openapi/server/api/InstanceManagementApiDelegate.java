package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.OpenInstanceDTO;
import com.apollo.openapi.server.model.OpenPageDTOOpenInstanceDTO;
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
 * A delegate to be called by the {@link InstanceManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public interface InstanceManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances : 获取命名空间下的实例数量
     * GET /openapi/v1/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances
     *
     * @param appId  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see InstanceManagementApi#openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet
     */
    default ResponseEntity<Integer> openapiV1AppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet(String appId,
        String clusterName,
        String namespaceName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances : 查询不在指定发布版本中的实例
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances?excludeReleases&#x3D;1,2,3
     *
     * @param env  (required)
     * @param appId  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param excludeReleases 排除的发布ID列表，用逗号分隔 (optional)
     * @return  (status code 200)
     * @see InstanceManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet
     */
    default ResponseEntity<List<OpenInstanceDTO>> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesGet(String env,
        String appId,
        String clusterName,
        String namespaceName,
        String excludeReleases) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"configs\" : [ { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ], \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 }, { \"configs\" : [ { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ], \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/releases/{releaseId}/instances : 根据发布版本查询实例（支持分页）
     * GET /openapi/v1/envs/{env}/releases/{releaseId}/instances
     *
     * @param env  (required)
     * @param releaseId  (required)
     * @param page  (required)
     * @param size  (required)
     * @return  (status code 200)
     * @see InstanceManagementApi#openapiV1EnvsEnvReleasesReleaseIdInstancesGet
     */
    default ResponseEntity<OpenPageDTOOpenInstanceDTO> openapiV1EnvsEnvReleasesReleaseIdInstancesGet(String env,
        Integer releaseId,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 1, \"size\" : 6, \"page\" : 0, \"content\" : [ { \"configs\" : [ { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ], \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 }, { \"configs\" : [ { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, { \"releaseDeliveryTime\" : \"releaseDeliveryTime\", \"release\" : { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"key\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" } ], \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
