package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Multiplex;
import com.loconav.event.management.entity.Price;
import com.loconav.event.management.model.response.user.MultiplexByEventResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface MultiplexesRepository extends JpaRepository<Multiplex, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM multiplexes")
    List<Multiplex> fetch();

    @Query(nativeQuery = true, value = "SELECT m.* FROM multiplexes m " +
            "inner join layouts l on l.multiplex_id = m.id " +
            "inner join shows s on s.layout_id = l.id " +
            "inner join events e on e.id = s.event_id " +
            "WHERE (:eventId is NULL OR e.id = :eventId) ")
    List<Multiplex> fetchByEvent(Long eventId);

}
