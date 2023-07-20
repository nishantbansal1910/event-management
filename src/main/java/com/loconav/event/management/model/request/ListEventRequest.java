package com.loconav.event.management.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class ListEventRequest {
    private String name;
    private Language language;
    private String host;
    private Long duration;
    private Float rating;
    @JsonProperty("number_of_users_rated")
    private Long numberOfUsersRated;
    @JsonProperty("event_type")
    private EventType eventType;
}



