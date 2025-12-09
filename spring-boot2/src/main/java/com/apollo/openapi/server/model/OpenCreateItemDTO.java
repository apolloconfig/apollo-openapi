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
 * OpenCreateItemDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenCreateItemDTO {

  private String key;

  private Integer type;

  private String value;

  private String comment;

  public OpenCreateItemDTO key(String key) {
    this.key = key;
    return this;
  }

  /**
   * 配置项的键名，在同一命名空间内唯一标识一个配置项
   * @return key
  */

  @Schema(name = "key", description = "配置项的键名，在同一命名空间内唯一标识一个配置项", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OpenCreateItemDTO type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * 配置项类型，0表示普通配置项，1表示文件类型配置项
   * @return type
  */

  @Schema(name = "type", description = "配置项类型，0表示普通配置项，1表示文件类型配置项", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public OpenCreateItemDTO value(String value) {
    this.value = value;
    return this;
  }

  /**
   * 配置项的值，可以是字符串、数字、JSON等格式
   * @return value
  */

  @Schema(name = "value", description = "配置项的值，可以是字符串、数字、JSON等格式", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OpenCreateItemDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 配置项的注释说明，用于描述配置项的用途和含义
   * @return comment
  */

  @Schema(name = "comment", description = "配置项的注释说明，用于描述配置项的用途和含义", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenCreateItemDTO openCreateItemDTO = (OpenCreateItemDTO) o;
    return Objects.equals(this.key, openCreateItemDTO.key) &&
        Objects.equals(this.type, openCreateItemDTO.type) &&
        Objects.equals(this.value, openCreateItemDTO.value) &&
        Objects.equals(this.comment, openCreateItemDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, value, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCreateItemDTO {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
