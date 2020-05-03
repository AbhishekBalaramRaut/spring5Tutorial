package com.abhishek.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.abhishek.models.Circle;
import com.abhishek.models.Point;
import com.abhishek.processors.ShapeService;

@Aspect
public class LoggingAspect {

	
	 public void LoggingAdviceBefore(String name) {
		 System.out.println("Before logging advice "+name);
	 }
	
	 public void LoggingAdviceBefore1() {
		 System.out.println("Before 2 logging advice ");
	 }
	
	
	 public void LoggingAdviceJoinPoint(JoinPoint joinPoint) {
		 System.out.println(joinPoint.getTarget());
		 Circle c = (Circle)joinPoint.getTarget();
		 System.out.println(c.getName());
	 }
	
	 
	 public void LoggingAdviceAfterReturning(JoinPoint a , Object name) {
		 System.out.println("@AfterReturning logging advice a:"+name);
	 }
	 
	
	 public void LoggingAdviceAfterThrowing(JoinPoint jp,Exception ex) {
		 System.out.println("@AfterThrowing logging advice "+ex.getMessage());
	 }
	 
	 
	 
	 public String LoggingAdviceAround(ProceedingJoinPoint jp) {
		 String name = null;
		 try {
			System.out.println("Around advice before");
			 name= (String) jp.proceed();
			 System.out.println("Around advice after " +name);
		} catch (Throwable e) {
			
			System.out.println("Around advice handled exception");
		}
		 finally {
			 System.out.println("Around advice finally");
		 }
		 return name;
	 }
	 
	 public void OnlytGetters() {
		
	 }
	 
	
	 public void OnlyCircle() {
		
	 }
}
