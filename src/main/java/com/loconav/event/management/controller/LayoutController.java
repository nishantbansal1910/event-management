package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.ListLayoutRequest;
import com.loconav.event.management.model.request.ListMultiplexesRequest;
import com.loconav.event.management.model.response.ListLayoutResponse;
import com.loconav.event.management.model.response.ListMultiplexesResponse;
import com.loconav.event.management.service.LayoutService;
import com.loconav.event.management.service.MultiplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/layouts")
public class LayoutController {
    @Autowired
    public LayoutService layoutService;
    @PostMapping("")
    public ListLayoutResponse layout(@Valid @RequestBody
                                             ListLayoutRequest listLayoutRequest)
    {
        return layoutService.create(listLayoutRequest);
    }
}
