package com.nr.isha;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
Long id;
	
	
String name;
String password;

public User() {
System.out.println("USer->D.C");
}
 



public User(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}




public User(Long id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
}




public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}




public String getPassword() {
	return password;
}




public void setPassword(String password) {
	this.password = password;
}




@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
}


}
