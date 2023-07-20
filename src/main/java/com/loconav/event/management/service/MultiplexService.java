package com.loconav.event.management.service;

import com.loconav.event.management.model.request.ListMultiplexesRequest;
import com.loconav.event.management.model.response.ListMultiplexesResponse;
import com.loconav.event.management.repository.MultiplexesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplexService {

    @Autowired
    private MultiplexesRepository multiplexesRepository;

    @Autowired
    private MultiplexMapper multiplexMapper;

    public ListMultiplexesResponse create(ListMultiplexesRequest listMultiplexesRequest) {
        return multiplexMapper.multiplexToMultiplexResponse(multiplexesRepository.save(multiplexMapper.multiplexRequestToMultiplex(listMultiplexesRequest)));
    }
}
