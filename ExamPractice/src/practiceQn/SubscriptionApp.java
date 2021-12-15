package practiceQn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubscriptionApp {

	public static void main(String[] args) {
		PhysicalNewspaperSubcription physicalNewspaperSubcription[] = new PhysicalNewspaperSubcription[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<physicalNewspaperSubcription.length;i++)
		{
			System.out.println("Enter Data fpr paper "+(i+1));
			System.out.println("Enter Subscriber Name :");
			
			try {
				physicalNewspaperSubcription[i] = new PhysicalNewspaperSubcription(sc.nextLine());
				addToFile(physicalNewspaperSubcription[i]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void addToFile(PhysicalNewspaperSubcription physicalNewspaperSubcription) throws IOException
	{
		FileWriter fileWriter = new FileWriter("newspaper.txt",true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println(physicalNewspaperSubcription.sName+" "+physicalNewspaperSubcription.rate+" "+physicalNewspaperSubcription.subscriptionType);
		fileWriter.close();
		
	}
}
