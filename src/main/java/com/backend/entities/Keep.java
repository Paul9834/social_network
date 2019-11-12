package com.backend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Keep_Publications")
public class Keep  implements Serializable {

    @EmbeddedId
    private Keep_Id id;

    @Column(name = "Date" , nullable = false)
    private Date date;

    public Keep(){
    }

    public Keep(User user, Publication publication,Date date){
        setId(new Keep_Id(user,publication));
        setDate(date);
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

    private void setId(Keep_Id id) {
        this.id = id;
    }

    private void setDate(Date date){
        this.date = date;
    }

}
