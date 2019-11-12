package com.backend.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class Relation_Id implements Serializable {

    @ManyToOne(optional = false)
    @JoinColumn(name = "Fist_User", nullable = false)
    private User fist_user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Second_User", nullable = false)
    private User second_user;

    public Relation_Id(){
    }

    public Relation_Id(User fist_user, User second_user){
        setFist_user(fist_user);
        setSecond_user(second_user);
    }

    public User getFist_user() {
        return fist_user;
    }

    public User getSecond_user() {
        return second_user;
    }

    private void setFist_user(User fist_user) {
        this.fist_user = fist_user;
    }

    private void setSecond_user(User second_user) {
        this.second_user = second_user;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
