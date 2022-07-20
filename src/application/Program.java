package application;

import entities.Account;
import entities.BankAccount;
import entities.SavingsAccount;


public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account( 1001, "Jason", 1000.0);
		
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
	
		Account acc2 = new SavingsAccount(1002, "Mary", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
	
		Account acc3 = new BankAccount(1003, "Daniel", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
