package exercise;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class DisplaySelectedCustomersByName {
	public  static void searchBylastName(String lastName) throws IOException
	{
		File file = new File("Customer.txt");
		Scanner sc = new Scanner(file);
		boolean status = false;
		int number = 1;
		
		while(sc.hasNext()) {
			String token[] = sc.nextLine().split(" ");
			String lname = token[2];
			
			if(lname.equalsIgnoreCase(lastName))
			{
				int id = Integer.parseInt(token[0]);
				String fname = token[1];
				float balance = Float.parseFloat(token[3]);
				
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
			System.out.println("Account not found");
		}
		sc.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String lastName;
		
		System.out.println("Enter Last Name: ");
		Scanner sc = new Scanner(System.in);
		lastName = sc.nextLine();
		
		searchBylastName(lastName);
		
		sc.close();

	}

}
