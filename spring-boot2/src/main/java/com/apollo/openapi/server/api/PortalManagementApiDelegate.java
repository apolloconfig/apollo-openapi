package com.apollo.openapi.server.api;

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
 * A delegate to be called by the {@link PortalManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PortalManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/favorites : 添加收藏(new added)
     * POST /openapi/v1/favorites
     *
     * @param body  (required)
     * @return 成功添加收藏 (status code 200)
     * @see PortalManagementApi#addFavorite
     */
    default ResponseEntity<Object> addFavorite(Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/consumers/{token}/assign-role : 给消费者授权(new added)
     * POST /openapi/v1/consumers/{token}/assign-role
     *
     * @param token  (required)
     * @param type  (required)
     * @param body  (required)
     * @param envs  (optional)
     * @return 成功授权 (status code 200)
     * @see PortalManagementApi#assignRoleToConsumer
     */
    default ResponseEntity<List<Object>> assignRoleToConsumer(String token,
        String type,
        Object body,
        String envs) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * HEAD /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export : 检查应用配置导出权限(new added)
     * HEAD /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @return 可导出 (status code 200)
     * @see PortalManagementApi#checkExportAppConfig
     */
    default ResponseEntity<Void> checkExportAppConfig(String appId,
        String env,
        String clusterName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/system-info/health : 检查系统实例健康状态(new added)
     * GET /openapi/v1/system-info/health
     *
     * @param instanceId  (required)
     * @return 成功获取健康状态 (status code 200)
     * @see PortalManagementApi#checkSystemHealth
     */
    default ResponseEntity<Object> checkSystemHealth(String instanceId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/consumers : 创建开放平台消费者(new added)
     * POST /openapi/v1/consumers
     *
     * @param body  (required)
     * @param expires  (optional)
     * @return 成功创建消费者 (status code 200)
     * @see PortalManagementApi#createConsumer
     */
    default ResponseEntity<Object> createConsumer(Object body,
        String expires) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/server/envs/{env}/config-db/config : 创建或更新Config DB配置(new added)
     * POST /openapi/v1/server/envs/{env}/config-db/config
     *
     * @param env  (required)
     * @param body  (required)
     * @return 成功创建或更新配置 (status code 200)
     * @see PortalManagementApi#createOrUpdateConfigDBConfig
     */
    default ResponseEntity<Object> createOrUpdateConfigDBConfig(String env,
        Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/server/portal-db/config : 创建或更新Portal DB配置(new added)
     * POST /openapi/v1/server/portal-db/config
     *
     * @param body  (required)
     * @return 成功创建或更新配置 (status code 200)
     * @see PortalManagementApi#createOrUpdatePortalDBConfig
     */
    default ResponseEntity<Object> createOrUpdatePortalDBConfig(Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/server/envs/{env}/config-db/config : 删除Config DB配置(new added)
     * DELETE /openapi/v1/server/envs/{env}/config-db/config
     *
     * @param env  (required)
     * @param key  (required)
     * @param cluster  (required)
     * @return 成功删除配置 (status code 200)
     * @see PortalManagementApi#deleteConfigDBConfig
     */
    default ResponseEntity<Void> deleteConfigDBConfig(String env,
        String key,
        String cluster) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/consumers/by-appId : 按应用ID删除消费者(new added)
     * DELETE /openapi/v1/consumers/by-appId
     *
     * @param appId  (required)
     * @return 成功删除消费者 (status code 200)
     * @see PortalManagementApi#deleteConsumer
     */
    default ResponseEntity<Void> deleteConsumer(String appId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/favorites/{favoriteId} : 删除收藏(new added)
     * DELETE /openapi/v1/favorites/{favoriteId}
     *
     * @param favoriteId  (required)
     * @return 成功删除收藏 (status code 200)
     * @see PortalManagementApi#deleteFavorite
     */
    default ResponseEntity<Void> deleteFavorite(Long favoriteId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/server/portal-db/config : 删除Portal DB配置(new added)
     * DELETE /openapi/v1/server/portal-db/config
     *
     * @param key  (required)
     * @return 成功删除配置 (status code 200)
     * @see PortalManagementApi#deletePortalDBConfig
     */
    default ResponseEntity<Void> deletePortalDBConfig(String key) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/configs/export : 导出所有配置(new added)
     * GET /openapi/v1/configs/export
     *
     * @param envs  (required)
     * @return 成功导出配置 (status code 200)
     * @see PortalManagementApi#exportAllConfigs
     */
    default ResponseEntity<org.springframework.core.io.Resource> exportAllConfigs(String envs) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export : 导出应用配置(new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/export
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @return 成功导出应用配置 (status code 200)
     * @see PortalManagementApi#exportAppConfig
     */
    default ResponseEntity<org.springframework.core.io.Resource> exportAppConfig(String appId,
        String env,
        String clusterName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/export : 导出命名空间配置项(new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/export
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return 成功导出命名空间配置项 (status code 200)
     * @see PortalManagementApi#exportNamespaceItems
     */
    default ResponseEntity<org.springframework.core.io.Resource> exportNamespaceItems(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/server/envs/{env}/config-db/config/find-all-config : 查询指定环境全部Config DB配置(new added)
     * GET /openapi/v1/server/envs/{env}/config-db/config/find-all-config
     *
     * @param env  (required)
     * @return 成功获取配置列表 (status code 200)
     * @see PortalManagementApi#findAllConfigDBConfig
     */
    default ResponseEntity<List<Object>> findAllConfigDBConfig(String env) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/server/portal-db/config/find-all-config : 查询全部Portal DB配置(new added)
     * GET /openapi/v1/server/portal-db/config/find-all-config
     *
     * @return 成功获取配置列表 (status code 200)
     * @see PortalManagementApi#findAllPortalDBConfig
     */
    default ResponseEntity<List<Object>> findAllPortalDBConfig() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apollo/audit/logs/dataInfluences/field : 查询审计数据影响(new added)
     * GET /openapi/v1/apollo/audit/logs/dataInfluences/field
     *
     * @param entityName  (required)
     * @param entityId  (required)
     * @param fieldName  (required)
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @return 成功获取审计数据影响 (status code 200)
     * @see PortalManagementApi#findAuditDataInfluencesByField
     */
    default ResponseEntity<List<Object>> findAuditDataInfluencesByField(String entityName,
        String entityId,
        String fieldName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apollo/audit/logs : 查询审计日志(new added)
     * GET /openapi/v1/apollo/audit/logs
     *
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @return 成功获取审计日志 (status code 200)
     * @see PortalManagementApi#findAuditLogs
     */
    default ResponseEntity<List<Object>> findAuditLogs(Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apollo/audit/logs/opName : 按操作名查询审计日志(new added)
     * GET /openapi/v1/apollo/audit/logs/opName
     *
     * @param opName  (required)
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @return 成功获取审计日志 (status code 200)
     * @see PortalManagementApi#findAuditLogsByOpName
     */
    default ResponseEntity<List<Object>> findAuditLogsByOpName(String opName,
        Integer page,
        Integer size,
        String startDate,
        String endDate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apollo/audit/trace : 查询审计链路详情(new added)
     * GET /openapi/v1/apollo/audit/trace
     *
     * @param traceId  (required)
     * @return 成功获取审计链路详情 (status code 200)
     * @see PortalManagementApi#findAuditTraceDetails
     */
    default ResponseEntity<List<Object>> findAuditTraceDetails(String traceId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/commits : 查询命名空间提交记录(new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/commits
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param key  (optional)
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @return 成功获取提交记录 (status code 200)
     * @see PortalManagementApi#findCommits
     */
    default ResponseEntity<List<Object>> findCommits(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String key,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/favorites : 查询收藏(new added)
     * GET /openapi/v1/favorites
     *
     * @param userId  (optional)
     * @param appId  (optional)
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @return 成功获取收藏 (status code 200)
     * @see PortalManagementApi#findFavorites
     */
    default ResponseEntity<List<Object>> findFavorites(String userId,
        String appId,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/releases/histories : 查询命名空间发布历史(new added)
     * GET /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/releases/histories
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @return 成功获取发布历史 (status code 200)
     * @see PortalManagementApi#findReleaseHistoriesByNamespace
     */
    default ResponseEntity<List<Object>> findReleaseHistoriesByNamespace(String appId,
        String env,
        String clusterName,
        String namespaceName,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apollo/audit/properties : 获取审计配置(new added)
     * GET /openapi/v1/apollo/audit/properties
     *
     * @return 成功获取审计配置 (status code 200)
     * @see PortalManagementApi#getAuditProperties
     */
    default ResponseEntity<Object> getAuditProperties() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/consumers : 查询开放平台消费者列表(new added)
     * GET /openapi/v1/consumers
     *
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @return 成功获取消费者列表 (status code 200)
     * @see PortalManagementApi#getConsumerList
     */
    default ResponseEntity<List<Object>> getConsumerList(Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/consumer-tokens/by-appId : 按应用ID查询消费者Token(new added)
     * GET /openapi/v1/consumer-tokens/by-appId
     *
     * @param appId  (required)
     * @return 成功获取消费者Token (status code 200)
     * @see PortalManagementApi#getConsumerTokenByAppId
     */
    default ResponseEntity<Object> getConsumerTokenByAppId(String appId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/page-settings : 获取Portal页面配置(new added)
     * GET /openapi/v1/page-settings
     *
     * @return 成功获取页面配置 (status code 200)
     * @see PortalManagementApi#getPageSettings
     */
    default ResponseEntity<Object> getPageSettings() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/system-info : 获取系统信息(new added)
     * GET /openapi/v1/system-info
     *
     * @return 成功获取系统信息 (status code 200)
     * @see PortalManagementApi#getSystemInfo
     */
    default ResponseEntity<Object> getSystemInfo() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/configs/import : 导入所有配置(new added)
     * POST /openapi/v1/configs/import
     *
     * @param envs  (required)
     * @param conflictAction  (optional, default to ignore)
     * @param file  (optional)
     * @return 导入成功 (status code 200)
     * @see PortalManagementApi#importAllConfigs
     */
    default ResponseEntity<Void> importAllConfigs(String envs,
        String conflictAction,
        MultipartFile file) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/import : 导入应用配置(new added)
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/import
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param conflictAction  (optional, default to ignore)
     * @param file  (optional)
     * @return 导入成功 (status code 200)
     * @see PortalManagementApi#importAppConfig
     */
    default ResponseEntity<Void> importAppConfig(String appId,
        String env,
        String clusterName,
        String conflictAction,
        MultipartFile file) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/import : 导入配置兼容入口(new added)
     * POST /openapi/v1/import
     *
     * @param envs  (required)
     * @param conflictAction  (optional, default to ignore)
     * @param file  (optional)
     * @return 导入成功 (status code 200)
     * @see PortalManagementApi#importConfig
     */
    default ResponseEntity<Void> importConfig(String envs,
        String conflictAction,
        MultipartFile file) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/import : 导入命名空间配置项(new added)
     * POST /openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName}/items/import
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param file  (optional)
     * @return 导入成功 (status code 200)
     * @see PortalManagementApi#importNamespaceItems
     */
    default ResponseEntity<Void> importNamespaceItems(String appId,
        String env,
        String clusterName,
        String namespaceName,
        MultipartFile file) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/search/by-appid-or-name : 按应用ID或名称搜索应用(new added)
     * GET /openapi/v1/apps/search/by-appid-or-name
     *
     * @param query  (optional)
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 20)
     * @return 成功搜索应用 (status code 200)
     * @see PortalManagementApi#searchAppsByAppIdOrName
     */
    default ResponseEntity<Object> searchAppsByAppIdOrName(String query,
        Integer page,
        Integer size) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apollo/audit/logs/by-name-or-type-or-operator : 搜索审计日志(new added)
     * GET /openapi/v1/apollo/audit/logs/by-name-or-type-or-operator
     *
     * @param query  (required)
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 10)
     * @return 成功搜索审计日志 (status code 200)
     * @see PortalManagementApi#searchAuditLogs
     */
    default ResponseEntity<List<Object>> searchAuditLogs(String query,
        Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"{}\", \"{}\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/global-search/item-info/by-key-or-value : 按Key或Value全局搜索配置(new added)
     * GET /openapi/v1/global-search/item-info/by-key-or-value
     *
     * @param key  (optional, default to )
     * @param value  (optional, default to )
     * @return 成功搜索配置 (status code 200)
     * @see PortalManagementApi#searchItemInfoByKeyOrValue
     */
    default ResponseEntity<Object> searchItemInfoByKeyOrValue(String key,
        String value) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/favorites/{favoriteId} : 收藏置顶(new added)
     * PUT /openapi/v1/favorites/{favoriteId}
     *
     * @param favoriteId  (required)
     * @return 成功置顶收藏 (status code 200)
     * @see PortalManagementApi#topFavorite
     */
    default ResponseEntity<Void> topFavorite(Long favoriteId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
