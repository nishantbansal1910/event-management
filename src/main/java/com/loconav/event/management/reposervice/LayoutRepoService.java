package com.loconav.event.management.reposervice;

import com.loconav.event.management.entity.Multiplex;
import com.loconav.event.management.repository.LayoutRepository;
import com.loconav.event.management.repository.MultiplexesRepository;
import lombok.NonNull;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class LayoutRepoService {
    @Autowired
    public MultiplexesRepository multiplexesRepository;
    @Named(value = "findMultiplex")
    public Optional<Multiplex> getMultiplex(Long multiplexId) {
        return multiplexesRepository.findById(multiplexId);
    }
}
