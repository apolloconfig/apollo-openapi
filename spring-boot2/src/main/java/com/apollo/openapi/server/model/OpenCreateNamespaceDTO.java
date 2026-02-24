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
 * Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项
 */

@Schema(name = "OpenCreateNamespaceDTO", description = "Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenCreateNamespaceDTO {

  private String appId;

  private String env;

  private String clusterName;

  private String appNamespaceName;

  public OpenCreateNamespaceDTO appId(String appId) {
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

  public OpenCreateNamespaceDTO env(String env) {
    this.env = env;
    return this;
  }

  /**
   * 所在那个环境创建
   * @return env
  */

  @Schema(name = "env", description = "所在那个环境创建", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public OpenCreateNamespaceDTO clusterName(String clusterName) {
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

  public OpenCreateNamespaceDTO appNamespaceName(String appNamespaceName) {
    this.appNamespaceName = appNamespaceName;
    return this;
  }

  /**
   * 根据已创建的appnamespace来实例化namespace
   * @return appNamespaceName
  */

  @Schema(name = "appNamespaceName", description = "根据已创建的appnamespace来实例化namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appNamespaceName")
  public String getAppNamespaceName() {
    return appNamespaceName;
  }

  public void setAppNamespaceName(String appNamespaceName) {
    this.appNamespaceName = appNamespaceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenCreateNamespaceDTO openCreateNamespaceDTO = (OpenCreateNamespaceDTO) o;
    return Objects.equals(this.appId, openCreateNamespaceDTO.appId) &&
        Objects.equals(this.env, openCreateNamespaceDTO.env) &&
        Objects.equals(this.clusterName, openCreateNamespaceDTO.clusterName) &&
        Objects.equals(this.appNamespaceName, openCreateNamespaceDTO.appNamespaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, env, clusterName, appNamespaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCreateNamespaceDTO {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    appNamespaceName: ").append(toIndentedString(appNamespaceName)).append("\n");
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
