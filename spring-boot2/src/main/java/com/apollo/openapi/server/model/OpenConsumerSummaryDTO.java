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
 * OpenConsumerSummaryDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenConsumerSummaryDTO {

  private String appId;

  private String name;

  private String orgId;

  private String orgName;

  private String ownerName;

  private String ownerEmail;

  private Long consumerId;

  private Boolean allowCreateApplication = false;

  private Boolean allowManageUsers = false;

  private Integer rateLimit = 0;

  private Boolean rateLimitEnabled = false;

  public OpenConsumerSummaryDTO appId(String appId) {
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

  public OpenConsumerSummaryDTO name(String name) {
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

  public OpenConsumerSummaryDTO orgId(String orgId) {
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

  public OpenConsumerSummaryDTO orgName(String orgName) {
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

  public OpenConsumerSummaryDTO ownerName(String ownerName) {
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

  public OpenConsumerSummaryDTO ownerEmail(String ownerEmail) {
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

  public OpenConsumerSummaryDTO consumerId(Long consumerId) {
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

  public OpenConsumerSummaryDTO allowCreateApplication(Boolean allowCreateApplication) {
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

  public OpenConsumerSummaryDTO allowManageUsers(Boolean allowManageUsers) {
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

  public OpenConsumerSummaryDTO rateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

  /**
   * 限流QPS，0表示不限流
   * minimum: 0
   * @return rateLimit
  */
  @Min(0)
  @Schema(name = "rateLimit", description = "限流QPS，0表示不限流", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLimit")
  public Integer getRateLimit() {
    return rateLimit;
  }

  public void setRateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
  }

  public OpenConsumerSummaryDTO rateLimitEnabled(Boolean rateLimitEnabled) {
    this.rateLimitEnabled = rateLimitEnabled;
    return this;
  }

  /**
   * 是否开启限流
   * @return rateLimitEnabled
  */

  @Schema(name = "rateLimitEnabled", description = "是否开启限流", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLimitEnabled")
  public Boolean getRateLimitEnabled() {
    return rateLimitEnabled;
  }

  public void setRateLimitEnabled(Boolean rateLimitEnabled) {
    this.rateLimitEnabled = rateLimitEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenConsumerSummaryDTO openConsumerSummaryDTO = (OpenConsumerSummaryDTO) o;
    return Objects.equals(this.appId, openConsumerSummaryDTO.appId) &&
        Objects.equals(this.name, openConsumerSummaryDTO.name) &&
        Objects.equals(this.orgId, openConsumerSummaryDTO.orgId) &&
        Objects.equals(this.orgName, openConsumerSummaryDTO.orgName) &&
        Objects.equals(this.ownerName, openConsumerSummaryDTO.ownerName) &&
        Objects.equals(this.ownerEmail, openConsumerSummaryDTO.ownerEmail) &&
        Objects.equals(this.consumerId, openConsumerSummaryDTO.consumerId) &&
        Objects.equals(this.allowCreateApplication, openConsumerSummaryDTO.allowCreateApplication) &&
        Objects.equals(this.allowManageUsers, openConsumerSummaryDTO.allowManageUsers) &&
        Objects.equals(this.rateLimit, openConsumerSummaryDTO.rateLimit) &&
        Objects.equals(this.rateLimitEnabled, openConsumerSummaryDTO.rateLimitEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, name, orgId, orgName, ownerName, ownerEmail, consumerId, allowCreateApplication, allowManageUsers, rateLimit, rateLimitEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenConsumerSummaryDTO {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    allowCreateApplication: ").append(toIndentedString(allowCreateApplication)).append("\n");
    sb.append("    allowManageUsers: ").append(toIndentedString(allowManageUsers)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    rateLimitEnabled: ").append(toIndentedString(rateLimitEnabled)).append("\n");
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
