package com.backend.repositories;

import com.backend.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Notification_Repository extends JpaRepository<Notification, Integer> {
}