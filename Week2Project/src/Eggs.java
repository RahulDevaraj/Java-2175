import java.util.Scanner;

public class Eggs {

	final static float PRICE_OF_DOZEN = 3.25F;
	final static float PRICE_OF_SINGLE_EGG = 0.45F;
	final static int NUMBER_IN_DOZEN = 12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nuber of eggs : ");
		int numberOfEggs = sc.nextInt();
		
		int numberOfDozen = numberOfEggs / NUMBER_IN_DOZEN;
		int numberOfSingle = numberOfEggs % NUMBER_IN_DOZEN;
		
		float total = numberOfDozen * PRICE_OF_DOZEN + numberOfSingle * PRICE_OF_SINGLE_EGG;
		
		System.out.println("You ordered "+numberOfEggs+" eggs. That’s "+numberOfDozen+" dozen at $"+PRICE_OF_DOZEN+" per\n"
				+ "dozen and "+numberOfSingle+" loose eggs at "+(int)(PRICE_OF_SINGLE_EGG*100)+" cents each for a total of $"+total);
		
		sc.close();
	}

}
