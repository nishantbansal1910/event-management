package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Multiplex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MultiplexesRepository extends JpaRepository<Multiplex, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM multiplexes")
    List<Multiplex> fetch();

    @Query(nativeQuery = true, value = "SELECT m.id, m.name, m.city, m.address FROM multiplexes m " +
            "join layouts l on l.multiplex_id = m.id" +
            "join shows s on s.layout_id = l.id" +
            "join events e.id = s.event_id ")
    List<Multiplex> fetchByEvent(Long eventId);
}
