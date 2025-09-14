package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.MapString;
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
 * Apollo发布信息数据传输对象，表示一次配置发布的完整信息
 */

@Schema(name = "OpenReleaseDTO", description = "Apollo发布信息数据传输对象，表示一次配置发布的完整信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenReleaseDTO {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  private @Nullable Long id;

  private @Nullable String appId;

  private @Nullable String clusterName;

  private @Nullable String namespaceName;

  private @Nullable String name;

  private @Nullable MapString configurations;

  private @Nullable String comment;

  public OpenReleaseDTO dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 发布创建者用户名，记录是谁创建了这次发布
   * @return dataChangeCreatedBy
   */
  
  @Schema(name = "dataChangeCreatedBy", description = "发布创建者用户名，记录是谁创建了这次发布", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public @Nullable String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenReleaseDTO dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 发布最后修改者用户名，记录最后一次修改发布信息的用户
   * @return dataChangeLastModifiedBy
   */
  
  @Schema(name = "dataChangeLastModifiedBy", description = "发布最后修改者用户名，记录最后一次修改发布信息的用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public @Nullable String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenReleaseDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 发布创建时间，ISO 8601格式的时间戳
   * @return dataChangeCreatedTime
   */
  
  @Schema(name = "dataChangeCreatedTime", description = "发布创建时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public @Nullable String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenReleaseDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 发布最后修改时间，ISO 8601格式的时间戳
   * @return dataChangeLastModifiedTime
   */
  
  @Schema(name = "dataChangeLastModifiedTime", description = "发布最后修改时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public @Nullable String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenReleaseDTO id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * 发布记录的唯一标识符，系统自动生成
   * @return id
   */
  
  @Schema(name = "id", description = "发布记录的唯一标识符，系统自动生成", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public OpenReleaseDTO appId(@Nullable String appId) {
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

  public OpenReleaseDTO clusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 所属集群的名称
   * @return clusterName
   */
  
  @Schema(name = "clusterName", description = "所属集群的名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public @Nullable String getClusterName() {
    return clusterName;
  }

  public void setClusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
  }

  public OpenReleaseDTO namespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 所属命名空间的名称
   * @return namespaceName
   */
  
  @Schema(name = "namespaceName", description = "所属命名空间的名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public @Nullable String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public OpenReleaseDTO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * 发布名称，用于标识这次发布的版本或描述
   * @return name
   */
  
  @Schema(name = "name", description = "发布名称，用于标识这次发布的版本或描述", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public OpenReleaseDTO configurations(@Nullable MapString configurations) {
    this.configurations = configurations;
    return this;
  }

  /**
   * Get configurations
   * @return configurations
   */
  @Valid 
  @Schema(name = "configurations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configurations")
  public @Nullable MapString getConfigurations() {
    return configurations;
  }

  public void setConfigurations(@Nullable MapString configurations) {
    this.configurations = configurations;
  }

  public OpenReleaseDTO comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 发布备注，描述本次发布的变更内容和目的
   * @return comment
   */
  
  @Schema(name = "comment", description = "发布备注，描述本次发布的变更内容和目的", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OpenReleaseDTO openReleaseDTO = (OpenReleaseDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, openReleaseDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, openReleaseDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedTime, openReleaseDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openReleaseDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.id, openReleaseDTO.id) &&
        Objects.equals(this.appId, openReleaseDTO.appId) &&
        Objects.equals(this.clusterName, openReleaseDTO.clusterName) &&
        Objects.equals(this.namespaceName, openReleaseDTO.namespaceName) &&
        Objects.equals(this.name, openReleaseDTO.name) &&
        Objects.equals(this.configurations, openReleaseDTO.configurations) &&
        Objects.equals(this.comment, openReleaseDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedTime, dataChangeLastModifiedTime, id, appId, clusterName, namespaceName, name, configurations, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenReleaseDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

