package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenUserInfoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpenEnvNamespaceRoleUserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenEnvNamespaceRoleUserDTO {

  private String appId;

  private String namespaceName;

  @Valid
  private List<@Valid OpenUserInfoDTO> modifyRoleUsers;

  @Valid
  private List<@Valid OpenUserInfoDTO> releaseRoleUsers;

  private String env;

  public OpenEnvNamespaceRoleUserDTO appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   *
   * @return appId
  */

  @Schema(name = "appId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenEnvNamespaceRoleUserDTO namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   *
   * @return namespaceName
  */

  @Schema(name = "namespaceName", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public OpenEnvNamespaceRoleUserDTO modifyRoleUsers(List<@Valid OpenUserInfoDTO> modifyRoleUsers) {
    this.modifyRoleUsers = modifyRoleUsers;
    return this;
  }

  public OpenEnvNamespaceRoleUserDTO addModifyRoleUsersItem(OpenUserInfoDTO modifyRoleUsersItem) {
    if (this.modifyRoleUsers == null) {
      this.modifyRoleUsers = new ArrayList<>();
    }
    this.modifyRoleUsers.add(modifyRoleUsersItem);
    return this;
  }

  /**
   *
   * @return modifyRoleUsers
  */
  @Valid
  @Schema(name = "modifyRoleUsers", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifyRoleUsers")
  public List<@Valid OpenUserInfoDTO> getModifyRoleUsers() {
    return modifyRoleUsers;
  }

  public void setModifyRoleUsers(List<@Valid OpenUserInfoDTO> modifyRoleUsers) {
    this.modifyRoleUsers = modifyRoleUsers;
  }

  public OpenEnvNamespaceRoleUserDTO releaseRoleUsers(List<@Valid OpenUserInfoDTO> releaseRoleUsers) {
    this.releaseRoleUsers = releaseRoleUsers;
    return this;
  }

  public OpenEnvNamespaceRoleUserDTO addReleaseRoleUsersItem(OpenUserInfoDTO releaseRoleUsersItem) {
    if (this.releaseRoleUsers == null) {
      this.releaseRoleUsers = new ArrayList<>();
    }
    this.releaseRoleUsers.add(releaseRoleUsersItem);
    return this;
  }

  /**
   *
   * @return releaseRoleUsers
  */
  @Valid
  @Schema(name = "releaseRoleUsers", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseRoleUsers")
  public List<@Valid OpenUserInfoDTO> getReleaseRoleUsers() {
    return releaseRoleUsers;
  }

  public void setReleaseRoleUsers(List<@Valid OpenUserInfoDTO> releaseRoleUsers) {
    this.releaseRoleUsers = releaseRoleUsers;
  }

  public OpenEnvNamespaceRoleUserDTO env(String env) {
    this.env = env;
    return this;
  }

  /**
   *
   * @return env
  */

  @Schema(name = "env", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenEnvNamespaceRoleUserDTO openEnvNamespaceRoleUserDTO = (OpenEnvNamespaceRoleUserDTO) o;
    return Objects.equals(this.appId, openEnvNamespaceRoleUserDTO.appId) &&
        Objects.equals(this.namespaceName, openEnvNamespaceRoleUserDTO.namespaceName) &&
        Objects.equals(this.modifyRoleUsers, openEnvNamespaceRoleUserDTO.modifyRoleUsers) &&
        Objects.equals(this.releaseRoleUsers, openEnvNamespaceRoleUserDTO.releaseRoleUsers) &&
        Objects.equals(this.env, openEnvNamespaceRoleUserDTO.env);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, namespaceName, modifyRoleUsers, releaseRoleUsers, env);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenEnvNamespaceRoleUserDTO {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    modifyRoleUsers: ").append(toIndentedString(modifyRoleUsers)).append("\n");
    sb.append("    releaseRoleUsers: ").append(toIndentedString(releaseRoleUsers)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
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
