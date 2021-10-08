package exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ValidateCheckDigits {
	
	public static ArrayList<String> getValidAccounts() throws IOException
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		
		File file = new File("Account.txt");
		Scanner sc = new Scanner(file);
		String line;
		
		while(sc.hasNext())
		{
			line = sc.nextLine();
			int sum = 0;
			
			int length = line.length();
			String token[] = new String[length];
			
			for(int i=0;i<length;i++)
			{
				token[i] =  Character.toString(line.charAt(i));
			}
			
			int lastDigit = Integer.parseInt(token[length -1]);
			
			for(int i=0; i< length-1; i++)
			{
				sum += Integer.parseInt(token[i]);
			}
			
			int calculatedRem = sum % 10;
			
			if(calculatedRem == lastDigit)
			{
				arrayList.add(line);
			}
								
		}
		sc.close();
		return arrayList;
		
	}
	
	public static void writeValidAccounts(ArrayList<String> arrayList) throws IOException {
		
		FileWriter fileWriter = new FileWriter("ValidAccounts.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		int length = arrayList.size();
		
		for(int i=0; i<length; i++) {
			printWriter.println(arrayList.get(i));
		}
		System.out.println("Valid numbers are Updated");
		printWriter.close();
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		writeValidAccounts(getValidAccounts());
		

	}

}
