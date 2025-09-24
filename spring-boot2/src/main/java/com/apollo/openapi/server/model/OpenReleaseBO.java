package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.KVEntity;
import com.apollo.openapi.server.model.OpenReleaseDTO;
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
 * OpenReleaseBO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-25T00:40:29.983824+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenReleaseBO {

  private @Nullable OpenReleaseDTO baseInfo;

  @Valid
  private List<@Valid KVEntity> items = new ArrayList<>();

  public OpenReleaseBO baseInfo(@Nullable OpenReleaseDTO baseInfo) {
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
  public @Nullable OpenReleaseDTO getBaseInfo() {
    return baseInfo;
  }

  public void setBaseInfo(@Nullable OpenReleaseDTO baseInfo) {
    this.baseInfo = baseInfo;
  }

  public OpenReleaseBO items(List<@Valid KVEntity> items) {
    this.items = items;
    return this;
  }

  public OpenReleaseBO addItemsItem(KVEntity itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OpenReleaseBO openReleaseBO = (OpenReleaseBO) o;
    return Objects.equals(this.baseInfo, openReleaseBO.baseInfo) &&
        Objects.equals(this.items, openReleaseBO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseInfo, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenReleaseBO {\n");
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
