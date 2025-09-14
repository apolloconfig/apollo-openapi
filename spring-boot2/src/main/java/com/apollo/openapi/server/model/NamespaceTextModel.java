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
 * NamespaceTextModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class NamespaceTextModel {

  private @Nullable String appId;

  private @Nullable String env;

  private @Nullable String clusterName;

  private @Nullable String namespaceName;

  private @Nullable Long namespaceId;

  private @Nullable String format;

  private @Nullable String configText;

  private @Nullable String operator;

  public NamespaceTextModel appId(@Nullable String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 
   * @return appId
   */
  
  @Schema(name = "appId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public @Nullable String getAppId() {
    return appId;
  }

  public void setAppId(@Nullable String appId) {
    this.appId = appId;
  }

  public NamespaceTextModel env(@Nullable String env) {
    this.env = env;
    return this;
  }

  /**
   * 
   * @return env
   */
  
  @Schema(name = "env", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public @Nullable String getEnv() {
    return env;
  }

  public void setEnv(@Nullable String env) {
    this.env = env;
  }

  public NamespaceTextModel clusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 
   * @return clusterName
   */
  
  @Schema(name = "clusterName", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public @Nullable String getClusterName() {
    return clusterName;
  }

  public void setClusterName(@Nullable String clusterName) {
    this.clusterName = clusterName;
  }

  public NamespaceTextModel namespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * 
   * @return namespaceName
   */
  
  @Schema(name = "namespaceName", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceName")
  public @Nullable String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(@Nullable String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public NamespaceTextModel namespaceId(@Nullable Long namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

  /**
   * 
   * @return namespaceId
   */
  
  @Schema(name = "namespaceId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespaceId")
  public @Nullable Long getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(@Nullable Long namespaceId) {
    this.namespaceId = namespaceId;
  }

  public NamespaceTextModel format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * 
   * @return format
   */
  
  @Schema(name = "format", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public NamespaceTextModel configText(@Nullable String configText) {
    this.configText = configText;
    return this;
  }

  /**
   * 
   * @return configText
   */
  
  @Schema(name = "configText", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configText")
  public @Nullable String getConfigText() {
    return configText;
  }

  public void setConfigText(@Nullable String configText) {
    this.configText = configText;
  }

  public NamespaceTextModel operator(@Nullable String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * 
   * @return operator
   */
  
  @Schema(name = "operator", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    NamespaceTextModel namespaceTextModel = (NamespaceTextModel) o;
    return Objects.equals(this.appId, namespaceTextModel.appId) &&
        Objects.equals(this.env, namespaceTextModel.env) &&
        Objects.equals(this.clusterName, namespaceTextModel.clusterName) &&
        Objects.equals(this.namespaceName, namespaceTextModel.namespaceName) &&
        Objects.equals(this.namespaceId, namespaceTextModel.namespaceId) &&
        Objects.equals(this.format, namespaceTextModel.format) &&
        Objects.equals(this.configText, namespaceTextModel.configText) &&
        Objects.equals(this.operator, namespaceTextModel.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, env, clusterName, namespaceName, namespaceId, format, configText, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceTextModel {\n");
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

