package com.vishwa.rest;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.model.Employee;
import com.vishwa.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping("/employee")
	public Employee saveEmplyee(@Valid @RequestBody Employee emp) {
	    return empService.saveEmployee(emp);
	}

	@GetMapping("/employees")
	public List<Employee> loadEmployee() {
	    return empService.loadAllEmployees();
	}
}
