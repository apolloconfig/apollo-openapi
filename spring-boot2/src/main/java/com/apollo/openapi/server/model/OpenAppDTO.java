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
 * Apollo应用信息数据传输对象，包含应用的基本信息和元数据
 */

@Schema(name = "OpenAppDTO", description = "Apollo应用信息数据传输对象，包含应用的基本信息和元数据")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenAppDTO {

  private String dataChangeCreatedBy;

  private String dataChangeLastModifiedBy;

  private String dataChangeCreatedTime;

  private String dataChangeLastModifiedTime;

  private String name;

  private String appId;

  private String orgId;

  private String orgName;

  private String ownerName;

  private String ownerEmail;

  private String ownerDisplayName;

  public OpenAppDTO dataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 数据创建者用户名，记录是谁创建了这个应用
   * @return dataChangeCreatedBy
  */

  @Schema(name = "dataChangeCreatedBy", description = "数据创建者用户名，记录是谁创建了这个应用", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenAppDTO dataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 数据最后修改者用户名，记录最后一次修改应用信息的用户
   * @return dataChangeLastModifiedBy
  */

  @Schema(name = "dataChangeLastModifiedBy", description = "数据最后修改者用户名，记录最后一次修改应用信息的用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenAppDTO dataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 数据创建时间，ISO 8601格式的时间戳
   * @return dataChangeCreatedTime
  */

  @Schema(name = "dataChangeCreatedTime", example = "2025-09-29T12:34:56Z", description = "数据创建时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenAppDTO dataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 数据最后修改时间，ISO 8601格式的时间戳
   * @return dataChangeLastModifiedTime
  */

  @Schema(name = "dataChangeLastModifiedTime", example = "2025-09-29T12:34:56Z", description = "数据最后修改时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenAppDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 应用名称，用于显示的友好名称
   * @return name
  */

  @Schema(name = "name", description = "应用名称，用于显示的友好名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpenAppDTO appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 应用唯一标识符，全局唯一的应用ID
   * @return appId
  */

  @Schema(name = "appId", description = "应用唯一标识符，全局唯一的应用ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenAppDTO orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * 组织ID，应用所属组织的唯一标识
   * @return orgId
  */

  @Schema(name = "orgId", description = "组织ID，应用所属组织的唯一标识", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgId")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public OpenAppDTO orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * 组织名称，应用所属组织的显示名称
   * @return orgName
  */

  @Schema(name = "orgName", description = "组织名称，应用所属组织的显示名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgName")
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public OpenAppDTO ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * 应用负责人姓名，应用的主要负责人
   * @return ownerName
  */

  @Schema(name = "ownerName", description = "应用负责人姓名，应用的主要负责人", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerName")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public OpenAppDTO ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * 应用负责人邮箱地址，用于接收应用相关通知
   * @return ownerEmail
  */

  @Schema(name = "ownerEmail", description = "应用负责人邮箱地址，用于接收应用相关通知", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerEmail")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public OpenAppDTO ownerDisplayName(String ownerDisplayName) {
    this.ownerDisplayName = ownerDisplayName;
    return this;
  }

  /**
   * Get ownerDisplayName
   * @return ownerDisplayName
  */

  @Schema(name = "ownerDisplayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerDisplayName")
  public String getOwnerDisplayName() {
    return ownerDisplayName;
  }

  public void setOwnerDisplayName(String ownerDisplayName) {
    this.ownerDisplayName = ownerDisplayName;
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
        Objects.equals(this.ownerEmail, openAppDTO.ownerEmail) &&
        Objects.equals(this.ownerDisplayName, openAppDTO.ownerDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedTime, dataChangeLastModifiedTime, name, appId, orgId, orgName, ownerName, ownerEmail, ownerDisplayName);
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
    sb.append("    ownerDisplayName: ").append(toIndentedString(ownerDisplayName)).append("\n");
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
