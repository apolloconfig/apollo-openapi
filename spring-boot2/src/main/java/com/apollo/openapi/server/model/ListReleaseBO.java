package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.KVEntity;
import com.apollo.openapi.server.model.ReleaseDTO;
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
 * ListReleaseBO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class ListReleaseBO {

  private @Nullable ReleaseDTO baseInfo;

  @Valid
  private List<@Valid KVEntity> items = new ArrayList<>();

  public ListReleaseBO baseInfo(@Nullable ReleaseDTO baseInfo) {
    this.baseInfo = baseInfo;
    return this;
  }

  /**
   * Get baseInfo
   * @return baseInfo
   */
  @Valid 
  @Schema(name = "baseInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseInfo")
  public @Nullable ReleaseDTO getBaseInfo() {
    return baseInfo;
  }

  public void setBaseInfo(@Nullable ReleaseDTO baseInfo) {
    this.baseInfo = baseInfo;
  }

  public ListReleaseBO items(List<@Valid KVEntity> items) {
    this.items = items;
    return this;
  }

  public ListReleaseBO addItemsItem(KVEntity itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * 
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid KVEntity> getItems() {
    return items;
  }

  public void setItems(List<@Valid KVEntity> items) {
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
    ListReleaseBO listReleaseBO = (ListReleaseBO) o;
    return Objects.equals(this.baseInfo, listReleaseBO.baseInfo) &&
        Objects.equals(this.items, listReleaseBO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseInfo, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListReleaseBO {\n");
    sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
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

