package exercise;

import java.util.Scanner;

public class SalespersonDatabase {
	public static int currentItems = 0;
	
	public static void main(String[] args) {
		boolean exitStatus = false;
		Salesperson salespersons[] = new Salesperson[20];
		
		Scanner sc = new Scanner(System.in);
		while(!exitStatus)
		{
			System.out.println("Menu");
			System.out.println("1. Add Data");
			System.out.println("2. Delete Data");
			System.out.println("3. Modify Data");
			System.out.println("4. Exit");
			
			int choice = sc.nextInt();
			while(choice<1 || choice > 4) {
				System.out.println("Invalid Choice. Enter (1-4)");
				choice = sc.nextInt();
			}
			
			switch(choice) {
			case 1:
			{
				if(currentItems == 20) {
					System.out.println("Database Full");
				}
				else
				{
					System.out.println("Enter ID");
					int id= sc.nextInt();
					if(checkId(salespersons, id))
					{
						System.out.println("User Exists");
					}
					else {
						System.out.println("Enter amount");
						double amount = sc.nextDouble();
						salespersons[currentItems] = new Salesperson(id, amount);
						currentItems++;
					}
				}
			}
				break;
				
			case 2:
			{
				if(currentItems == 0) {
					System.out.println("Database Empty");
				}
				else {
					System.out.println("Enter ID to Delete");
					int id = sc.nextInt();
					if(!checkId(salespersons, id))
					{
						System.out.println("Error!! USer Not Found");
					}
					else
					{
						//asdddddddddddddddddd.
						int index = getIndex(salespersons, id);
						delete(salespersons, index);
					}
					
				}
			}
				break;
				
			case 3:
			{if(currentItems == 0) {
				System.out.println("Database Empty");
			}
			else {
				System.out.println("Enter ID to modify");
				int id = sc.nextInt();
				if(!checkId(salespersons, id))
				{
					System.out.println("Error!! USer Not Found");
				}
				else
				{
					System.out.println("Enter sales amount to modify");
					double amount = sc.nextDouble();
					int index = getIndex(salespersons, id);
					salespersons[index].setAmount(amount);
				}
			}
				
			}
				break;
				
				case 4:
					exitStatus = true;
					System.out.println("Thanks!!!");
					break;
			}
			sortSales(salespersons);
			display(salespersons);
			
		}
	}
	
	public static boolean checkId(Salesperson salespersons[], int id) {
		if(currentItems == 0)
			return false;
		for (int i = 0; i< currentItems;i++) {
			if(salespersons[i].getId()==id)
				return true;
		}
		
		return false;
	}
	
	public static int getIndex(Salesperson salespersons[], int id) {
		boolean status = false;
		int i = 0;
		while ( i< currentItems && !status) {
			if(salespersons[i].getId()==id)
				{
				status = true;
				}
			else {
				i++;
			}
		}
		
		return i;

	}
	
	public static void sortSales(Salesperson salespersons[])
	{
		for(int i = 0; i< currentItems -1; i++) {
			for(int j=0; j<currentItems -1-i; j++)
			{
					if(salespersons[j].getId() > salespersons[j+1].getId())
					{
						Salesperson temp = salespersons[j];
						salespersons[j] = salespersons[j+1];
						salespersons[j+1] = temp;
					}				
			}
		}
	}
	
	public static void display(Salesperson salespersons[]) {
		if(currentItems == 0)
			return;
		System.out.println("Updated Databse");
		for (int i = 0; i< currentItems;i++) {
			System.out.println(salespersons[i]);
		}
	}
	
	public static void delete(Salesperson salespersons[],int index)
	{
		for(int i = index ; i<currentItems; i++)
		{
			salespersons[i] = salespersons[i+1];			
		}
		
		currentItems--;
	}
	
	

}
