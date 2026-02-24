package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
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
 * OpenPermissionConditionDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenPermissionConditionDTO {

  private Boolean hasPermission;

  public OpenPermissionConditionDTO hasPermission(Boolean hasPermission) {
    this.hasPermission = hasPermission;
    return this;
  }

  /**
   *
   * @return hasPermission
  */

  @Schema(name = "hasPermission", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasPermission")
  public Boolean getHasPermission() {
    return hasPermission;
  }

  public void setHasPermission(Boolean hasPermission) {
    this.hasPermission = hasPermission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenPermissionConditionDTO openPermissionConditionDTO = (OpenPermissionConditionDTO) o;
    return Objects.equals(this.hasPermission, openPermissionConditionDTO.hasPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasPermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenPermissionConditionDTO {\n");
    sb.append("    hasPermission: ").append(toIndentedString(hasPermission)).append("\n");
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
