package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpenConsumerTokenDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenConsumerTokenDTO {

  private Long consumerId;

  private String token;

  private Integer rateLimit = 0;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expires;

  private String dataChangeCreatedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataChangeCreatedTime;

  private String dataChangeLastModifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataChangeLastModifiedTime;

  public OpenConsumerTokenDTO consumerId(Long consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Consumer ID
   * @return consumerId
  */

  @Schema(name = "consumerId", description = "Consumer ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumerId")
  public Long getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(Long consumerId) {
    this.consumerId = consumerId;
  }

  public OpenConsumerTokenDTO token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Consumer Token
   * @return token
  */

  @Schema(name = "token", description = "Consumer Token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public OpenConsumerTokenDTO rateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

  /**
   * 限流QPS，0表示不限流
   * minimum: 0
   * @return rateLimit
  */
  @Min(0)
  @Schema(name = "rateLimit", description = "限流QPS，0表示不限流", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLimit")
  public Integer getRateLimit() {
    return rateLimit;
  }

  public void setRateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
  }

  public OpenConsumerTokenDTO expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * 过期时间
   * @return expires
  */
  @Valid
  @Schema(name = "expires", description = "过期时间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public OpenConsumerTokenDTO dataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
    return this;
  }

  /**
   * 创建人
   * @return dataChangeCreatedBy
  */

  @Schema(name = "dataChangeCreatedBy", description = "创建人", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedBy")
  public String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public OpenConsumerTokenDTO dataChangeCreatedTime(OffsetDateTime dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
    return this;
  }

  /**
   * 创建时间
   * @return dataChangeCreatedTime
  */
  @Valid
  @Schema(name = "dataChangeCreatedTime", description = "创建时间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeCreatedTime")
  public OffsetDateTime getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(OffsetDateTime dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  public OpenConsumerTokenDTO dataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    return this;
  }

  /**
   * 最后修改人
   * @return dataChangeLastModifiedBy
  */

  @Schema(name = "dataChangeLastModifiedBy", description = "最后修改人", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedBy")
  public String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public OpenConsumerTokenDTO dataChangeLastModifiedTime(OffsetDateTime dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    return this;
  }

  /**
   * 最后修改时间
   * @return dataChangeLastModifiedTime
  */
  @Valid
  @Schema(name = "dataChangeLastModifiedTime", description = "最后修改时间", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataChangeLastModifiedTime")
  public OffsetDateTime getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(OffsetDateTime dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenConsumerTokenDTO openConsumerTokenDTO = (OpenConsumerTokenDTO) o;
    return Objects.equals(this.consumerId, openConsumerTokenDTO.consumerId) &&
        Objects.equals(this.token, openConsumerTokenDTO.token) &&
        Objects.equals(this.rateLimit, openConsumerTokenDTO.rateLimit) &&
        Objects.equals(this.expires, openConsumerTokenDTO.expires) &&
        Objects.equals(this.dataChangeCreatedBy, openConsumerTokenDTO.dataChangeCreatedBy) &&
        Objects.equals(this.dataChangeCreatedTime, openConsumerTokenDTO.dataChangeCreatedTime) &&
        Objects.equals(this.dataChangeLastModifiedBy, openConsumerTokenDTO.dataChangeLastModifiedBy) &&
        Objects.equals(this.dataChangeLastModifiedTime, openConsumerTokenDTO.dataChangeLastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, token, rateLimit, expires, dataChangeCreatedBy, dataChangeCreatedTime, dataChangeLastModifiedBy, dataChangeLastModifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenConsumerTokenDTO {\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    token: ").append(token == null ? "null" : "***redacted***").append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    dataChangeCreatedBy: ").append(toIndentedString(dataChangeCreatedBy)).append("\n");
    sb.append("    dataChangeCreatedTime: ").append(toIndentedString(dataChangeCreatedTime)).append("\n");
    sb.append("    dataChangeLastModifiedBy: ").append(toIndentedString(dataChangeLastModifiedBy)).append("\n");
    sb.append("    dataChangeLastModifiedTime: ").append(toIndentedString(dataChangeLastModifiedTime)).append("\n");
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
