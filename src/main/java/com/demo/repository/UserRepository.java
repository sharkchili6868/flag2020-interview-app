package com.demo.repository;

import com.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT COUNT(*) FROM User u WHERE u.username = :username", nativeQuery = true)
    int checkIfUserExists(String username);

    @Query(value = "SELECT COUNT(*) FROM User u WHERE u.username = :username AND u.password = :password",
            nativeQuery = true)
    int checkIfPasswordMatch(String username, String password);

}
