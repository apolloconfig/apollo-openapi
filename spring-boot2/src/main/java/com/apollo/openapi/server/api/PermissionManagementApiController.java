package com.apollo.openapi.server.api;

import java.util.List;
import java.util.Map;
import com.apollo.openapi.server.model.OpenAppRoleUserDTO;
import com.apollo.openapi.server.model.OpenClusterNamespaceRoleUserDTO;
import com.apollo.openapi.server.model.OpenEnvNamespaceRoleUserDTO;
import com.apollo.openapi.server.model.OpenNamespaceRoleUserDTO;
import com.apollo.openapi.server.model.OpenPermissionConditionDTO;


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
public class PermissionManagementApiController implements PermissionManagementApi {

    private final PermissionManagementApiDelegate delegate;

    public PermissionManagementApiController(@Autowired(required = false) PermissionManagementApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PermissionManagementApiDelegate() {});
    }

    @Override
    public PermissionManagementApiDelegate getDelegate() {
        return delegate;
    }

}
