package com.abhishek.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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

	//JSR 250
	@Resource(name="point1")
	public void setCenter(Point center) {
		
		this.center = center;
		System.out.println("Circle center from setter is point ("+center.getPointX()+","+center.getPointY()+")");
	}
  
	@PostConstruct
	public void circlePostConstruct() {
		System.out.println(" circlePostConstruct");
	}
	
	@PreDestroy
	public void circlePreDestroy() {
		System.out.println(" circlePreDestroy");
	}
}
