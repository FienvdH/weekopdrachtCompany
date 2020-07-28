package com.theorganisation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theorganisation.domain.*;

@Service
@Transactional
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentrepository;
	
	public Department addDepartment(Department department) {
		System.out.println("department toegevoegd aan database");
		return departmentrepository.save(department);
	}

	public Iterable<Department> getAllDepartments() {
		System.out.println("inzien alle departments in database");
		return departmentrepository.findAll();
	}

	public Department getById(long id) {
		System.out.println("inzien department gevonden met id");
		return departmentrepository.findById(id).get();
	}
	
}
