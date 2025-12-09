package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.OpenItemDTO;
import com.apollo.openapi.server.model.OpenItemDiffDTO;
import com.apollo.openapi.server.model.OpenItemPageDTO;
import com.apollo.openapi.server.model.OpenNamespaceSyncDTO;
import com.apollo.openapi.server.model.OpenNamespaceTextModel;
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
 * A delegate to be called by the {@link ItemManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface ItemManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items : 通过文本批量修改配置项 (new added)
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items:
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param openNamespaceTextModel  (required)
     * @param operator 操作人用户名 (optional)
     * @return 批量更新配置项成功 (status code 200)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#batchUpdateItemsByText
     */
    default ResponseEntity<Void> batchUpdateItemsByText(String appId,
        String env,
        String clusterName,
        String namespaceName,
        OpenNamespaceTextModel openNamespaceTextModel,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/diff : 对比命名空间配置差异 (new added)
     * POST /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/diff
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param openNamespaceSyncDTO  (required)
     * @return 成功对比命名空间配置差异 (status code 200)
     * @see ItemManagementApi#compareItems
     */
    default ResponseEntity<List<OpenItemDiffDTO>> compareItems(String appId,
        String env,
        String clusterName,
        String namespaceName,
        OpenNamespaceSyncDTO openNamespaceSyncDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"code\" : 0, \"namespace\" : { \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"env\" : \"env\", \"namespaceName\" : \"namespaceName\" }, \"deleteItems\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"createItems\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"message\" : \"message\", \"updateItems\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ] }, { \"code\" : 0, \"namespace\" : { \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"env\" : \"env\", \"namespaceName\" : \"namespaceName\" }, \"deleteItems\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"createItems\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ], \"message\" : \"message\", \"updateItems\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items : 创建新的配置项 (original openapi)
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param openItemDTO  (required)
     * @param operator 操作人用户名 (optional)
     * @return 配置项创建成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#createItem
     */
    default ResponseEntity<OpenItemDTO> createItem(String appId,
        String env,
        String clusterName,
        String namespaceName,
        OpenItemDTO openItemDTO,
        String operator) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} : 删除配置项 (original openapi)
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param key 配置项键名 (required)
     * @param operator 操作人用户名 (optional)
     * @return 配置项删除成功 (status code 200)
     * @see ItemManagementApi#deleteItem
     */
    default ResponseEntity<Void> deleteItem(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} : 通过编码的key删除配置项 (original openapi)
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (required)
     * @param operator  (required)
     * @return  (status code 200)
     * @see ItemManagementApi#deleteItemByEncodedKey
     */
    default ResponseEntity<Void> deleteItemByEncodedKey(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items : 获取分支下的配置项 (new added)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items:
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param branchName 分支名称 (required)
     * @return 成功获取分支下的配置项列表 (status code 200)
     *         or 分支不存在 (status code 404)
     * @see ItemManagementApi#findBranchItems
     */
    default ResponseEntity<List<OpenItemDTO>> findBranchItems(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items : 获取命名空间下的配置项列表 (original openapi)
     * 获取指定命名空间的配置项列表，支持分页
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param page 页码，从0开始 (required)
     * @param size 每页数量 (required)
     * @return 成功获取配置项列表 (status code 200)
     *         or 命名空间不存在 (status code 404)
     * @see ItemManagementApi#findItemsByNamespace
     */
    default ResponseEntity<OpenItemPageDTO> findItemsByNamespace(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 1, \"size\" : 6, \"page\" : 0, \"content\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} : 获取单个配置项 (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param key 配置项键名 (required)
     * @return 成功获取配置项 (status code 200)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#getItem
     */
    default ResponseEntity<OpenItemDTO> getItem(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} : 通过查询参数获取配置项（支持编码的key） (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}
     *
     * @param appId  (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param key 配置项键名（需要URL编码） (required)
     * @return 成功获取配置项（支持编码key） (status code 200)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#getItemByEncodedKey
     */
    default ResponseEntity<OpenItemDTO> getItemByEncodedKey(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"extendInfo\" : { \"newValue\" : \"newValue\", \"isModified\" : true, \"isDeleted\" : true, \"namespaceId\" : 6, \"oldValue\" : \"oldValue\", \"isNewlyAdded\" : true }, \"value\" : \"value\", \"key\" : \"key\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revocation : 撤销配置项更改 (new added)
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/revocation
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param operator 操作人用户名 (optional)
     * @return 配置项更改撤销成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#revertItems
     */
    default ResponseEntity<Void> revertItems(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/synchronize : 同步配置项到多个命名空间 (new added)
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/synchronize:
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param openNamespaceSyncDTO  (required)
     * @param operator 操作人用户名 (optional)
     * @return 配置项同步成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see ItemManagementApi#syncItems
     */
    default ResponseEntity<Void> syncItems(String appId,
        String env,
        String clusterName,
        String namespaceName,
        OpenNamespaceSyncDTO openNamespaceSyncDTO,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validation : 验证配置文本语法 (new added)
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/validation
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param openNamespaceTextModel  (required)
     * @return 配置文本语法验证通过 (status code 200)
     *         or 配置文本语法错误 (status code 400)
     * @see ItemManagementApi#syntaxCheck
     */
    default ResponseEntity<Void> syntaxCheck(String appId,
        String env,
        String clusterName,
        String namespaceName,
        OpenNamespaceTextModel openNamespaceTextModel) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key} : 更新配置项 (original openapi)
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}
     *
     * @param appId  (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param key  (required)
     * @param createIfNotExists  (required)
     * @param openItemDTO  (required)
     * @param operator 操作人用户名 (optional)
     * @return 配置项更新成功 (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#updateItem
     */
    default ResponseEntity<Void> updateItem(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        Boolean createIfNotExists,
        OpenItemDTO openItemDTO,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key} : 通过编码的key更新配置项 (original openapi)
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/encodedItems/{key}
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param key 配置项键名（需要URL编码） (required)
     * @param createIfNotExists 若不存在则创建（true/false） (required)
     * @param openItemDTO  (required)
     * @param operator 操作人用户名 (optional)
     * @return 配置项更新成功（编码key） (status code 200)
     *         or 请求参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     *         or 配置项不存在 (status code 404)
     * @see ItemManagementApi#updateItemByEncodedKey
     */
    default ResponseEntity<Void> updateItemByEncodedKey(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        Boolean createIfNotExists,
        OpenItemDTO openItemDTO,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
