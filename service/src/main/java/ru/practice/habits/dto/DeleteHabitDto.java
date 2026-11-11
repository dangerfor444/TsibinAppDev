package ru.practice.habits.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeleteHabitDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class DeleteHabitDto {

  private UUID id;

  private Boolean deleted;

  public DeleteHabitDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeleteHabitDto(UUID id, Boolean deleted) {
    this.id = id;
    this.deleted = deleted;
  }

  public DeleteHabitDto id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор удалённой привычки
   * @return id
   */
  @NotNull @Valid 
  @Schema(name = "id", description = "Идентификатор удалённой привычки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  public DeleteHabitDto deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  @NotNull 
  @Schema(name = "deleted", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  @JsonProperty("deleted")
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteHabitDto deleteHabitDto = (DeleteHabitDto) o;
    return Objects.equals(this.id, deleteHabitDto.id) &&
        Objects.equals(this.deleted, deleteHabitDto.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteHabitDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

