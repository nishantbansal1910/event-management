package com.loconav.event.management.reposervice;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.Show;
import com.loconav.event.management.repository.EventRepository;
import com.loconav.event.management.repository.LayoutRepository;
import com.loconav.event.management.repository.SeatRepository;
import com.loconav.event.management.repository.ShowRepository;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowRepoService {

    @Autowired
    private ShowRepository showRepository;

    @Named(value = "findShow")
    public Show fecthShow(Long showId) {
        return showRepository.findById(showId).get();
    }
}
