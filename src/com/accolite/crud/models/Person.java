package com.accolite.crud.models;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="person")
@XmlType(propOrder= {"name","username","password","address","contact","email"})
public class Person {
	private String name;
	private String username;
	private String password;
	private String address;
	private String contact;
	private String email;
	public String getName() {
		return name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
		
	
	public Person(String name, String username, String password, String address,
			String contact, String email) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
