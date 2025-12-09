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
 * 命名空间使用情况数据传输对象，统计各环境和集群下的使用指标
 */

@Schema(name = "OpenNamespaceUsageDTO", description = "命名空间使用情况数据传输对象，统计各环境和集群下的使用指标")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenNamespaceUsageDTO {

  private String namespaceName;

  private String appId;

  private String clusterName;

  private String envName;

  private Integer instanceCount;

  private Integer branchInstanceCount;

  private Integer linkedNamespaceCount;

  public OpenNamespaceUsageDTO namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 命名空间名称
   * @return namespaceName
  */

  @Schema(name = "namespaceName", description = "命名空间名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public OpenNamespaceUsageDTO appId(String appId) {
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

  public OpenNamespaceUsageDTO clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 所属集群名称
   * @return clusterName
  */

  @Schema(name = "clusterName", description = "所属集群名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public OpenNamespaceUsageDTO envName(String envName) {
    this.envName = envName;
    return this;
  }

  /**
   * 环境名称
   * @return envName
  */

  @Schema(name = "envName", description = "环境名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("envName")
  public String getEnvName() {
    return envName;
  }

  public void setEnvName(String envName) {
    this.envName = envName;
  }

  public OpenNamespaceUsageDTO instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * 该命名空间关联的实例数量
   * @return instanceCount
  */

  @Schema(name = "instanceCount", description = "该命名空间关联的实例数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instanceCount")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  public OpenNamespaceUsageDTO branchInstanceCount(Integer branchInstanceCount) {
    this.branchInstanceCount = branchInstanceCount;
    return this;
  }

  /**
   * 分支命名空间关联的实例数量
   * @return branchInstanceCount
  */

  @Schema(name = "branchInstanceCount", description = "分支命名空间关联的实例数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branchInstanceCount")
  public Integer getBranchInstanceCount() {
    return branchInstanceCount;
  }

  public void setBranchInstanceCount(Integer branchInstanceCount) {
    this.branchInstanceCount = branchInstanceCount;
  }

  public OpenNamespaceUsageDTO linkedNamespaceCount(Integer linkedNamespaceCount) {
    this.linkedNamespaceCount = linkedNamespaceCount;
    return this;
  }

  /**
   * 关联到该公共命名空间的命名空间数量
   * @return linkedNamespaceCount
  */

  @Schema(name = "linkedNamespaceCount", description = "关联到该公共命名空间的命名空间数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedNamespaceCount")
  public Integer getLinkedNamespaceCount() {
    return linkedNamespaceCount;
  }

  public void setLinkedNamespaceCount(Integer linkedNamespaceCount) {
    this.linkedNamespaceCount = linkedNamespaceCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenNamespaceUsageDTO openNamespaceUsageDTO = (OpenNamespaceUsageDTO) o;
    return Objects.equals(this.namespaceName, openNamespaceUsageDTO.namespaceName) &&
        Objects.equals(this.appId, openNamespaceUsageDTO.appId) &&
        Objects.equals(this.clusterName, openNamespaceUsageDTO.clusterName) &&
        Objects.equals(this.envName, openNamespaceUsageDTO.envName) &&
        Objects.equals(this.instanceCount, openNamespaceUsageDTO.instanceCount) &&
        Objects.equals(this.branchInstanceCount, openNamespaceUsageDTO.branchInstanceCount) &&
        Objects.equals(this.linkedNamespaceCount, openNamespaceUsageDTO.linkedNamespaceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaceName, appId, clusterName, envName, instanceCount, branchInstanceCount, linkedNamespaceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceUsageDTO {\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    branchInstanceCount: ").append(toIndentedString(branchInstanceCount)).append("\n");
    sb.append("    linkedNamespaceCount: ").append(toIndentedString(linkedNamespaceCount)).append("\n");
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
