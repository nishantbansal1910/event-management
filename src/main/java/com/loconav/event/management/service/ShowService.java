package com.loconav.event.management.service;

import com.loconav.event.management.mapper.ShowMapper;
import com.loconav.event.management.model.request.ListShowRequest;
import com.loconav.event.management.model.response.ListShowResponse;
import com.loconav.event.management.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private ShowMapper showMapper;

    public ListShowResponse create(ListShowRequest listShowRequest) {
        System.out.println(listShowRequest.getShowFormat());
        return showMapper.showToShowResponse(showRepository.save(showMapper.showRequestToShow(listShowRequest)));
    }
}
