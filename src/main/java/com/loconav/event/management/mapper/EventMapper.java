package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.model.request.ListEventRequest;
import com.loconav.event.management.model.response.ListEventResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface EventMapper {
    EventMapper INSTANCE= Mappers.getMapper(EventMapper.class);
    Event eventRequestToEvent(final ListEventRequest listEventRequest);
    ListEventResponse eventToEventResponse(final Event event);

    List<ListEventResponse> eventListToEventResponseList(final List<Event> event);
}
