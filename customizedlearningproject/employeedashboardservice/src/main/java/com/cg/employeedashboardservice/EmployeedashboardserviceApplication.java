package com.cg.employeedashboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class EmployeedashboardserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedashboardserviceApplication.class, args);
	}

}
