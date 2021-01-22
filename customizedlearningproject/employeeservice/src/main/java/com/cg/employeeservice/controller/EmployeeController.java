package com.cg.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employeeservice.entity.Employee;
import com.cg.employeeservice.service.EmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
   EmployeeService employeeService;
   @GetMapping("/{id}")
   public Employee findById(@PathVariable int id) {
	   
	   return employeeService.getOneEmployee(id);
   }
   
   @GetMapping
   public List<Employee>findAll(){
	   
	   return employeeService.getAllEmployee();
   }
   
   @PostMapping
   public String addEmployee(@RequestBody Employee emp) {
	   employeeService.addEmployee(emp);
	   return "Employee Added Successfully";
   }
   
   @DeleteMapping("/{id}")
   public String removeById(@PathVariable int id) {
	   employeeService.removeEmployee(id);
	    return "Employee deleted Successfully";
	    
   }
   @PutMapping("/update")
   public Employee updateEmployee(@RequestBody Employee emp) {
	   
	  return employeeService.updateEmployee(emp);
	   
   }
}
