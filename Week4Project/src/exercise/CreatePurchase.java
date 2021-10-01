package exercise;

import java.util.Scanner;

public class CreatePurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int invoice;
		double amount;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter invoice number (between 1000 and 8000) :");
			invoice = sc.nextInt();
			
			if(invoice>= 1000 &&  invoice<=8000)
				break;
			System.out.println("Enter within limit");
		}
		
		while(true)
		{
			System.out.println("Enter Sale amount (non negative) :");
			amount = sc.nextDouble();
			
			if(amount >= 0)
				break;
			System.out.println("Enter within limit");
		}
		
		Purchase purchase = new Purchase(invoice, amount);
		purchase.display();

	}

}
