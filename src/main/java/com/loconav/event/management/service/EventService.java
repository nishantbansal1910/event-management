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


    public List<ListEventResponse> fetchByLanguageOrLaunchTime(EventRequest eventRequest) {
//        System.out.println();
        if(eventRequest.getLanguage() == null)  {
            return eventMapper.eventListToEventResponseList(eventRepository.fetchByLanguageOrLaunchTime(eventRequest.getLaunchTime(),
                    null));
        }
        return eventMapper.eventListToEventResponseList(eventRepository.fetchByLanguageOrLaunchTime(eventRequest.getLaunchTime(),
                eventRequest.getLanguage().name()));
    }
  
    //Method to get event with filters in EventRequest POJO
//    public List<ListEventResponse> fetchByLanguageOrLaunchTime(EventRequest eventRequest) {
//            return eventRepository.fetchByLanguageOrLaunchTime().
//                    stream().map(event -> eventMapper.eventToEventResponse(event)).collect(Collectors.toList());
//        }

}
