package com.loconav.event.management.service;

import com.loconav.event.management.mapper.LayoutMapper;
import com.loconav.event.management.model.request.CreateLayoutRequest;
import com.loconav.event.management.model.response.CreateLayoutResponse;
import com.loconav.event.management.repository.LayoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LayoutService {

    @Autowired
    private LayoutRepository layoutRepository;

    @Autowired
    private LayoutMapper layoutMapper;

    public CreateLayoutResponse create(CreateLayoutRequest createLayoutRequest) {
        return layoutMapper.layoutToLayoutResponse(layoutRepository.save(layoutMapper.layoutRequestToLayout(createLayoutRequest)));
    }

    public List<CreateLayoutResponse> fetchAll() {
        return layoutRepository.fetch().stream().map(layout -> layoutMapper.layoutToLayoutResponse(layout)).collect(Collectors.toList());
    }
}