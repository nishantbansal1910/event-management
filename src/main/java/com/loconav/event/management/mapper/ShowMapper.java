package com.loconav.event.management.mapper;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Price;
import com.loconav.event.management.entity.Show;
import com.loconav.event.management.enums.ShowFormat;
import com.loconav.event.management.model.request.ListShowRequest;
import com.loconav.event.management.model.response.ListShowResponse;
import com.loconav.event.management.repository.EventRepository;
import com.loconav.event.management.repository.LayoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
@Component
public class ShowMapper {
    @Autowired
    EventRepository eventRepository;

    @Autowired
    LayoutRepository layoutRepository;

    public Show showRequestToShow(ListShowRequest listShowRequest) {
        Event event = eventRepository.findById(listShowRequest.getEventId()).get();
        Layout layout = layoutRepository.findById(listShowRequest.getLayoutId()).get();
        return Show.builder().startTime(listShowRequest.getStartTime())
                .showFormat(listShowRequest.getShowFormat()).event(event).layout(layout).build();
    }

    public ListShowResponse showToShowResponse(Show show) {
        return ListShowResponse.builder().eventId(show.getEvent().getId())
                .layoutId(show.getLayout().getId()).showFormat(show.getShowFormat())
                .startTime(show.getStartTime()).build();
    }
}
