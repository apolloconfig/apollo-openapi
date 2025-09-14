package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.ItemDTO;
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
 * ItemChangeSets
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class ItemChangeSets {

  private @Nullable String dataChangeCreatedBy;

  private @Nullable String dataChangeLastModifiedBy;

  private @Nullable String dataChangeCreatedByDisplayName;

  private @Nullable String dataChangeLastModifiedByDisplayName;

  private @Nullable String dataChangeCreatedTime;

  private @Nullable String dataChangeLastModifiedTime;

  @Valid
  private List<@Valid ItemDTO> createItems = new ArrayList<>();

  @Valid
  private List<@Valid ItemDTO> updateItems = new ArrayList<>();

  @Valid
  private List<@Valid ItemDTO> deleteItems = new ArrayList<>();

  public ItemChangeSets dataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 
   * @return dataChangeCreatedBy
   */
  
  @Schema(name = "dataChangeCreatedBy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public @Nullable String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(@Nullable String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public ItemChangeSets dataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 
   * @return dataChangeLastModifiedBy
   */
  
  @Schema(name = "dataChangeLastModifiedBy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public @Nullable String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(@Nullable String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public ItemChangeSets dataChangeCreatedByDisplayName(@Nullable String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
    return this;
  }

  /**
   * 
   * @return dataChangeCreatedByDisplayName
   */
  
  @Schema(name = "dataChangeCreatedByDisplayName", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedByDisplayName")
  public @Nullable String getDataChangeCreatedByDisplayName() {
    return dataChangeCreatedByDisplayName;
  }

  public void setDataChangeCreatedByDisplayName(@Nullable String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
  }

  public ItemChangeSets dataChangeLastModifiedByDisplayName(@Nullable String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
    return this;
  }

  /**
   * 
   * @return dataChangeLastModifiedByDisplayName
   */
  
  @Schema(name = "dataChangeLastModifiedByDisplayName", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedByDisplayName")
  public @Nullable String getDataChangeLastModifiedByDisplayName() {
    return dataChangeLastModifiedByDisplayName;
  }

  public void setDataChangeLastModifiedByDisplayName(@Nullable String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
  }

  public ItemChangeSets dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 
   * @return dataChangeCreatedTime
   */
  
  @Schema(name = "dataChangeCreatedTime", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public @Nullable String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public ItemChangeSets dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 
   * @return dataChangeLastModifiedTime
   */
  
  @Schema(name = "dataChangeLastModifiedTime", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public @Nullable String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public ItemChangeSets createItems(List<@Valid ItemDTO> createItems) {
    this.createItems = createItems;
    return this;
  }

  public ItemChangeSets addCreateItemsItem(ItemDTO createItemsItem) {
    if (this.createItems == null) {
      this.createItems = new ArrayList<>();
    }
    this.createItems.add(createItemsItem);
    return this;
  }

  /**
   * 
   * @return createItems
   */
  @Valid 
  @Schema(name = "createItems", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createItems")
  public List<@Valid ItemDTO> getCreateItems() {
    return createItems;
  }

  public void setCreateItems(List<@Valid ItemDTO> createItems) {
    this.createItems = createItems;
  }

  public ItemChangeSets updateItems(List<@Valid ItemDTO> updateItems) {
    this.updateItems = updateItems;
    return this;
  }

  public ItemChangeSets addUpdateItemsItem(ItemDTO updateItemsItem) {
    if (this.updateItems == null) {
      this.updateItems = new ArrayList<>();
    }
    this.updateItems.add(updateItemsItem);
    return this;
  }

  /**
   * 
   * @return updateItems
   */
  @Valid 
  @Schema(name = "updateItems", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateItems")
  public List<@Valid ItemDTO> getUpdateItems() {
    return updateItems;
  }

  public void setUpdateItems(List<@Valid ItemDTO> updateItems) {
    this.updateItems = updateItems;
  }

  public ItemChangeSets deleteItems(List<@Valid ItemDTO> deleteItems) {
    this.deleteItems = deleteItems;
    return this;
  }

  public ItemChangeSets addDeleteItemsItem(ItemDTO deleteItemsItem) {
    if (this.deleteItems == null) {
      this.deleteItems = new ArrayList<>();
    }
    this.deleteItems.add(deleteItemsItem);
    return this;
  }

  /**
   * 
   * @return deleteItems
   */
  @Valid 
  @Schema(name = "deleteItems", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleteItems")
  public List<@Valid ItemDTO> getDeleteItems() {
    return deleteItems;
  }

  public void setDeleteItems(List<@Valid ItemDTO> deleteItems) {
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
    ItemChangeSets itemChangeSets = (ItemChangeSets) o;
    return Objects.equals(this.dataChangeCreatedBy, itemChangeSets.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, itemChangeSets.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedByDisplayName, itemChangeSets.dataChangeCreatedByDisplayName) &&
        Objects.equals(this.dataChangeLastModifiedByDisplayName, itemChangeSets.dataChangeLastModifiedByDisplayName) &&
        Objects.equals(this.dataChangeCreatedTime, itemChangeSets.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, itemChangeSets.dataChangeLastModifiedTime) &&
        Objects.equals(this.createItems, itemChangeSets.createItems) &&
        Objects.equals(this.updateItems, itemChangeSets.updateItems) &&
        Objects.equals(this.deleteItems, itemChangeSets.deleteItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedByDisplayName, dataChangeLastModifiedByDisplayName, dataChangeCreatedTime, dataChangeLastModifiedTime, createItems, updateItems, deleteItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemChangeSets {\n");
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

