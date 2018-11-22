package com.sda.demo.repositories;

import com.sda.demo.dto.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer> {

    Iterable<User> findAllByName (String name);

    @Query("select u.name from User u where u.id = :id")
    String findNameById(@Param("id")Integer id);

}
