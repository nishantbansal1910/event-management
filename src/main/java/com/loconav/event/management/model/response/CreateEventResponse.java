package com.loconav.event.management.model.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.loconav.event.management.enums.EventType;
import com.loconav.event.management.enums.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateEventResponse {
    private Long id;
    private String name;
    private Language language;
    private String host;
    private Long duration;
    private Float rating;
    private Long numberOfUsersRated;
    private EventType eventType;
}
