package com.tech.spring.SpringHibernateIntegration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeDetails")
public class Employee {
	@Id
	@Column(name="employeeID")
	private int id;
	@Column(name="employeeName")
	private String name;
	@Column(name="employeeCity")
	private String city;
	public Employee() {}
	public Employee(int id,String name,String city){
		this.city=city;
		this.id=id;
		this.name=name;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
