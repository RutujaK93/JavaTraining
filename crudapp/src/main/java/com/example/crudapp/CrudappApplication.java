package com.example.crudapp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(CrudappApplication.class, args);
		StudentRepository stud;
		stud=context.getBean(StudentRepository.class);
		//insert
		
       Student01 st1=new Student01(3000,"cccc");
       stud.save(st1);
      System.out.println("Record Saved");
		
		//update
		
		
//		Optional<Student> op;
//		
//		op=stud.findById(300);
//		Student st2=op.get();
//		System.out.println(st2.getId());
//		System.out.println(st2.getName());
//		st2.setName("demo123");
//		stud.save(st2);
		//delete
		
//		Optional<Student01> op;		
//		op=stud.findById(300);
//		Student01 st2=op.get();
//		stud.delete(st2);
		
		
//		List<Student01> studlist;
//		studlist=stud.findAll();
//		
//		for(Student01 st3:studlist) {
//			System.out.println(st3.getId());
//			System.out.println(st3.getName());
		}
		
				
	}


