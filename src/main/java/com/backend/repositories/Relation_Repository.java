package com.backend.repositories;

import com.backend.entities.Relation;
import com.backend.entities.Relation_Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Relation_Repository extends JpaRepository<Relation, Relation_Id> {
}
