package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplaySavedCustomerList {
	public static void displayCustomers() throws FileNotFoundException
	{
		File file = new File("Customer.txt");
		Scanner sc = new Scanner(file);
		
		int number = 1;
		
		while(sc.hasNext())
		{
			String token[];
			token = sc.nextLine().split(" ");
			
			int id = Integer.parseInt(token[0]);
			String fname = token[1],lname = token[2];
			float balance = Float.parseFloat(token[3]);
			
			System.out.println("Details of Customer : "+number);
			System.out.println("ID : "+id);
			System.out.println("First Name : "+fname);
			System.out.println("Last Name : "+lname);
			System.out.println("Balance : "+balance);
			System.out.println("--------------------------");
			
			number++;
			
		}
		
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		displayCustomers();
		

	}

}
