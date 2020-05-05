package com.abhishek.implementor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.db.HibernateDAOImpl;
import com.abhishek.db.SimpleJdbcDAOImpl;
import com.abhishek.models.Circle;


public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		HibernateDAOImpl t   =  context.getBean("hibernateDAOImpl",HibernateDAOImpl.class);
		

		
		com.abhishek.db.entities.Circle c = new com.abhishek.db.entities.Circle();
		c.setCircleId(6);
		c.setName("perpendi6");
		
		
		t.saveCircle(c);
		System.out.println("Circle count using hibernate is  "+t.getCircleCount());
		
		context.close();
	}

}
