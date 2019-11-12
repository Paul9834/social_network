package com.backend.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class Like_Id implements Serializable {

    @ManyToOne(optional = false)
    @JoinColumn(name = "User", nullable = false)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Publication", nullable = false)
    private Publication publication;

    public Like_Id(){
    }

    public Like_Id(User user, Publication publication){
        setUser(user);
        setPublication(publication);
    }

    public User getUser() {
        return user;
    }

    public Publication getPublication() {
        return publication;
    }

    private void setUser(User user) {
        this.user = user;
    }

    private void setPublication(Publication publication) {
        this.publication = publication;
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
