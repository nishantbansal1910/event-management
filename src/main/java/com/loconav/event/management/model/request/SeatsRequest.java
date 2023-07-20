package com.loconav.event.management.model.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SeatsRequest {
    @NotBlank
    private Character row;
    @NotNull
    private Integer col;
    @NotNull
    private Integer price;
    @NotNull
    private Double rating;
    @NotBlank
    private String seatType;
    @NotNull
    private Long layoutId;
}
