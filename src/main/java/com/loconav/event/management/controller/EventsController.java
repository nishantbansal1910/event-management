package com.loconav.event.management.controller;

import com.loconav.event.management.enums.Language;
import com.loconav.event.management.model.request.CreateEventRequest;
import com.loconav.event.management.model.request.user.EventRequest;
import com.loconav.event.management.model.response.CreateEventResponse;
import com.loconav.event.management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
public class EventsController {

    @Autowired
    private EventService eventService;

    @PostMapping("")
    public CreateEventResponse create(@RequestBody CreateEventRequest createEventRequest) {
        return eventService.create(createEventRequest);

    }

    @GetMapping("")
    public List<CreateEventResponse> fetch(@RequestParam(name = "language",required = false)final Language language,
                                           @RequestParam(name = "launch_time",required = false)final Long launchTime) {
        EventRequest eventRequest=
                EventRequest.builder().language(language).launchTime(launchTime).build();
        return eventService.fetchByLanguageOrLaunchTime(eventRequest);
    }

}
