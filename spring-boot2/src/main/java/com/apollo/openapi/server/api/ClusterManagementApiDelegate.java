package com.apollo.openapi.server.api;

import java.util.Map;
import com.apollo.openapi.server.model.OpenClusterDTO;
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
 * A delegate to be called by the {@link ClusterManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public interface ClusterManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters : 创建集群 (original openapi)
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters
     *
     * @param appId 应用ID (required)
     * @param env  (required)
     * @param openClusterDTO  (required)
     * @return 集群创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ClusterManagementApi#createCluster
     */
    default ResponseEntity<OpenClusterDTO> createCluster(String appId,
        String env,
        OpenClusterDTO openClusterDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} : 删除集群 (new added)
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}
     *
     * @param env  (required)
     * @param appId  (required)
     * @param clusterName  (required)
     * @param operator 操作人用户名 (required)
     * @return 集群删除成功 (status code 200)
     *         or 删除失败，集群可能包含配置 (status code 400)
     *         or 权限不足 (status code 403)
     *         or 集群不存在 (status code 404)
     * @see ClusterManagementApi#deleteCluster
     */
    default ResponseEntity<Object> deleteCluster(String env,
        String appId,
        String clusterName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName} : 获取指定集群信息 (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}
     *
     * @param appId  (required)
     * @param clusterName  (required)
     * @param env  (required)
     * @return 成功获取集群信息 (status code 200)
     *         or 集群不存在 (status code 404)
     * @see ClusterManagementApi#getCluster
     */
    default ResponseEntity<OpenClusterDTO> getCluster(String appId,
        String clusterName,
        String env) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
