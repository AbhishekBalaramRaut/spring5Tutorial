package com.abhishek.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
  
	private Point center;
	
	@Override
	public void draw() {
		System.out.println(" Circle drawn ");
		System.out.println("Circle center is point ("+center.getPointX()+","+center.getPointY()+")");
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("cirlceRelated")
	public void setCenter(Point center) {
		
		this.center = center;
		System.out.println("Circle center from setter is point ("+center.getPointX()+","+center.getPointY()+")");
	}
  
	
}
