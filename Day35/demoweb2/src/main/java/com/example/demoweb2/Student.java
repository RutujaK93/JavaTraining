package com.example.demoweb2;

import org.springframework.stereotype.Controller;

@Controller
public class Student {
	
	
private int Id;
private String name;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
