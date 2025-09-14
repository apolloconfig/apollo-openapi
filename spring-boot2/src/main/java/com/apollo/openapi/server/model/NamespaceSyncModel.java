package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.ItemDTO;
import com.apollo.openapi.server.model.NamespaceIdentifier;
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
 * NamespaceSyncModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class NamespaceSyncModel {

  @Valid
  private List<@Valid NamespaceIdentifier> syncToNamespaces = new ArrayList<>();

  @Valid
  private List<@Valid ItemDTO> syncItems = new ArrayList<>();

  public NamespaceSyncModel syncToNamespaces(List<@Valid NamespaceIdentifier> syncToNamespaces) {
    this.syncToNamespaces = syncToNamespaces;
    return this;
  }

  public NamespaceSyncModel addSyncToNamespacesItem(NamespaceIdentifier syncToNamespacesItem) {
    if (this.syncToNamespaces == null) {
      this.syncToNamespaces = new ArrayList<>();
    }
    this.syncToNamespaces.add(syncToNamespacesItem);
    return this;
  }

  /**
   * 
   * @return syncToNamespaces
   */
  @Valid 
  @Schema(name = "syncToNamespaces", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncToNamespaces")
  public List<@Valid NamespaceIdentifier> getSyncToNamespaces() {
    return syncToNamespaces;
  }

  public void setSyncToNamespaces(List<@Valid NamespaceIdentifier> syncToNamespaces) {
    this.syncToNamespaces = syncToNamespaces;
  }

  public NamespaceSyncModel syncItems(List<@Valid ItemDTO> syncItems) {
    this.syncItems = syncItems;
    return this;
  }

  public NamespaceSyncModel addSyncItemsItem(ItemDTO syncItemsItem) {
    if (this.syncItems == null) {
      this.syncItems = new ArrayList<>();
    }
    this.syncItems.add(syncItemsItem);
    return this;
  }

  /**
   * 
   * @return syncItems
   */
  @Valid 
  @Schema(name = "syncItems", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncItems")
  public List<@Valid ItemDTO> getSyncItems() {
    return syncItems;
  }

  public void setSyncItems(List<@Valid ItemDTO> syncItems) {
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
    NamespaceSyncModel namespaceSyncModel = (NamespaceSyncModel) o;
    return Objects.equals(this.syncToNamespaces, namespaceSyncModel.syncToNamespaces) &&
        Objects.equals(this.syncItems, namespaceSyncModel.syncItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncToNamespaces, syncItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceSyncModel {\n");
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

