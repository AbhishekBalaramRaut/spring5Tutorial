package com.abhishek.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape,InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware{


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
		System.out.println("Calling setter");
		this.points = points;
	}

	public void draw() {
		System.out.println(" Triangle drawn ");
		for(Point point1: points) {
			System.out.println(" Point 1 ("+point1.getPointX()+","+point1.getPointY()+")");
		}
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
	}
	public void myInit() throws Exception {
		System.out.println("myinit");
	}
	
	public void myDestroy() throws Exception {
		System.out.println("myDestroy");
	}

	public void myInitDef() throws Exception {
		System.out.println("myinitDef");
	}
	
	public void myDestroyDef() throws Exception {
		System.out.println("myDestroyDef");
	}
	
	@Override
	public void setBeanName(String arg0) {
		System.out.println("Bean is "+arg0);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("context is "+arg0);
		
	}
}
