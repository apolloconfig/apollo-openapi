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
 * Apollo命名空间锁状态数据传输对象
 */

@Schema(name = "OpenNamespaceLockDTO", description = "Apollo命名空间锁状态数据传输对象")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenNamespaceLockDTO {

  private String namespaceName;

  private Boolean isLocked;

  private String lockedBy;

  private Boolean isEmergencyPublishAllowed;

  public OpenNamespaceLockDTO namespaceName(String namespaceName) {
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

  public OpenNamespaceLockDTO isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * 是否被锁定
   * @return isLocked
  */

  @Schema(name = "isLocked", description = "是否被锁定", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLocked")
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public OpenNamespaceLockDTO lockedBy(String lockedBy) {
    this.lockedBy = lockedBy;
    return this;
  }

  /**
   * 锁定者用户名
   * @return lockedBy
  */

  @Schema(name = "lockedBy", description = "锁定者用户名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lockedBy")
  public String getLockedBy() {
    return lockedBy;
  }

  public void setLockedBy(String lockedBy) {
    this.lockedBy = lockedBy;
  }

  public OpenNamespaceLockDTO isEmergencyPublishAllowed(Boolean isEmergencyPublishAllowed) {
    this.isEmergencyPublishAllowed = isEmergencyPublishAllowed;
    return this;
  }

  /**
   * 是否允许紧急发布
   * @return isEmergencyPublishAllowed
  */

  @Schema(name = "isEmergencyPublishAllowed", description = "是否允许紧急发布", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEmergencyPublishAllowed")
  public Boolean getIsEmergencyPublishAllowed() {
    return isEmergencyPublishAllowed;
  }

  public void setIsEmergencyPublishAllowed(Boolean isEmergencyPublishAllowed) {
    this.isEmergencyPublishAllowed = isEmergencyPublishAllowed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenNamespaceLockDTO openNamespaceLockDTO = (OpenNamespaceLockDTO) o;
    return Objects.equals(this.namespaceName, openNamespaceLockDTO.namespaceName) &&
        Objects.equals(this.isLocked, openNamespaceLockDTO.isLocked) &&
        Objects.equals(this.lockedBy, openNamespaceLockDTO.lockedBy) &&
        Objects.equals(this.isEmergencyPublishAllowed, openNamespaceLockDTO.isEmergencyPublishAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaceName, isLocked, lockedBy, isEmergencyPublishAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNamespaceLockDTO {\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    isEmergencyPublishAllowed: ").append(toIndentedString(isEmergencyPublishAllowed)).append("\n");
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
