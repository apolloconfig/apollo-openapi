package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenReleaseDTO {

  private String dataChangeCreatedBy;

  private String dataChangeLastModifiedBy;

  private String dataChangeCreatedTime;

  private String dataChangeLastModifiedTime;

  private Long id;

  private String appId;

  private String clusterName;

  private String namespaceName;

  private String name;

  @Valid
  private Map<String, String> configurations = new HashMap<>();

  private String comment;

  public OpenReleaseDTO dataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 发布创建者用户名，记录是谁创建了这次发布
   * @return dataChangeCreatedBy
  */

  @Schema(name = "dataChangeCreatedBy", description = "发布创建者用户名，记录是谁创建了这次发布", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenReleaseDTO dataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 发布最后修改者用户名，记录最后一次修改发布信息的用户
   * @return dataChangeLastModifiedBy
  */

  @Schema(name = "dataChangeLastModifiedBy", description = "发布最后修改者用户名，记录最后一次修改发布信息的用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenReleaseDTO dataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 发布创建时间，ISO 8601格式的时间戳
   * @return dataChangeCreatedTime
  */

  @Schema(name = "dataChangeCreatedTime", example = "2025-09-29T12:34:56Z", description = "发布创建时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenReleaseDTO dataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 发布最后修改时间，ISO 8601格式的时间戳
   * @return dataChangeLastModifiedTime
  */

  @Schema(name = "dataChangeLastModifiedTime", example = "2025-09-29T12:34:56Z", description = "发布最后修改时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenReleaseDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 发布记录的唯一标识符，系统自动生成
   * @return id
  */

  @Schema(name = "id", description = "发布记录的唯一标识符，系统自动生成", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OpenReleaseDTO appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 所属应用的唯一标识符
   * @return appId
  */

  @Schema(name = "appId", description = "所属应用的唯一标识符", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenReleaseDTO clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 所属集群的名称
   * @return clusterName
  */

  @Schema(name = "clusterName", description = "所属集群的名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public OpenReleaseDTO namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 所属命名空间的名称
   * @return namespaceName
  */

  @Schema(name = "namespaceName", description = "所属命名空间的名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public OpenReleaseDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 发布名称，用于标识这次发布的版本或描述
   * @return name
  */

  @Schema(name = "name", description = "发布名称，用于标识这次发布的版本或描述", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpenReleaseDTO configurations(Map<String, String> configurations) {
    this.configurations = configurations;
    return this;
  }

  public OpenReleaseDTO putConfigurationsItem(String key, String configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new HashMap<>();
    }
    this.configurations.put(key, configurationsItem);
    return this;
  }

  /**
   * Get configurations
   * @return configurations
  */

  @Schema(name = "configurations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configurations")
  public Map<String, String> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(Map<String, String> configurations) {
    this.configurations = configurations;
  }

  public OpenReleaseDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 发布备注，描述本次发布的变更内容和目的
   * @return comment
  */

  @Schema(name = "comment", description = "发布备注，描述本次发布的变更内容和目的", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
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
