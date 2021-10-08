package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplaySelectedCustomer {
	
	public  static void searchById(int id) throws FileNotFoundException
	{
		File file = new File("Customer.txt");
		Scanner sc = new Scanner(file);
		boolean status = false;
		
		while(sc.hasNext()) {
			String token[] = sc.nextLine().split(" ");
			int readId = Integer.parseInt(token[0]);
			
			if(readId == id)
			{
				String fname = token[1],lname = token[2];
				float balance = Float.parseFloat(token[3]);
				
				System.out.println("Details of Customer : ");
				System.out.println("ID : "+readId);
				System.out.println("First Name : "+fname);
				System.out.println("Last Name : "+lname);
				System.out.println("Balance : "+balance);
				System.out.println("--------------------------");
				
				status = true;
				break;
			}
		}
		
		if(status == false)
		{
			System.out.println("ID not found");
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int id;
		
		System.out.println("Enter ID: ");
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		
		searchById(id);
		
		sc.close();

	}

}
