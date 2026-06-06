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
 * OpenConsumerInfoDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenConsumerInfoDTO {

  private String appId;

  private String name;

  private String orgId;

  private String orgName;

  private String ownerName;

  private String ownerEmail;

  private Long consumerId;

  private String token;

  private Boolean allowCreateApplication = false;

  private Boolean allowManageUsers = false;

  private Integer rateLimit = 0;

  public OpenConsumerInfoDTO appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 第三方应用ID
   * @return appId
  */

  @Schema(name = "appId", description = "第三方应用ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenConsumerInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 第三方应用名称
   * @return name
  */

  @Schema(name = "name", description = "第三方应用名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpenConsumerInfoDTO orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * 部门ID
   * @return orgId
  */

  @Schema(name = "orgId", description = "部门ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgId")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public OpenConsumerInfoDTO orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * 部门名称
   * @return orgName
  */

  @Schema(name = "orgName", description = "部门名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgName")
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public OpenConsumerInfoDTO ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * 负责人用户名
   * @return ownerName
  */

  @Schema(name = "ownerName", description = "负责人用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerName")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public OpenConsumerInfoDTO ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * 负责人邮箱
   * @return ownerEmail
  */

  @Schema(name = "ownerEmail", description = "负责人邮箱", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerEmail")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public OpenConsumerInfoDTO consumerId(Long consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  */

  @Schema(name = "consumerId", description = "Consumer ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumerId")
  public Long getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(Long consumerId) {
    this.consumerId = consumerId;
  }

  public OpenConsumerInfoDTO token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Consumer Token，仅在创建或按应用查询详情时返回
   * @return token
  */

  @Schema(name = "token", description = "Consumer Token，仅在创建或按应用查询详情时返回", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public OpenConsumerInfoDTO allowCreateApplication(Boolean allowCreateApplication) {
    this.allowCreateApplication = allowCreateApplication;
    return this;
  }

  /**
   * 是否允许该Consumer Token创建应用
   * @return allowCreateApplication
  */

  @Schema(name = "allowCreateApplication", description = "是否允许该Consumer Token创建应用", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowCreateApplication")
  public Boolean getAllowCreateApplication() {
    return allowCreateApplication;
  }

  public void setAllowCreateApplication(Boolean allowCreateApplication) {
    this.allowCreateApplication = allowCreateApplication;
  }

  public OpenConsumerInfoDTO allowManageUsers(Boolean allowManageUsers) {
    this.allowManageUsers = allowManageUsers;
    return this;
  }

  /**
   * 是否允许该Consumer Token管理用户
   * @return allowManageUsers
  */

  @Schema(name = "allowManageUsers", description = "是否允许该Consumer Token管理用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowManageUsers")
  public Boolean getAllowManageUsers() {
    return allowManageUsers;
  }

  public void setAllowManageUsers(Boolean allowManageUsers) {
    this.allowManageUsers = allowManageUsers;
  }

  public OpenConsumerInfoDTO rateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

  /**
   * 限流QPS，0表示不限流
   * @return rateLimit
  */

  @Schema(name = "rateLimit", description = "限流QPS，0表示不限流", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLimit")
  public Integer getRateLimit() {
    return rateLimit;
  }

  public void setRateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenConsumerInfoDTO openConsumerInfoDTO = (OpenConsumerInfoDTO) o;
    return Objects.equals(this.appId, openConsumerInfoDTO.appId) &&
        Objects.equals(this.name, openConsumerInfoDTO.name) &&
        Objects.equals(this.orgId, openConsumerInfoDTO.orgId) &&
        Objects.equals(this.orgName, openConsumerInfoDTO.orgName) &&
        Objects.equals(this.ownerName, openConsumerInfoDTO.ownerName) &&
        Objects.equals(this.ownerEmail, openConsumerInfoDTO.ownerEmail) &&
        Objects.equals(this.consumerId, openConsumerInfoDTO.consumerId) &&
        Objects.equals(this.token, openConsumerInfoDTO.token) &&
        Objects.equals(this.allowCreateApplication, openConsumerInfoDTO.allowCreateApplication) &&
        Objects.equals(this.allowManageUsers, openConsumerInfoDTO.allowManageUsers) &&
        Objects.equals(this.rateLimit, openConsumerInfoDTO.rateLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, name, orgId, orgName, ownerName, ownerEmail, consumerId, token, allowCreateApplication, allowManageUsers, rateLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenConsumerInfoDTO {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    allowCreateApplication: ").append(toIndentedString(allowCreateApplication)).append("\n");
    sb.append("    allowManageUsers: ").append(toIndentedString(allowManageUsers)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
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
