package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {

	//@Before(value = "execution(* com.controller.*.*(..)) or execution(* com.client.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint){
		System.out.println("before logging Advice " +joinPoint.getSignature().getName()); 
		Object[] values = joinPoint.getArgs();
		for(Object val:values){
			System.out.println("values "+val); 
		}
		
	}
	
	//@After("execution(* com.controller.*.*(..)) or execution(* com.client.*.*(..))")
	public void AfterMethod(JoinPoint joinPoint){
		System.out.println("after logging Advice " +joinPoint.getSignature().getName());
	}
	

	//@AfterReturning(pointcut="execution(* com.controller.*.*(..)) or execution(* com.client.*.*(..))",returning="args")
	public void AfterMethodReturn(JoinPoint joinPoint, Object args){
		System.out.println("after logging return Advice " +joinPoint.getSignature().getName() +" val "+args);
	}
	
	//@AfterThrowing(pointcut="execution(* com.controller.*.*(..)) or execution(* com.client.*.*(..))", throwing="ex")
	public void AfterMethodThrowing(JoinPoint joinPoint, Throwable ex){
		System.out.println("after throwing logging return Advice " +joinPoint.getSignature().getName());
	}
	
	@Around("execution(* com.controller.*.*(..)) or execution(* com.client.*.*(..))")
	public void AroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("Around Before logging Advice " +joinPoint.getSignature().getName());
		//
		//
		joinPoint.proceed();
		System.out.println("Around After logging Advice " +joinPoint.getSignature().getName());
		
	}
	
	
}
