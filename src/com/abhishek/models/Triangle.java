package com.abhishek.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle {


	private List<Point> points = new ArrayList<>(); 
	
	

	public Triangle() {
		System.out.println("cons no arg");
	}
	
	public Triangle(Point point1, Point point2,Point point3) {
		System.out.println("cons  arg");
	}

	

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		System.out.println(" Triangle drawn ");
		for(Point point1: points) {
			System.out.println(" Point 1 ("+point1.getPointX()+","+point1.getPointY()+")");
		}
		
	}
}
