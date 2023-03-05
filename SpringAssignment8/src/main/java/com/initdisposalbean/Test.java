package com.initdisposalbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/initdisposalbean/config.xml");
		Animal an = context.getBean("animal1", Animal.class);
		context.registerShutdownHook();
		System.out.println(an);

	}

}