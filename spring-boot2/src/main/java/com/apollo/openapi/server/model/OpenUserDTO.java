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
 * OpenUserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenUserDTO {

  private String username;

  private String userDisplayName;

  private String password;

  private String email;

  private Integer enabled;

  public OpenUserDTO username(String username) {
    this.username = username;
    return this;
  }

  /**
   * 用户名
   * @return username
  */

  @Schema(name = "username", description = "用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public OpenUserDTO userDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
    return this;
  }

  /**
   * 用户显示名
   * @return userDisplayName
  */

  @Schema(name = "userDisplayName", description = "用户显示名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userDisplayName")
  public String getUserDisplayName() {
    return userDisplayName;
  }

  public void setUserDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
  }

  public OpenUserDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 用户密码
   * @return password
  */

  @Schema(name = "password", description = "用户密码", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public OpenUserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * 用户邮箱
   * @return email
  */

  @Schema(name = "email", description = "用户邮箱", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OpenUserDTO enabled(Integer enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * 是否启用，1 表示启用，0 表示禁用
   * @return enabled
  */

  @Schema(name = "enabled", description = "是否启用，1 表示启用，0 表示禁用", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OpenUserDTO openUserDTO = (OpenUserDTO) o;
    return Objects.equals(this.username, openUserDTO.username) &&
        Objects.equals(this.userDisplayName, openUserDTO.userDisplayName) &&
        Objects.equals(this.password, openUserDTO.password) &&
        Objects.equals(this.email, openUserDTO.email) &&
        Objects.equals(this.enabled, openUserDTO.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, userDisplayName, password, email, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenUserDTO {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userDisplayName: ").append(toIndentedString(userDisplayName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
