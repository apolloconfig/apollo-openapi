package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.NamespaceGrayDelReleaseDTO;
import com.apollo.openapi.server.model.NamespaceReleaseDTO;
import com.apollo.openapi.server.model.OpenReleaseBO;
import com.apollo.openapi.server.model.OpenReleaseDTO;
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
 * A delegate to be called by the {@link ReleaseManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface ReleaseManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-del-releases : 创建灰度删除发布 (original openapi)
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @param namespaceGrayDelReleaseDTO  (required)
     * @return  (status code 200)
     * @see ReleaseManagementApi#createGrayDelRelease
     */
    default ResponseEntity<OpenReleaseDTO> createGrayDelRelease(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        NamespaceGrayDelReleaseDTO namespaceGrayDelReleaseDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/releases : 创建灰度发布 (original openapi)
     * 创建灰度发布
     *
     * @param appId app标识 (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param branchName 分支名称 (required)
     * @param namespaceReleaseDTO  (required)
     * @return 灰度发布创建成功 (status code 200)
     * @see ReleaseManagementApi#createGrayRelease
     */
    default ResponseEntity<OpenReleaseDTO> createGrayRelease(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        NamespaceReleaseDTO namespaceReleaseDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases : 创建发布 (original openapi)
     * 创建发布
     *
     * @param appId app标识 (required)
     * @param env 环境标识 (required)
     * @param clusterName  (required)
     * @param namespaceName 命名空间名称 (required)
     * @param namespaceReleaseDTO  (required)
     * @return 发布创建成功 (status code 200)
     *         or 发布参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ReleaseManagementApi#createRelease
     */
    default ResponseEntity<OpenReleaseDTO> createRelease(String appId,
        String env,
        String clusterName,
        String namespaceName,
        NamespaceReleaseDTO namespaceReleaseDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active : 获取活跃发布（分页） (new added)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param page 页码，从0开始 (required)
     * @param size 每页数量 (required)
     * @return 成功获取活跃发布列表 (status code 200)
     * @see ReleaseManagementApi#findActiveReleases
     */
    default ResponseEntity<List<OpenReleaseDTO>> findActiveReleases(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all : 获取所有发布（分页） (new added)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param page 页码，从0开始 (required)
     * @param size 每页数量 (required)
     * @return 成功获取发布列表 (status code 200)
     * @see ReleaseManagementApi#findAllReleases
     */
    default ResponseEntity<List<OpenReleaseBO>> findAllReleases(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"baseInfo\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"items\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ] }, { \"baseInfo\" : { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, \"items\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/releases/{releaseId} : 获取发布详情 (new added)
     * GET /openapi/v1/envs/{env}/releases/{releaseId}
     *
     * @param env 环境标识 (required)
     * @param releaseId 发布ID (required)
     * @return 成功获取发布详情 (status code 200)
     * @see ReleaseManagementApi#getReleaseById
     */
    default ResponseEntity<OpenReleaseDTO> getReleaseById(String env,
        Integer releaseId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/latest : 获取最新活跃发布 (original openapi)
     * 查询命名空间最新活跃发布
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @return 成功获取最新活跃发布 (status code 200)
     *         or 未找到活跃发布 (status code 404)
     * @see ReleaseManagementApi#loadLatestActiveRelease
     */
    default ResponseEntity<OpenReleaseDTO> loadLatestActiveRelease(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/merge : 合并分支 (original openapi)
     * 合并灰度分支并可选择删除分支
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param branchName 分支名称 (required)
     * @param deleteBranch 合并后是否删除分支（true/false） (required)
     * @param namespaceReleaseDTO  (required)
     * @return 分支合并成功 (status code 200)
     *         or 合并参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ReleaseManagementApi#merge
     */
    default ResponseEntity<OpenReleaseDTO> merge(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        Boolean deleteBranch,
        NamespaceReleaseDTO namespaceReleaseDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"configurations\" : { \"key\" : \"configurations\" }, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"name\" : \"name\", \"comment\" : \"comment\", \"id\" : 0, \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/envs/{env}/releases/{releaseId}/rollback : 回滚发布 (original openapi)
     * 回滚到指定的发布版本
     *
     * @param env 环境标识 (required)
     * @param releaseId 发布ID (required)
     * @param operator 操作人用户名 (required)
     * @return 发布回滚成功 (status code 200)
     * @see ReleaseManagementApi#rollback
     */
    default ResponseEntity<Object> rollback(String env,
        Long releaseId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
