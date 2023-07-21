package com.loconav.event.management.service;

import com.loconav.event.management.mapper.PriceMapper;
import com.loconav.event.management.model.request.PriceRequest;
import com.loconav.event.management.model.request.SeatsRequest;
import com.loconav.event.management.model.response.PriceResponse;
import com.loconav.event.management.model.response.SeatsResponse;
import com.loconav.event.management.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    @Autowired
    private PriceMapper priceMapper;

    @Autowired
    private PriceRepository priceRepository;
    public PriceResponse create(PriceRequest priceRequest) {
//        System.out.println(seatsRequest.getSeatType());
        return priceMapper.priceToPriceResponse(priceRepository.save(priceMapper.priceRequestToPrice(priceRequest)));
    }
}
