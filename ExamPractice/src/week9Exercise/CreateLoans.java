package week9Exercise;

import java.util.Scanner;

public class CreateLoans {
	public static void main(String[] args) {
		Loan[] loans = new Loan[5];
		System.out.println("Enter prime Rate:");
		Scanner sc = new Scanner(System.in);
		double interest = sc.nextDouble();
		
		for(int i=0;i<loans.length;i++)
		{
			
			
			System.out.println("Enter 1 for Business and 2 for Personal Loan");
			int choice = sc.nextInt();
			
			System.out.println("Entery Number "+(i+1));
			System.out.println("Enter Loan Number");
			int loanNumber = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Last Name");
			String name = sc.nextLine();
						
			System.out.println("Enter Term");
			int term = sc.nextInt();
			
			System.out.println("Enter loan amount");
			double amount = sc.nextDouble();
			
			if(choice == 1)
				loans[i] = new BusinessLoan(loanNumber, name, amount, interest, term);
			else if(choice == 2)
				loans[i] = new PersonalLoan(loanNumber, name, amount, interest, term);
			
					
			
		}
		
		for(int i=0;i<loans.length;i++)
		{
			System.out.println("Entry"+(i+1)+" : "+loans[i]);
		}
		
		
	}

}
