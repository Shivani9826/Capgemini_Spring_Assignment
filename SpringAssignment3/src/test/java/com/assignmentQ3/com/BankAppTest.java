package com.assignmentQ3.com;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAppTest {

	ApplicationContext C = new ClassPathXmlApplicationContext("com/assignmentQ3/com/config.xml");
	BankAccountcontroller B = (BankAccountcontroller) C.getBean("BS");

	@Test
	public void test() {
		assertEquals((int) 2300, (int) B.getBalance(1));
	}

	@Test
	public void test1() {
		assertEquals((int) 4000, (int) B.getBalance(2));
	}
}