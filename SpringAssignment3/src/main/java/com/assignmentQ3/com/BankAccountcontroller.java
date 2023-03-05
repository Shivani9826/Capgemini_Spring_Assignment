package com.assignmentQ3.com;

public class BankAccountcontroller {
	BankAccountServiceImpl BSI;

	public BankAccountServiceImpl getBSI() {
		return BSI;
	}

	public void setBSI(BankAccountServiceImpl bSI) {
		BSI = bSI;
	}

	public double withdraw(long accountId, double balance) {
		return getBSI().withdraw(accountId, balance);
	}

	public double deposit(long accountId, double balance) {
		return getBSI().deposit(accountId, balance);
	}

	public double getBalance(long accountId) {
		return getBSI().getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return getBSI().fundTransfer(1, 2, amount);
	}

}
