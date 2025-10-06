package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenGrayReleaseRuleItemDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Apollo灰度发布规则数据传输对象，表示完整的灰度发布规则配置
 */

@Schema(name = "OpenGrayReleaseRuleDTO", description = "Apollo灰度发布规则数据传输对象，表示完整的灰度发布规则配置")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenGrayReleaseRuleDTO {

  private String dataChangeCreatedBy;

  private String dataChangeLastModifiedBy;

  private String dataChangeCreatedTime;

  private String dataChangeLastModifiedTime;

  private String appId;

  private String clusterName;

  private String namespaceName;

  private String branchName;

  @Valid
  private List<@Valid OpenGrayReleaseRuleItemDTO> ruleItems;

  public OpenGrayReleaseRuleDTO dataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 灰度规则创建者用户名，记录是谁创建了这个灰度发布规则
   * @return dataChangeCreatedBy
  */

  @Schema(name = "dataChangeCreatedBy", description = "灰度规则创建者用户名，记录是谁创建了这个灰度发布规则", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenGrayReleaseRuleDTO dataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 灰度规则最后修改者用户名，记录最后一次修改规则的用户
   * @return dataChangeLastModifiedBy
  */

  @Schema(name = "dataChangeLastModifiedBy", description = "灰度规则最后修改者用户名，记录最后一次修改规则的用户", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenGrayReleaseRuleDTO dataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 灰度规则创建时间，ISO 8601格式的时间戳
   * @return dataChangeCreatedTime
  */

  @Schema(name = "dataChangeCreatedTime", example = "2025-09-29T12:34:56Z", description = "灰度规则创建时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenGrayReleaseRuleDTO dataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 灰度规则最后修改时间，ISO 8601格式的时间戳
   * @return dataChangeLastModifiedTime
  */

  @Schema(name = "dataChangeLastModifiedTime", example = "2025-09-29T12:34:56Z", description = "灰度规则最后修改时间，ISO 8601格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public String getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(String dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public OpenGrayReleaseRuleDTO appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 所属应用的唯一标识符
   * @return appId
  */

  @Schema(name = "appId", description = "所属应用的唯一标识符", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenGrayReleaseRuleDTO clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 所属集群的名称
   * @return clusterName
  */

  @Schema(name = "clusterName", description = "所属集群的名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public OpenGrayReleaseRuleDTO namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 所属命名空间的名称
   * @return namespaceName
  */

  @Schema(name = "namespaceName", description = "所属命名空间的名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public OpenGrayReleaseRuleDTO branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * 灰度分支名称，标识灰度发布的分支
   * @return branchName
  */

  @Schema(name = "branchName", description = "灰度分支名称，标识灰度发布的分支", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branchName")
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public OpenGrayReleaseRuleDTO ruleItems(List<@Valid OpenGrayReleaseRuleItemDTO> ruleItems) {
    this.ruleItems = ruleItems;
    return this;
  }

  public OpenGrayReleaseRuleDTO addRuleItemsItem(OpenGrayReleaseRuleItemDTO ruleItemsItem) {
    if (this.ruleItems == null) {
      this.ruleItems = new ArrayList<>();
    }
    this.ruleItems.add(ruleItemsItem);
    return this;
  }

  /**
   * 灰度发布规则项列表，包含具体的灰度规则条件
   * @return ruleItems
  */
  @Valid
  @Schema(name = "ruleItems", description = "灰度发布规则项列表，包含具体的灰度规则条件", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ruleItems")
  public List<@Valid OpenGrayReleaseRuleItemDTO> getRuleItems() {
    return ruleItems;
  }

  public void setRuleItems(List<@Valid OpenGrayReleaseRuleItemDTO> ruleItems) {
    this.ruleItems = ruleItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenGrayReleaseRuleDTO openGrayReleaseRuleDTO = (OpenGrayReleaseRuleDTO) o;
    return Objects.equals(this.dataChangeCreatedBy, openGrayReleaseRuleDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeLastModifiedBy, openGrayReleaseRuleDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeCreatedTime, openGrayReleaseRuleDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedTime, openGrayReleaseRuleDTO.dataChangeLastModifiedTime) &&
        Objects.equals(this.appId, openGrayReleaseRuleDTO.appId) &&
        Objects.equals(this.clusterName, openGrayReleaseRuleDTO.clusterName) &&
        Objects.equals(this.namespaceName, openGrayReleaseRuleDTO.namespaceName) &&
        Objects.equals(this.branchName, openGrayReleaseRuleDTO.branchName) &&
        Objects.equals(this.ruleItems, openGrayReleaseRuleDTO.ruleItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataChangeCreatedBy, dataChangeLastModifiedBy, dataChangeCreatedTime, dataChangeLastModifiedTime, appId, clusterName, namespaceName, branchName, ruleItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenGrayReleaseRuleDTO {\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    ruleItems: ").append(toIndentedString(ruleItems)).append("\n");
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
