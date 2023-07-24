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


//    @Query(nativeQuery = true, value = "SELECT shows.* FROM shows" +
//            "inner join layouts l on l.id = shows.layout_id " +
//            "inner join seats on seats.layout_id = layouts.id " +
//            "left join ticket_seat on ticket_seat.seat_id = seats.id " +
//            "where ts.seat_id is NULL ")
//        @Query(nativeQuery = true, value = "SELECT s.* from seats s " +
//                "left join ticket_seat ts on ts.seat_id = s.id " +
//                "WHERE (:showId is NULL OR ts.show_id = :showId) AND (ts.seat_id is NULL OR ts.status = 'cancelled')")
    @Query(nativeQuery = true, value = "select * from seats s left join ticket_seat ts on ts.seat_id = s.id " +
            "and ts.show_id = :showId where ts.seat_id is null")
    List<Seat> fetchAvailableTickets(Long showId);
}
