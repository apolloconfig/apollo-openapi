package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenItemDTO;
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
 * 分页配置项数据传输对象，用于返回分页查询的配置项列表结果
 */

@Schema(name = "OpenPageDTOOpenItemDTO", description = "分页配置项数据传输对象，用于返回分页查询的配置项列表结果")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-14T17:08:21.606545+08:00[Asia/Shanghai]", comments = "Generator version: 7.15.0")
public class OpenPageDTOOpenItemDTO {

  private @Nullable Integer page;

  private @Nullable Integer size;

  private @Nullable Long total;

  @Valid
  private List<@Valid OpenItemDTO> content = new ArrayList<>();

  public OpenPageDTOOpenItemDTO page(@Nullable Integer page) {
    this.page = page;
    return this;
  }

  /**
   * 当前页码，从0开始计数
   * @return page
   */
  
  @Schema(name = "page", description = "当前页码，从0开始计数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public @Nullable Integer getPage() {
    return page;
  }

  public void setPage(@Nullable Integer page) {
    this.page = page;
  }

  public OpenPageDTOOpenItemDTO size(@Nullable Integer size) {
    this.size = size;
    return this;
  }

  /**
   * 每页显示的记录数量
   * @return size
   */
  
  @Schema(name = "size", description = "每页显示的记录数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable Integer getSize() {
    return size;
  }

  public void setSize(@Nullable Integer size) {
    this.size = size;
  }

  public OpenPageDTOOpenItemDTO total(@Nullable Long total) {
    this.total = total;
    return this;
  }

  /**
   * 总记录数，符合查询条件的配置项总数量
   * @return total
   */
  
  @Schema(name = "total", description = "总记录数，符合查询条件的配置项总数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public @Nullable Long getTotal() {
    return total;
  }

  public void setTotal(@Nullable Long total) {
    this.total = total;
  }

  public OpenPageDTOOpenItemDTO content(List<@Valid OpenItemDTO> content) {
    this.content = content;
    return this;
  }

  public OpenPageDTOOpenItemDTO addContentItem(OpenItemDTO contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * 当前页的配置项列表，包含具体的配置项数据
   * @return content
   */
  @Valid 
  @Schema(name = "content", description = "当前页的配置项列表，包含具体的配置项数据", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid OpenItemDTO> getContent() {
    return content;
  }

  public void setContent(List<@Valid OpenItemDTO> content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenPageDTOOpenItemDTO openPageDTOOpenItemDTO = (OpenPageDTOOpenItemDTO) o;
    return Objects.equals(this.page, openPageDTOOpenItemDTO.page) &&
        Objects.equals(this.size, openPageDTOOpenItemDTO.size) &&
        Objects.equals(this.total, openPageDTOOpenItemDTO.total) &&
        Objects.equals(this.content, openPageDTOOpenItemDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, size, total, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenPageDTOOpenItemDTO {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

