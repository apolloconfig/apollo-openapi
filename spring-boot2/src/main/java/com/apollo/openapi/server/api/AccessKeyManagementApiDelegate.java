package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.OpenAccessKeyDTO;
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
 * A delegate to be called by the {@link AccessKeyManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface AccessKeyManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /openapi/v1/apps/{appId}/envs/{env}/accesskeys : 创建AccessKey
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param operator  (optional)
     * @return  (status code 200)
     * @see AccessKeyManagementApi#createAccessKey
     */
    default ResponseEntity<OpenAccessKeyDTO> createAccessKey(String appId,
        String env,
        String operator) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mode\" : 6, \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"id\" : 0, \"secret\" : \"secret\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"enabled\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /openapi/v1/apps/{appId}/envs/{env}/accesskeys/{accessKeyId} : 删除AccessKey
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param accessKeyId  (required)
     * @param operator  (optional)
     * @return  (status code 200)
     * @see AccessKeyManagementApi#deleteAccessKey
     */
    default ResponseEntity<Void> deleteAccessKey(String appId,
        String env,
        Long accessKeyId,
        String operator) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/apps/{appId}/envs/{env}/accesskeys/{accessKeyId}/deactivation : 禁用AccessKey
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param accessKeyId  (required)
     * @return  (status code 200)
     * @see AccessKeyManagementApi#disableAccessKey
     */
    default ResponseEntity<Void> disableAccessKey(String appId,
        String env,
        Long accessKeyId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /openapi/v1/apps/{appId}/envs/{env}/accesskeys/{accessKeyId}/activation : 启用AccessKey
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @param accessKeyId  (required)
     * @param mode  (optional, default to 0)
     * @return  (status code 200)
     * @see AccessKeyManagementApi#enableAccessKey
     */
    default ResponseEntity<Void> enableAccessKey(String appId,
        String env,
        Long accessKeyId,
        Integer mode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /openapi/v1/apps/{appId}/envs/{env}/accesskeys : 查找AccessKey
     *
     *
     * @param appId  (required)
     * @param env  (required)
     * @return  (status code 200)
     * @see AccessKeyManagementApi#findAccessKeys
     */
    default ResponseEntity<List<OpenAccessKeyDTO>> findAccessKeys(String appId,
        String env) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"mode\" : 6, \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"id\" : 0, \"secret\" : \"secret\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"enabled\" : true }, { \"mode\" : 6, \"dataChangeLastModifiedByDisplayName\" : \"dataChangeLastModifiedByDisplayName\", \"dataChangeCreatedByDisplayName\" : \"dataChangeCreatedByDisplayName\", \"dataChangeCreatedTime\" : \"dataChangeCreatedTime\", \"dataChangeLastModifiedBy\" : \"dataChangeLastModifiedBy\", \"appId\" : \"appId\", \"dataChangeCreatedBy\" : \"dataChangeCreatedBy\", \"id\" : 0, \"secret\" : \"secret\", \"dataChangeLastModifiedTime\" : \"dataChangeLastModifiedTime\", \"enabled\" : true } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
