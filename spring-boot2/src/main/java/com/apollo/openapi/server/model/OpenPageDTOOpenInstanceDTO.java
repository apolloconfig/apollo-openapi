package com.apollo.openapi.server.model;

import java.net.URI;
import java.util.Objects;
import com.apollo.openapi.server.model.OpenInstanceDTO;
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
 * 分页实例数据传输对象，用于返回分页查询的实例列表结果
 */

@Schema(name = "OpenPageDTOOpenInstanceDTO", description = "分页实例数据传输对象，用于返回分页查询的实例列表结果")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-07T09:56:27.881+08:00[Asia/Shanghai]")
public class OpenPageDTOOpenInstanceDTO {

  private Integer page;

  private Integer size;

  private Long total;

  @Valid
  private List<@Valid OpenInstanceDTO> content;

  public OpenPageDTOOpenInstanceDTO page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * 当前页码，从0开始计数
   * @return page
  */

  @Schema(name = "page", description = "当前页码，从0开始计数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public OpenPageDTOOpenInstanceDTO size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * 每页显示的记录数量
   * @return size
  */

  @Schema(name = "size", description = "每页显示的记录数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public OpenPageDTOOpenInstanceDTO total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * 总记录数，符合查询条件的实例总数量
   * @return total
  */

  @Schema(name = "total", description = "总记录数，符合查询条件的实例总数量", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public OpenPageDTOOpenInstanceDTO content(List<@Valid OpenInstanceDTO> content) {
    this.content = content;
    return this;
  }

  public OpenPageDTOOpenInstanceDTO addContentItem(OpenInstanceDTO contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * 当前页的实例列表，包含具体的实例数据
   * @return content
  */
  @Valid
  @Schema(name = "content", description = "当前页的实例列表，包含具体的实例数据", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid OpenInstanceDTO> getContent() {
    return content;
  }

  public void setContent(List<@Valid OpenInstanceDTO> content) {
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
    OpenPageDTOOpenInstanceDTO openPageDTOOpenInstanceDTO = (OpenPageDTOOpenInstanceDTO) o;
    return Objects.equals(this.page, openPageDTOOpenInstanceDTO.page) &&
        Objects.equals(this.size, openPageDTOOpenInstanceDTO.size) &&
        Objects.equals(this.total, openPageDTOOpenInstanceDTO.total) &&
        Objects.equals(this.content, openPageDTOOpenInstanceDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, size, total, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenPageDTOOpenInstanceDTO {\n");
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
