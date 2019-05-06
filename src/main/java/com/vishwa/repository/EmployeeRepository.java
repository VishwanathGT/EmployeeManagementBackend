package com.vishwa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishwa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
