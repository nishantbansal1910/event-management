package com.loconav.event.management.model.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.loconav.event.management.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SeatsResponse {
    private Long seatId;
    private Character row;
    private Integer col;
//    private Integer price;
    private Float rating;
    private SeatType seatType;
    private Long layoutId;

}
