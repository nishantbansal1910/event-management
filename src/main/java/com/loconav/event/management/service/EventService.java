package com.loconav.event.management.service;

import com.loconav.event.management.model.request.ListEventRequest;
import com.loconav.event.management.model.request.user.EventRequest;
import com.loconav.event.management.model.response.ListEventResponse;
import com.loconav.event.management.model.response.user.EventsResponse;
import com.loconav.event.management.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    public EventsResponse create(ListEventRequest listEventRequest) {
        return eventMapper.eventToEventResponse(eventRepository.save(eventMapper.eventRequestToEvent(listEventRequest)));
    }

}
