package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenAppDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * 创建Apollo应用的请求数据传输对象，包含创建应用所需的所有信息
 */

@Schema(name = "OpenCreateAppDTO", description = "创建Apollo应用的请求数据传输对象，包含创建应用所需的所有信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenCreateAppDTO {

  private @Nullable Boolean assignAppRoleToSelf;

  @Valid
  private List<String> admins = new ArrayList<>();

  private @Nullable OpenAppDTO app;

  public OpenCreateAppDTO assignAppRoleToSelf(@Nullable Boolean assignAppRoleToSelf) {
    this.assignAppRoleToSelf = assignAppRoleToSelf;
    return this;
  }

  /**
   * 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限
   * @return assignAppRoleToSelf
   */
  
  @Schema(name = "assignAppRoleToSelf", description = "是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignAppRoleToSelf")
  public @Nullable Boolean getAssignAppRoleToSelf() {
    return assignAppRoleToSelf;
  }

  public void setAssignAppRoleToSelf(@Nullable Boolean assignAppRoleToSelf) {
    this.assignAppRoleToSelf = assignAppRoleToSelf;
  }

  public OpenCreateAppDTO admins(List<String> admins) {
    this.admins = admins;
    return this;
  }

  public OpenCreateAppDTO addAdminsItem(String adminsItem) {
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
  
  @Schema(name = "admins", description = "应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("admins")
  public List<String> getAdmins() {
    return admins;
  }

  public void setAdmins(List<String> admins) {
    this.admins = admins;
  }

  public OpenCreateAppDTO app(@Nullable OpenAppDTO app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
   */
  @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app")
  public @Nullable OpenAppDTO getApp() {
    return app;
  }

  public void setApp(@Nullable OpenAppDTO app) {
    this.app = app;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenCreateAppDTO openCreateAppDTO = (OpenCreateAppDTO) o;
    return Objects.equals(this.assignAppRoleToSelf, openCreateAppDTO.assignAppRoleToSelf) &&
        Objects.equals(this.admins, openCreateAppDTO.admins) &&
        Objects.equals(this.app, openCreateAppDTO.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignAppRoleToSelf, admins, app);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCreateAppDTO {\n");
    sb.append("    assignAppRoleToSelf: ").append(toIndentedString(assignAppRoleToSelf)).append("\n");
    sb.append("    admins: ").append(toIndentedString(admins)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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

