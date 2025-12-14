package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpenUserInfoDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenUserInfoDTO {

  private String userId;

  private String name;

  private String email;

  private Integer enabled;

  public OpenUserInfoDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   *
   * @return userId
  */

  @Schema(name = "userId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public OpenUserInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   *
   * @return name
  */

  @Schema(name = "name", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpenUserInfoDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   *
   * @return email
  */

  @Schema(name = "email", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OpenUserInfoDTO enabled(Integer enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   *
   * @return enabled
  */

  @Schema(name = "enabled", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Integer getEnabled() {
    return enabled;
  }

  public void setEnabled(Integer enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenUserInfoDTO openUserInfoDTO = (OpenUserInfoDTO) o;
    return Objects.equals(this.userId, openUserInfoDTO.userId) &&
        Objects.equals(this.name, openUserInfoDTO.name) &&
        Objects.equals(this.email, openUserInfoDTO.email) &&
        Objects.equals(this.enabled, openUserInfoDTO.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, name, email, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenUserInfoDTO {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
