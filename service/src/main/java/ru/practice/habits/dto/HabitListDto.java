package ru.practice.habits.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import ru.practice.habits.dto.HabitDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HabitListDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class HabitListDto {

  private List<@Valid HabitDto> items = new ArrayList<>();

  private Integer total;

  public HabitListDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HabitListDto(List<@Valid HabitDto> items, Integer total) {
    this.items = items;
    this.total = total;
  }

  public HabitListDto items(List<@Valid HabitDto> items) {
    this.items = items;
    return this;
  }

  public HabitListDto addItemsItem(HabitDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @NotNull 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid HabitDto> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid HabitDto> items) {
    this.items = items;
  }

  public HabitListDto total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Общее число привычек текущего пользователя до пагинации
   * minimum: 0
   * @return total
   */
  @NotNull @Min(value = 0) 
  @Schema(name = "total", description = "Общее число привычек текущего пользователя до пагинации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  @JsonProperty("total")
  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HabitListDto habitListDto = (HabitListDto) o;
    return Objects.equals(this.items, habitListDto.items) &&
        Objects.equals(this.total, habitListDto.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HabitListDto {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

