package com.loconav.event.management.reposervice;

import com.loconav.event.management.entity.Layout;
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
    private LayoutRepository layoutRepository;

    @Named(value = "findLayout")
    public Layout fetchLayout(Long layoutId) {
        return layoutRepository.findById(layoutId).get();
    }
}
