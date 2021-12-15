package practiceQn;

import java.util.Scanner;

public class LoanDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BusinessLoan businessLoans[] = new BusinessLoan[2];
		
		for(int i=0;i<businessLoans.length;i++)
		{
			Boolean status = true;
			System.out.println("Enter Details for Customer :"+ (i+1));
			System.out.println("Enter name:");
			
			String name = sc.nextLine();
			System.out.println("Enter loan Num");
			int loanNum = sc.nextInt();
			
			while(status)
			{try {
				System.out.println("Enter loan amnt");
				double amount = sc.nextDouble();
				businessLoans[i] = new BusinessLoan(loanNum, name, amount);
				status = false;
				sc.nextLine();
				
			} catch (InvalidLoanException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}}
							
			}
		
		for (BusinessLoan businessLoan : businessLoans) {
			System.out.println(businessLoan);
		}
		
		if(businessLoans[0].equals(businessLoans[1]))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
