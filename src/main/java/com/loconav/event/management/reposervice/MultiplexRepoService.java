package com.loconav.event.management.reposervice;

import com.loconav.event.management.entity.Multiplex;
import com.loconav.event.management.repository.MultiplexesRepository;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplexRepoService {
    @Autowired
    public MultiplexesRepository multiplexesRepository;

    @Named(value = "findMultiplex")
    public Multiplex getMultiplex(Long multiplexId) {
        return multiplexesRepository.findById(multiplexId).get();
    }
}
