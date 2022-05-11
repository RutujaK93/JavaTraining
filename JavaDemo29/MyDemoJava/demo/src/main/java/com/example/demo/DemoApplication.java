package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(DemoApplication.class, args);
		StudentRepository stud = context.getBean(StudentRepository.class);
		// create row
		Student st = new Student(1000, "Java");
		stud.save(st);
		System.out.println("Record Saved");

		


	}

}
