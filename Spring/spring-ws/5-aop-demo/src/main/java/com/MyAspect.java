package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(void set*(*))")
	public void f1(JoinPoint jp) {
		System.out.println(">>> Property of  " + jp.getSignature() + " about to change <<<");
	}
	
	@After("execution(void set*(*))")
	public void f2(JoinPoint jp) {
		System.out.println(">>> Property of  " + jp.getSignature() + " changed.. <<<");
	}

}
