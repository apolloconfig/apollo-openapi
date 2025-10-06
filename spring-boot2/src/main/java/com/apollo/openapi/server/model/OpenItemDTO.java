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
 * Apollo配置项数据传输对象，表示一个具体的配置键值对及其元数据
 */

@Schema(name = "OpenItemDTO", description = "Apollo配置项数据传输对象，表示一个具体的配置键值对及其元数据")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenItemDTO {

  private String dataChangeCreatedBy;

  private String dataChangeLastModifiedBy;

  private String dataChangeCreatedTime;

  private String dataChangeLastModifiedTime;

  private String key;

  private Integer type;

  private String value;

  private String comment;

  public OpenItemDTO dataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 配置项创建者用户名，记录是谁创建了这个配置项
   * @return dataChangeCreatedBy
  */

  @Schema(name = "dataChangeCreatedBy", description = "配置项创建者用户名，记录是谁创建了这个配置项", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenItemDTO dataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 配置项最后修改者用户名，记录最后一次修改配置的用户
   * @return dataChangeLastModifiedBy
  */

  @Schema(name = "dataChangeLastModifiedBy", description = "配置项最后修改者用户名，记录最后一次修改配置的用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenItemDTO dataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 配置项创建时间，ISO 8601格式的时间戳
   * @return dataChangeCreatedTime
  */

  @Schema(name = "dataChangeCreatedTime", example = "2025-09-29T12:34:56Z", description = "配置项创建时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenItemDTO dataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 配置项最后修改时间，ISO 8601格式的时间戳
   * @return dataChangeLastModifiedTime
  */

  @Schema(name = "dataChangeLastModifiedTime", example = "2025-09-29T12:34:56Z", description = "配置项最后修改时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenItemDTO key(String key) {
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

  public OpenItemDTO type(Integer type) {
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

  public OpenItemDTO value(String value) {
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

  public OpenItemDTO comment(String comment) {
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
    OpenItemDTO openItemDTO = (OpenItemDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, openItemDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, openItemDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedTime, openItemDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openItemDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.key, openItemDTO.key) &&
        Objects.equals(this.type, openItemDTO.type) &&
        Objects.equals(this.value, openItemDTO.value) &&
        Objects.equals(this.comment, openItemDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedTime, dataChangeLastModifiedTime, key, type, value, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenItemDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
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
