package entities;

public class BankAccount extends Account{
	
	private Double loanLimit;
	
	public BankAccount () {
		super();
		
	}

	public BankAccount(Double balance, String holder, Double accountNumber, Double loanLimit) {
		super(balance, holder, accountNumber);
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
	

}
