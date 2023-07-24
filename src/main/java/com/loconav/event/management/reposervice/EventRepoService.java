package com.loconav.event.management.reposervice;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.repository.EventRepository;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRepoService {

    @Autowired
    private EventRepository eventRepository;

    @Named(value = "findEvent")
    public Event fetchSeat(Long eventId) {
        return eventRepository.findById(eventId).get();
    }
}
