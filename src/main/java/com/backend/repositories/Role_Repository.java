package com.backend.repositories;

import com.backend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Role_Repository extends JpaRepository<Role,Integer> {
}
