package week9Exercise;

import java.util.Scanner;

public abstract class Loan implements LoanConstants {
	
	int loanNumber;
	String lastName;
	double amount;
	double interest;
	int term;
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		if(amount > MAXLOAN) {
			System.out.println("Cannot be Greater than "+MAXLOAN);
			System.out.println("Enter again");
			Scanner sc = new Scanner(System.in);
			amount = sc.nextDouble();
			while(amount>MAXLOAN) {
				System.out.println("Cannot be Greater than "+MAXLOAN);
				System.out.println("Enter again");
				amount = sc.nextDouble();
			}
			this.amount = amount;
			
		}
			
		else
			this.amount = amount;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		if(term == SHORT || term == MEDIUM || term == LONG)
			this.term = term;
		else
			this.term = 1;
	}
	public Loan(int loanNumber, String lastName, double amount, double interest, int term) {
		super();
		this.loanNumber = loanNumber;
		this.lastName = lastName;
		
		this.interest = interest;
		setTerm(term);
		setAmount(amount);
	}
	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", lastName=" + lastName + ", amount=" + amount + ", interest="
				+ interest + ", term=" + term + "]";
	}
	

}
