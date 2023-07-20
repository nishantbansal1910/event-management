package com.loconav.event.management.controller;

import com.loconav.event.management.enums.Language;
import com.loconav.event.management.enums.ShowFormat;
import com.loconav.event.management.model.request.EventRequest;
import com.loconav.event.management.model.request.user.EventsRequest;
import com.loconav.event.management.model.response.ListEventResponse;
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
    @PostMapping("")
    public ListEventResponse events(@Valid @RequestBody EventRequest eventRequest)
    {
        return EventService.create(eventRequest);
    }

    @GetMapping("/list")
    public ListEventResponse listAll(@RequestParam(name = "location",required = false)final String location,
                                     @RequestParam(name = "language",required = false)final Language language,
                                     @RequestParam(name = "show_format",required = false)final ShowFormat showFormat){
        EventsRequest eventsRequest=
                EventsRequest.builder().location(location).language(language).showFormat(showFormat).build();
        return EventService.list(eventsRequest);
    }

}
