package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemDTO;
import com.apollo.openapi.server.model.OpenNamespaceIdentifier;
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
 * OpenNamespaceSyncModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenNamespaceSyncModel {

  @Valid
  private List<@Valid OpenNamespaceIdentifier> syncToNamespaces;

  @Valid
  private List<@Valid OpenItemDTO> syncItems;

  public OpenNamespaceSyncModel syncToNamespaces(List<@Valid OpenNamespaceIdentifier> syncToNamespaces) {
    this.syncToNamespaces = syncToNamespaces;
    return this;
  }

  public OpenNamespaceSyncModel addSyncToNamespacesItem(OpenNamespaceIdentifier syncToNamespacesItem) {
    if (this.syncToNamespaces == null) {
      this.syncToNamespaces = new ArrayList<>();
    }
    this.syncToNamespaces.add(syncToNamespacesItem);
    return this;
  }

  /**
   * 目标命名空间标识列表
   * @return syncToNamespaces
  */
  @Valid
  @Schema(name = "syncToNamespaces", description = "目标命名空间标识列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncToNamespaces")
  public List<@Valid OpenNamespaceIdentifier> getSyncToNamespaces() {
    return syncToNamespaces;
  }

  public void setSyncToNamespaces(List<@Valid OpenNamespaceIdentifier> syncToNamespaces) {
    this.syncToNamespaces = syncToNamespaces;
  }

  public OpenNamespaceSyncModel syncItems(List<@Valid OpenItemDTO> syncItems) {
    this.syncItems = syncItems;
    return this;
  }

  public OpenNamespaceSyncModel addSyncItemsItem(OpenItemDTO syncItemsItem) {
    if (this.syncItems == null) {
      this.syncItems = new ArrayList<>();
    }
    this.syncItems.add(syncItemsItem);
    return this;
  }

  /**
   * 需要同步的配置项列表
   * @return syncItems
  */
  @Valid
  @Schema(name = "syncItems", description = "需要同步的配置项列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncItems")
  public List<@Valid OpenItemDTO> getSyncItems() {
    return syncItems;
  }

  public void setSyncItems(List<@Valid OpenItemDTO> syncItems) {
    this.syncItems = syncItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenNamespaceSyncModel openNamespaceSyncModel = (OpenNamespaceSyncModel) o;
    return Objects.equals(this.syncToNamespaces, openNamespaceSyncModel.syncToNamespaces) &&
        Objects.equals(this.syncItems, openNamespaceSyncModel.syncItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncToNamespaces, syncItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceSyncModel {\n");
    sb.append("    syncToNamespaces: ").append(toIndentedString(syncToNamespaces)).append("\n");
    sb.append("    syncItems: ").append(toIndentedString(syncItems)).append("\n");
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
