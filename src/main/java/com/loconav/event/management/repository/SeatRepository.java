package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {
}
