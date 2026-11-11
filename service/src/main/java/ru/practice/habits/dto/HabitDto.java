package ru.practice.habits.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * HabitDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class HabitDto {

  private UUID id;

  private String title;

  /**
   * Gets or Sets frequency
   */
  public enum FrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY");

    private final String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FrequencyEnum frequency;

  private Integer targetCount;

  public HabitDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HabitDto(UUID id, String title, FrequencyEnum frequency, Integer targetCount) {
    this.id = id;
    this.title = title;
    this.frequency = frequency;
    this.targetCount = targetCount;
  }

  public HabitDto id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Публичный идентификатор привычки
   * @return id
   */
  @Valid 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Публичный идентификатор привычки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  public HabitDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull @Pattern(regexp = "^[\\s\\S]*\\S[\\s\\S]*$") @Size(min = 1, max = 120) 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  public HabitDto frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @NotNull 
  @Schema(name = "frequency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("frequency")
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  @JsonProperty("frequency")
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public HabitDto targetCount(Integer targetCount) {
    this.targetCount = targetCount;
    return this;
  }

  /**
   * Get targetCount
   * minimum: 1
   * maximum: 100
   * @return targetCount
   */
  @NotNull @Min(value = 1) @Max(value = 100) 
  @Schema(name = "targetCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetCount")
  public Integer getTargetCount() {
    return targetCount;
  }

  @JsonProperty("targetCount")
  public void setTargetCount(Integer targetCount) {
    this.targetCount = targetCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HabitDto habitDto = (HabitDto) o;
    return Objects.equals(this.id, habitDto.id) &&
        Objects.equals(this.title, habitDto.title) &&
        Objects.equals(this.frequency, habitDto.frequency) &&
        Objects.equals(this.targetCount, habitDto.targetCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, frequency, targetCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HabitDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    targetCount: ").append(toIndentedString(targetCount)).append("\n");
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

