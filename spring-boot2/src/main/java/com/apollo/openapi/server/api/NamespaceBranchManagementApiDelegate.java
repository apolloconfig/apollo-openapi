package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.NamespaceGrayDelReleaseDTO;
import com.apollo.openapi.server.model.NamespaceReleaseDTO;
import com.apollo.openapi.server.model.OpenGrayReleaseRuleDTO;
import com.apollo.openapi.server.model.OpenItemDTO;
import com.apollo.openapi.server.model.OpenNamespaceDTO;
import com.apollo.openapi.server.model.OpenReleaseDTO;
import com.apollo.openapi.server.model.OpenapiV1AppsGet401Response;
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
 * A delegate to be called by the {@link NamespaceBranchManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public interface NamespaceBranchManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branch : 创建命名空间分支
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branch
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param operator  (required)
     * @return  (status code 200)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost
     */
    default ResponseEntity<OpenNamespaceDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchPost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String operator) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} : 删除命名空间分支
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}
     *
     * @param env  (required)
     * @param appId  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @param operator  (required)
     * @return  (status code 200)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete
     */
    default ResponseEntity<Object> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameDelete(String env,
        String appId,
        String clusterName,
        String namespaceName,
        String branchName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-del-releases : 创建灰度删除发布
     * 
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @param namespaceGrayDelReleaseDTO  (required)
     * @return  (status code 200)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost
     */
    default ResponseEntity<OpenReleaseDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayDelReleasesPost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        NamespaceGrayDelReleaseDTO namespaceGrayDelReleaseDTO) {
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
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules : 获取分支灰度发布规则
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @return  (status code 200)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet
     */
    default ResponseEntity<OpenGrayReleaseRuleDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"branchName\" : \"branchName\", \"ruleItems\" : [ { \"clientIpList\" : [ \"clientIpList\", \"clientIpList\" ], \"clientLabelList\" : [ \"clientLabelList\", \"clientLabelList\" ], \"clientAppId\" : \"clientAppId\" }, { \"clientIpList\" : [ \"clientIpList\", \"clientIpList\" ], \"clientLabelList\" : [ \"clientLabelList\", \"clientLabelList\" ], \"clientAppId\" : \"clientAppId\" } ], \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules : 更新分支灰度发布规则
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/gray-rules
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @param operator  (required)
     * @param openGrayReleaseRuleDTO  (required)
     * @return  (status code 200)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut
     */
    default ResponseEntity<Object> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameGrayRulesPut(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        String operator,
        OpenGrayReleaseRuleDTO openGrayReleaseRuleDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items : 获取分支下的配置项
     * GET /apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/items
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @return 成功获取分支下的配置项列表 (status code 200)
     *         or 分支不存在 (status code 404)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet
     */
    default ResponseEntity<List<OpenItemDTO>> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameItemsGet(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"key\" : \"key\" } ]";
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
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/merge : 合并分支
     * 
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @param deleteBranch  (required)
     * @param namespaceReleaseDTO  (required)
     * @return 分支合并成功 (status code 200)
     *         or 合并参数错误 (status code 400)
     *         or 权限不足 (status code 403)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost
     */
    default ResponseEntity<OpenReleaseDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameMergePost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        Boolean deleteBranch,
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
     * PATCH /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} : 合并分支到主分支
     * PATCH /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}  使用 PATCH 方法表示部分更新操作（将分支状态从\&quot;独立\&quot;更新为\&quot;合并\&quot;）
     *
     * @param env  (required)
     * @param appId  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @param deleteBranch  (required)
     * @param xApolloOperator  (required)
     * @param namespaceReleaseDTO  (required)
     * @return  (status code 200)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch
     */
    default ResponseEntity<OpenReleaseDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNamePatch(String env,
        String appId,
        String clusterName,
        String namespaceName,
        String branchName,
        Boolean deleteBranch,
        String xApolloOperator,
        NamespaceReleaseDTO namespaceReleaseDTO) {
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
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/releases : 创建灰度发布
     * 
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @param branchName  (required)
     * @param namespaceReleaseDTO  (required)
     * @return  (status code 200)
     * @see NamespaceBranchManagementApi#openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost
     */
    default ResponseEntity<OpenReleaseDTO> openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameBranchesBranchNameReleasesPost(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        NamespaceReleaseDTO namespaceReleaseDTO) {
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

}
