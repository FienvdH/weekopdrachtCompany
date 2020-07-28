package com.theorganisation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theorganisation.controller.*;
import com.theorganisation.domain.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeEndpoint {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/new")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/all")
	public Iterable<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
	
	 @PutMapping("/changesalary/{id}")
	    public Employee updateDepartmentById(@PathVariable(value="id")long id, @RequestBody Employee emp) {
	        return employeeService.changeSalary(id, emp);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public void deleteEmployeeById(@PathVariable(value="id") long id) {
	        employeeService.deleteById(id);
	    }
	
}
