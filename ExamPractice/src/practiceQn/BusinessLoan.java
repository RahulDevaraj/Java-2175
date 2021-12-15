package practiceQn;

public class BusinessLoan extends Loan {
	
	double interestRate;

	public BusinessLoan(int loanNum, String lname, double amount) throws InvalidLoanException {
		super(loanNum, lname, amount);
		this.interestRate = 2.99;
	}

	@Override
	public String toString() {
		return "BusinessLoan [interestRate=" + interestRate + ", loanNum=" + loanNum + ", lname=" + lname + ", amount="
				+ amount + "]";
	}
	
	@Override
	public boolean equals(Object object)
	{
		BusinessLoan businessLoan = (BusinessLoan) object;
		
		if(loanNum==businessLoan.getLoanNum())
		{
			return true;
		}
		else
			return false;
	}
	

}
