package com.abhishek.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.abhishek.models.Circle;
import com.abhishek.models.Point;
import com.abhishek.processors.ShapeService;

@Aspect
public class LoggingAspect {

	@Before("args(name)")
	 public void LoggingAdviceBefore(String name) {
		 System.out.println("Before logging advice "+name);
	 }
	@Before("args(String)")
	 public void LoggingAdviceBefore1() {
		 System.out.println("Before 2 logging advice ");
	 }
	
/*	@Before("execution(* set*(*)) && OnlyCircle()")
	 public void LoggingAdviceJoinPoint(JoinPoint joinPoint) {
		 System.out.println(joinPoint.getTarget());
		 Circle c = (Circle)joinPoint.getTarget();
		 System.out.println(c.getName());
	 }*/
	
	 @AfterReturning(value="execution(*  set*(*)) && OnlyCircle()", returning="name")
	 public void LoggingAdviceAfterReturning(JoinPoint a , Object name) {
		 System.out.println("@AfterReturning logging advice a:"+name);
	 }
	 
	 @AfterThrowing(value="execution(*  set*(..)) && OnlyCircle()", throwing="ex")
	 public void LoggingAdviceAfterThrowing(JoinPoint jp,Exception ex) {
		 System.out.println("@AfterThrowing logging advice "+ex.getMessage());
	 }
	 
	 @Pointcut("execution(*  get*())")
	 public void OnlytGetters() {
		
	 }
	 
	 @Pointcut("within(com.abhishek.models.Circle)")
	 public void OnlyCircle() {
		
	 }
}
