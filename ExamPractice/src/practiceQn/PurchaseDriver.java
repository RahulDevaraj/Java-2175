package practiceQn;

import java.util.Scanner;

public class PurchaseDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int invoice;
		double sales;
		Purchase purchase = new Purchase();
		
		do {
			System.out.println("Enter invoice (1000-8000): ");
			invoice = sc.nextInt();
		}while(invoice<1000 || invoice > 8000);
		
		do {
			System.out.println("Enter sale amnt (non negative): ");
			sales = sc.nextDouble();
		}while(sales<0);
		
		purchase.setAmountOfSales(sales);
		purchase.setInvoice(invoice);
		
		System.out.println(purchase);
	}

}
