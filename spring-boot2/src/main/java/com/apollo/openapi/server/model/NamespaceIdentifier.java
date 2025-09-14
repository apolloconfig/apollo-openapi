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
 * NamespaceIdentifier
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class NamespaceIdentifier {

  private @Nullable String appId;

  private @Nullable String env;

  private @Nullable String clusterName;

  private @Nullable String namespaceName;

  public NamespaceIdentifier appId(@Nullable String appId) {
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

  public NamespaceIdentifier env(@Nullable String env) {
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

  public NamespaceIdentifier clusterName(@Nullable String clusterName) {
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

  public NamespaceIdentifier namespaceName(@Nullable String namespaceName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceIdentifier namespaceIdentifier = (NamespaceIdentifier) o;
    return Objects.equals(this.appId, namespaceIdentifier.appId) &&
        Objects.equals(this.env, namespaceIdentifier.env) &&
        Objects.equals(this.clusterName, namespaceIdentifier.clusterName) &&
        Objects.equals(this.namespaceName, namespaceIdentifier.namespaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, env, clusterName, namespaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceIdentifier {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
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

