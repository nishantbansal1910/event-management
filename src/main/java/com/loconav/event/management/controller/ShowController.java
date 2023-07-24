package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.CreateShowRequest;
import com.loconav.event.management.model.request.user.ShowsAvailableRequest;
import com.loconav.event.management.model.response.CreateShowResponse;
import com.loconav.event.management.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/shows")
public class ShowController {

    @Autowired
    public ShowService showService;

    @PostMapping("")
    public CreateShowResponse create(@Valid @RequestBody CreateShowRequest createShowRequest) {
        return showService.create(createShowRequest);
    }

    @GetMapping("/list")
    public List<CreateShowResponse> fetch(@RequestParam(name = "event_id", required = false) Long eventId,
                                                            @RequestParam(name = "show_time", required = false) Long showTime) {
        ShowsAvailableRequest showsAvailableRequest = ShowsAvailableRequest.builder().showTime(showTime).eventId(eventId).build();
        return showService.fetchByEventAndShowTime(showsAvailableRequest);
    }

}
