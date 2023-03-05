package com.assignmentQ3.com;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountepositoryImpl BAI;

	public double withdraw(long accountId, double balance) {
		double b = getBAI().getB().getAccountBalance().get((int) accountId - 1);
		getBAI().getB().getAccountBalance().set((int) accountId - 1, b - balance);
		return balance;
	}

	public double deposit(long accountId, double balance) {
		getBAI().updateBalance(accountId, balance);
		return balance;
	}

	public BankAccountepositoryImpl getBAI() {
		return BAI;
	}

	public void setBAI(BankAccountepositoryImpl bAI) {
		BAI = bAI;
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return getBAI().getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double ammount) {
		// TODO Auto-generated method stub
		return false;
	}

}
