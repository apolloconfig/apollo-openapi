package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpenItemChangeSets
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenItemChangeSets {

  private String dataChangeCreatedBy;

  private String dataChangeLastModifiedBy;

  private String dataChangeCreatedByDisplayName;

  private String dataChangeLastModifiedByDisplayName;

  private String dataChangeCreatedTime;

  private String dataChangeLastModifiedTime;

  @Valid
  private List<@Valid OpenItemDTO> createItems = null;

  @Valid
  private List<@Valid OpenItemDTO> updateItems = null;

  @Valid
  private List<@Valid OpenItemDTO> deleteItems = null;

  public OpenItemChangeSets dataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 变更集合创建者用户名
   * @return dataChangeCreatedBy
  */

  @Schema(name = "dataChangeCreatedBy", description = "变更集合创建者用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenItemChangeSets dataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 变更集合最后修改者用户名
   * @return dataChangeLastModifiedBy
  */

  @Schema(name = "dataChangeLastModifiedBy", description = "变更集合最后修改者用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenItemChangeSets dataChangeCreatedByDisplayName(String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
    return this;
  }

  /**
   * 创建者显示名
   * @return dataChangeCreatedByDisplayName
  */

  @Schema(name = "dataChangeCreatedByDisplayName", description = "创建者显示名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedByDisplayName")
  public String getDataChangeCreatedByDisplayName() {
    return dataChangeCreatedByDisplayName;
  }

  public void setDataChangeCreatedByDisplayName(String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
  }

  public OpenItemChangeSets dataChangeLastModifiedByDisplayName(String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
    return this;
  }

  /**
   * 最后修改者显示名
   * @return dataChangeLastModifiedByDisplayName
  */

  @Schema(name = "dataChangeLastModifiedByDisplayName", description = "最后修改者显示名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedByDisplayName")
  public String getDataChangeLastModifiedByDisplayName() {
    return dataChangeLastModifiedByDisplayName;
  }

  public void setDataChangeLastModifiedByDisplayName(String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
  }

  public OpenItemChangeSets dataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 变更集合创建时间（ISO 8601）
   * @return dataChangeCreatedTime
  */

  @Schema(name = "dataChangeCreatedTime", example = "2025-09-29T12:34:56Z", description = "变更集合创建时间（ISO 8601）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenItemChangeSets dataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 变更集合最后修改时间（ISO 8601）
   * @return dataChangeLastModifiedTime
  */

  @Schema(name = "dataChangeLastModifiedTime", example = "2025-09-29T12:34:56Z", description = "变更集合最后修改时间（ISO 8601）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenItemChangeSets createItems(List<@Valid OpenItemDTO> createItems) {
    this.createItems = createItems;
    return this;
  }

  public OpenItemChangeSets addCreateItemsItem(OpenItemDTO createItemsItem) {
    if (this.createItems == null) {
      this.createItems = null;
    }
    this.createItems.add(createItemsItem);
    return this;
  }

  /**
   * 待创建的配置项列表
   * @return createItems
  */
  @Valid
  @Schema(name = "createItems", description = "待创建的配置项列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createItems")
  public List<@Valid OpenItemDTO> getCreateItems() {
    return createItems;
  }

  public void setCreateItems(List<@Valid OpenItemDTO> createItems) {
    this.createItems = createItems;
  }

  public OpenItemChangeSets updateItems(List<@Valid OpenItemDTO> updateItems) {
    this.updateItems = updateItems;
    return this;
  }

  public OpenItemChangeSets addUpdateItemsItem(OpenItemDTO updateItemsItem) {
    if (this.updateItems == null) {
      this.updateItems = null;
    }
    this.updateItems.add(updateItemsItem);
    return this;
  }

  /**
   * 待更新的配置项列表
   * @return updateItems
  */
  @Valid
  @Schema(name = "updateItems", description = "待更新的配置项列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateItems")
  public List<@Valid OpenItemDTO> getUpdateItems() {
    return updateItems;
  }

  public void setUpdateItems(List<@Valid OpenItemDTO> updateItems) {
    this.updateItems = updateItems;
  }

  public OpenItemChangeSets deleteItems(List<@Valid OpenItemDTO> deleteItems) {
    this.deleteItems = deleteItems;
    return this;
  }

  public OpenItemChangeSets addDeleteItemsItem(OpenItemDTO deleteItemsItem) {
    if (this.deleteItems == null) {
      this.deleteItems = null;
    }
    this.deleteItems.add(deleteItemsItem);
    return this;
  }

  /**
   * 待删除的配置项列表
   * @return deleteItems
  */
  @Valid
  @Schema(name = "deleteItems", description = "待删除的配置项列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleteItems")
  public List<@Valid OpenItemDTO> getDeleteItems() {
    return deleteItems;
  }

  public void setDeleteItems(List<@Valid OpenItemDTO> deleteItems) {
    this.deleteItems = deleteItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenItemChangeSets openItemChangeSets = (OpenItemChangeSets) o;
    return Objects.equals(this.dataChangeCreatedBy, openItemChangeSets.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, openItemChangeSets.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedByDisplayName, openItemChangeSets.dataChangeCreatedByDisplayName) &&
        Objects.equals(this.dataChangeLastModifiedByDisplayName, openItemChangeSets.dataChangeLastModifiedByDisplayName) &&
        Objects.equals(this.dataChangeCreatedTime, openItemChangeSets.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openItemChangeSets.dataChangeLastModifiedTime) &&
        Objects.equals(this.createItems, openItemChangeSets.createItems) &&
        Objects.equals(this.updateItems, openItemChangeSets.updateItems) &&
        Objects.equals(this.deleteItems, openItemChangeSets.deleteItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedByDisplayName, dataChangeLastModifiedByDisplayName, dataChangeCreatedTime, dataChangeLastModifiedTime, createItems, updateItems, deleteItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenItemChangeSets {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedByDisplayName: ").append(toIndentedString(dataChangeCreatedByDisplayName)).append("\n");
    sb.append("    dataChangeLastModifiedByDisplayName: ").append(toIndentedString(dataChangeLastModifiedByDisplayName)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    createItems: ").append(toIndentedString(createItems)).append("\n");
    sb.append("    updateItems: ").append(toIndentedString(updateItems)).append("\n");
    sb.append("    deleteItems: ").append(toIndentedString(deleteItems)).append("\n");
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
