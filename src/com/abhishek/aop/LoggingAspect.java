package com.abhishek.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import com.abhishek.models.Point;

@Aspect
public class LoggingAspect {

	@Before("execution(public com.abhishek.models.Point getCenter())")
	 public void LoggingAdvice() {
		 System.out.println("Before logging advice");
	 }
	
}
