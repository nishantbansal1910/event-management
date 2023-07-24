package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Show;
import com.loconav.event.management.model.request.CreateShowRequest;
import com.loconav.event.management.model.response.CreateShowResponse;
import com.loconav.event.management.repository.EventRepository;
import com.loconav.event.management.repository.LayoutRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper
public interface ShowMapper {




//    @Mapping(target = "event", source = "eventId", )
//    Show showRequestToShow(CreateShowRequest createShowRequest);

    CreateShowResponse showToShowResponse(Show show);

//    @Autowired
//    EventRepository eventRepository;
//
//    @Autowired
//    LayoutRepository layoutRepository;
//
//    public Show showRequestToShow(CreateShowRequest createShowRequest) {
//        Event event = eventRepository.findById(createShowRequest.getEventId()).get();
//        Layout layout = layoutRepository.findById(createShowRequest.getLayoutId()).get();
//        return Show.builder().startTime(createShowRequest.getStartTime())
//                .showFormat(createShowRequest.getShowFormat()).event(event).layout(layout).build();
//    }
//
//    public CreateShowResponse showToShowResponse(Show show) {
//        return CreateShowResponse.builder().eventId(show.getEvent().getId())
//                .layoutId(show.getLayout().getId()).showFormat(show.getShowFormat())
//                .startTime(show.getStartTime()).build();
//    }
}
