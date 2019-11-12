package com.backend.repositories;

import com.backend.entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Gender_Repository extends JpaRepository<Gender,Integer> {
}
