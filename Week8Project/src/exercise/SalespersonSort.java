package exercise;

import java.util.Scanner;

public class SalespersonSort {
public static void main(String[] args) {
	Salesperson salespersons[] = new Salesperson[7];
	
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<7; i++)
	{
		System.out.println("Enter details for Salesperson no. "+(i+1));
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter amount");
		double amount = sc.nextDouble();
		
		salespersons[i] = new Salesperson(id, amount);
	}
	
	System.out.println("Sort by id or amount (1/2)");
	int choice = sc.nextInt();
	for(int i = 0; i< 6; i++) {
		for(int j=0; j<6-i; j++)
		{
			if(choice == 1) {
				if(salespersons[j].getId() > salespersons[j+1].getId())
				{
					Salesperson temp = salespersons[j];
					salespersons[j] = salespersons[j+1];
					salespersons[j+1] = temp;
				}
			}
			else
			{
				if(salespersons[j].getAmount() > salespersons[j+1].getAmount())
				{
					Salesperson temp = salespersons[j];
					salespersons[j] = salespersons[j+1];
					salespersons[j+1] = temp;
				}
			}
		}
	}
	
	System.out.println("Sorted Array");
	for (Salesperson salesperson : salespersons) {
		System.out.println(salesperson);
	}
}
}
