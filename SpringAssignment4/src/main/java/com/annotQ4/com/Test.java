package com.annotQ4.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotQ4/com/config.xml");
		Employee ob = (Employee) context.getBean("emp");
		System.out.println(ob);

	}

}