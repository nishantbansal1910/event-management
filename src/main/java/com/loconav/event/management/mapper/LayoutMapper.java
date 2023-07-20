package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Multiplex;
import com.loconav.event.management.model.request.ListLayoutRequest;
import com.loconav.event.management.model.response.ListLayoutResponse;
import com.loconav.event.management.repository.MultiplexesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LayoutMapper {

    @Autowired
    MultiplexesRepository multiplexesRepository;

    public Layout layoutRequestToLayout(ListLayoutRequest listLayoutRequest){
        Multiplex multiplex=
                multiplexesRepository.findById(listLayoutRequest.getMultiplexId()).get();
        return Layout.builder().name(listLayoutRequest.getName()).multiplex(multiplex).build();
    }

    public ListLayoutResponse layoutToLayoutResponse(Layout layout)
    {
        return ListLayoutResponse.builder().id(layout.getId()).name(layout.getName()).multiplexId(layout.getMultiplex().getId()).build();
    }
}
