package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.ListShowRequest;
import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.ListShowResponse;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.service.SeatService;
import com.loconav.event.management.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
}
