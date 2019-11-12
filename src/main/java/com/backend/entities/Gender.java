package com.backend.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Genders")
public class Gender {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Gender_Type" , nullable = false)
	private String type;

	@OneToMany(mappedBy = "gender")
	private List<Profile> profiles;

	public Gender() {
	}

	public Gender(String type){
		setGender_type(type);
	}

	public int getId() {
		return id;
	}

	public String getGender_type() {
		return type;
	}

	private void setGender_type(String gender_type) {
		this.type = gender_type;
	}

}
