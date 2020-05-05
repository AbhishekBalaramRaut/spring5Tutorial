package com.abhishek.db.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Circle {
	@Id
	private int circleId;
	private String name;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the circleId
	 */
	public int getCircleId() {
		return circleId;
	}
	/**
	 * @param circleId the circleId to set
	 */
	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
