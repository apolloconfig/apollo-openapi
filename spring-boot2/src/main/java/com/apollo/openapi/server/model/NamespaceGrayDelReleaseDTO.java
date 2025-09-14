package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * 命名空间灰度删除发布请求数据传输对象，用于创建删除特定配置项的灰度发布
 */

@Schema(name = "NamespaceGrayDelReleaseDTO", description = "命名空间灰度删除发布请求数据传输对象，用于创建删除特定配置项的灰度发布")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class NamespaceGrayDelReleaseDTO {

  private @Nullable String releaseTitle;

  private @Nullable String releaseComment;

  private @Nullable String releasedBy;

  private @Nullable Boolean isEmergencyPublish;

  @Valid
  private List<String> grayDelKeys = new ArrayList<>();

  public NamespaceGrayDelReleaseDTO releaseTitle(@Nullable String releaseTitle) {
    this.releaseTitle = releaseTitle;
    return this;
  }

  /**
   * 发布标题，用于标识这次灰度删除发布的名称或版本号
   * @return releaseTitle
   */
  
  @Schema(name = "releaseTitle", description = "发布标题，用于标识这次灰度删除发布的名称或版本号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseTitle")
  public @Nullable String getReleaseTitle() {
    return releaseTitle;
  }

  public void setReleaseTitle(@Nullable String releaseTitle) {
    this.releaseTitle = releaseTitle;
  }

  public NamespaceGrayDelReleaseDTO releaseComment(@Nullable String releaseComment) {
    this.releaseComment = releaseComment;
    return this;
  }

  /**
   * 发布备注，详细描述本次灰度删除发布的目的和删除的配置项
   * @return releaseComment
   */
  
  @Schema(name = "releaseComment", description = "发布备注，详细描述本次灰度删除发布的目的和删除的配置项", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseComment")
  public @Nullable String getReleaseComment() {
    return releaseComment;
  }

  public void setReleaseComment(@Nullable String releaseComment) {
    this.releaseComment = releaseComment;
  }

  public NamespaceGrayDelReleaseDTO releasedBy(@Nullable String releasedBy) {
    this.releasedBy = releasedBy;
    return this;
  }

  /**
   * 发布操作者用户名，记录是谁执行了这次灰度删除发布操作
   * @return releasedBy
   */
  
  @Schema(name = "releasedBy", description = "发布操作者用户名，记录是谁执行了这次灰度删除发布操作", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releasedBy")
  public @Nullable String getReleasedBy() {
    return releasedBy;
  }

  public void setReleasedBy(@Nullable String releasedBy) {
    this.releasedBy = releasedBy;
  }

  public NamespaceGrayDelReleaseDTO isEmergencyPublish(@Nullable Boolean isEmergencyPublish) {
    this.isEmergencyPublish = isEmergencyPublish;
    return this;
  }

  /**
   * 是否为紧急发布，紧急发布可能会跳过某些审核流程
   * @return isEmergencyPublish
   */
  
  @Schema(name = "isEmergencyPublish", description = "是否为紧急发布，紧急发布可能会跳过某些审核流程", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEmergencyPublish")
  public @Nullable Boolean getIsEmergencyPublish() {
    return isEmergencyPublish;
  }

  public void setIsEmergencyPublish(@Nullable Boolean isEmergencyPublish) {
    this.isEmergencyPublish = isEmergencyPublish;
  }

  public NamespaceGrayDelReleaseDTO grayDelKeys(List<String> grayDelKeys) {
    this.grayDelKeys = grayDelKeys;
    return this;
  }

  public NamespaceGrayDelReleaseDTO addGrayDelKeysItem(String grayDelKeysItem) {
    if (this.grayDelKeys == null) {
      this.grayDelKeys = new ArrayList<>();
    }
    this.grayDelKeys.add(grayDelKeysItem);
    return this;
  }

  /**
   * 需要在灰度发布中删除的配置项键名列表
   * @return grayDelKeys
   */
  
  @Schema(name = "grayDelKeys", description = "需要在灰度发布中删除的配置项键名列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grayDelKeys")
  public List<String> getGrayDelKeys() {
    return grayDelKeys;
  }

  public void setGrayDelKeys(List<String> grayDelKeys) {
    this.grayDelKeys = grayDelKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceGrayDelReleaseDTO namespaceGrayDelReleaseDTO = (NamespaceGrayDelReleaseDTO) o;
    return Objects.equals(this.releaseTitle, namespaceGrayDelReleaseDTO.releaseTitle) &&
        Objects.equals(this.releaseComment, namespaceGrayDelReleaseDTO.releaseComment) &&
        Objects.equals(this.releasedBy, namespaceGrayDelReleaseDTO.releasedBy) &&
        Objects.equals(this.isEmergencyPublish, namespaceGrayDelReleaseDTO.isEmergencyPublish) &&
        Objects.equals(this.grayDelKeys, namespaceGrayDelReleaseDTO.grayDelKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseTitle, releaseComment, releasedBy, isEmergencyPublish, grayDelKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceGrayDelReleaseDTO {\n");
    sb.append("    releaseTitle: ").append(toIndentedString(releaseTitle)).append("\n");
    sb.append("    releaseComment: ").append(toIndentedString(releaseComment)).append("\n");
    sb.append("    releasedBy: ").append(toIndentedString(releasedBy)).append("\n");
    sb.append("    isEmergencyPublish: ").append(toIndentedString(isEmergencyPublish)).append("\n");
    sb.append("    grayDelKeys: ").append(toIndentedString(grayDelKeys)).append("\n");
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

