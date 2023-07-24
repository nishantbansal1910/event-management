package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.model.request.CreateLayoutRequest;
import com.loconav.event.management.model.response.CreateLayoutResponse;
import com.loconav.event.management.reposervice.LayoutRepoService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {LayoutRepoService.class})
public interface LayoutMapper {

    LayoutMapper INSTANCE= Mappers.getMapper(LayoutMapper.class);

    @Mapping(target = "multiplex", source = "multiplexId", qualifiedByName = "findMultiplex")
    Layout layoutRequestToLayout(CreateLayoutRequest createLayoutRequest);

    @Mapping(target = "multiplexId", expression = "java(layout.getId())")
    CreateLayoutResponse layoutToLayoutResponse(Layout layout);

//    @Autowired
//    MultiplexesRepository multiplexesRepository;

//    public Layout layoutRequestToLayout(ListLayoutRequest listLayoutRequest){
//        Multiplex multiplex=
//                multiplexesRepository.findById(listLayoutRequest.getMultiplexId()).get();
//        return Layout.builder().name(listLayoutRequest.getName()).multiplex(multiplex).build();
//    }

//    public ListLayoutResponse layoutToLayoutResponse(Layout layout)
//    {
//        return ListLayoutResponse.builder().id(layout.getId()).name(layout.getName()).multiplexId(layout.getMultiplex().getId()).build();
//    }
}
