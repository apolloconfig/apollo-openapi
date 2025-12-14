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
 * OpenAppRoleUserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenAppRoleUserDTO {

  private String appId;

  @Valid
  private List<@Valid OpenUserInfoDTO> masterUsers;

  public OpenAppRoleUserDTO appId(String appId) {
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

  public OpenAppRoleUserDTO masterUsers(List<@Valid OpenUserInfoDTO> masterUsers) {
    this.masterUsers = masterUsers;
    return this;
  }

  public OpenAppRoleUserDTO addMasterUsersItem(OpenUserInfoDTO masterUsersItem) {
    if (this.masterUsers == null) {
      this.masterUsers = new ArrayList<>();
    }
    this.masterUsers.add(masterUsersItem);
    return this;
  }

  /**
   *
   * @return masterUsers
  */
  @Valid
  @Schema(name = "masterUsers", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("masterUsers")
  public List<@Valid OpenUserInfoDTO> getMasterUsers() {
    return masterUsers;
  }

  public void setMasterUsers(List<@Valid OpenUserInfoDTO> masterUsers) {
    this.masterUsers = masterUsers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAppRoleUserDTO openAppRoleUserDTO = (OpenAppRoleUserDTO) o;
    return Objects.equals(this.appId, openAppRoleUserDTO.appId) &&
        Objects.equals(this.masterUsers, openAppRoleUserDTO.masterUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, masterUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAppRoleUserDTO {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    masterUsers: ").append(toIndentedString(masterUsers)).append("\n");
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
