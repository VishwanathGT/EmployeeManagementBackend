package com.vishwa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwa.model.Employee;
import com.vishwa.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public EmployeeService() {

	}

	public EmployeeService(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Employee saveEmployee(Employee emp) {
		return repository.save(emp);
	}
	
	public List<Employee> loadAllEmployees() {
		 List<Employee> list = repository.findAll();
		 list.sort((e1,e2) -> { return e1.getFirstName().compareTo(e2.getFirstName()); });
		return list;
	}
	

	
	
	
}
