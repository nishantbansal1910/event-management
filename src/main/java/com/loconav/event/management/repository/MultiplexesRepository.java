package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Multiplex;
import com.loconav.event.management.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MultiplexesRepository extends JpaRepository<Multiplex, Long> {

}
