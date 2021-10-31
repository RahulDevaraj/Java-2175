package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings {
	public static void main(String[] args) {
		
		
		ArrayList<String> smallString = new ArrayList<String>();
		ArrayList<String> longString = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		boolean status=false;
		for(; count < 20 && !status; count++)
		{
			System.out.println("Enter a string (Enter 999 to terminate)");
			String str = sc.nextLine();
			if(str.equals("999"))
				status = true;
			else {
				if(str.length()<=10)
				{
					smallString.add(str);
				}
				else
					longString.add(str);
			}
			
		}
		
		System.out.println("Do you want to see smaller list? (Enter y / n)");
		String choice = sc.nextLine();
		
		while(!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
			System.out.println("Enter valid input (y / n)");
			choice = sc.nextLine();
		}
		
		if(choice.equalsIgnoreCase("y"))
		{
			if(smallString.size() == 0)
				System.out.println("Nothing to display");
			
			else
			{
				for (String string : smallString) {
					System.out.print(string + " ");
				}
				System.out.println();
			}
		}
		else {
			
			if(longString.size() == 0)
				System.out.println("Nothing to display");
			
			else
			{
				for (String string : longString) {
					System.out.print(string + " ");
				}
				System.out.println();
			}
			
		}
	}

}
