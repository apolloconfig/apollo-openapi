package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemDTO;
import com.apollo.openapi.server.model.OpenNamespaceIdentifier;
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
 * OpenItemDiffDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OpenItemDiffDTO {

  private Integer code;

  private String message;

  private OpenNamespaceIdentifier namespace;

  @Valid
  private List<@Valid OpenItemDTO> createItems;

  @Valid
  private List<@Valid OpenItemDTO> deleteItems;

  @Valid
  private List<@Valid OpenItemDTO> updateItems;

  public OpenItemDiffDTO code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * 查找结果
   * @return code
  */

  @Schema(name = "code", description = "查找结果", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public OpenItemDiffDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * 查找结果信息
   * @return message
  */

  @Schema(name = "message", description = "查找结果信息", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OpenItemDiffDTO namespace(OpenNamespaceIdentifier namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
  @Valid
  @Schema(name = "namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namespace")
  public OpenNamespaceIdentifier getNamespace() {
    return namespace;
  }

  public void setNamespace(OpenNamespaceIdentifier namespace) {
    this.namespace = namespace;
  }

  public OpenItemDiffDTO createItems(List<@Valid OpenItemDTO> createItems) {
    this.createItems = createItems;
    return this;
  }

  public OpenItemDiffDTO addCreateItemsItem(OpenItemDTO createItemsItem) {
    if (this.createItems == null) {
      this.createItems = new ArrayList<>();
    }
    this.createItems.add(createItemsItem);
    return this;
  }

  /**
   * Get createItems
   * @return createItems
  */
  @Valid
  @Schema(name = "createItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createItems")
  public List<@Valid OpenItemDTO> getCreateItems() {
    return createItems;
  }

  public void setCreateItems(List<@Valid OpenItemDTO> createItems) {
    this.createItems = createItems;
  }

  public OpenItemDiffDTO deleteItems(List<@Valid OpenItemDTO> deleteItems) {
    this.deleteItems = deleteItems;
    return this;
  }

  public OpenItemDiffDTO addDeleteItemsItem(OpenItemDTO deleteItemsItem) {
    if (this.deleteItems == null) {
      this.deleteItems = new ArrayList<>();
    }
    this.deleteItems.add(deleteItemsItem);
    return this;
  }

  /**
   * Get deleteItems
   * @return deleteItems
  */
  @Valid
  @Schema(name = "deleteItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleteItems")
  public List<@Valid OpenItemDTO> getDeleteItems() {
    return deleteItems;
  }

  public void setDeleteItems(List<@Valid OpenItemDTO> deleteItems) {
    this.deleteItems = deleteItems;
  }

  public OpenItemDiffDTO updateItems(List<@Valid OpenItemDTO> updateItems) {
    this.updateItems = updateItems;
    return this;
  }

  public OpenItemDiffDTO addUpdateItemsItem(OpenItemDTO updateItemsItem) {
    if (this.updateItems == null) {
      this.updateItems = new ArrayList<>();
    }
    this.updateItems.add(updateItemsItem);
    return this;
  }

  /**
   * Get updateItems
   * @return updateItems
  */
  @Valid
  @Schema(name = "updateItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateItems")
  public List<@Valid OpenItemDTO> getUpdateItems() {
    return updateItems;
  }

  public void setUpdateItems(List<@Valid OpenItemDTO> updateItems) {
    this.updateItems = updateItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenItemDiffDTO openItemDiffDTO = (OpenItemDiffDTO) o;
    return Objects.equals(this.code, openItemDiffDTO.code) &&
        Objects.equals(this.message, openItemDiffDTO.message) &&
        Objects.equals(this.namespace, openItemDiffDTO.namespace) &&
        Objects.equals(this.createItems, openItemDiffDTO.createItems) &&
        Objects.equals(this.deleteItems, openItemDiffDTO.deleteItems) &&
        Objects.equals(this.updateItems, openItemDiffDTO.updateItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, namespace, createItems, deleteItems, updateItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenItemDiffDTO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    createItems: ").append(toIndentedString(createItems)).append("\n");
    sb.append("    deleteItems: ").append(toIndentedString(deleteItems)).append("\n");
    sb.append("    updateItems: ").append(toIndentedString(updateItems)).append("\n");
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
