package com.assignment.question4;

import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository {
	double getBalance(long accountId);

	double updateBalance(long accountId, double newBalance);
}
