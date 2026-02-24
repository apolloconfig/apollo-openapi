package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenReleaseChangeDTO;
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
 * OpenReleaseDiffDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenReleaseDiffDTO {

  @Valid
  private List<@Valid OpenReleaseChangeDTO> changes;

  public OpenReleaseDiffDTO changes(List<@Valid OpenReleaseChangeDTO> changes) {
    this.changes = changes;
    return this;
  }

  public OpenReleaseDiffDTO addChangesItem(OpenReleaseChangeDTO changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

  /**
   * A list of changes, ensuring order if necessary.
   * @return changes
  */
  @Valid
  @Schema(name = "changes", description = "A list of changes, ensuring order if necessary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changes")
  public List<@Valid OpenReleaseChangeDTO> getChanges() {
    return changes;
  }

  public void setChanges(List<@Valid OpenReleaseChangeDTO> changes) {
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
    OpenReleaseDiffDTO openReleaseDiffDTO = (OpenReleaseDiffDTO) o;
    return Objects.equals(this.changes, openReleaseDiffDTO.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenReleaseDiffDTO {\n");
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
