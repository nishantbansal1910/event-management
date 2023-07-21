package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM users where :id is null or id=:id")
    List<User> fetch(Integer id);

}
