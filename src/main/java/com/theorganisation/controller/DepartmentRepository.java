package com.theorganisation.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theorganisation.domain.*;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
