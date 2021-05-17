package com.bawa.rest.webservices.bawarestfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	@Size (min=4, message = "User Name shuld have minimum 4 chars")
	private String Name;
	
	
	private Integer Id;
	
	@Past
	private Date dob;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [Name=" + Name + ", Id=" + Id + ", dob=" + dob + "]";
	}
	public User(String name, Integer id, Date dob) {
		super();
		Name = name;
		Id = id;
		this.dob = dob;
	}
	
	
}
