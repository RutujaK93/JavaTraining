package com.example.crudapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Student01")
public class Student01 {
@Id
private int id;
private String name;
public Student01(int i,String s) {
	id=i;
	name=s;
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
public Student01() {
	
}
}
