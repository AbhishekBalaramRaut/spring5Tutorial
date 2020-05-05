package com.abhishek.implementor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.abhishek.db.TestJdbc;
import com.abhishek.models.Circle;
import com.abhishek.models.Shape;
import com.abhishek.models.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		TestJdbc t   =  context.getBean("testJdbc",TestJdbc.class);
		

		
		Circle c = new Circle();
		c.setCircleId(4);
		c.setName("perpendi4");
		System.out.println("Name for Circle with id 1 is  "+t.getCircleNamed(4));
	
	}

}
