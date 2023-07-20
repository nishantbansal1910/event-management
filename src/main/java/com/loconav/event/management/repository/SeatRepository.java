package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM seats")
    List<Seat> fetch();
}
