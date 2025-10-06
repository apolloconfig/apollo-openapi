package com.apollo.openapi.server.api;

import java.util.Map;
import com.apollo.openapi.server.model.OpenOrganizationDto;
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
 * A delegate to be called by the {@link OrganizationManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public interface OrganizationManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /openapi/v1/organizations : 获取所有组织信息 (original openapi)
     * GET /openapi/v1/organizations
     *
     * @return 成功获取组织列表 (status code 200)
     *         or 未授权访问 (status code 401)
     * @see OrganizationManagementApi#getOrganization
     */
    default ResponseEntity<List<OpenOrganizationDto>> getOrganization() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"orgName\" : \"orgName\", \"orgId\" : \"orgId\" }, { \"orgName\" : \"orgName\", \"orgId\" : \"orgId\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
