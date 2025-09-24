package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemChangeSets;
import com.apollo.openapi.server.model.OpenNamespaceIdentifier;
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
 * OpenItemDiffs
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-25T00:40:29.983824+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenItemDiffs {

  private @Nullable OpenNamespaceIdentifier namespace;

  private @Nullable OpenItemChangeSets diffs;

  private @Nullable String extInfo;

  public OpenItemDiffs namespace(@Nullable OpenNamespaceIdentifier namespace) {
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
  public @Nullable OpenNamespaceIdentifier getNamespace() {
    return namespace;
  }

  public void setNamespace(@Nullable OpenNamespaceIdentifier namespace) {
    this.namespace = namespace;
  }

  public OpenItemDiffs diffs(@Nullable OpenItemChangeSets diffs) {
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
  public @Nullable OpenItemChangeSets getDiffs() {
    return diffs;
  }

  public void setDiffs(@Nullable OpenItemChangeSets diffs) {
    this.diffs = diffs;
  }

  public OpenItemDiffs extInfo(@Nullable String extInfo) {
    this.extInfo = extInfo;
    return this;
  }

  /**
   * 扩展信息
   * @return extInfo
   */

  @Schema(name = "extInfo", description = "扩展信息", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OpenItemDiffs openItemDiffs = (OpenItemDiffs) o;
    return Objects.equals(this.namespace, openItemDiffs.namespace) &&
        Objects.equals(this.diffs, openItemDiffs.diffs) &&
        Objects.equals(this.extInfo, openItemDiffs.extInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, diffs, extInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenItemDiffs {\n");
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
