package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.Show;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository {

    @Query(nativeQuery = true, value = "SELECT * FROM shows")
    List<Show> fetch();

    @Query(nativeQuery = true, value = "SELECT * FROM shows where event_id = :eventId && start_time >= :showTime")
    List<Show> fetchByEventAndTime(Long eventId, Long showTime);
}
