package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.PriceRequest;
import com.loconav.event.management.model.response.PriceResponse;
import com.loconav.event.management.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/prices")
public class PriceController {
    @Autowired
    public PriceService priceService;
    @PostMapping("")
    public PriceResponse create(@Valid @RequestBody final PriceRequest priceRequest)
    {
        return priceService.create(priceRequest);
    }
}
