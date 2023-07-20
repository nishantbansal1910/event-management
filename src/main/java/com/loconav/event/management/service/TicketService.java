//package com.loconav.event.management.service;
//
//import com.loconav.event.management.mapper.TicketMapper;
//import com.loconav.event.management.model.request.user.BookTicketRequest;
//import com.loconav.event.management.model.response.user.BookTicketResponse;
//import com.loconav.event.management.repository.TicketRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TicketService {
//
//    @Autowired
//    private TicketRepository ticketRepository;
//
//    @Autowired
//    private TicketMapper ticketMapper;
//
//    public BookTicketResponse create(BookTicketRequest bookTicketRequest) {
//        return ticketMapper.ticketToTicketResponse(ticketRepository.save(ticketMapper.ticketRequestToTicket(bookTicketRequest)));
//    }
//}
