package com.tech.hbm.HibernateAnnotation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // @Entity annotation defines that a class can be mapped to a table
@Table(name="userdetails")
public class UserData {
	private String name;
	private String surname;
	
	@Id
	private int id;
	private String city;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int age) {
		this.id = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
