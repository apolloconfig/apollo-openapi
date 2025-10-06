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
 * OpenNamespaceIdentifier
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenNamespaceIdentifier {

  private String appId;

  private String env;

  private String clusterName;

  private String namespaceName;

  public OpenNamespaceIdentifier appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * 应用唯一标识
   * @return appId
  */

  @Schema(name = "appId", description = "应用唯一标识", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenNamespaceIdentifier env(String env) {
    this.env = env;
    return this;
  }

  /**
   * 环境标识
   * @return env
  */

  @Schema(name = "env", description = "环境标识", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public OpenNamespaceIdentifier clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * 集群名称
   * @return clusterName
  */

  @Schema(name = "clusterName", description = "集群名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public OpenNamespaceIdentifier namespaceName(String namespaceName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenNamespaceIdentifier openNamespaceIdentifier = (OpenNamespaceIdentifier) o;
    return Objects.equals(this.appId, openNamespaceIdentifier.appId) &&
        Objects.equals(this.env, openNamespaceIdentifier.env) &&
        Objects.equals(this.clusterName, openNamespaceIdentifier.clusterName) &&
        Objects.equals(this.namespaceName, openNamespaceIdentifier.namespaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, env, clusterName, namespaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceIdentifier {\n");
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
