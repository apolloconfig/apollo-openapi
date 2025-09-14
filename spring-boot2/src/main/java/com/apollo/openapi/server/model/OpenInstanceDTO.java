package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenInstanceConfigDTO;
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
 * OpenInstanceDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenInstanceDTO {

  private @Nullable Long id;

  private @Nullable String appId;

  private @Nullable String clusterName;

  private @Nullable String dataCenter;

  private @Nullable String ip;

  @Valid
  private List<@Valid OpenInstanceConfigDTO> configs = new ArrayList<>();

  private @Nullable String dataChangeCreatedTime;

  public OpenInstanceDTO id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * 
   * @return id
   */
  
  @Schema(name = "id", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public OpenInstanceDTO appId(@Nullable String appId) {
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

  public OpenInstanceDTO clusterName(@Nullable String clusterName) {
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

  public OpenInstanceDTO dataCenter(@Nullable String dataCenter) {
    this.dataCenter = dataCenter;
    return this;
  }

  /**
   * 
   * @return dataCenter
   */
  
  @Schema(name = "dataCenter", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataCenter")
  public @Nullable String getDataCenter() {
    return dataCenter;
  }

  public void setDataCenter(@Nullable String dataCenter) {
    this.dataCenter = dataCenter;
  }

  public OpenInstanceDTO ip(@Nullable String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * 
   * @return ip
   */
  
  @Schema(name = "ip", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public @Nullable String getIp() {
    return ip;
  }

  public void setIp(@Nullable String ip) {
    this.ip = ip;
  }

  public OpenInstanceDTO configs(List<@Valid OpenInstanceConfigDTO> configs) {
    this.configs = configs;
    return this;
  }

  public OpenInstanceDTO addConfigsItem(OpenInstanceConfigDTO configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<>();
    }
    this.configs.add(configsItem);
    return this;
  }

  /**
   * 
   * @return configs
   */
  @Valid 
  @Schema(name = "configs", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configs")
  public List<@Valid OpenInstanceConfigDTO> getConfigs() {
    return configs;
  }

  public void setConfigs(List<@Valid OpenInstanceConfigDTO> configs) {
    this.configs = configs;
  }

  public OpenInstanceDTO dataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 
   * @return dataChangeCreatedTime
   */
  
  @Schema(name = "dataChangeCreatedTime", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public @Nullable String getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(@Nullable String dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInstanceDTO openInstanceDTO = (OpenInstanceDTO) o;
    return Objects.equals(this.id, openInstanceDTO.id) &&
        Objects.equals(this.appId, openInstanceDTO.appId) &&
        Objects.equals(this.clusterName, openInstanceDTO.clusterName) &&
        Objects.equals(this.dataCenter, openInstanceDTO.dataCenter) &&
        Objects.equals(this.ip, openInstanceDTO.ip) &&
        Objects.equals(this.configs, openInstanceDTO.configs) &&
        Objects.equals(this.dataChangeCreatedTime, openInstanceDTO.dataChangeCreatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appId, clusterName, dataCenter, ip, configs, dataChangeCreatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInstanceDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
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

