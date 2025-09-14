package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenReleaseDTO;
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
 * OpenInstanceConfigDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenInstanceConfigDTO {

  private @Nullable OpenReleaseDTO release;

  private @Nullable String releaseDeliveryTime;

  private @Nullable String dataChangeLastModifiedTime;

  public OpenInstanceConfigDTO release(@Nullable OpenReleaseDTO release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   */
  @Valid 
  @Schema(name = "release", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("release")
  public @Nullable OpenReleaseDTO getRelease() {
    return release;
  }

  public void setRelease(@Nullable OpenReleaseDTO release) {
    this.release = release;
  }

  public OpenInstanceConfigDTO releaseDeliveryTime(@Nullable String releaseDeliveryTime) {
    this.releaseDeliveryTime = releaseDeliveryTime;
    return this;
  }

  /**
   * 
   * @return releaseDeliveryTime
   */
  
  @Schema(name = "releaseDeliveryTime", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDeliveryTime")
  public @Nullable String getReleaseDeliveryTime() {
    return releaseDeliveryTime;
  }

  public void setReleaseDeliveryTime(@Nullable String releaseDeliveryTime) {
    this.releaseDeliveryTime = releaseDeliveryTime;
  }

  public OpenInstanceConfigDTO dataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 
   * @return dataChangeLastModifiedTime
   */
  
  @Schema(name = "dataChangeLastModifiedTime", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public @Nullable String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(@Nullable String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInstanceConfigDTO openInstanceConfigDTO = (OpenInstanceConfigDTO) o;
    return Objects.equals(this.release, openInstanceConfigDTO.release) &&
        Objects.equals(this.releaseDeliveryTime, openInstanceConfigDTO.releaseDeliveryTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openInstanceConfigDTO.dataChangeLastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(release, releaseDeliveryTime, dataChangeLastModifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInstanceConfigDTO {\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    releaseDeliveryTime: ").append(toIndentedString(releaseDeliveryTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
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

