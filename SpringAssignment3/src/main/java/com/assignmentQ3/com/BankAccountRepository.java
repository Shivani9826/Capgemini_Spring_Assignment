package com.assignmentQ3.com;

public interface BankAccountRepository {
	public double getBalance(long accountId);

	public double updateBalance(long accountId, double newBalance);
}
