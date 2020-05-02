package com.abhishek.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.abhishek.models.Point;

@Aspect
public class LoggingAspect {

	@Before("OnlytGetters() && OnlyCircle()")
	 public void LoggingAdviceBefore() {
		 System.out.println("Before logging advice");
	 }
	 @After("OnlytGetters()")
	 public void LoggingAdviceAfter() {
		 System.out.println("After logging advice");
	 }
	 
	 @Pointcut("execution(*  get*())")
	 public void OnlytGetters() {
		
	 }
	 
	 @Pointcut("within(com.abhishek.models.Circle)")
	 public void OnlyCircle() {
		
	 }
}
