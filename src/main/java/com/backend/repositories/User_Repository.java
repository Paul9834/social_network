package com.backend.repositories;

import com.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User_Repository extends JpaRepository<User,Integer > {
    User findByNick(String nick);
    List<User> findAllByNickContains(String nick);
}