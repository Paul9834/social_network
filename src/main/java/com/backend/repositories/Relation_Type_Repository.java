package com.backend.repositories;

import com.backend.entities.Relation_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface Relation_Type_Repository extends JpaRepository<Relation_Type,Integer > {
}
