package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemChangeSets;
import com.apollo.openapi.server.model.OpenNamespaceIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenItemDiffs {

  private OpenNamespaceIdentifier namespace;

  private OpenItemChangeSets diffs;

  private String extInfo;

  public OpenItemDiffs namespace(OpenNamespaceIdentifier namespace) {
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
  public OpenNamespaceIdentifier getNamespace() {
    return namespace;
  }

  public void setNamespace(OpenNamespaceIdentifier namespace) {
    this.namespace = namespace;
  }

  public OpenItemDiffs diffs(OpenItemChangeSets diffs) {
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
  public OpenItemChangeSets getDiffs() {
    return diffs;
  }

  public void setDiffs(OpenItemChangeSets diffs) {
    this.diffs = diffs;
  }

  public OpenItemDiffs extInfo(String extInfo) {
    this.extInfo = extInfo;
    return this;
  }

  /**
   * 扩展信息
   * @return extInfo
  */

  @Schema(name = "extInfo", description = "扩展信息", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extInfo")
  public String getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(String extInfo) {
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
