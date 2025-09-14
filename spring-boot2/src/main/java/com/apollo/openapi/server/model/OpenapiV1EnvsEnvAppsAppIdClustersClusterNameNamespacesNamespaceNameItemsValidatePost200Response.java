package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response
 */

@JsonTypeName("_openapi_v1_envs__env__apps__appId__clusters__clusterName__namespaces__namespaceName__items_validate_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response {

  private @Nullable Boolean valid;

  private @Nullable String message;

  public OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response = (OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response) o;
    return Objects.equals(this.valid, openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response.valid) &&
        Objects.equals(this.message, openapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiV1EnvsEnvAppsAppIdClustersClusterNameNamespacesNamespaceNameItemsValidatePost200Response {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

