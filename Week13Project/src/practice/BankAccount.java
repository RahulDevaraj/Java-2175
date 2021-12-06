package practice;

public class BankAccount {
	int accountNumber;
	String lName,fName;
	double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(int accountNumber, String lName, String fName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.lName = lName;
		this.fName = fName;
		this.balance = balance;
	}
	
	public BankAccount() {
		
	}
	
	

}
