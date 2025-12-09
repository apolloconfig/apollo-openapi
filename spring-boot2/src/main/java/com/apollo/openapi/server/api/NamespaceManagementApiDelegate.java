package com.apollo.openapi.server.api;

import java.util.List;
import com.apollo.openapi.server.model.OpenCreateNamespaceDTO;
import com.apollo.openapi.server.model.OpenNamespaceDTO;
import com.apollo.openapi.server.model.OpenNamespaceUsageDTO;
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
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces : 创建缺失的Namespace (new added)
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param operator 操作人用户名 (optional)
     * @return 缺失的命名空间创建成功 (status code 200)
     * @see NamespaceManagementApi#createMissingNamespaces
     */
    default ResponseEntity<Object> createMissingNamespaces(String appId,
        String env,
        String clusterName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/namespaces : 创建Namespace (new added)
     * POST /openapi/v1/apps/{appId}/namespaces
     *
     * @param openCreateNamespaceDTO  (required)
     * @param operator 操作人用户名 (optional)
     * @return Namespace创建成功 (status code 200)
     * @see NamespaceManagementApi#createNamespaces
     */
    default ResponseEntity<Void> createNamespaces(List<OpenCreateNamespaceDTO> openCreateNamespaceDTO,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName} : 删除指定的Namespace (new added)
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param operator 操作人用户名 (optional)
     * @return 解除关联成功 (status code 200)
     * @see NamespaceManagementApi#deleteNamespace
     */
    default ResponseEntity<Void> deleteNamespace(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces : 查找缺失的Namespace (new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @return 缺失的命名空间名称列表 (status code 200)
     * @see NamespaceManagementApi#findMissingNamespaces
     */
    default ResponseEntity<List<String>> findMissingNamespaces(String appId,
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
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName} : 获取指定的Namespace (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param fillItemDetail  (required)
     * @param extendInfo  (optional, default to false)
     * @return  (status code 200)
     * @see NamespaceManagementApi#findNamespace
     */
    default ResponseEntity<OpenNamespaceDTO> findNamespace(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Boolean fillItemDetail,
        Boolean extendInfo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"extendInfo\" : { \"parentAppId\" : \"parentAppId\", \"isConfigHidden\" : true, \"itemModifiedCnt\" : 0 }, \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/usage : 查询namespace使用情况(new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/usage
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @return NamespaceUsage查询成功 (status code 200)
     * @see NamespaceManagementApi#findNamespaceUsage
     */
    default ResponseEntity<List<OpenNamespaceUsageDTO>> findNamespaceUsage(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"branchInstanceCount\" : 6, \"envName\" : \"envName\", \"instanceCount\" : 0, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"linkedNamespaceCount\" : 1, \"namespaceName\" : \"namespaceName\" }, { \"branchInstanceCount\" : 6, \"envName\" : \"envName\", \"instanceCount\" : 0, \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"linkedNamespaceCount\" : 1, \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
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
     * @param extendInfo  (optional, default to false)
     * @return  (status code 200)
     * @see NamespaceManagementApi#findNamespaces
     */
    default ResponseEntity<List<OpenNamespaceDTO>> findNamespaces(String appId,
        String env,
        String clusterName,
        Boolean fillItemDetail,
        Boolean extendInfo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"extendInfo\" : { \"parentAppId\" : \"parentAppId\", \"isConfigHidden\" : true, \"itemModifiedCnt\" : 0 }, \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"extendInfo\" : { \"parentAppId\" : \"parentAppId\", \"isConfigHidden\" : true, \"itemModifiedCnt\" : 0 }, \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace : 查询关联Namespace对应的公共Namespace详情 (new added)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace
     *
     * @param env 环境标识 (required)
     * @param appId 应用ID (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 关联Namespace名称 (required)
     * @param extendInfo  (optional, default to false)
     * @return 成功获取关联的公共Namespace详情 (status code 200)
     * @see NamespaceManagementApi#findPublicNamespaceForAssociatedNamespace
     */
    default ResponseEntity<OpenNamespaceDTO> findPublicNamespaceForAssociatedNamespace(String env,
        String appId,
        String clusterName,
        String namespaceName,
        Boolean extendInfo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"extendInfo\" : { \"parentAppId\" : \"parentAppId\", \"isConfigHidden\" : true, \"itemModifiedCnt\" : 0 }, \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
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

}
