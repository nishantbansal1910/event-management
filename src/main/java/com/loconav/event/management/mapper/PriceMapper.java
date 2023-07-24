package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Price;
import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.Show;
import com.loconav.event.management.model.request.PriceRequest;
import com.loconav.event.management.model.response.PriceResponse;
import com.loconav.event.management.reposervice.PriceRepoService;
import com.loconav.event.management.reposervice.SeatRepoService;
import com.loconav.event.management.reposervice.ShowRepoService;
import com.loconav.event.management.repository.SeatRepository;
import com.loconav.event.management.repository.ShowRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring", uses = {ShowRepoService.class, SeatRepoService.class})
public interface PriceMapper {

    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    @Mapping(target = "show", source = "showId", qualifiedByName = "findShow")
    @Mapping(target = "seat", source = "seatId", qualifiedByName = "findSeat")
    public Price priceRequestToPrice(PriceRequest priceRequest);

    @Mapping(target = "seatId", expression = "java(price.getSeat().getId())")
    @Mapping(target = "showId", expression = "java(price.getShow().getId())")
    public PriceResponse priceToPriceResponse(Price price);

}
