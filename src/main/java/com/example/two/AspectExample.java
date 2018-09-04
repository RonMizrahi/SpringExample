package com.example.two;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExample {

	@Before("within(com.example.one..*) && !target(com.example.one.CustomBeanPostProcessInterceptor) && !target(com.example.one.CustomConfiguration)")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Class "+joinPoint.getTarget().getClass().getSimpleName()+" Method " + joinPoint.getSignature().getName() + " is running");
		System.out.println("Timestamp : " + System.currentTimeMillis());
	}
}
