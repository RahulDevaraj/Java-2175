package package1;

public class BankAccount {
	private int acctNum;
	private double balance;
	public BankAccount(int num,double bal) throws HighBalanceException {
		acctNum = num;
		balance = bal;
		if(balance > 20000)
			throw new HighBalanceException();
	}
	
	@Override
	public String toString() {
		String info = " BankAccount AcctNum = " + acctNum + " Balance = $" + balance;
		return info;
	}
	
//	@Override
//	public boolean equals(Object object)
//	{
//		BankAccount bankAccount2 = (BankAccount)object;
//		if(acctNum == bankAccount2.acctNum && balance == bankAccount2.balance)
//			return true;
//		else
//			return false;
//		
//	}
//	
	
	//OberLoaded
	public boolean equals(BankAccount bankAccount2)
	{
		
		if(acctNum == bankAccount2.acctNum && balance == bankAccount2.balance)
			return true;
		else
			return false;
		
	}
	
	
	
}	