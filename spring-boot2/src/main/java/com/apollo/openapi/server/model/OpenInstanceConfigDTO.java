package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenReleaseDTO;
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
 * OpenInstanceConfigDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenInstanceConfigDTO {

  private OpenReleaseDTO release;

  private String releaseDeliveryTime;

  private String dataChangeLastModifiedTime;

  public OpenInstanceConfigDTO release(OpenReleaseDTO release) {
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
  public OpenReleaseDTO getRelease() {
    return release;
  }

  public void setRelease(OpenReleaseDTO release) {
    this.release = release;
  }

  public OpenInstanceConfigDTO releaseDeliveryTime(String releaseDeliveryTime) {
    this.releaseDeliveryTime = releaseDeliveryTime;
    return this;
  }

  /**
   * 配置下发时间（ISO 8601）
   * @return releaseDeliveryTime
  */

  @Schema(name = "releaseDeliveryTime", example = "2025-09-29T12:34:56Z", description = "配置下发时间（ISO 8601）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDeliveryTime")
  public String getReleaseDeliveryTime() {
    return releaseDeliveryTime;
  }

  public void setReleaseDeliveryTime(String releaseDeliveryTime) {
    this.releaseDeliveryTime = releaseDeliveryTime;
  }

  public OpenInstanceConfigDTO dataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 最后修改时间（ISO 8601）
   * @return dataChangeLastModifiedTime
  */

  @Schema(name = "dataChangeLastModifiedTime", example = "2025-09-29T12:34:56Z", description = "最后修改时间（ISO 8601）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
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
