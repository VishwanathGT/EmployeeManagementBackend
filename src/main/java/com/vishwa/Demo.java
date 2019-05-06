package com.vishwa;

import com.vishwa.model.Employee;

public class Demo {

	public static void main(String[] args) {
		Employee employee = new Employee("abc","xyz","male","31/07/1988","CS");
		Employee employee2 = new Employee(1, "abc","xyz","male","31/07/1988","CS");
		
		System.out.println(employee.equals(employee2));

	}

}
