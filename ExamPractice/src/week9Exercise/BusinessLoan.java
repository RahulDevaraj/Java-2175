package week9Exercise;

public class BusinessLoan extends Loan{

	public BusinessLoan(int loanNumber, String lastName, double amount, double interest, int term) {
		
		super(loanNumber, lastName, amount, interest+1, term);
		// TODO Auto-generated constructor stub
	}
	

}
