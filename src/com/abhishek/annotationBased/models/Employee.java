package com.abhishek.annotationBased.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;
	@Value("30000")
	private String salary;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	@Value("Abhishek")
	public void setName(String name) {
		System.out.println("In emp name setter");
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		System.out.println("In emp sal setter");
		this.salary = salary;
	}
	
	
}
