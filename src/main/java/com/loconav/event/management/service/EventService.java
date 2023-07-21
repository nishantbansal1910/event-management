package com.loconav.event.management.service;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.mapper.EventMapper;
import com.loconav.event.management.model.request.ListEventRequest;
import com.loconav.event.management.model.request.user.EventRequest;
import com.loconav.event.management.model.response.ListEventResponse;
import com.loconav.event.management.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import java.util.stream.Collectors;


@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    public ListEventResponse create(ListEventRequest listEventRequest) {
//        System.out.println(listEventRequest);
        Event event = eventMapper.eventRequestToEvent(listEventRequest);
        System.out.println(event);
        return eventMapper.eventToEventResponse(eventRepository.save(event));
    }


    public List<ListEventResponse> list(EventRequest eventRequest){
        return eventMapper.eventListToEventResponseList(eventRepository.fetchFilter(eventRequest.getLocation(),
                eventRequest.getLanguage(),eventRequest.getShowFormat()));
  
    //Method to get event with filters in EventRequest POJO
    public List<ListEventResponse> fetchByLocationAndTmeAndShowFormat(EventRequest eventRequest) {
        return eventRepository.fetchByLocationAndTmeAndShowFormat(eventRequest.getLocation(),
                eventRequest.getLanguage().toString(), eventRequest.getShowFormat().toString()).
                stream().map(event -> eventMapper.eventToEventResponse(event)).collect(Collectors.toList());

    }
}
