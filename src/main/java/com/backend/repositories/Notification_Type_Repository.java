package com.backend.repositories;

import com.backend.entities.Notification_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface Notification_Type_Repository extends JpaRepository<Notification_Type, Integer> {
}

