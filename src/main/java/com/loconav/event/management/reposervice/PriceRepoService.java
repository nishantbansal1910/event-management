package com.loconav.event.management.reposervice;

import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.Show;
import com.loconav.event.management.repository.PriceRepository;
import com.loconav.event.management.repository.SeatRepository;
import com.loconav.event.management.repository.ShowRepository;
import jdk.jfr.Name;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceRepoService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Named(value = "findShow")
    public Show fecthShow(Long showId) {
        return showRepository.findById(showId).get();
    }

    @Named(value = "findSeat")
    public Seat findSeat(Long seatId) {
        return seatRepository.findById(seatId).get();
    }
}
