package com.abhishek.models;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationListenerMethodAdapter;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationEventListener implements ApplicationListener{
	
	public void onApplicationEvent(ApplicationEvent event) {
	    System.out.println(event.toString());
	}	  

}
