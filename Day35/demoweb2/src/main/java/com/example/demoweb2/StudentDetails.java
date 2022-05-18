package com.example.demoweb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	private Student stud;
	
	public Student getStud() {
		return stud;
	}
	@Autowired
	public void setStud(Student stud) {
		this.stud=stud;
	}
//	public StudentDetails(Student stud) {
//		this.stud=stud;
//	}
void setdata() {
	stud.setId(800);
	stud.setName("pqr");
}
void shodata() {
	System.out.println(stud.getId());
	System.out.println(stud.getName());
}
}
