package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM tickets")
    List<Ticket> fetch();
}
