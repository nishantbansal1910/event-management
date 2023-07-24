package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Ticket;
import com.loconav.event.management.model.request.user.BookTicketRequest;
import com.loconav.event.management.model.response.user.BookTicketResponse;
import com.loconav.event.management.reposervice.PriceRepoService;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring", uses = {PriceRepoService.class})
public interface TicketMapper {
    TicketMapper INSTANCE= Mappers.getMapper(TicketMapper.class);

    Ticket ticketRequestToTicket(BookTicketRequest bookTicketRequest);

    BookTicketResponse ticketToTicketResponse(Ticket ticket);
}
