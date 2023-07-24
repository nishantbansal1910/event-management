//package com.loconav.event.management.service;
//
//import com.loconav.event.management.entity.Payment;
//import com.loconav.event.management.entity.Ticket;
//import com.loconav.event.management.mapper.TicketMapper;
//import com.loconav.event.management.model.request.user.BookTicketRequest;
//import com.loconav.event.management.model.response.user.BookTicketResponse;
//import com.loconav.event.management.repository.PaymentRepository;
//import com.loconav.event.management.repository.TicketRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Lock;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.LockModeType;
//import javax.transaction.Transactional;
//
//@Service
//public class TicketService {
//
//    @Autowired
//    private TicketRepository ticketRepository;
//
//    @Autowired
//    private PaymentRepository paymentRepository;
//
//    @Autowired
//    private TicketMapper ticketMapper;
//
//    @Lock(LockModeType.PESSIMISTIC_WRITE)
//    @Transactional
//    public BookTicketResponse create(BookTicketRequest bookTicketRequest) {
//        Ticket ticket = ticketMapper.ticketRequestToTicket(bookTicketRequest);
//        Integer amount  = 100; //Calculate amount using join query
//        paymentRepository.save(Payment.builder().paymentMethod(bookTicketRequest.getPaymentMethod()).amount(amount)
//                .ticket(ticket).build());
//        return ticketMapper.ticketToTicketResponse(ticketRepository.save(ticket));
//    }
//}
