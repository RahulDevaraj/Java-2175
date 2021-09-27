package exercise;

public class Billing {
	
public float computeBill(float price)
{
	return (float) (1.08*price);
}

public float computeBill(float price,int quantity)
{
	return (float) (1.08*(price*quantity));
}

public float computeBill(float price,int quantity, float coupon)
{
	return (float) (1.08*((price*quantity)-coupon));
}

public static void main(String[] args) {
	Billing bill =  new Billing();
	
	System.out.println("Overload 1 with price = 20$ : "+bill.computeBill(20));
	System.out.println("Overload 2 with price = 20$ and Quantity = 5 : "+bill.computeBill(20,5));
	System.out.println("Overload 2 with price = 20$ and Quantity = 5 ad coupon = 16.4$ : "+bill.computeBill(20,5,16.4f));
}
}
