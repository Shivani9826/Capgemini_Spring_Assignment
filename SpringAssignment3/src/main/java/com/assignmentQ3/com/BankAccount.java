package com.assignmentQ3.com;

import java.util.List;

public class BankAccount {

	private List<Integer> accountId;
	private List<String> accountHolderName;
	private List<String> accountContact;
	private List<Double> accountBalance;

	public List<Integer> getAccountId() {
		return accountId;
	}

	public void setAccountId(List<Integer> accountId) {
		this.accountId = accountId;
	}

	public List<String> getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(List<String> accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public List<String> getAccountContact() {
		return accountContact;
	}

	public void setAccountContact(List<String> accountContact) {
		this.accountContact = accountContact;
	}

	public List<Double> getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(List<Double> accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void getDetails() {
		System.out.println(getAccountId());
		System.out.println(getAccountHolderName());
		System.out.println(getAccountContact());
		System.out.println(getAccountBalance());

	}
}