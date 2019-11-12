package com.backend.repositories;

import com.backend.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Publication_Repository extends JpaRepository<Publication,Integer> {
}
