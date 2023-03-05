package com.assignmentQ3.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBankApp {

	public static void main(String[] args) {
		ApplicationContext C = new ClassPathXmlApplicationContext("com/assignmentQ3/com/config.xml");
		BankAccountcontroller B = (BankAccountcontroller) C.getBean("BS");
		System.out.println("Balance of account id 1: Rs." + B.getBalance(1));
		System.out.println("Deposit of Rs." + B.deposit(1, 10000));
		System.out.println("Balance after Deposit is Rs." + B.getBalance(1));
		System.out.println("Balance of account id 2: Rs." + B.getBalance(2));
		System.out.println("Withdraw of Rs." + B.withdraw(2, 1000));
		System.out.println("Balance after Withdraw is Rs." + B.getBalance(2));
	}

}
