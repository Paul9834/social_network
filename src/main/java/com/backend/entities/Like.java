package com.backend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Likes")
public class Like  implements Serializable {

    @EmbeddedId
    private Like_Id id;

    @Column(name = "Date" , nullable = false)
    private Date date;

    public Like(){
    }

    public Like(User user, Publication publication,Date date){
        setId(new Like_Id(user,publication));
        setDate(date);
    }

    public Like_Id getId() {
        return id;
    }

    public User getUser() {
        return id.getUser();
    }

    public Publication getPublication() {
        return id.getPublication();
    }

    public Date getDate() {
        return date;
    }

    private void setId(Like_Id id) {
        this.id = id;
    }

    private void setDate(Date date){
        this.date = date;
    }

}
