package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.NamespaceGrayDelReleaseDTO;
import com.apollo.openapi.server.model.NamespaceReleaseDTO;
import com.apollo.openapi.server.model.OpenReleaseDTO;
import com.apollo.openapi.server.model.OpenReleaseDiffDTO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.apolloOpen.base-path:}")
public class ReleaseManagementApiController implements ReleaseManagementApi {

    private final ReleaseManagementApiDelegate delegate;

    public ReleaseManagementApiController(@Autowired(required = false) ReleaseManagementApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ReleaseManagementApiDelegate() {});
    }

    @Override
    public ReleaseManagementApiDelegate getDelegate() {
        return delegate;
    }

}
