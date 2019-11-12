package com.backend.repositories;

import com.backend.entities.Keep;
import com.backend.entities.Keep_Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Keep_Repository extends JpaRepository<Keep, Keep_Id> {
}
