package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.NamespaceReleaseDTO;
import com.apollo.openapi.server.model.OpenGrayReleaseRuleDTO;
import com.apollo.openapi.server.model.OpenNamespaceDTO;
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
 * A delegate to be called by the {@link NamespaceBranchManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface NamespaceBranchManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches : 创建命名空间分支 (original openapi)
     * POST /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches
     *
     * @param appId app标识 (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param operator 操作人用户名 (required)
     * @return 命名空间分支创建成功 (status code 200)
     * @see NamespaceBranchManagementApi#createBranch
     */
    default ResponseEntity<OpenNamespaceDTO> createBranch(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String operator) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} : 删除命名空间分支 (original openapi)
     * DELETE /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}
     *
     * @param env 环境标识 (required)
     * @param appId 应用ID (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param branchName 分支名称 (required)
     * @param operator 操作人用户名 (required)
     * @return 分支删除成功 (status code 200)
     * @see NamespaceBranchManagementApi#deleteBranch
     */
    default ResponseEntity<Object> deleteBranch(String env,
        String appId,
        String clusterName,
        String namespaceName,
        String branchName,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches : 获取命名空间分支信息 (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @return 成功获取分支信息 (status code 200)
     *         or 分支不存在 (status code 404)
     * @see NamespaceBranchManagementApi#findBranch
     */
    default ResponseEntity<OpenNamespaceDTO> findBranch(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"format\" : \"format\", \"isPublic\" : true, \"comment\" : \"comment\", \"items\" : [ { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" }, { \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"comment\" : \"comment\", \"type\" : 0, \"value\" : \"value\", \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"key\" : \"key\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules : 获取分支灰度发布规则 (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules
     *
     * @param appId app标识 (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param branchName 分支名称 (required)
     * @return 成功获取灰度发布规则 (status code 200)
     * @see NamespaceBranchManagementApi#getBranchGrayRules
     */
    default ResponseEntity<OpenGrayReleaseRuleDTO> getBranchGrayRules(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataChangeCreatedTime\" : \"2025-09-29T12:34:56Z\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"clusterName\" : \"clusterName\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"branchName\" : \"branchName\", \"ruleItems\" : [ { \"clientIpList\" : [ \"clientIpList\", \"clientIpList\" ], \"clientLabelList\" : [ \"clientLabelList\", \"clientLabelList\" ], \"clientAppId\" : \"clientAppId\" }, { \"clientIpList\" : [ \"clientIpList\", \"clientIpList\" ], \"clientLabelList\" : [ \"clientLabelList\", \"clientLabelList\" ], \"clientAppId\" : \"clientAppId\" } ], \"dataChangeLastModifiedTime\" : \"2025-09-29T12:34:56Z\", \"namespaceName\" : \"namespaceName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName} : 合并分支到主分支 (new added)
     * PATCH /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}  使用 PATCH 方法表示部分更新操作（将分支状态从\&quot;独立\&quot;更新为\&quot;合并\&quot;）
     *
     * @param env 环境标识 (required)
     * @param appId 应用ID (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param branchName 分支名称 (required)
     * @param deleteBranch 合并后是否删除分支（true/false） (required)
     * @param operator 操作人用户名 (required)
     * @param namespaceReleaseDTO  (required)
     * @return 分支合并成功 (status code 200)
     * @see NamespaceBranchManagementApi#mergeBranch
     */
    default ResponseEntity<OpenReleaseDTO> mergeBranch(String env,
        String appId,
        String clusterName,
        String namespaceName,
        String branchName,
        Boolean deleteBranch,
        String operator,
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
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules : 更新分支灰度发布规则 (original openapi)
     * PUT /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules
     *
     * @param appId 应用ID (required)
     * @param env 环境标识 (required)
     * @param clusterName 集群名称 (required)
     * @param namespaceName 命名空间名称 (required)
     * @param branchName 分支名称 (required)
     * @param operator 操作人用户名 (required)
     * @param openGrayReleaseRuleDTO  (required)
     * @return 灰度规则更新成功 (status code 200)
     * @see NamespaceBranchManagementApi#updateBranchRules
     */
    default ResponseEntity<Object> updateBranchRules(String appId,
        String env,
        String clusterName,
        String namespaceName,
        String branchName,
        String operator,
        OpenGrayReleaseRuleDTO openGrayReleaseRuleDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
