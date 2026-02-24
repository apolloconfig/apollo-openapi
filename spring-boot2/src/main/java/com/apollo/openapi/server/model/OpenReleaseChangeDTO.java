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
 * OpenReleaseChangeDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenReleaseChangeDTO {

  private String changeType;

  private String key;

  private String newValue;

  private String oldValue;

  public OpenReleaseChangeDTO changeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * 修改类型
   * @return changeType
  */

  @Schema(name = "changeType", description = "修改类型", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeType")
  public String getChangeType() {
    return changeType;
  }

  public void setChangeType(String changeType) {
    this.changeType = changeType;
  }

  public OpenReleaseChangeDTO key(String key) {
    this.key = key;
    return this;
  }

  /**
   * key
   * @return key
  */

  @Schema(name = "key", description = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OpenReleaseChangeDTO newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * new value
   * @return newValue
  */

  @Schema(name = "newValue", description = "new value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public OpenReleaseChangeDTO oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  /**
   * old value
   * @return oldValue
  */

  @Schema(name = "oldValue", description = "old value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oldValue")
  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenReleaseChangeDTO openReleaseChangeDTO = (OpenReleaseChangeDTO) o;
    return Objects.equals(this.changeType, openReleaseChangeDTO.changeType) &&
        Objects.equals(this.key, openReleaseChangeDTO.key) &&
        Objects.equals(this.newValue, openReleaseChangeDTO.newValue) &&
        Objects.equals(this.oldValue, openReleaseChangeDTO.oldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeType, key, newValue, oldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenReleaseChangeDTO {\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
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
