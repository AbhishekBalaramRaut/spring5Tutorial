package com.abhishek.annotationBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.annotationBased.models.Company;
import com.abhishek.annotationBased.models.Employee;
import com.abhishek.db.HibernateDAOImpl;

public class TestAnnotationBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		context.registerShutdownHook();
		
	/*	Employee t1   =  context.getBean(Employee.class);
		
		System.out.println(t1.getSalary());
	*/
		Company t   =  context.getBean(Company.class);
		Employee y = (Employee)(t.getOwner());
		System.out.println(y.getSalary());
		
		
		
	}

}
