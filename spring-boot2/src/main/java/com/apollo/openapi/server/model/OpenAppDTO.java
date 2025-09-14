package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Apollo应用信息数据传输对象，包含应用的基本信息和元数据
 */

@Schema(name = "OpenAppDTO", description = "Apollo应用信息数据传输对象，包含应用的基本信息和元数据")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenAppDTO {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  private @Nullable String name;

  private @Nullable String appId;

  private @Nullable String orgId;

  private @Nullable String orgName;

  private @Nullable String ownerName;

  private @Nullable String ownerEmail;

  public OpenAppDTO dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 数据创建者用户名，记录是谁创建了这个应用
   * @return dataChangeCreatedBy
   */
  
  @Schema(name = "dataChangeCreatedBy", description = "数据创建者用户名，记录是谁创建了这个应用", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public @Nullable String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenAppDTO dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 数据最后修改者用户名，记录最后一次修改应用信息的用户
   * @return dataChangeLastModifiedBy
   */
  
  @Schema(name = "dataChangeLastModifiedBy", description = "数据最后修改者用户名，记录最后一次修改应用信息的用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public @Nullable String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenAppDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 数据创建时间，ISO 8601格式的时间戳
   * @return dataChangeCreatedTime
   */
  
  @Schema(name = "dataChangeCreatedTime", description = "数据创建时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public @Nullable String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenAppDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 数据最后修改时间，ISO 8601格式的时间戳
   * @return dataChangeLastModifiedTime
   */
  
  @Schema(name = "dataChangeLastModifiedTime", description = "数据最后修改时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public @Nullable String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenAppDTO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * 应用名称，用于显示的友好名称
   * @return name
   */
  
  @Schema(name = "name", description = "应用名称，用于显示的友好名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public OpenAppDTO appId(@Nullable String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 应用唯一标识符，全局唯一的应用ID
   * @return appId
   */
  
  @Schema(name = "appId", description = "应用唯一标识符，全局唯一的应用ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public @Nullable String getAppId() {
    return appId;
  }

  public void setAppId(@Nullable String appId) {
    this.appId = appId;
  }

  public OpenAppDTO orgId(@Nullable String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * 组织ID，应用所属组织的唯一标识
   * @return orgId
   */
  
  @Schema(name = "orgId", description = "组织ID，应用所属组织的唯一标识", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgId")
  public @Nullable String getOrgId() {
    return orgId;
  }

  public void setOrgId(@Nullable String orgId) {
    this.orgId = orgId;
  }

  public OpenAppDTO orgName(@Nullable String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * 组织名称，应用所属组织的显示名称
   * @return orgName
   */
  
  @Schema(name = "orgName", description = "组织名称，应用所属组织的显示名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgName")
  public @Nullable String getOrgName() {
    return orgName;
  }

  public void setOrgName(@Nullable String orgName) {
    this.orgName = orgName;
  }

  public OpenAppDTO ownerName(@Nullable String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * 应用负责人姓名，应用的主要负责人
   * @return ownerName
   */
  
  @Schema(name = "ownerName", description = "应用负责人姓名，应用的主要负责人", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerName")
  public @Nullable String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(@Nullable String ownerName) {
    this.ownerName = ownerName;
  }

  public OpenAppDTO ownerEmail(@Nullable String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * 应用负责人邮箱地址，用于接收应用相关通知
   * @return ownerEmail
   */
  
  @Schema(name = "ownerEmail", description = "应用负责人邮箱地址，用于接收应用相关通知", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerEmail")
  public @Nullable String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(@Nullable String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAppDTO openAppDTO = (OpenAppDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, openAppDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, openAppDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedTime, openAppDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openAppDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.name, openAppDTO.name) &&
        Objects.equals(this.appId, openAppDTO.appId) &&
        Objects.equals(this.orgId, openAppDTO.orgId) &&
        Objects.equals(this.orgName, openAppDTO.orgName) &&
        Objects.equals(this.ownerName, openAppDTO.ownerName) &&
        Objects.equals(this.ownerEmail, openAppDTO.ownerEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedTime, dataChangeLastModifiedTime, name, appId, orgId, orgName, ownerName, ownerEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAppDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
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

