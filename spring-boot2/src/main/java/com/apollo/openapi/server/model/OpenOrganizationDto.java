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
 * OpenOrganizationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenOrganizationDto {

  private String orgId;

  private String orgName;

  public OpenOrganizationDto orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * 组织ID
   * @return orgId
  */

  @Schema(name = "orgId", description = "组织ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgId")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public OpenOrganizationDto orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * 组织名称
   * @return orgName
  */

  @Schema(name = "orgName", description = "组织名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgName")
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenOrganizationDto openOrganizationDto = (OpenOrganizationDto) o;
    return Objects.equals(this.orgId, openOrganizationDto.orgId) &&
        Objects.equals(this.orgName, openOrganizationDto.orgName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, orgName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenOrganizationDto {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
