package com.backend.repositories;

import com.backend.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Profile_Repository extends JpaRepository<Profile, Integer> {
    List<Profile> findAllByNameContainsOrLastContains(String pName, String pLast);
}
