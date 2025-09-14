package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ListItemDiffs;
import com.apollo.openapi.server.model.NamespaceSyncModel;
import com.apollo.openapi.server.model.NamespaceTextModel;
import com.apollo.openapi.server.model.OpenItemDTO;
import com.apollo.openapi.server.model.OpenPageDTOOpenItemDTO;
import com.apollo.openapi.server.model.OpenapiV1AppsGet401Response;
import com.apollo.openapi.server.model.OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response;
import com.apollo.openapi.server.model.OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost400Response;
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
 * A delegate to be called by the {@link ItemManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public interface ItemManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} : 通过编码的key删除配置项
     * DELETE /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (required)
     * @param operator  (required)
     * @return  (status code 200)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete
     */
    default ResponseEntity<Object> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyDelete(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} : 通过查询参数获取配置项（支持编码的key）
     * GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items?key&#x3D;{key}&amp;encoded&#x3D;{true|false}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (required)
     * @return 成功获取配置项（支持编码key） (status code 200)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet
     */
    default ResponseEntity<OpenItemDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }";
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
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} : 通过编码的key更新配置项
     * PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (required)
     * @param createIfNotExists  (required)
     * @param openItemDTO  (required)
     * @return 配置项更新成功（编码key） (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameEncodedItemsKeyPut(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        Boolean createIfNotExists,
        OpenItemDTO openItemDTO) {
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
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:batchUpdate : 通过文本批量修改配置项
     * PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:batchUpdate
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param namespaceTextModel  (required)
     * @return 批量更新配置项成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsBatchUpdatePut(String appId,
        String env,
        String clusterName,
        String namespaceName,
        NamespaceTextModel namespaceTextModel) {
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
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:compare : 对比命名空间配置差异
     * POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:compare
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param namespaceSyncModel  (required)
     * @return 成功对比命名空间配置差异 (status code 200)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost
     */
    default ResponseEntity<List<ListItemDiffs>> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsComparePost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        NamespaceSyncModel namespaceSyncModel) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"namespace\" : { \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"env\" : \"env\", \"namespaceName\" : \"namespaceName\" }, \"diffs\" : { \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"deleteItems\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" } ], \"createItems\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" } ], \"updateItems\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, \"extInfo\" : \"extInfo\" }, { \"namespace\" : { \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"env\" : \"env\", \"namespaceName\" : \"namespaceName\" }, \"diffs\" : { \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"deleteItems\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" } ], \"createItems\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" } ], \"updateItems\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"type\" : 1, \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"namespaceId\" : 6, \"lineNum\" : 5, \"comment\" : \"comment\", \"id\" : 0, \"value\" : \"value\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\" }, \"extInfo\" : \"extInfo\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items : 获取命名空间下的配置项列表
     * 
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param page  (required)
     * @param size  (required)
     * @return 成功获取配置项列表 (status code 200)
     *         or 命名空间不存在 (status code 404)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet
     */
    default ResponseEntity<OpenPageDTOOpenItemDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 1, \"size\" : 6, \"page\" : 0, \"content\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ] }";
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
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} : 删除配置项
     * DELETE /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (required)
     * @param operator  (required)
     * @return  (status code 200)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete
     */
    default ResponseEntity<Object> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyDelete(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} : 获取单个配置项
     * GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (required)
     * @return 成功获取配置项 (status code 200)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet
     */
    default ResponseEntity<OpenItemDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }";
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
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} : 更新配置项
     * PUT /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (required)
     * @param createIfNotExists  (required)
     * @param openItemDTO  (required)
     * @return 配置项更新成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsKeyPut(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        Boolean createIfNotExists,
        OpenItemDTO openItemDTO) {
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
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items : 创建新的配置项
     * POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param openItemDTO  (required)
     * @return 配置项创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost
     */
    default ResponseEntity<OpenItemDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsPost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        OpenItemDTO openItemDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }";
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
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:revert : 撤销配置项更改
     * POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:revert
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return 配置项更改撤销成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsRevertPost(String appId,
        String env,
        String clusterName,
        String namespaceName) {
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
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:sync : 同步配置项到多个命名空间
     * POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:sync
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param namespaceSyncModel  (required)
     * @return 配置项同步成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost
     */
    default ResponseEntity<OpenapiV1AppsGet401Response> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsSyncPost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        NamespaceSyncModel namespaceSyncModel) {
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
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:validate : 验证配置文本语法
     * POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:validate
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param namespaceTextModel  (required)
     * @return 配置文本语法验证通过 (status code 200)
     *         or 配置文本语法错误 (status code 400)
     * @see ItemManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost
     */
    default ResponseEntity<OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        NamespaceTextModel namespaceTextModel) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"valid\" : true, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"valid\" : true, \"message\" : \"message\", \"errors\" : [ \"errors\", \"errors\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
