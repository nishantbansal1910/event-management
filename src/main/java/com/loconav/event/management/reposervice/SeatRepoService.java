package com.loconav.event.management.reposervice;

import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.repository.SeatRepository;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatRepoService {

    @Autowired
    private SeatRepository seatRepository;

    @Named(value = "findSeat")
    public Seat findSeat(Long seatId) {
        return seatRepository.findById(seatId).get();
    }
}
