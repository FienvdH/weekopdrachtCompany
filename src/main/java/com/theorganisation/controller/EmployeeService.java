package com.theorganisation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theorganisation.domain.*;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public Employee addEmployee(Employee employee) {
		System.out.println("Employee toegevoegd aan database");
		return employeerepository.save(employee);
	}

	public Iterable<Employee> getAllEmployees() {
		System.out.println("inzien alle employees in database");
		return employeerepository.findAll();
	}

	public Employee changeSalary(long id, Employee e) {
		System.out.println("Request received to update salary");
        Employee emp = employeerepository.findById(id).get();
        emp.setSalary(e.getSalary());
        employeerepository.save(emp);
		return emp;
	}

	public void deleteById(long id) {
		System.out.println("verwijder medewerker met meegegeven id");
		employeerepository.deleteById(id);
	}
	
}
