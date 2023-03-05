package com.Q6assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bank {

	@Value("Shivani Tiwari")
	private String AccountHolderName;

	@Value("Current")
	private String AccountType;

	@Value("1234284")
	private int AccountNumber;

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void details() {
		System.out.println("AccountHolderName: " + getAccountHolderName());
		System.out.println("AccountType: " + getAccountType());
		System.out.println("AccountNumber: " + getAccountNumber());
	}
}