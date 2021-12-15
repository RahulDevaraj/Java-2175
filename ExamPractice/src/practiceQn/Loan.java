package practiceQn;

public class Loan implements LoanConstants{
	
	int loanNum;
	String lname;
	double amount;
	
	
	public int getLoanNum() {
		return loanNum;
	}


	public void setLoanNum(int loanNum) {
		this.loanNum = loanNum;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) throws InvalidLoanException {
		
		if(amount > MAXAMOUNT)
			throw new InvalidLoanException();
		else
		this.amount = amount;
	}


	public Loan(int loanNum, String lname, double amount) throws InvalidLoanException {
		
		this.loanNum = loanNum;
		this.lname = lname;
		setAmount(amount);
	}
	
	

}
