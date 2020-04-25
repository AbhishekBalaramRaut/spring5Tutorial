package com.abhishek.implementor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.abhishek.models.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory beanF = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t = (Triangle) beanF.getBean("triangle");
		t.draw();
	}

}
