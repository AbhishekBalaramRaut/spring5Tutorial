package com.abhishek.implementor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.models.Shape;
import com.abhishek.processors.ShapeService;

public class TestAop {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
		ShapeService t = context.getBean("shapeService",ShapeService.class);
		
		t.getCircle().setName("equi");
	}

}
