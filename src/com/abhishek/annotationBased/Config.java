package com.abhishek.annotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhishek.annotationBased.models.Company;
import com.abhishek.annotationBased.models.Employee;

@Configuration
@ComponentScan(basePackages= {
		"com.abhishek.annotationBased.models"
		})
public class Config {
	
	@Bean
	public Company getComp() {
		Company p =  new Company();
		p.setOwner(getEmployee());
		return p;
	}
	

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
