package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student01")
public class Student {
    
    @Id
    private int id;
    private String name;

    public Student(int i, String s) {
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
    public Student(){

    }
}

