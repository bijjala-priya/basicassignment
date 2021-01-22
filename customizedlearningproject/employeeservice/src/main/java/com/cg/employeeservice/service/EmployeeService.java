package com.cg.employeeservice.service;

import java.util.List;

import com.cg.employeeservice.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	Employee getOneEmployee(int id);
	String addEmployee(Employee employee);
	String removeEmployee(int id);
	Employee updateEmployee(Employee emp);

}
