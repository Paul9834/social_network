package com.backend.social_network;

import com.backend.entities.Profile;
import com.backend.entities.User;
import com.backend.repositories.Gender_Repository;
import com.backend.repositories.Profile_Repository;
import com.backend.repositories.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Profile_Controller {

    @Autowired
    Profile_Repository profile_repository;

    @Autowired
    User_Repository user_repository;

    @GetMapping("/profile/{nick}")
    public Profile getProfile(@PathVariable String nick){
        return profile_repository.getOne(user_repository.findByNick(nick).getId());
    }

    @PostMapping("/profile/modify")
    public void modifyProfile(@RequestBody Profile profile){
        profile_repository.save(profile);
    }

    @GetMapping("/search/{pName}")
    public List<Profile> getProfiles(@PathVariable String pName){
        return profile_repository.findAllByNameContainsOrLastContains(pName,pName);
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="content", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
