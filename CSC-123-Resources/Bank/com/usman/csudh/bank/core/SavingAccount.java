package com.usman.csudh.bank.core;
public class SavingAccount extends Account{
	private static final long serialVersionUID = 1L;

	public SavingAccount(Customer customer) {
		super("Saving", customer);
	}

	//Deposit not possible if account is not open
	public boolean deposit(double amount) {
		if (!isOpen())
			return false;
		return super.deposit(amount);

	}

	//Withdrawals only allowed against positive balances 
	public boolean withdraw(double amount) {
		if (getBalance() - amount < 0)
			return false;
		return super.withdraw(amount);

	}

}
