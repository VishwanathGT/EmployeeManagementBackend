package com.vishwa.service;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.vishwa.model.Employee;
import com.vishwa.repository.EmployeeRepository;

public class EmployeeServiceTest {

	@Test
	public void testSaveEmployee() {
		EmployeeRepository empRepo = Mockito.mock(EmployeeRepository.class);
		Employee employee = new Employee("abc","xyz","male","31/07/1988","CS");
		Employee employee2 = new Employee(1, "abc","xyz","male","31/07/1988","CS");
		
		when(empRepo.save(employee)).thenReturn(employee2);
		EmployeeService empService = new EmployeeService(empRepo);
		Employee saveEmployee = empService.saveEmployee(employee);
		assertEquals(employee, saveEmployee);
		
	}
	

/*	@Test
	public void testLoadAllEmployees() {
		fail("Not yet implemented");
	}*/

}
