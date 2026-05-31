package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemExtendDTO;
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
 * Apollo配置项核心数据对象，仅包含键值及基础审计信息
 */

@Schema(name = "OpenItemDTO", description = "Apollo配置项核心数据对象，仅包含键值及基础审计信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenItemDTO {

  private String key;

  private String value;

  private Integer type;

  private String comment;

  private Integer lineNum;

  private OpenItemExtendDTO extendInfo;

  private String dataChangeCreatedBy;

  private String dataChangeCreatedByDisplayName;

  private String dataChangeLastModifiedBy;

  private String dataChangeLastModifiedByDisplayName;

  private String dataChangeCreatedTime;

  private String dataChangeLastModifiedTime;

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

  public OpenItemDTO type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * 配置项类型
   * @return type
  */

  @Schema(name = "type", description = "配置项类型", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
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

  public OpenItemDTO lineNum(Integer lineNum) {
    this.lineNum = lineNum;
    return this;
  }

  /**
   * 配置项在命名空间中的行号，用于保持和旧版 Portal 配置项列表一致的默认展示顺序
   * @return lineNum
  */

  @Schema(name = "lineNum", description = "配置项在命名空间中的行号，用于保持和旧版 Portal 配置项列表一致的默认展示顺序", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineNum")
  public Integer getLineNum() {
    return lineNum;
  }

  public void setLineNum(Integer lineNum) {
    this.lineNum = lineNum;
  }

  public OpenItemDTO extendInfo(OpenItemExtendDTO extendInfo) {
    this.extendInfo = extendInfo;
    return this;
  }

  /**
   * Get extendInfo
   * @return extendInfo
  */
  @Valid
  @Schema(name = "extendInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendInfo")
  public OpenItemExtendDTO getExtendInfo() {
    return extendInfo;
  }

  public void setExtendInfo(OpenItemExtendDTO extendInfo) {
    this.extendInfo = extendInfo;
  }

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

  public OpenItemDTO dataChangeCreatedByDisplayName(String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
    return this;
  }

  /**
   * 配置项创建者显示名称，用于展示创建者的友好名称
   * @return dataChangeCreatedByDisplayName
  */

  @Schema(name = "dataChangeCreatedByDisplayName", description = "配置项创建者显示名称，用于展示创建者的友好名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedByDisplayName")
  public String getDataChangeCreatedByDisplayName() {
    return dataChangeCreatedByDisplayName;
  }

  public void setDataChangeCreatedByDisplayName(String dataChangeCreatedByDisplayName) {
    this.dataChangeCreatedByDisplayName = dataChangeCreatedByDisplayName;
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

  public OpenItemDTO dataChangeLastModifiedByDisplayName(String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
    return this;
  }

  /**
   * 配置项最后修改者显示名称，用于展示最后修改者的友好名称
   * @return dataChangeLastModifiedByDisplayName
  */

  @Schema(name = "dataChangeLastModifiedByDisplayName", description = "配置项最后修改者显示名称，用于展示最后修改者的友好名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedByDisplayName")
  public String getDataChangeLastModifiedByDisplayName() {
    return dataChangeLastModifiedByDisplayName;
  }

  public void setDataChangeLastModifiedByDisplayName(String dataChangeLastModifiedByDisplayName) {
    this.dataChangeLastModifiedByDisplayName = dataChangeLastModifiedByDisplayName;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenItemDTO openItemDTO = (OpenItemDTO) o;
    return Objects.equals(this.key, openItemDTO.key) &&
        Objects.equals(this.value, openItemDTO.value) &&
        Objects.equals(this.type, openItemDTO.type) &&
        Objects.equals(this.comment, openItemDTO.comment) &&
        Objects.equals(this.lineNum, openItemDTO.lineNum) &&
        Objects.equals(this.extendInfo, openItemDTO.extendInfo) &&
        Objects.equals(this.dataChangeCreatedBy, openItemDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeCreatedByDisplayName, openItemDTO.dataChangeCreatedByDisplayName) &&
        Objects.equals(this.dataChangeLastModifiedBy, openItemDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeLastModifiedByDisplayName, openItemDTO.dataChangeLastModifiedByDisplayName) &&
        Objects.equals(this.dataChangeCreatedTime, openItemDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openItemDTO.dataChangeLastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, type, comment, lineNum, extendInfo, dataChangeCreatedBy, dataChangeCreatedByDisplayName, dataChangeLastModifiedBy, dataChangeLastModifiedByDisplayName, dataChangeCreatedTime, dataChangeLastModifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenItemDTO {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
    sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeCreatedByDisplayName: ").append(toIndentedString(dataChangeCreatedByDisplayName)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeLastModifiedByDisplayName: ").append(toIndentedString(dataChangeLastModifiedByDisplayName)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
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
