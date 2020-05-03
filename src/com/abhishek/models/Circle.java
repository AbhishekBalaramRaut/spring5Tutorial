package com.abhishek.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component()
public class Circle implements Shape , ApplicationEventPublisherAware{
  
	private Point center;
	private String name;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * @throws Exception 
	 */
	
	public String setName(String name) throws Exception {
		this.name = name;
		return "Abhi";
	}

	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	@Override
	public void draw() {
		System.out.println(" Circle drawn ");
		System.out.println(messageSource.getMessage("withPara",new Object[] {"Abhishek","Raut"}, "dummy text", null));
		DrawEvent de = new DrawEvent(this);
		publisher.publishEvent(de);
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

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
}
