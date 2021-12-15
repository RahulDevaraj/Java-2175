package week9Exercise;

public class PersonalLoan extends Loan {

	public PersonalLoan(int loanNumber, String lastName, double amount, double interest, int term) {
		super(loanNumber, lastName, amount, interest+2, term);
		// TODO Auto-generated constructor stub
	}

}
