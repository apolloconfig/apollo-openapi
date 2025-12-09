package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.OpenNamespaceLockDTO;
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
 * A delegate to be called by the {@link NamespaceLockManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface NamespaceLockManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock : 获取Namespace的锁状态 (original openapi)
     * GET /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock
     *
     * @param appId  (required)
     * @param env  (required)
     * @param clusterName  (required)
     * @param namespaceName  (required)
     * @return  (status code 200)
     * @see NamespaceLockManagementApi#getNamespaceLock
     */
    default ResponseEntity<OpenNamespaceLockDTO> getNamespaceLock(String appId,
        String env,
        String clusterName,
        String namespaceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lockedBy\" : \"lockedBy\", \"isLocked\" : true, \"namespaceName\" : \"namespaceName\", \"isEmergencyPublishAllowed\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
