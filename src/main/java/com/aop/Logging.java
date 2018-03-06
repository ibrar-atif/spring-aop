package com.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class Logging {

	@Before("execution(* com.controller.AccountController.*(..))")
	public void logBefore(JoinPoint joinPoint){
		Object[] arg = joinPoint.getArgs();
		for(Object a:arg){
			System.out.println(a);
		}
		System.out.println("before method is calling "+joinPoint.getSignature().getName());
	}
	
	//@After("execution(* com.controller.AccountController.*(..))")
	public void logAfter(JoinPoint joinPoint) {

	
	}
	
/*	@AfterReturning(
			pointcut = "execution(* com.controller.AccountController.*(..))",
			returning= "result")*/
	public void logAfterReturning(JoinPoint joinPoint, Object result) {


	}
	
	/*@AfterThrowing(
			pointcut = "execution(* com.controller.AccountController.*(..))",
			throwing= "error")*/
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {


	}
	
	
	//@Around("execution(* com.controller.AccountController.*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {}
}
