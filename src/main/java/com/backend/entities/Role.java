package com.backend.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "Role" , nullable = false)
	private String role;

	@OneToMany(mappedBy = "role")
	private List<User> users;

	public Role(){
	}

	public Role(String role){
		setRole(role);
	}

	public int getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	private void setRole(String role) {
		this.role = role;
	}

}
