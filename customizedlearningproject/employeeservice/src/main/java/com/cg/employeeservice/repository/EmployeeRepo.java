package com.cg.employeeservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.employeeservice.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
	

}
