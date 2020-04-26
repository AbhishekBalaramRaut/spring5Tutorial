package com.abhishek.models;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	private String type;
	private List<Point> points;


	public Triangle() {
		
	}
	public Triangle(String type) {
		System.out.println("cons 1");
		this.type = type;
	}

	public Triangle(String type, int height) {
		System.out.println("cons 3");
		this.type = type;

	}

	public Triangle(int height, String type) {

		this.type = type;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw() {
		System.out.println(type+" Triangle drawn ");
		for(Point p: points) {
			System.out.println(" Point : ("+p.getPointX()+","+p.getPointY()+")");		
		}
	}
}
