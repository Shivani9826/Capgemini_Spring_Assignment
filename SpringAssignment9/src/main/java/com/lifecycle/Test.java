package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/beanconfig.xml");
		context.registerShutdownHook();
		Example e = context.getBean("ex", Example.class);
		System.out.println(e);
	}

}