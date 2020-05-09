package com.abhishek.annotationBased.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Company {
  private String name;
  
  private Member owner;
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
public Member getOwner() {
	return owner;
}
/**
 * @param owner the owner to set
 */
public void setOwner(Member owner) {
	this.owner = owner;
}
  
  
}
