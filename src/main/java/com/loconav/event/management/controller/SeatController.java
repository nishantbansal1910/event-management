package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/seats")
public class SeatController {
    @Autowired
    public SeatService seatService;
    @PostMapping("")
    public SeatsResponse seats(@Valid @RequestBody SeatsRequest seatsRequest)
    {
        return seatService.create(seatsRequest);
    }

    @GetMapping("/list")
    public List<SeatsResponse> fetchAvailableSeats(@RequestParam(name = "show_id", required = false) Long showId) {
        return seatService.fetchAvailableSeats(showId);
    }



}
