package com.example.demohttpmethods;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {
	
	@Autowired
	private StudentRepository stud;
	
//	@GetMapping("/Students")
//	public List<Student01> getAllStudent(){
//		return stud.findAll();
//	}
	
	@GetMapping("/Students/{id}")
	public Student01 getStudentById(@PathVariable("id")Integer studId) {
		Optional<Student01> op=stud.findById(studId);
		Student01 st=op.get();
		return st;
	}
	
	@PostMapping("/save")
	public Student01 createStudent(@RequestBody Student01 st) {
		return stud.save(st);
	
	}
	
	@PutMapping("/updatestud/{id}")
	public boolean updateStudent(@PathVariable(value="id") Integer studId, @RequestBody Student01 studDetails) throws Exception{
		boolean f=true;
		try {
			Optional<Student01> op=stud.findById(studId);
			Student01 st=op.get();
			st.setName(studDetails.getName());
			final Student01 updatestud=stud.save(st);
		} catch (Exception e) {
			f=false;
		}
		return f;
	}

	@DeleteMapping("/deletestud/{id}")
	public boolean deleteStudent(@PathVariable(value="id")Integer studId,@RequestBody Student01 studDetails) throws Exception{
		Optional<Student01> op= stud.findById(studId);
		Student01 st=op.get();
		stud.delete(st);
		return true;
	}
}
