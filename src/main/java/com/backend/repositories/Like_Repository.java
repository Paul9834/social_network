package com.backend.repositories;

import com.backend.entities.Like;
import com.backend.entities.Like_Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Like_Repository extends JpaRepository<Like, Like_Id> {
}