package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyAopAopAspect {
	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.AopAspect()")
	public void beforeaddAccount(JoinPoint thejoinpoint) {
		
		System.out.println("====> in my loggingaspect: before addacount");
		MethodSignature methodsign = (MethodSignature) thejoinpoint.getSignature();
		System.out.println("method Signature:" +methodsign);
		
		Object[] args = thejoinpoint.getArgs();
		for(Object arg:args) {
			System.out.println(arg);
		}
	}
	
	
}
