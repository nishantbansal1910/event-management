package com.loconav.event.management.model.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ListEventResponse {
    private Integer eventId;
    private String eventName;
    private String language;
    private String host;
    private Long duration;
    private Double rating;
    private Long numberOfUsersRated;
    private String type;
}
