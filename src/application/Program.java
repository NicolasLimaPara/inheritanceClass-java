package application;

import entities.Account;
import entities.BankAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account( 1001, "Jason", 0.0);
		BankAccount bacc = new BankAccount(1002, "Mary", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BankAccount (1003, "Daniel", 0.0, 200.0);
		Account acc3 = new SavingsAccount (1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING
		
		BankAccount acc4 = (BankAccount)acc2;
		acc4.loan(100.0);
		
		// --> We'll have a problem because acc3 is actually a SavingsAccount  BankAccount acc5 = (BankAccount) acc3;
		// When doing a DOWNCASTING is good to test it with "instanceof"
		
		if (acc3 instanceof BankAccount) {
			BankAccount acc5 = (BankAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
