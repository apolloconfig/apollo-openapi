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
 * OpenClusterNamespaceRoleUserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenClusterNamespaceRoleUserDTO {

  private String appId;

  private String env;

  private String cluster;

  @Valid
  private List<@Valid OpenUserInfoDTO> modifyRoleUsers;

  @Valid
  private List<@Valid OpenUserInfoDTO> releaseRoleUsers;

  public OpenClusterNamespaceRoleUserDTO appId(String appId) {
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

  public OpenClusterNamespaceRoleUserDTO env(String env) {
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

  public OpenClusterNamespaceRoleUserDTO cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   *
   * @return cluster
  */

  @Schema(name = "cluster", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster")
  public String getCluster() {
    return cluster;
  }

  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  public OpenClusterNamespaceRoleUserDTO modifyRoleUsers(List<@Valid OpenUserInfoDTO> modifyRoleUsers) {
    this.modifyRoleUsers = modifyRoleUsers;
    return this;
  }

  public OpenClusterNamespaceRoleUserDTO addModifyRoleUsersItem(OpenUserInfoDTO modifyRoleUsersItem) {
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

  public OpenClusterNamespaceRoleUserDTO releaseRoleUsers(List<@Valid OpenUserInfoDTO> releaseRoleUsers) {
    this.releaseRoleUsers = releaseRoleUsers;
    return this;
  }

  public OpenClusterNamespaceRoleUserDTO addReleaseRoleUsersItem(OpenUserInfoDTO releaseRoleUsersItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenClusterNamespaceRoleUserDTO openClusterNamespaceRoleUserDTO = (OpenClusterNamespaceRoleUserDTO) o;
    return Objects.equals(this.appId, openClusterNamespaceRoleUserDTO.appId) &&
        Objects.equals(this.env, openClusterNamespaceRoleUserDTO.env) &&
        Objects.equals(this.cluster, openClusterNamespaceRoleUserDTO.cluster) &&
        Objects.equals(this.modifyRoleUsers, openClusterNamespaceRoleUserDTO.modifyRoleUsers) &&
        Objects.equals(this.releaseRoleUsers, openClusterNamespaceRoleUserDTO.releaseRoleUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, env, cluster, modifyRoleUsers, releaseRoleUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenClusterNamespaceRoleUserDTO {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    modifyRoleUsers: ").append(toIndentedString(modifyRoleUsers)).append("\n");
    sb.append("    releaseRoleUsers: ").append(toIndentedString(releaseRoleUsers)).append("\n");
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
