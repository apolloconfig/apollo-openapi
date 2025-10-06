package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.RichResponseEntity;
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
 * A response container holding multiple RichResponseEntity objects
 */

@Schema(name = "MultiResponseEntity", description = "A response container holding multiple RichResponseEntity objects")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class MultiResponseEntity {

  private Integer code;

  @Valid
  private List<@Valid RichResponseEntity> entities = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link MultiResponseEntity#MultiResponseEntity(Integer, List<@Valid RichResponseEntity>)}
   */
  @Deprecated
  public MultiResponseEntity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MultiResponseEntity(Integer code, List<@Valid RichResponseEntity> entities) {
    this.code = code;
    this.entities = entities;
  }

  public MultiResponseEntity code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Overall HTTP status code
   * @return code
  */
  @NotNull
  @Schema(name = "code", example = "200", description = "Overall HTTP status code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public MultiResponseEntity entities(List<@Valid RichResponseEntity> entities) {
    this.entities = entities;
    return this;
  }

  public MultiResponseEntity addEntitiesItem(RichResponseEntity entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * List of rich response entities
   * @return entities
  */
  @NotNull @Valid
  @Schema(name = "entities", description = "List of rich response entities", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entities")
  public List<@Valid RichResponseEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<@Valid RichResponseEntity> entities) {
    this.entities = entities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiResponseEntity multiResponseEntity = (MultiResponseEntity) o;
    return Objects.equals(this.code, multiResponseEntity.code) &&
        Objects.equals(this.entities, multiResponseEntity.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiResponseEntity {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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
