package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.ListMultiplexesRequest;
import com.loconav.event.management.model.response.ListMultiplexesResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/multilexes")
public class MultiplexController {
    @PostMapping("")
    public ListMultiplexesResponse multiplex(@Valid @RequestBody ListMultiplexesRequest listMultiplexesRequest)
    {
        return MultiplexService.create(listMultiplexesRequest);
    }

    @GetMapping("/list")
    public List<ListMultiplexesResponse> listAll(@RequestParam (name = "city",required = false)final String city)
    {
        return MultiplexService.list(city);
    }
}
