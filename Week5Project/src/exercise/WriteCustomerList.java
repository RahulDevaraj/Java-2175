package exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCustomerList {
	public static void writeToFile(int id, String fname,String lname, float balance) throws IOException
	{
		FileWriter fileWriter = new FileWriter("Customer.txt",true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println(id+" "+fname+" "+lname+" "+balance);
		printWriter.close();
		
		
	}
	public static void main(String[] args) throws IOException {
		int id;
		String fname,lname;
		float balance;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id:");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter first name:");
		fname = sc.nextLine();
		
		System.out.print("Enter last name:");
		lname = sc.nextLine();
		
		System.out.print("Enter balance:");
		balance = sc.nextFloat();
		
		writeToFile(id, fname, lname, balance);
	}

}
