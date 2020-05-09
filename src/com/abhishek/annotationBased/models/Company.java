package com.abhishek.annotationBased.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
  private String name;
  
  @Autowired
  private Employee owner;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the owner
 */
public Employee getOwner() {
	return owner;
}
/**
 * @param owner the owner to set
 */
public void setOwner(Employee owner) {
	this.owner = owner;
}
  
  
}
