package com.loconav.event.management.service;

import com.loconav.event.management.mapper.ShowMapper;
import com.loconav.event.management.model.request.ListShowRequest;
import com.loconav.event.management.model.request.user.ShowsAvailableRequest;
import com.loconav.event.management.model.response.ListShowResponse;
import com.loconav.event.management.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private ShowMapper showMapper;

    public ListShowResponse create(ListShowRequest listShowRequest) {
        return showMapper.showToShowResponse(showRepository.save(showMapper.showRequestToShow(listShowRequest)));
    }

    //Filter show response according to event and time as in ShowsAvailableRequest POJO
    public List<ListShowResponse> fetchByEventAndShowTime(ShowsAvailableRequest showsAvailableRequest) {
        return showRepository.fetchByEventAndTime(showsAvailableRequest.getEventId(), showsAvailableRequest.getShowTime())
                .stream().map(show -> showMapper.showToShowResponse(show)).collect(Collectors.toList());
    }
}
