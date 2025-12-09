package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.OpenAppNamespaceDTO;
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
 * A delegate to be called by the {@link AppNamespaceManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface AppNamespaceManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/apps/{appId}/appnamespaces : 创建AppNamespace (original openapi)
     * POST /openapi/v1/apps/{appId}/appnamespaces
     *
     * @param appId  (required)
     * @param openAppNamespaceDTO  (required)
     * @param operator 操作人用户名 (optional)
     * @return AppNamespace创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see AppNamespaceManagementApi#createAppNamespace
     */
    default ResponseEntity<OpenAppNamespaceDTO> createAppNamespace(String appId,
        OpenAppNamespaceDTO openAppNamespaceDTO,
        String operator) {
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
     * @param operator 操作人用户名 (optional)
     * @return AppNamespace删除成功 (status code 200)
     * @see AppNamespaceManagementApi#deleteAppNamespace
     */
    default ResponseEntity<Void> deleteAppNamespace(String appId,
        String namespaceName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName} : 获取指定的AppNamespace (new added)
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}
     *
     * @param appId 应用ID (required)
     * @param namespaceName 命名空间名称 (required)
     * @param extendInfo  (optional, default to false)
     * @return 成功获取AppNamespace (status code 200)
     * @see AppNamespaceManagementApi#findAppNamespace
     */
    default ResponseEntity<OpenAppNamespaceDTO> findAppNamespace(String appId,
        String namespaceName,
        Boolean extendInfo) {
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
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}/usage : 查询appnamespace使用情况(new added)
     * GET /openapi/v1/apps/{appId}/appnamespaces/{namespaceName}/usage
     *
     * @param appId 应用ID (required)
     * @param namespaceName 命名空间名称 (required)
     * @return AppNamespaceUsage查询成功 (status code 200)
     * @see AppNamespaceManagementApi#findAppNamespaceUsage
     */
    default ResponseEntity<List<OpenNamespaceUsageDTO>> findAppNamespaceUsage(String appId,
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
     * GET /openapi/v1/appnamespaces : 获取所有公共AppNamespace (new added)
     * GET /openapi/v1/appnamespaces/public
     *
     * @return  (status code 200)
     * @see AppNamespaceManagementApi#getAppNamespaces
     */
    default ResponseEntity<List<OpenAppNamespaceDTO>> getAppNamespaces() {
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
     * @see AppNamespaceManagementApi#getAppNamespacesByAppId
     */
    default ResponseEntity<List<OpenAppNamespaceDTO>> getAppNamespacesByAppId(String appId) {
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
     * GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances : 获取公共AppNamespace的所有实例 (new added)
     * GET /openapi/v1/envs/{env}/appnamespaces/{publicNamespaceName}/instances
     *
     * @param env 环境标识 (required)
     * @param publicNamespaceName 公共命名空间名称 (required)
     * @param page 页码，从0开始 (required)
     * @param size 每页数量 (required)
     * @return 成功获取实例列表 (status code 200)
     * @see AppNamespaceManagementApi#getPublicAppNamespaceInstances
     */
    default ResponseEntity<List<OpenNamespaceDTO>> getPublicAppNamespaceInstances(String env,
        String publicNamespaceName,
        Integer page,
        Integer size) {
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

}
