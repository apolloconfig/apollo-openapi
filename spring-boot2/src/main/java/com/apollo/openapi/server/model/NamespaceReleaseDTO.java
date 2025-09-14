package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
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
 * 命名空间发布请求数据传输对象，用于创建新的配置发布
 */

@Schema(name = "NamespaceReleaseDTO", description = "命名空间发布请求数据传输对象，用于创建新的配置发布")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class NamespaceReleaseDTO {

  private @Nullable String releaseTitle;

  private @Nullable String releaseComment;

  private @Nullable String releasedBy;

  private @Nullable Boolean isEmergencyPublish;

  public NamespaceReleaseDTO releaseTitle(@Nullable String releaseTitle) {
    this.releaseTitle = releaseTitle;
    return this;
  }

  /**
   * 发布标题，用于标识这次发布的名称或版本号
   * @return releaseTitle
   */
  
  @Schema(name = "releaseTitle", description = "发布标题，用于标识这次发布的名称或版本号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseTitle")
  public @Nullable String getReleaseTitle() {
    return releaseTitle;
  }

  public void setReleaseTitle(@Nullable String releaseTitle) {
    this.releaseTitle = releaseTitle;
  }

  public NamespaceReleaseDTO releaseComment(@Nullable String releaseComment) {
    this.releaseComment = releaseComment;
    return this;
  }

  /**
   * 发布备注，详细描述本次发布的变更内容和目的
   * @return releaseComment
   */
  
  @Schema(name = "releaseComment", description = "发布备注，详细描述本次发布的变更内容和目的", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseComment")
  public @Nullable String getReleaseComment() {
    return releaseComment;
  }

  public void setReleaseComment(@Nullable String releaseComment) {
    this.releaseComment = releaseComment;
  }

  public NamespaceReleaseDTO releasedBy(@Nullable String releasedBy) {
    this.releasedBy = releasedBy;
    return this;
  }

  /**
   * 发布操作者用户名，记录是谁执行了这次发布操作
   * @return releasedBy
   */
  
  @Schema(name = "releasedBy", description = "发布操作者用户名，记录是谁执行了这次发布操作", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releasedBy")
  public @Nullable String getReleasedBy() {
    return releasedBy;
  }

  public void setReleasedBy(@Nullable String releasedBy) {
    this.releasedBy = releasedBy;
  }

  public NamespaceReleaseDTO isEmergencyPublish(@Nullable Boolean isEmergencyPublish) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceReleaseDTO namespaceReleaseDTO = (NamespaceReleaseDTO) o;
    return Objects.equals(this.releaseTitle, namespaceReleaseDTO.releaseTitle) &&
        Objects.equals(this.releaseComment, namespaceReleaseDTO.releaseComment) &&
        Objects.equals(this.releasedBy, namespaceReleaseDTO.releasedBy) &&
        Objects.equals(this.isEmergencyPublish, namespaceReleaseDTO.isEmergencyPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseTitle, releaseComment, releasedBy, isEmergencyPublish);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceReleaseDTO {\n");
    sb.append("    releaseTitle: ").append(toIndentedString(releaseTitle)).append("\n");
    sb.append("    releaseComment: ").append(toIndentedString(releaseComment)).append("\n");
    sb.append("    releasedBy: ").append(toIndentedString(releasedBy)).append("\n");
    sb.append("    isEmergencyPublish: ").append(toIndentedString(isEmergencyPublish)).append("\n");
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

