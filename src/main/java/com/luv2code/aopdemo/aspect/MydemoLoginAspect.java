package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MydemoLoginAspect {
	
	@After("com.luv2code.aopdemo.aspect.LuvAopExpressions.AopAspect()")
	public void beforeSillyAccount() {
		System.out.println("====> After silly account in class");
	}
	
	
	
}
