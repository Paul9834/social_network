package com.backend.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "Notification_Types")
public class Notification_Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Notification_Format" , nullable = false)
	private String format;

	@OneToMany(mappedBy = "type")
	private Set<Notification> notifications;

	public Notification_Type() {
	}

	public Notification_Type(String format){
		setFormat(format);
	}

	public int getId() {
		return id;
	}

	public String getFormat() {
		return format;
	}

	private void setFormat(String format) {
		this.format = format;
	}

}
