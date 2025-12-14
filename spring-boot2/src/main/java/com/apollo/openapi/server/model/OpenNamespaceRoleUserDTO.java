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
 * OpenNamespaceRoleUserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenNamespaceRoleUserDTO {

  private String appId;

  private String namespaceName;

  @Valid
  private List<@Valid OpenUserInfoDTO> modifyRoleUsers;

  @Valid
  private List<@Valid OpenUserInfoDTO> releaseRoleUsers;

  public OpenNamespaceRoleUserDTO appId(String appId) {
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

  public OpenNamespaceRoleUserDTO namespaceName(String namespaceName) {
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

  public OpenNamespaceRoleUserDTO modifyRoleUsers(List<@Valid OpenUserInfoDTO> modifyRoleUsers) {
    this.modifyRoleUsers = modifyRoleUsers;
    return this;
  }

  public OpenNamespaceRoleUserDTO addModifyRoleUsersItem(OpenUserInfoDTO modifyRoleUsersItem) {
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

  public OpenNamespaceRoleUserDTO releaseRoleUsers(List<@Valid OpenUserInfoDTO> releaseRoleUsers) {
    this.releaseRoleUsers = releaseRoleUsers;
    return this;
  }

  public OpenNamespaceRoleUserDTO addReleaseRoleUsersItem(OpenUserInfoDTO releaseRoleUsersItem) {
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
    OpenNamespaceRoleUserDTO openNamespaceRoleUserDTO = (OpenNamespaceRoleUserDTO) o;
    return Objects.equals(this.appId, openNamespaceRoleUserDTO.appId) &&
        Objects.equals(this.namespaceName, openNamespaceRoleUserDTO.namespaceName) &&
        Objects.equals(this.modifyRoleUsers, openNamespaceRoleUserDTO.modifyRoleUsers) &&
        Objects.equals(this.releaseRoleUsers, openNamespaceRoleUserDTO.releaseRoleUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, namespaceName, modifyRoleUsers, releaseRoleUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceRoleUserDTO {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
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
