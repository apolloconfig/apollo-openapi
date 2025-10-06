package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
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
 * Apollo灰度发布规则项数据传输对象，表示灰度发布的具体规则条件
 */

@Schema(name = "OpenGrayReleaseRuleItemDTO", description = "Apollo灰度发布规则项数据传输对象，表示灰度发布的具体规则条件")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenGrayReleaseRuleItemDTO {

  private String clientAppId;

  @Valid
  private List<String> clientIpList;

  @Valid
  private List<String> clientLabelList;

  public OpenGrayReleaseRuleItemDTO clientAppId(String clientAppId) {
    this.clientAppId = clientAppId;
    return this;
  }

  /**
   * 客户端应用ID，指定哪个应用可以获取灰度配置
   * @return clientAppId
  */

  @Schema(name = "clientAppId", description = "客户端应用ID，指定哪个应用可以获取灰度配置", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientAppId")
  public String getClientAppId() {
    return clientAppId;
  }

  public void setClientAppId(String clientAppId) {
    this.clientAppId = clientAppId;
  }

  public OpenGrayReleaseRuleItemDTO clientIpList(List<String> clientIpList) {
    this.clientIpList = clientIpList;
    return this;
  }

  public OpenGrayReleaseRuleItemDTO addClientIpListItem(String clientIpListItem) {
    if (this.clientIpList == null) {
      this.clientIpList = new ArrayList<>();
    }
    this.clientIpList.add(clientIpListItem);
    return this;
  }

  /**
   * 客户端IP地址列表，指定哪些IP地址可以获取灰度配置
   * @return clientIpList
  */

  @Schema(name = "clientIpList", description = "客户端IP地址列表，指定哪些IP地址可以获取灰度配置", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientIpList")
  public List<String> getClientIpList() {
    return clientIpList;
  }

  public void setClientIpList(List<String> clientIpList) {
    this.clientIpList = clientIpList;
  }

  public OpenGrayReleaseRuleItemDTO clientLabelList(List<String> clientLabelList) {
    this.clientLabelList = clientLabelList;
    return this;
  }

  public OpenGrayReleaseRuleItemDTO addClientLabelListItem(String clientLabelListItem) {
    if (this.clientLabelList == null) {
      this.clientLabelList = new ArrayList<>();
    }
    this.clientLabelList.add(clientLabelListItem);
    return this;
  }

  /**
   * 客户端标签列表，通过标签来识别可以获取灰度配置的客户端
   * @return clientLabelList
  */

  @Schema(name = "clientLabelList", description = "客户端标签列表，通过标签来识别可以获取灰度配置的客户端", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientLabelList")
  public List<String> getClientLabelList() {
    return clientLabelList;
  }

  public void setClientLabelList(List<String> clientLabelList) {
    this.clientLabelList = clientLabelList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenGrayReleaseRuleItemDTO openGrayReleaseRuleItemDTO = (OpenGrayReleaseRuleItemDTO) o;
    return Objects.equals(this.clientAppId, openGrayReleaseRuleItemDTO.clientAppId) &&
        Objects.equals(this.clientIpList, openGrayReleaseRuleItemDTO.clientIpList) &&
        Objects.equals(this.clientLabelList, openGrayReleaseRuleItemDTO.clientLabelList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientAppId, clientIpList, clientLabelList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenGrayReleaseRuleItemDTO {\n");
    sb.append("    clientAppId: ").append(toIndentedString(clientAppId)).append("\n");
    sb.append("    clientIpList: ").append(toIndentedString(clientIpList)).append("\n");
    sb.append("    clientLabelList: ").append(toIndentedString(clientLabelList)).append("\n");
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
