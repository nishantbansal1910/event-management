package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM seats")
    List<Seat> fetch();

//    @Query(nativeQuery = true, value = "SELECT s.* from seats s " +
//            "left join ticket_seat ts on ts.seat_id = s.id " +
//            "WHERE (:showId is NULL OR ts.show_id = :showId) AND (ts.seat_id is NULL OR ts.status = 'cancelled')")
    @Query(nativeQuery = true, value = "SELECT s.* FROM seats s" +
            "inner join layouts l on l.id = ")
    List<Seat> fetchAvailableTickets(Long showId);
}
