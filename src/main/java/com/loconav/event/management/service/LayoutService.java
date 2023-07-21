package com.loconav.event.management.service;

import com.loconav.event.management.mapper.LayoutMapper;
import com.loconav.event.management.model.request.ListLayoutRequest;
import com.loconav.event.management.model.response.ListLayoutResponse;
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

    public ListLayoutResponse create(ListLayoutRequest listLayoutRequest) {
//        System.out.println();
        return layoutMapper.layoutToLayoutResponse(layoutRepository.save(layoutMapper.layoutRequestToLayout(listLayoutRequest)));
    }

    public List<ListLayoutResponse> fetchAll() {
        return layoutRepository.fetch().stream().map(layout -> layoutMapper.layoutToLayoutResponse(layout)).collect(Collectors.toList());
    }
}