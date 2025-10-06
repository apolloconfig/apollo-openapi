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
 * A wrapper for a single response entity with code, message, and body
 */

@Schema(name = "RichResponseEntity", description = "A wrapper for a single response entity with code, message, and body")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class RichResponseEntity {

  private Integer code;

  private Object message;

  private Object body;

  /**
   * Default constructor
   * @deprecated Use {@link RichResponseEntity#RichResponseEntity(Integer, Object)}
   */
  @Deprecated
  public RichResponseEntity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RichResponseEntity(Integer code, Object message) {
    this.code = code;
    this.message = message;
  }

  public RichResponseEntity code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * HTTP status code
   * @return code
  */
  @NotNull
  @Schema(name = "code", example = "200", description = "HTTP status code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RichResponseEntity message(Object message) {
    this.message = message;
    return this;
  }

  /**
   * Response message (can be string or object)
   * @return message
  */
  @NotNull
  @Schema(name = "message", example = "OK", description = "Response message (can be string or object)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public Object getMessage() {
    return message;
  }

  public void setMessage(Object message) {
    this.message = message;
  }

  public RichResponseEntity body(Object body) {
    this.body = body;
    return this;
  }

  /**
   * Response payload (generic type T)
   * @return body
  */

  @Schema(name = "body", description = "Response payload (generic type T)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public Object getBody() {
    return body;
  }

  public void setBody(Object body) {
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichResponseEntity richResponseEntity = (RichResponseEntity) o;
    return Objects.equals(this.code, richResponseEntity.code) &&
        Objects.equals(this.message, richResponseEntity.message) &&
        Objects.equals(this.body, richResponseEntity.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichResponseEntity {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
