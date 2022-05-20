package com.example.demoemployee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int Emid;
	private String name;
	private String address;
	private String email;
	private int phoneNo;
	private int salary;
	
	
	
	public Employee(int emid, String name, String address, String email, int phoneNo, int salary) {
		super();
		Emid = emid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}
	
	
	public int getEmid() {
		return Emid;
	}
	public void setEmid(int emid) {
		Emid = emid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
}
