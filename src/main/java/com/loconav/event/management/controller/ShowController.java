package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.ListShowRequest;
import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.request.user.ShowsAvailableRequest;
import com.loconav.event.management.model.response.ListShowResponse;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.service.SeatService;
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
    public ListShowResponse shows(@Valid @RequestBody ListShowRequest listShowRequest)
    {
        return showService.create(listShowRequest);
    }
    @GetMapping("/list")
    public List<ListShowResponse> fetchByEventOrStartTime(@RequestParam(name = "event_id", required = false) Long eventId,
                                                          @RequestParam(name = "show_time", required = false) Long showTime) {
        ShowsAvailableRequest showsAvailableRequest = ShowsAvailableRequest.builder().ShowTime(showTime).eventId(eventId).build();
        return showService.fetchByEventAndShowTime(showsAvailableRequest);
    }

}
