package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.ListLayoutRequest;
import com.loconav.event.management.model.request.ListMultiplexesRequest;
import com.loconav.event.management.model.response.ListLayoutResponse;
import com.loconav.event.management.model.response.ListMultiplexesResponse;
import com.loconav.event.management.service.LayoutService;
import com.loconav.event.management.service.MultiplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("")
    public List<ListLayoutResponse> fetchAll() {
        return layoutService.fetchAll();
    }
}
