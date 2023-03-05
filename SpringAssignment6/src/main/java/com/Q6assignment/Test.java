package com.Q6assignment;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Q6assignment/config.xml");
		Bank b = context.getBean("bank1", Bank.class);
		b.details();

	}

}