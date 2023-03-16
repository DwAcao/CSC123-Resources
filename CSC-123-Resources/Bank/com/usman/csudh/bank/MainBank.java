package com.usman.csudh.bank;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.usman.csudh.bank.core.Account;
import com.usman.csudh.bank.core.Bank;
import com.usman.csudh.util.UIManager;

public class MainBank {

	//All messages are declared as constants to make it easier to change. Also, to ensure future proofing in case the application need to be made available
	//in more than one languages
	public static final String MSG_ACCOUNT_OPENED = "%nAccount opened, account number is: %s%n%n";
	public static final String MSG_ACCOUNT_CLOSED = "%nAccount number %s has been closed, balance is %s. Deposit no longer possible!%n";
	public static final String MSG_ACCOUNT_NOT_FOUND = "%nAccount number %s not found! %n%n";
	public static final String MSG_FIRST_NAME = "Enter first name:  ";
	public static final String MSG_LAST_NAME = "Enter last name:  ";
	public static final String MSG_SSN = "Enter Social Security Number:  ";
	public static final String MSG_ACCOUNT_NAME = "Enter account name:  ";
	public static final String MSG_ACCOUNT_OD_LIMIT = "Enter overdraft limit:  ";
	public static final String MSG_ACCOUNT_CREDIT_LIMIT = "Enter credit limit:  ";
	public static final String MSG_AMOUNT = "Enter amount: ";
	public static final String MSG_ACCOUNT_NUMBER = "Enter account number: ";
	public static final String MSG_ACCOUNT_ACTION = "%n%s was %s, account balance is:%s%n";

	//Declare main menu and prompt to accept user input
	public static final String[] menuOptions = { "Open Checking Account%n","Open Saving Account%n", "List Accounts%n","View Statement%n", "Deposit Funds%n", "Withdraw Funds%n",
			"Close an Account%n", "Exit%n" };
	public static final String MSG_PROMPT = "%nEnter choice: ";

	
	//Declare streams to accept user input / provide output
	InputStream in;
	OutputStream out;
	
	
	//Constructor
	public MainBank(InputStream in, OutputStream out) {
		this.in=in;
		this.out=out;
	}
	
	
	//Main method. 
	public static void main(String[] args) throws IOException {

		new MainBank(System.in,System.out).run();

	}
	
	
	//The core of the program responsible for providing user experience.
	public void run() {

		Account acc;
		int option = 0;

		UIManager ui = new UIManager(this.in,this.out,menuOptions,MSG_PROMPT);
		try {

			do {
				option = ui.getMainOption(); //Render main menu

				switch (option) {
				case 1:
					
					
					//Compact statement to accept user input, open account, and print the result including the account number
					ui.print(MSG_ACCOUNT_OPENED,
							new Object[] { Bank.openCheckingAccount(ui.readToken(MSG_FIRST_NAME),
									ui.readToken(MSG_LAST_NAME), ui.readToken(MSG_SSN),
									ui.readDouble(MSG_ACCOUNT_OD_LIMIT)).getAccountNumber() });
					break;
				case 2:
					
					//Compact statement to accept user input, open account, and print the result including the account number
					ui.print(MSG_ACCOUNT_OPENED,
							new Object[] { Bank
									.openSavingAccount(ui.readToken(MSG_FIRST_NAME),
											ui.readToken(MSG_LAST_NAME), ui.readToken(MSG_SSN))
									.getAccountNumber() });
					break;

				case 3:
					
					//Get bank to print list of accounts to the output stream provided as method arguemnt
					Bank.listAccounts(this.out);
					break;
					
				case 4:
					
					//find account and get the account to print transactions to the  output stream provided in method arguments
					acc = findAccount(ui);
					if (acc != null) {
						acc.printTransactions(this.out);
					}
					break;

				case 5:
					//find account, deposit money and print result
					acc = findAccount(ui);
					if (acc != null) {
						printAccountAction(ui, acc.deposit(ui.readDouble(MSG_AMOUNT)), "Deposit", acc);
					}
					break;
				case 6:
					//find account, withdraw money and print result
					acc = findAccount(ui);
					if (acc != null) {
						printAccountAction(ui, acc.withdraw(ui.readDouble(MSG_AMOUNT)), "Withdrawal", acc);
					}
					break;

				case 7:
					//find account and close it
					acc = findAccount(ui);
					if (acc != null) {
						acc.close();
						ui.print(MSG_ACCOUNT_CLOSED,
								new Object[] { acc.getAccountNumber(), acc.getBalance() });

					}
				}

			} while (option != 9);

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	// Print success / failure messages for deposit and withdrawal
	private static void printAccountAction(UIManager ui, boolean outcome, String actionType, Account ac)
			throws IOException {
		if (outcome)
			ui.print(MSG_ACCOUNT_ACTION, new Object[] { actionType, "successful", ac.getBalance() });
		else
			ui.print(MSG_ACCOUNT_ACTION, new Object[] { actionType, "unsuccessful", ac.getBalance() });
	}

	// Find an account
	private static Account findAccount(UIManager ui) throws IOException {
		int aNumber = ui.readInt(MSG_ACCOUNT_NUMBER);
		Account acc = Bank.lookup(aNumber);
		if (acc == null)
			ui.print(MSG_ACCOUNT_NOT_FOUND, new Object[] { aNumber });
		return acc;

	}

}
