package com.spring.userApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
     
     @NotNull(message = "username should not be null")
     @NotBlank(message = "username should not be null")
	private String name;
     @NotBlank(message = "useremail should not be null")
     @Email(message = "invalid email address")
	private String email;
     @NotBlank(message = " should not be null")
     @NotNull(message = "active should not be null")
	private String active;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User( String name, String email, String active) {
		super();
		//this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", active=" + active + "]";
	}

	
}
