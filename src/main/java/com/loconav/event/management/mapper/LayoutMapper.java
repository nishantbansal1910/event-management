package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.model.request.CreateLayoutRequest;
import com.loconav.event.management.model.response.CreateLayoutResponse;
import com.loconav.event.management.reposervice.LayoutRepoService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring", uses = {LayoutRepoService.class})
public interface LayoutMapper {

    LayoutMapper INSTANCE= Mappers.getMapper(LayoutMapper.class);

    @Mapping(target = "multiplex", source = "multiplexId", qualifiedByName = "findMultiplex")
    Layout layoutRequestToLayout(CreateLayoutRequest createLayoutRequest);

    @Mapping(target = "multiplexId", expression = "java(layout.getMultiplex().getId())")
    CreateLayoutResponse layoutToLayoutResponse(Layout layout);
}
