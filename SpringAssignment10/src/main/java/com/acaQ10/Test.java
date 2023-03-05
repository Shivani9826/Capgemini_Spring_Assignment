package com.acaQ10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/acaQ10/config.xml");
		Demo d1 = (Demo) c.getBean("d");
		d1.show();
	}
}
