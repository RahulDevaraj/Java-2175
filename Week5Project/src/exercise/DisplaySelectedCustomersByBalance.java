package exercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplaySelectedCustomersByBalance {
	
	public  static void searchByBalance(float balanceAmount) throws IOException
	{
		File file = new File("Customer.txt");
		Scanner sc = new Scanner(file);
		boolean status = false;
		int number = 1;
		
		while(sc.hasNext()) {
			String token[] = sc.nextLine().split(" ");
			Float balance = Float.parseFloat(token[3]);
			
			if(balance > balanceAmount)
			{
				int id = Integer.parseInt(token[0]);
				String fname = token[1];
				String lname = token[2];
				
				
				System.out.println("Details of Customer : "+number);
				System.out.println("ID : "+id);
				System.out.println("First Name : "+fname);
				System.out.println("Last Name : "+lname);
				System.out.println("Balance : "+balance);
				System.out.println("--------------------------");
				number++;
				
				status = true;
				
			}
		}
		
		if(status == false)
		{
			System.out.println("Account not found with sufficient Balance");
		}
		sc.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		float  balanceAmount;
		
		System.out.println("Enter Purchase amount: ");
		Scanner sc = new Scanner(System.in);
		balanceAmount = sc.nextFloat();
		
		searchByBalance(balanceAmount);
		
		sc.close();

	}
}
