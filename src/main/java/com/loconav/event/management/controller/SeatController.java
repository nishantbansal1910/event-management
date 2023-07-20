package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/seats")
public class SeatController {
    @Autowired
    public SeatService seatService;
//    @PostMapping("")
//    public SeatsResponse seats(@Valid @RequestBody SeatsRequest seatsRequest)
//    {
//        return seatService.create(seatsRequest);
//    }



}
