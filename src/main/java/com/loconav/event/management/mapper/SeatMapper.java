package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.repository.LayoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeatMapper {
    @Autowired
    LayoutRepository layoutRepository;

    public Seat seatRequestToSeat(SeatsRequest seatsRequest) {
        Layout layout = layoutRepository.findById(seatsRequest.getLayoutId()).get();
        return Seat.builder().layout(layout).seatType(seatsRequest.getSeatType())
                .rating(seatsRequest.getRating()).row(seatsRequest.getRow()).col(seatsRequest.getCol()).build();
    }

    public SeatsResponse seatToSeatResponse(Seat seat)
    {
        return SeatsResponse.builder().layoutId(seat.getLayout().getId()).seatId(seat.getId()).col(seat.getCol()).row(seat.getRow()).build();
    }
}
