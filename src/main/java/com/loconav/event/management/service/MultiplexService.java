package com.loconav.event.management.service;

import com.loconav.event.management.entity.Multiplex;
import com.loconav.event.management.mapper.MultiplexMapper;
import com.loconav.event.management.model.request.CreateMultiplexesRequest;
import com.loconav.event.management.model.response.CreateMultiplexesResponse;
import com.loconav.event.management.model.response.user.MultiplexByEventResponse;
import com.loconav.event.management.repository.EventRepository;
import com.loconav.event.management.repository.MultiplexesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MultiplexService {

    @Autowired
    private MultiplexesRepository multiplexesRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private MultiplexMapper multiplexMapper;

    public CreateMultiplexesResponse create(CreateMultiplexesRequest createMultiplexesRequest) {
        return multiplexMapper.multiplexToMultiplexResponse(multiplexesRepository.save(multiplexMapper.multiplexRequestToMultiplex(createMultiplexesRequest)));
    }

    public List<MultiplexByEventResponse> fetchByEvent(Long eventId) {
        List<Multiplex> multiplexes = multiplexesRepository.fetchByEvent(eventId);
        String eventName = eventRepository.findById(eventId).get().getName();
        List<MultiplexByEventResponse> multiplexesByEventResponse = multiplexes.stream()
                .map(multiplex ->
                             multiplexMapper.multiplexToMultiplexByEventResponse(multiplex)
                ).collect(Collectors.toList());
        for(MultiplexByEventResponse multiplexByEventResponse : multiplexesByEventResponse) {
            multiplexByEventResponse.setEventName(eventName);
        }
        return multiplexesByEventResponse;
    }

    public List<CreateMultiplexesResponse> fetchALl() {
        return multiplexMapper.multiplexListToMultiplexResponseList(multiplexesRepository.fetch());
    }
}
