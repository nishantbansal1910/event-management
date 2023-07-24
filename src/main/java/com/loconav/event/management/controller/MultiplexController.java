package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.CreateMultiplexesRequest;
import com.loconav.event.management.model.response.CreateMultiplexesResponse;
import com.loconav.event.management.model.response.user.MultiplexByEventResponse;
import com.loconav.event.management.service.MultiplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/multiplexes")
public class MultiplexController {
    @Autowired
    public MultiplexService multiplexService;
    @PostMapping("")
    public CreateMultiplexesResponse create(@Valid @RequestBody CreateMultiplexesRequest createMultiplexesRequest)
    {
        return multiplexService.create(createMultiplexesRequest);
    }

    @GetMapping("/list")
    public List<MultiplexByEventResponse> fetch(@RequestParam(name = "event_id", required = false)
                                                      Long eventId) {
        return multiplexService.fetchByEvent(eventId);
    }
}
