package com.program.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; // Corrected import
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Fixed typo here
    private int id;           // Unique identifier for the employee
    private String name;      // Employee's name
    private String email;     // Employee's email address
    private String address;    // Employee's address
    private String gender;    // Employee's gender
    private String password;   // Employee's password
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", gender="
				+ gender + ", password=" + password + "]";
	}
    
	
	

    
}
