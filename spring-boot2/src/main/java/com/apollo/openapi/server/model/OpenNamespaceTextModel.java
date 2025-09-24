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
 * OpenNamespaceTextModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-25T00:40:29.983824+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenNamespaceTextModel {

  private @Nullable String appId;

  private @Nullable String env;

  private @Nullable String clusterName;

  private @Nullable String namespaceName;

  private @Nullable Long namespaceId;

  private @Nullable String format;

  private @Nullable String configText;

  private @Nullable String operator;

  public OpenNamespaceTextModel appId(@Nullable String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 应用唯一标识
   * @return appId
   */

  @Schema(name = "appId", description = "应用唯一标识", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public @Nullable String getAppId() {
    return appId;
  }

  public void setAppId(@Nullable String appId) {
    this.appId = appId;
  }

  public OpenNamespaceTextModel env(@Nullable String env) {
    this.env = env;
    return this;
  }

  /**
   * 环境标识
   * @return env
   */

  @Schema(name = "env", description = "环境标识", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public @Nullable String getEnv() {
    return env;
  }

  public void setEnv(@Nullable String env) {
    this.env = env;
  }

  public OpenNamespaceTextModel clusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 集群名称
   * @return clusterName
   */

  @Schema(name = "clusterName", description = "集群名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public @Nullable String getClusterName() {
    return clusterName;
  }

  public void setClusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
  }

  public OpenNamespaceTextModel namespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 命名空间名称
   * @return namespaceName
   */

  @Schema(name = "namespaceName", description = "命名空间名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public @Nullable String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public OpenNamespaceTextModel namespaceId(@Nullable Long namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

  /**
   * 命名空间ID
   * @return namespaceId
   */

  @Schema(name = "namespaceId", description = "命名空间ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceId")
  public @Nullable Long getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(@Nullable Long namespaceId) {
    this.namespaceId = namespaceId;
  }

  public OpenNamespaceTextModel format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * 命名空间格式类型（properties/xml/json/yml等）
   * @return format
   */

  @Schema(name = "format", description = "命名空间格式类型（properties/xml/json/yml等）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public OpenNamespaceTextModel configText(@Nullable String configText) {
    this.configText = configText;
    return this;
  }

  /**
   * 配置内容的原始文本
   * @return configText
   */

  @Schema(name = "configText", description = "配置内容的原始文本", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configText")
  public @Nullable String getConfigText() {
    return configText;
  }

  public void setConfigText(@Nullable String configText) {
    this.configText = configText;
  }

  public OpenNamespaceTextModel operator(@Nullable String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * 操作者用户名
   * @return operator
   */

  @Schema(name = "operator", description = "操作者用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator")
  public @Nullable String getOperator() {
    return operator;
  }

  public void setOperator(@Nullable String operator) {
    this.operator = operator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenNamespaceTextModel openNamespaceTextModel = (OpenNamespaceTextModel) o;
    return Objects.equals(this.appId, openNamespaceTextModel.appId) &&
        Objects.equals(this.env, openNamespaceTextModel.env) &&
        Objects.equals(this.clusterName, openNamespaceTextModel.clusterName) &&
        Objects.equals(this.namespaceName, openNamespaceTextModel.namespaceName) &&
        Objects.equals(this.namespaceId, openNamespaceTextModel.namespaceId) &&
        Objects.equals(this.format, openNamespaceTextModel.format) &&
        Objects.equals(this.configText, openNamespaceTextModel.configText) &&
        Objects.equals(this.operator, openNamespaceTextModel.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, env, clusterName, namespaceName, namespaceId, format, configText, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceTextModel {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    configText: ").append(toIndentedString(configText)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
