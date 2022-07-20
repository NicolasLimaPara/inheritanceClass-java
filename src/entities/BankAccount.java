package entities;

public class BankAccount extends Account{
	
	private Double loanLimit;
	
	public BankAccount () {
		super();
		
	}

	

	public BankAccount(Integer accountNumber, String holder, Double balance, Double loanLimit) {
		super(accountNumber, holder, balance);
		this.loanLimit = loanLimit;
	}



	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount;
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	

}
