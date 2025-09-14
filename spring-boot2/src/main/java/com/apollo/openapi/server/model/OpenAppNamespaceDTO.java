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
 * Apollo应用命名空间数据传输对象，表示应用级别的命名空间配置信息
 */

@Schema(name = "OpenAppNamespaceDTO", description = "Apollo应用命名空间数据传输对象，表示应用级别的命名空间配置信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenAppNamespaceDTO {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  private @Nullable String name;

  private @Nullable String appId;

  private @Nullable String format;

  private @Nullable Boolean isPublic;

  private Boolean appendNamespacePrefix = true;

  private @Nullable String comment;

  public OpenAppNamespaceDTO dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 命名空间创建者用户名，记录是谁创建了这个应用命名空间
   * @return dataChangeCreatedBy
   */
  
  @Schema(name = "dataChangeCreatedBy", description = "命名空间创建者用户名，记录是谁创建了这个应用命名空间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public @Nullable String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenAppNamespaceDTO dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户
   * @return dataChangeLastModifiedBy
   */
  
  @Schema(name = "dataChangeLastModifiedBy", description = "命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public @Nullable String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenAppNamespaceDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 命名空间创建时间，ISO 8601格式的时间戳
   * @return dataChangeCreatedTime
   */
  
  @Schema(name = "dataChangeCreatedTime", description = "命名空间创建时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public @Nullable String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenAppNamespaceDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 命名空间最后修改时间，ISO 8601格式的时间戳
   * @return dataChangeLastModifiedTime
   */
  
  @Schema(name = "dataChangeLastModifiedTime", description = "命名空间最后修改时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public @Nullable String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenAppNamespaceDTO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * 命名空间名称，在同一应用内唯一标识一个命名空间
   * @return name
   */
  
  @Schema(name = "name", description = "命名空间名称，在同一应用内唯一标识一个命名空间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public OpenAppNamespaceDTO appId(@Nullable String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 所属应用的唯一标识符
   * @return appId
   */
  
  @Schema(name = "appId", description = "所属应用的唯一标识符", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public @Nullable String getAppId() {
    return appId;
  }

  public void setAppId(@Nullable String appId) {
    this.appId = appId;
  }

  public OpenAppNamespaceDTO format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * 命名空间格式类型，如properties、xml、json、yml等
   * @return format
   */
  
  @Schema(name = "format", description = "命名空间格式类型，如properties、xml、json、yml等", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public OpenAppNamespaceDTO isPublic(@Nullable Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * 是否为公共命名空间，公共命名空间可以被其他应用关联使用
   * @return isPublic
   */
  
  @Schema(name = "isPublic", description = "是否为公共命名空间，公共命名空间可以被其他应用关联使用", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPublic")
  public @Nullable Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(@Nullable Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public OpenAppNamespaceDTO appendNamespacePrefix(Boolean appendNamespacePrefix) {
    this.appendNamespacePrefix = appendNamespacePrefix;
    return this;
  }

  /**
   * 对于公共命名空间，是否在命名空间名称前添加前缀
   * @return appendNamespacePrefix
   */
  
  @Schema(name = "appendNamespacePrefix", description = "对于公共命名空间，是否在命名空间名称前添加前缀", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appendNamespacePrefix")
  public Boolean getAppendNamespacePrefix() {
    return appendNamespacePrefix;
  }

  public void setAppendNamespacePrefix(Boolean appendNamespacePrefix) {
    this.appendNamespacePrefix = appendNamespacePrefix;
  }

  public OpenAppNamespaceDTO comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 命名空间备注说明，描述命名空间的用途和包含的配置类型
   * @return comment
   */
  
  @Schema(name = "comment", description = "命名空间备注说明，描述命名空间的用途和包含的配置类型", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAppNamespaceDTO openAppNamespaceDTO = (OpenAppNamespaceDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, openAppNamespaceDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, openAppNamespaceDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedTime, openAppNamespaceDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openAppNamespaceDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.name, openAppNamespaceDTO.name) &&
        Objects.equals(this.appId, openAppNamespaceDTO.appId) &&
        Objects.equals(this.format, openAppNamespaceDTO.format) &&
        Objects.equals(this.isPublic, openAppNamespaceDTO.isPublic) &&
        Objects.equals(this.appendNamespacePrefix, openAppNamespaceDTO.appendNamespacePrefix) &&
        Objects.equals(this.comment, openAppNamespaceDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedTime, dataChangeLastModifiedTime, name, appId, format, isPublic, appendNamespacePrefix, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAppNamespaceDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    appendNamespacePrefix: ").append(toIndentedString(appendNamespacePrefix)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

