package com.assignmentQ3.com;

public class BankAccountepositoryImpl implements BankAccountRepository {
	BankAccount B;

	public BankAccount getB() {
		return B;
	}

	public void setB(BankAccount b) {
		B = b;
	}

	public double getBalance(long accountId) {
		return getB().getAccountBalance().get((int) accountId - 1);
	}

	public double updateBalance(long accountId, double newBalance) {
		double b = getB().getAccountBalance().get((int) accountId - 1);
		getB().getAccountBalance().set((int) accountId - 1, b + newBalance);
		return getB().getAccountBalance().get((int) accountId - 1);
	}
}
