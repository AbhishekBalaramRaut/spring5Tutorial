package com.abhishek.processors;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("Before : "+beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("After : "+beanName);
		return bean;
	}
}
 