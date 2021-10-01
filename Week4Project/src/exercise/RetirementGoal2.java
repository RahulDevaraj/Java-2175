package exercise;

import java.util.Scanner;

public class RetirementGoal2 {

	public static void main(String[] args) {
		int years;
		double amntPerYear;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the years remaining and amnt per year :");
		while(true)
		{
			years = sc.nextInt();
			if(years <= 0)
				System.out.println("Invalid! Enter the year value again");
			else
				break;
		}
		
		while(true)
		{
			amntPerYear = sc.nextDouble();
			if(amntPerYear <= 0)
				System.out.println("Invalid! Enter the amount value again");
			else
				break;
		}
		
		double amount = Math.pow(1.04, years);
		double total =  amntPerYear * amount;
		
		System.out.println("The savings will be "+ total);
		
	}

}
