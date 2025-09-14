package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.Change;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OpenapiV1EnvsEnvReleasesCompareGet200Response
 */

@JsonTypeName("_openapi_v1_envs__env__releases_compare_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenapiV1EnvsEnvReleasesCompareGet200Response {

  @Valid
  private List<@Valid Change> changes = new ArrayList<>();

  public OpenapiV1EnvsEnvReleasesCompareGet200Response changes(List<@Valid Change> changes) {
    this.changes = changes;
    return this;
  }

  public OpenapiV1EnvsEnvReleasesCompareGet200Response addChangesItem(Change changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

  /**
   * Get changes
   * @return changes
   */
  @Valid 
  @Schema(name = "changes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changes")
  public List<@Valid Change> getChanges() {
    return changes;
  }

  public void setChanges(List<@Valid Change> changes) {
    this.changes = changes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiV1EnvsEnvReleasesCompareGet200Response openapiV1EnvsEnvReleasesCompareGet200Response = (OpenapiV1EnvsEnvReleasesCompareGet200Response) o;
    return Objects.equals(this.changes, openapiV1EnvsEnvReleasesCompareGet200Response.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiV1EnvsEnvReleasesCompareGet200Response {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

