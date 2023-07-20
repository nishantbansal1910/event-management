package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LayoutRepository extends JpaRepository<Price, Long> {

}
