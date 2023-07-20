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
public class EventRequest {
    @NotBlank
    private String eventName;
    @NotBlank
    private String language;
    @NotBlank
    private String host;
    @NotNull
    private Long duration;
    @NotNull
    private Double rating;
    @NotNull
    private Long numberOfUsersRated;
    @NotBlank
    private String type;
}
