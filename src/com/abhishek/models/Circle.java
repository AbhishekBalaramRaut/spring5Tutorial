package com.abhishek.models;

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

	public void setCenter(Point center) {
		this.center = center;
	}
  
	
}
