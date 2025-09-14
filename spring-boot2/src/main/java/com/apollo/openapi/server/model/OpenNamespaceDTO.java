package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项
 */

@Schema(name = "OpenNamespaceDTO", description = "Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenNamespaceDTO {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  private @Nullable String appId;

  private @Nullable String clusterName;

  private @Nullable String namespaceName;

  private @Nullable String comment;

  private @Nullable String format;

  private @Nullable Boolean isPublic;

  @Valid
  private List<@Valid OpenItemDTO> items = new ArrayList<>();

  public OpenNamespaceDTO dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 命名空间创建者用户名，记录是谁创建了这个命名空间
   * @return dataChangeCreatedBy
   */
  
  @Schema(name = "dataChangeCreatedBy", description = "命名空间创建者用户名，记录是谁创建了这个命名空间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public @Nullable String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenNamespaceDTO dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
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

  public OpenNamespaceDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
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

  public OpenNamespaceDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
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

  public OpenNamespaceDTO appId(@Nullable String appId) {
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

  public OpenNamespaceDTO clusterName(@Nullable String clusterName) {
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

  public OpenNamespaceDTO namespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 命名空间名称，在同一应用和集群下唯一标识一个命名空间
   * @return namespaceName
   */
  
  @Schema(name = "namespaceName", description = "命名空间名称，在同一应用和集群下唯一标识一个命名空间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public @Nullable String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public OpenNamespaceDTO comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 命名空间备注说明，描述命名空间的用途
   * @return comment
   */
  
  @Schema(name = "comment", description = "命名空间备注说明，描述命名空间的用途", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  public OpenNamespaceDTO format(@Nullable String format) {
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

  public OpenNamespaceDTO isPublic(@Nullable Boolean isPublic) {
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

  public OpenNamespaceDTO items(List<@Valid OpenItemDTO> items) {
    this.items = items;
    return this;
  }

  public OpenNamespaceDTO addItemsItem(OpenItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * 命名空间包含的配置项列表
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "命名空间包含的配置项列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid OpenItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OpenItemDTO> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenNamespaceDTO openNamespaceDTO = (OpenNamespaceDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, openNamespaceDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, openNamespaceDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedTime, openNamespaceDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openNamespaceDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.appId, openNamespaceDTO.appId) &&
        Objects.equals(this.clusterName, openNamespaceDTO.clusterName) &&
        Objects.equals(this.namespaceName, openNamespaceDTO.namespaceName) &&
        Objects.equals(this.comment, openNamespaceDTO.comment) &&
        Objects.equals(this.format, openNamespaceDTO.format) &&
        Objects.equals(this.isPublic, openNamespaceDTO.isPublic) &&
        Objects.equals(this.items, openNamespaceDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedTime, dataChangeLastModifiedTime, appId, clusterName, namespaceName, comment, format, isPublic, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

