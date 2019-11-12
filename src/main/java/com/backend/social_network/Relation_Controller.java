package com.backend.social_network;

import com.backend.entities.Relation;
import com.backend.repositories.Relation_Repository;
import com.backend.repositories.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Relation_Controller {

    @Autowired
    Relation_Repository relation_repository;

    @Autowired
    User_Repository user_repository;

    @DeleteMapping("/friend/delete")
    public void deleteFriend(@RequestBody Relation relation) {
        relation_repository.delete(relation_repository.getOne(relation.getId()));
    }

    @PostMapping("/friend/add")
    public void addRelation(@RequestBody Relation relation){
        relation_repository.save(relation);
    }

}
