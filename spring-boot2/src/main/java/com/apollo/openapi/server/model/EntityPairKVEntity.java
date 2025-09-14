package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.KVEntity;
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
 * EntityPairKVEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class EntityPairKVEntity {

  private @Nullable KVEntity firstEntity;

  private @Nullable KVEntity secondEntity;

  public EntityPairKVEntity firstEntity(@Nullable KVEntity firstEntity) {
    this.firstEntity = firstEntity;
    return this;
  }

  /**
   * Get firstEntity
   * @return firstEntity
   */
  @Valid 
  @Schema(name = "firstEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstEntity")
  public @Nullable KVEntity getFirstEntity() {
    return firstEntity;
  }

  public void setFirstEntity(@Nullable KVEntity firstEntity) {
    this.firstEntity = firstEntity;
  }

  public EntityPairKVEntity secondEntity(@Nullable KVEntity secondEntity) {
    this.secondEntity = secondEntity;
    return this;
  }

  /**
   * Get secondEntity
   * @return secondEntity
   */
  @Valid 
  @Schema(name = "secondEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondEntity")
  public @Nullable KVEntity getSecondEntity() {
    return secondEntity;
  }

  public void setSecondEntity(@Nullable KVEntity secondEntity) {
    this.secondEntity = secondEntity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityPairKVEntity entityPairKVEntity = (EntityPairKVEntity) o;
    return Objects.equals(this.firstEntity, entityPairKVEntity.firstEntity) &&
        Objects.equals(this.secondEntity, entityPairKVEntity.secondEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstEntity, secondEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityPairKVEntity {\n");
    sb.append("    firstEntity: ").append(toIndentedString(firstEntity)).append("\n");
    sb.append("    secondEntity: ").append(toIndentedString(secondEntity)).append("\n");
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

