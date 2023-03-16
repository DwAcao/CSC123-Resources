package com.usman.csudh.bank.core;
import java.io.Serializable;

public class CheckingAccount extends Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	double overdraftLimit;
	
	public CheckingAccount(Customer customer,double od) {
		super("Checking",customer);
		this.overdraftLimit=od;
	}

	
	//Deposit not possible if the account is closed and has zero or positive balance
	public boolean deposit(double amount) {
		if (!isOpen()&&this.getBalance()>0)
			return false;
		return super.deposit(amount);

	}

	//Withdrawal is not possible if the account is closed and has zero or negative
	public boolean withdraw(double amount) {

		if (getBalance() + (isOpen()?overdraftLimit:0) - amount < 0)
			return false;
		return super.withdraw(amount);

	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}


	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
}
