package com.loconav.event.management.service;

import com.loconav.event.management.mapper.ShowMapper;
import com.loconav.event.management.model.request.CreateShowRequest;
import com.loconav.event.management.model.request.user.ShowsAvailableRequest;
import com.loconav.event.management.model.response.CreateShowResponse;
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

    public CreateShowResponse create(CreateShowRequest createShowRequest) {
        System.out.println(createShowRequest.getShowFormat());
        return showMapper.showToShowResponse(showRepository.save(showMapper.showRequestToShow(createShowRequest)));
    }

    //Filter show response according to event and time as in ShowsAvailableRequest POJO
    public List<CreateShowResponse> fetchByEventAndShowTime(ShowsAvailableRequest showsAvailableRequest) {
        return showRepository.fetchByEventAndTime(showsAvailableRequest.getEventId(), showsAvailableRequest.getShowTime())
                .stream().map(show -> showMapper.showToShowResponse(show)).collect(Collectors.toList());
    }
}
