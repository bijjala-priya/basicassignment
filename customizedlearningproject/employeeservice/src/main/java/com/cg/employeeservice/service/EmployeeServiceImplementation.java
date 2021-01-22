package com.cg.employeeservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employeeservice.entity.Employee;
import com.cg.employeeservice.repository.EmployeeRepo;
@Service
public class EmployeeServiceImplementation implements EmployeeService {
    
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employee=new ArrayList<Employee>();
		employeeRepo.findAll().forEach(emp->employee.add(emp));
		return employee;
	}

	@Override
	public Employee getOneEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).get();
	}

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
		return "New Employee Added Successfully";
	}

	@Override
	public String removeEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
		return "Employee with Id"+id+"deleted Successfully";
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		  return employeeRepo.save(emp);
	}
    
	
}
