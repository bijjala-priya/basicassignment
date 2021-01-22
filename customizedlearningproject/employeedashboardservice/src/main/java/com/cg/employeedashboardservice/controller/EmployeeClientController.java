package com.cg.employeedashboardservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.employeedashboardservice.entity.EmployeeInfo;


@RestController
public class EmployeeClientController {
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/{id}")
	public EmployeeInfo getEmployeeRecord(@PathVariable int id) {
		String url="http://employee-service:8080/employee/"+id;
		return restTemplate.getForObject(url, EmployeeInfo.class);
	}
	@PostMapping
	public String addEmployeeRecord(@RequestBody EmployeeInfo emp) {
		String url="http://employee-service:8080/employee";
		return restTemplate.postForObject(url,emp, String.class);
	}
	
	
	

}
