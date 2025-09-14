package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.ItemChangeSets;
import com.apollo.openapi.server.model.NamespaceIdentifier;
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
 * ListItemDiffs
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class ListItemDiffs {

  private @Nullable NamespaceIdentifier namespace;

  private @Nullable ItemChangeSets diffs;

  private @Nullable String extInfo;

  public ListItemDiffs namespace(@Nullable NamespaceIdentifier namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @Valid 
  @Schema(name = "namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespace")
  public @Nullable NamespaceIdentifier getNamespace() {
    return namespace;
  }

  public void setNamespace(@Nullable NamespaceIdentifier namespace) {
    this.namespace = namespace;
  }

  public ListItemDiffs diffs(@Nullable ItemChangeSets diffs) {
    this.diffs = diffs;
    return this;
  }

  /**
   * Get diffs
   * @return diffs
   */
  @Valid 
  @Schema(name = "diffs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diffs")
  public @Nullable ItemChangeSets getDiffs() {
    return diffs;
  }

  public void setDiffs(@Nullable ItemChangeSets diffs) {
    this.diffs = diffs;
  }

  public ListItemDiffs extInfo(@Nullable String extInfo) {
    this.extInfo = extInfo;
    return this;
  }

  /**
   * 
   * @return extInfo
   */
  
  @Schema(name = "extInfo", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extInfo")
  public @Nullable String getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(@Nullable String extInfo) {
    this.extInfo = extInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItemDiffs listItemDiffs = (ListItemDiffs) o;
    return Objects.equals(this.namespace, listItemDiffs.namespace) &&
        Objects.equals(this.diffs, listItemDiffs.diffs) &&
        Objects.equals(this.extInfo, listItemDiffs.extInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, diffs, extInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItemDiffs {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    diffs: ").append(toIndentedString(diffs)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
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

