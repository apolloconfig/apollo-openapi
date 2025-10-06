package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.OpenInstanceDTO;
import com.apollo.openapi.server.model.OpenPageDTOOpenInstanceDTO;
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
 * A delegate to be called by the {@link InstanceManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public interface InstanceManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances : 获取命名空间下的实例数量 (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances
     *
     * @param env  (required)
     * @param appId 应用ID (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @return 成功返回实例数量 (status code 200)
     * @see InstanceManagementApi#getInstanceCountByNamespace
     */
    default ResponseEntity<Integer> getInstanceCountByNamespace(String env,
        String appId,
        String clusterName,
        String namespaceName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances_not_int : 查询不在指定发布版本中的实例 (new added)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/instances?excludeReleases&#x3D;1,2,3
     *
     * @param env 环境标识 (required)
     * @param appId 应用ID (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param excludeReleases 排除的发布ID列表，用逗号分隔 (optional)
     * @return  (status code 200)
     * @see InstanceManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesNotIntGet
     */
    default ResponseEntity<List<OpenInstanceDTO>> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameInstancesNotIntGet(String env,
        String appId,
        String clusterName,
        String namespaceName,
        String excludeReleases) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"configs\" : [ { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 }, { \"configs\" : [ { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/releases/{releaseId}/instances : 根据发布版本查询实例（支持分页） (new added)
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
                    String exampleString = "{ \"total\" : 1, \"size\" : 6, \"page\" : 0, \"content\" : [ { \"configs\" : [ { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 }, { \"configs\" : [ { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"releaseDeliveryTime\" : \"2025-09-29T12:34:56Z\", \"release\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataCenter\" : \"dataCenter\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"ip\" : \"ip\", \"id\" : 5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
