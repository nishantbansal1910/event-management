package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Price;
import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.Show;
import com.loconav.event.management.model.request.PriceRequest;
import com.loconav.event.management.model.response.PriceResponse;
import com.loconav.event.management.repository.SeatRepository;
import com.loconav.event.management.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PriceMapper {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    SeatRepository seatRepository;

    public Price priceRequestToPrice(PriceRequest priceRequest)
    {
        Show show=showRepository.findById(priceRequest.getShowId()).get();
        Seat seat=seatRepository.findById(priceRequest.getSeatId()).get();

        return Price.builder().price(priceRequest.getPrice()).seat(seat).show(show).build();
    }

    public PriceResponse priceToPriceResponse(Price price){
        return PriceResponse.builder().seatId(price.getSeat().getId()).showId(price.getShow().getId()).price(price.getPrice()).build();
    }
}
