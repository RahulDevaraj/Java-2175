package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings2 {
	
	@SuppressWarnings("deprecation")
	public static int spaces(String string)
	{
		int count = 0;
		int len = string.length();
		
		for(int i=0; i< len; i++)
		{
			if(Character.isSpace(string.charAt(i)))
				count++;
		}
		
		return count;
	}
	
public static void main(String[] args) {

	
	
	ArrayList<String> noSpace = new ArrayList<String>();
	ArrayList<String> oneSpace = new ArrayList<String>();
	ArrayList<String> manySpace = new ArrayList<String>();
	
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
			if(spaces(str) == 1)
			{
				oneSpace.add(str);
			}
			else
				if(spaces(str) == 0)
				noSpace.add(str);
			else {
				manySpace.add(str);
			}
		}
		
	}
	
	System.out.println("Which list u want ot see? (Enter 0 / 1 / 2)");
	String choice = sc.nextLine();
	
	while(!choice.equals("0") && !choice.equals("1") && !choice.equals("2")) {
		System.out.println("Enter valid input (0 / 1 / 2)");
		choice = sc.nextLine();
	}
	
	if(choice.equals("0"))
	{
		if(noSpace.size() == 0)
			System.out.println("Nothing to display");
		
		else
		{
			for (String string : noSpace) {
				System.out.print(string + " | ");
			}
			System.out.println();
		}
	}
	else if(choice.equals("1")){
		
		if(oneSpace.size() == 0)
			System.out.println("Nothing to display");
		
		else
		{
			for (String string : oneSpace) {
				System.out.print(string + " | ");
			}
			System.out.println();
		}
		
	}
	
	else {
		if(manySpace.size() == 0)
			System.out.println("Nothing to display");
		
		else
		{
			for (String string : manySpace) {
				System.out.print(string + " | ");
			}
			System.out.println();
		}
	}
}

}


