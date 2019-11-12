package com.backend.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "User", nullable = false)
    private User user;

    @Column(name = "Date" , nullable = false)
    private Date date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Notification_Type", nullable = false)
    private Notification_Type type;

    @ManyToOne()
    @JoinColumn(name = "Publication")
    private Publication publication;

    public Notification(){
    }

    public Notification(User user, Date date){
        setUser(user);
        setDate(date);
    }

    public Notification(User user, Publication publication,Date date){
        setUser(user);
        setDate(date);
        setPublication(publication);
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    private void setUser(User user) {
        this.user = user;
    }

    private void setDate(Date date){
        this.date = date;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

}
