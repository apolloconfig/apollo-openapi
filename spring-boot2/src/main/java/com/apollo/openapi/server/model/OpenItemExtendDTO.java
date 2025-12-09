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
 * Apollo配置项扩展信息，包含状态、类型、归属及变更对比信息
 */

@Schema(name = "OpenItemExtendDTO", description = "Apollo配置项扩展信息，包含状态、类型、归属及变更对比信息")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenItemExtendDTO {

  private Long namespaceId;

  private Boolean isModified;

  private Boolean isDeleted;

  private Boolean isNewlyAdded;

  private String newValue;

  private String oldValue;

  public OpenItemExtendDTO namespaceId(Long namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

  /**
   * 所属命名空间的ID
   * @return namespaceId
  */

  @Schema(name = "namespaceId", description = "所属命名空间的ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceId")
  public Long getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(Long namespaceId) {
    this.namespaceId = namespaceId;
  }

  public OpenItemExtendDTO isModified(Boolean isModified) {
    this.isModified = isModified;
    return this;
  }

  /**
   * 是否有未发布的修改
   * @return isModified
  */

  @Schema(name = "isModified", description = "是否有未发布的修改", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isModified")
  public Boolean getIsModified() {
    return isModified;
  }

  public void setIsModified(Boolean isModified) {
    this.isModified = isModified;
  }

  public OpenItemExtendDTO isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * 是否被标记为删除（未发布）
   * @return isDeleted
  */

  @Schema(name = "isDeleted", description = "是否被标记为删除（未发布）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public OpenItemExtendDTO isNewlyAdded(Boolean isNewlyAdded) {
    this.isNewlyAdded = isNewlyAdded;
    return this;
  }

  /**
   * 是否为新添加的配置项（未发布）
   * @return isNewlyAdded
  */

  @Schema(name = "isNewlyAdded", description = "是否为新添加的配置项（未发布）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isNewlyAdded")
  public Boolean getIsNewlyAdded() {
    return isNewlyAdded;
  }

  public void setIsNewlyAdded(Boolean isNewlyAdded) {
    this.isNewlyAdded = isNewlyAdded;
  }

  public OpenItemExtendDTO newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * 新的值
   * @return newValue
  */

  @Schema(name = "newValue", description = "新的值", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public OpenItemExtendDTO oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  /**
   * 上一次发布的值，用于对比变更
   * @return oldValue
  */

  @Schema(name = "oldValue", description = "上一次发布的值，用于对比变更", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OpenItemExtendDTO openItemExtendDTO = (OpenItemExtendDTO) o;
    return Objects.equals(this.namespaceId, openItemExtendDTO.namespaceId) &&
        Objects.equals(this.isModified, openItemExtendDTO.isModified) &&
        Objects.equals(this.isDeleted, openItemExtendDTO.isDeleted) &&
        Objects.equals(this.isNewlyAdded, openItemExtendDTO.isNewlyAdded) &&
        Objects.equals(this.newValue, openItemExtendDTO.newValue) &&
        Objects.equals(this.oldValue, openItemExtendDTO.oldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaceId, isModified, isDeleted, isNewlyAdded, newValue, oldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenItemExtendDTO {\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    isModified: ").append(toIndentedString(isModified)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isNewlyAdded: ").append(toIndentedString(isNewlyAdded)).append("\n");
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
