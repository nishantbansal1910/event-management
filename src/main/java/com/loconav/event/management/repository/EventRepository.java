package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
