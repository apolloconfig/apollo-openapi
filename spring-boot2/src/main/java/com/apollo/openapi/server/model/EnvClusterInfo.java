package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.ClusterDTO;
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
 * EnvClusterInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class EnvClusterInfo {

  private @Nullable String env;

  @Valid
  private List<@Valid ClusterDTO> clusters = new ArrayList<>();

  public EnvClusterInfo env(@Nullable String env) {
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

  public EnvClusterInfo clusters(List<@Valid ClusterDTO> clusters) {
    this.clusters = clusters;
    return this;
  }

  public EnvClusterInfo addClustersItem(ClusterDTO clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

  /**
   * 
   * @return clusters
   */
  @Valid 
  @Schema(name = "clusters", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusters")
  public List<@Valid ClusterDTO> getClusters() {
    return clusters;
  }

  public void setClusters(List<@Valid ClusterDTO> clusters) {
    this.clusters = clusters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvClusterInfo envClusterInfo = (EnvClusterInfo) o;
    return Objects.equals(this.env, envClusterInfo.env) &&
        Objects.equals(this.clusters, envClusterInfo.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvClusterInfo {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

