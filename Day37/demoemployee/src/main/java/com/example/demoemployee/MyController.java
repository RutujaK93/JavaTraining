package com.example.demoemployee;

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
	private EmployeeRepository Emp;
	
	@GetMapping ("/Employee")
	public List<Employee> getAllEmployee(){
		return Emp.findAll();
	}
	
	@GetMapping("/Employee/{Emid}")
	public Employee getEmployeeByEmid(@PathVariable("id") Integer Emid) {
		Optional<Employee> op=Emp.findById(Emid);
		Employee em=op.get();
		return em;
	}
	
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee em ) {
		return Emp.save(em);
	
	}
	
	@PutMapping("/UpdateEmp/{empid}")
	public boolean updateEmployee(@PathVariable(value="empid")Integer employeeId,@RequestBody Employee empDetails)throws Exception{
		boolean f=true;
		try {
			Optional<Employee> op=Emp.findById(employeeId);
			Employee em=op.get();
			em.setName(empDetails.getName());
			final Employee UpdateEmp=Emp.save(em);
		}catch(Exception e)
		{
			f=false;
		}
		return f;
	}
	
	@DeleteMapping("/deleteemp/{empid}")
	public boolean eleteEmployee(@PathVariable(value="empid") Integer employeeId,@RequestBody Employee empDetails) throws Exception{
		Optional<Employee> op=Emp.findById(employeeId);
		Employee em=op.get();
		
		Emp.delete(em);
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
