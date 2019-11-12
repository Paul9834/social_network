package com.backend.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "Relations")
public class Relation implements Serializable {

    @EmbeddedId
    private Relation_Id id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Relation_Type", nullable = false)
    private Relation_Type type;

    public Relation(){
    }

    public Relation(Relation_Type type, User fist_user, User second_user) {
        setId(new Relation_Id(fist_user, second_user));
        setType(type);
    }

    public Relation_Id getId() {
        return id;
    }

    public Relation_Type getType() {
        return type;
    }

    public User getPrincipal_user() {
        return id.getFist_user();
    }

    public User getSecond_user() {
        return id.getSecond_user();
    }

    private void setId(Relation_Id id) {
        this.id = id;
    }

    private void setType(Relation_Type type) {
        this.type = type;
    }

}
