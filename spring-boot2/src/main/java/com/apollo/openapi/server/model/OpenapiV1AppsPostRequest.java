package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenAppDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * 
 */

@Schema(name = "_openapi_v1_apps_post_request", description = "")
@JsonTypeName("_openapi_v1_apps_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenapiV1AppsPostRequest {

  private OpenAppDTO app;

  private Boolean assignAppRoleToSelf;

  @Valid
  private List<String> admins = new ArrayList<>();

  public OpenapiV1AppsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OpenapiV1AppsPostRequest(OpenAppDTO app, Boolean assignAppRoleToSelf, List<String> admins) {
    this.app = app;
    this.assignAppRoleToSelf = assignAppRoleToSelf;
    this.admins = admins;
  }

  public OpenapiV1AppsPostRequest app(OpenAppDTO app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
   */
  @NotNull @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("app")
  public OpenAppDTO getApp() {
    return app;
  }

  public void setApp(OpenAppDTO app) {
    this.app = app;
  }

  public OpenapiV1AppsPostRequest assignAppRoleToSelf(Boolean assignAppRoleToSelf) {
    this.assignAppRoleToSelf = assignAppRoleToSelf;
    return this;
  }

  /**
   * 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限
   * @return assignAppRoleToSelf
   */
  @NotNull 
  @Schema(name = "assignAppRoleToSelf", description = "是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignAppRoleToSelf")
  public Boolean getAssignAppRoleToSelf() {
    return assignAppRoleToSelf;
  }

  public void setAssignAppRoleToSelf(Boolean assignAppRoleToSelf) {
    this.assignAppRoleToSelf = assignAppRoleToSelf;
  }

  public OpenapiV1AppsPostRequest admins(List<String> admins) {
    this.admins = admins;
    return this;
  }

  public OpenapiV1AppsPostRequest addAdminsItem(String adminsItem) {
    if (this.admins == null) {
      this.admins = new ArrayList<>();
    }
    this.admins.add(adminsItem);
    return this;
  }

  /**
   * 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限
   * @return admins
   */
  @NotNull 
  @Schema(name = "admins", description = "应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("admins")
  public List<String> getAdmins() {
    return admins;
  }

  public void setAdmins(List<String> admins) {
    this.admins = admins;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiV1AppsPostRequest openapiV1AppsPostRequest = (OpenapiV1AppsPostRequest) o;
    return Objects.equals(this.app, openapiV1AppsPostRequest.app) &&
        Objects.equals(this.assignAppRoleToSelf, openapiV1AppsPostRequest.assignAppRoleToSelf) &&
        Objects.equals(this.admins, openapiV1AppsPostRequest.admins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, assignAppRoleToSelf, admins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiV1AppsPostRequest {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    assignAppRoleToSelf: ").append(toIndentedString(assignAppRoleToSelf)).append("\n");
    sb.append("    admins: ").append(toIndentedString(admins)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

