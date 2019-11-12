package com.backend.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "Publications")
public class Publication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Text" , nullable = false)
	private String text;

	@Column(name = "Date" , nullable = false)
	private Date date;

	@ManyToOne(optional = false)
	@JoinColumn(name = "User", nullable = false)
	private User user;

	@OneToMany(mappedBy = "id.publication")
	private List<Like> likes;

	@OneToMany( mappedBy = "id.publication")
	private List<Keep> keep;

	@OneToMany(mappedBy = "publication")
	private List<Notification> notification;

	public Publication () {
	}

	public Publication(User user, String text, Date date){
		setUser(user);
		setText(text);
		setDate(date);
	}

	public int getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public Date getDate() {
		return date;
	}

	private void setText(String text) {
		this.text = text;
	}

	private void setDate(Date date) {
		this.date = date;
	}

	private void setUser(User user) {
		this.user = user;
	}

}
