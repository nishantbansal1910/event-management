package com.loconav.event.management.service;

import com.loconav.event.management.model.request.ListShowRequest;
import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.ListShowResponse;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private SeatMapper seatMapper;

    public SeatsResponse create(SeatsRequest seatsRequest) {
        return seatMapper.seatToSeatResponse(seatRepository.save(seatMapper.seatRequestToSeat(seatsRequest)));
    }
}
