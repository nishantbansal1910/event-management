package com.loconav.event.management.service;

import com.loconav.event.management.mapper.SeatMapper;
import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private SeatMapper seatMapper;

    public SeatsResponse create(SeatsRequest seatsRequest) {
        System.out.println(seatsRequest.getSeatType());
        return seatMapper.seatToSeatResponse(seatRepository.save(seatMapper.seatRequestToSeat(seatsRequest)));
    }

    public List<SeatsResponse> fetchAvailableSeats(Long showId) {
        return seatRepository.fetchAvailableTickets(showId).stream().map(seat -> seatMapper.seatToSeatResponse(seat)).collect(Collectors.toList());
    }
}
