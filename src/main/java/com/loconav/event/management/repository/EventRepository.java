package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.enums.Language;
import com.loconav.event.management.enums.ShowFormat;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(nativeQuery = true, value = "SELECT * from events")
    List<Event> fetch();

    @Query(nativeQuery = true, value = "SELECT * FROM events WHERE" +
            "(:location is NULL OR location = :location) AND " +
            "(:language is NULL OR :language = language ) AND " +
            "(:showFormat is NULL OR :showFormat = showFormat)")

    List<Event> fetchFilter(String location, Language language, ShowFormat showFormat);

    List<Event> fetchByLocationAndTmeAndShowFormat(String location, String language, String showFormat);


}
