package com.loconav.event.management.repository;

import com.loconav.event.management.entity.Seat;
import com.loconav.event.management.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    @Query(nativeQuery = true, value = "SELECT * FROM users")
    List<User> fetch();

}
