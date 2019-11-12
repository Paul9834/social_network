package com.backend.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "Profiles")
public class Profile  implements Serializable {

	@Id
	int id;

	@OneToOne()
	@JoinColumn(name = "User", nullable = false)
	@MapsId
	private User user;

	@Column(name = "Name" , nullable = false)
	private String name;

	@Column(name = "Last" ,nullable = false)
	private String last;

	@Column(name = "Description", nullable = false)
	private String description;

//	@Lob
//	@Column(name = "Image", nullable = false)
//	private byte[] image;

	@Column(name = "On_Location" , nullable = false)
	private boolean on_location;

//	@Column(name = "Location" , nullable = false)
//	private boolean location;

	@ManyToOne(optional = false)
	@JoinColumn(name = "Gender", nullable = false)
	private Gender gender;

	public Profile() {
	}

	public Profile(User user, String name, String last_name, String description, boolean on_location, Gender gender){
		setUser(user);
		setName(name);
		setLast_name(last_name);
		setDescription(description);
	//	setImage(image);
		setOn_location(on_location);
		setGender(gender);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLast_name() {
		return last;
	}

	public String getDescription() {
		return description;
	}

//	public byte[] getImage() {
//		return image;
//	}

	public boolean isOn_location() {
		return on_location;
	}

	public int getGender_id() {
		return gender.getId();
	}

	private void setUser(User user) {
		this.user = user;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setLast_name(String last_name) {
		this.last = last_name;
	}

	private void setDescription(String description) {
		this.description = description;
	}

//	public void setImage(byte[] image) {
//		this.image = image;
//	}

	public void setOn_location(boolean on_location) {
		this.on_location = on_location;
	}

	private void setGender(Gender gender) {
		this.gender = gender;
	}

}
	