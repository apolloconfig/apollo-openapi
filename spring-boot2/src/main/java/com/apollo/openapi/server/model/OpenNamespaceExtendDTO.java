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
 * OpenNamespaceExtendDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenNamespaceExtendDTO {

  private Boolean isConfigHidden;

  private String parentAppId;

  private Integer itemModifiedCnt;

  public OpenNamespaceExtendDTO isConfigHidden(Boolean isConfigHidden) {
    this.isConfigHidden = isConfigHidden;
    return this;
  }

  /**
   * 当当前用户无权限查看配置时置为 true
   * @return isConfigHidden
  */

  @Schema(name = "isConfigHidden", description = "当当前用户无权限查看配置时置为 true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isConfigHidden")
  public Boolean getIsConfigHidden() {
    return isConfigHidden;
  }

  public void setIsConfigHidden(Boolean isConfigHidden) {
    this.isConfigHidden = isConfigHidden;
  }

  public OpenNamespaceExtendDTO parentAppId(String parentAppId) {
    this.parentAppId = parentAppId;
    return this;
  }

  /**
   * 公共命名空间的归属应用 AppId，用于判断是否关联公共 namespace 并提供跳转
   * @return parentAppId
  */

  @Schema(name = "parentAppId", description = "公共命名空间的归属应用 AppId，用于判断是否关联公共 namespace 并提供跳转", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentAppId")
  public String getParentAppId() {
    return parentAppId;
  }

  public void setParentAppId(String parentAppId) {
    this.parentAppId = parentAppId;
  }

  public OpenNamespaceExtendDTO itemModifiedCnt(Integer itemModifiedCnt) {
    this.itemModifiedCnt = itemModifiedCnt;
    return this;
  }

  /**
   * 未发布变更数
   * @return itemModifiedCnt
  */

  @Schema(name = "itemModifiedCnt", description = "未发布变更数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemModifiedCnt")
  public Integer getItemModifiedCnt() {
    return itemModifiedCnt;
  }

  public void setItemModifiedCnt(Integer itemModifiedCnt) {
    this.itemModifiedCnt = itemModifiedCnt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenNamespaceExtendDTO openNamespaceExtendDTO = (OpenNamespaceExtendDTO) o;
    return Objects.equals(this.isConfigHidden, openNamespaceExtendDTO.isConfigHidden) &&
        Objects.equals(this.parentAppId, openNamespaceExtendDTO.parentAppId) &&
        Objects.equals(this.itemModifiedCnt, openNamespaceExtendDTO.itemModifiedCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isConfigHidden, parentAppId, itemModifiedCnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceExtendDTO {\n");
    sb.append("    isConfigHidden: ").append(toIndentedString(isConfigHidden)).append("\n");
    sb.append("    parentAppId: ").append(toIndentedString(parentAppId)).append("\n");
    sb.append("    itemModifiedCnt: ").append(toIndentedString(itemModifiedCnt)).append("\n");
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
