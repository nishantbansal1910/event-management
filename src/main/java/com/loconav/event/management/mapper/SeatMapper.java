package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.reposervice.LayoutRepoService;
import com.loconav.event.management.reposervice.PriceRepoService;
import com.loconav.event.management.repository.LayoutRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring", uses = {LayoutRepoService.class})
public interface SeatMapper {

    SeatMapper INSTANCE = Mappers.getMapper(SeatMapper.class);

    @Mapping(target = "layout", source = "layoutId", qualifiedByName = "findLayout")
    Seat seatRequestToSeat(SeatsRequest seatsRequest);

    @Mapping(target = "layoutId", expression = "java(seat.getLayout().getId()")
    SeatsResponse seatToSeatResponse(Seat seat);
}
