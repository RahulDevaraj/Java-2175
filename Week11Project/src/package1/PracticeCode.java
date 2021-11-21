package package1;

public class PracticeCode {
	public static void main(String[] args) {
		try {
			BankAccount bankAccount1 = new BankAccount(1, 122302);
		} catch (HighBalanceException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
//		BankAccount bankAccount2= new BankAccount(1, 1230);
//		
//		if(bankAccount1.equals(bankAccount2))
//			System.out.println(bankAccount1);
		
		////Part 2
//		WorkingDog workingDog = new WorkingDog("Simba");
//		workingDog.setHoursTraining(21);
//		workingDog.speak();
//		workingDog.work();
		
		//Part 3
//		int numerator = 15,deno = 0,result;
//		
//		try {
//			result = numerator / deno;
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("Exc");
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Exception");
//		}
//		finally {
//			System.out.println("Runs always");
//		}
		
		
	}
	
	
	
}
