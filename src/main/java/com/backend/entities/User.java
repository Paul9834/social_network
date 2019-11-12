package com.backend.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nick_name", nullable = false, unique = true)
    private String nick;

    @Column(name = "Active" , nullable = false)
    private boolean active;

    @OneToOne(mappedBy = "user")
    private Profile profile;

    @OneToMany(mappedBy = "user")
    private List<Publication> publications;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Role" , nullable = false)
    private Role role;

    @OneToMany(mappedBy = "id.fist_user")
    private List<Relation> myRelations;

    @OneToMany(mappedBy = "id.second_user")
    private List<Relation> relations;

    @OneToMany(mappedBy = "id.user")
    private List<Keep> keeps;

    @OneToMany(mappedBy = "id.user")
    private List<Like> likes;

    @OneToMany(mappedBy = "user")
    private List<Notification> notifications;

    public User(){
    }

    public User(String name, Role rol){
        setNick(name);
        setActive(true);
        setRole(role);
    }

    public int getId() {
        return id;
    }

    public String getNick(){
        return nick;
    }

    public boolean isActive(){
        return active;
    }

    private void setNick(String name) {
        this.nick = name;
    }

    private void setRole(Role role) {
        this.role = role;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
