package com.loconav.event.management.controller;

import com.loconav.event.management.enums.Language;
import com.loconav.event.management.enums.ShowFormat;
import com.loconav.event.management.model.request.ListEventRequest;
import com.loconav.event.management.model.request.user.EventRequest;
import com.loconav.event.management.model.request.ListEventRequest;
import com.loconav.event.management.model.response.ListEventResponse;
import com.loconav.event.management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/events")
public class EventsController {
    @Autowired
    public EventService eventService;
    @PostMapping("")
    public ListEventResponse events(@RequestBody ListEventRequest listEventRequest)
    {
        System.out.println("REQUEST SENT:");
        System.out.println(listEventRequest);
        return eventService.create(listEventRequest);

    }

//    @GetMapping("/list")
//    public ListEventResponse listAll(@RequestParam(name = "location",required = false)final String location,
//                                     @RequestParam(name = "language",required = false)final Language language,
//                                     @RequestParam(name = "show_format",required = false)final ShowFormat showFormat){
//        EventRequest eventRequest=
//                EventRequest.builder().location(location).language(language).showFormat(showFormat).build();
//        return EventService.list(eventRequest);
//    }

}
