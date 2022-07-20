package entities;

public class Account {
	
	protected Double balance;
	private String holder;
	private Double accountNumber;
	
	public Account() {
		
	}

	public Account(Double balance, String holder, Double accountNumber) {
		this.balance = balance;
		this.holder = holder;
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getAccountNumber() {
		return accountNumber;
	}

	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	

}
