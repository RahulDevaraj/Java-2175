package exercise;

import java.util.Scanner;

public class PurchaseArray {
	
	public static void main(String[] args) {
		
		Purchase purchase[] = new Purchase[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter invoice between 1000 and 8000");
			int invoice  = sc.nextInt();
			
			while(invoice<1000 || invoice>8000)
			{
				System.out.println("Enter within limit (1000 - 8000)");
				invoice = sc.nextInt();
			}
			
			System.out.println("Enter sale amount > 0");
			double amount = sc.nextDouble();
			while(amount<0)
			{
				System.out.println("Non Negative Sale amount");
				amount = sc.nextInt();
			}
			
			purchase[i] = new Purchase(invoice, amount);
			
		}
		
		System.out.println("Array is");
		for (Purchase purchaseObj : purchase) {
			purchaseObj.display();
		}
		
	}

}
