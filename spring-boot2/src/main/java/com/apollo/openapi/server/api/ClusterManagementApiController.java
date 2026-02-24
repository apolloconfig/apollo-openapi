package com.apollo.openapi.server.api;

import com.apollo.openapi.server.model.ExceptionResponse;
import com.apollo.openapi.server.model.OpenClusterDTO;


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
public class ClusterManagementApiController implements ClusterManagementApi {

    private final ClusterManagementApiDelegate delegate;

    public ClusterManagementApiController(@Autowired(required = false) ClusterManagementApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ClusterManagementApiDelegate() {});
    }

    @Override
    public ClusterManagementApiDelegate getDelegate() {
        return delegate;
    }

}
