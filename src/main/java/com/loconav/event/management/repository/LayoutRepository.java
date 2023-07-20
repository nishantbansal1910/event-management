package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Event;
import com.loconav.event.management.entity.Layout;
import com.loconav.event.management.entity.Multiplex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LayoutRepository extends JpaRepository<Layout, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM layouts")
    List<Layout> fetch();
}
