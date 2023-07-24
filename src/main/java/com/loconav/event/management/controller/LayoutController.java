package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.CreateLayoutRequest;
import com.loconav.event.management.model.response.CreateLayoutResponse;
import com.loconav.event.management.service.LayoutService;
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
    public CreateLayoutResponse create(@Valid @RequestBody
                                     CreateLayoutRequest createLayoutRequest) {
        return layoutService.create(createLayoutRequest);
    }

    @GetMapping("")
    public List<CreateLayoutResponse> fetch() {
        return layoutService.fetchAll();
    }
}
