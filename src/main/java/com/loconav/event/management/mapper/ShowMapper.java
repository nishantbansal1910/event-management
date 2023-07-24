package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Show;
import com.loconav.event.management.model.request.CreateShowRequest;
import com.loconav.event.management.model.response.CreateShowResponse;
import com.loconav.event.management.reposervice.EventRepoService;
import com.loconav.event.management.reposervice.LayoutRepoService;
import com.loconav.event.management.reposervice.PriceRepoService;
import com.loconav.event.management.reposervice.ShowRepoService;
import com.loconav.event.management.repository.EventRepository;
import com.loconav.event.management.repository.LayoutRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {EventRepoService.class, LayoutRepoService.class})
public interface ShowMapper {

    ShowMapper INSTANCE = Mappers.getMapper(ShowMapper.class);

    @Mapping(target = "event", source = "eventId", qualifiedByName = "findEvent")
    @Mapping(target = "layout", source = "layoutId", qualifiedByName = "findLayout")
    Show showRequestToShow(CreateShowRequest createShowRequest);

    @Mapping(target = "eventId", expression = "java(show.getEvent().getId())")
    @Mapping(target = "LayoutId", expression = "java(show.getLayout().getId())")
    CreateShowResponse showToShowResponse(Show show);

}
