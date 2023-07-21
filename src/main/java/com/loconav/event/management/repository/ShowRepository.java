package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM shows")
    List<Show> fetch();

    @Query(nativeQuery = true, value = "SELECT * FROM shows where " +
            "(:eventId is NULL OR event_id = :eventId ) AND " +
            "(:showTime is NULL OR start_time >= :showTime)")
    List<Show> fetchByEventAndTime(Long eventId, Long showTime);

}
