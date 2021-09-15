import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of Dollars : ");
		int dollars = sc.nextInt();
		int remain = dollars;
		
		int numberOf20 = remain/20;
		remain = remain - numberOf20 * 20;
		
		int numberOf10 = remain / 10;
		remain = remain - numberOf10 * 10;
		
		int numberOf5 = remain / 5;
		remain = remain - numberOf5 * 5;
		
		int numberOf1 = remain;
		remain = remain - numberOf1;
		System.out.println("Number of 20 dollar bills :"+ numberOf20);
		System.out.println("Number of 10 dollar bills :"+ numberOf10);
		System.out.println("Number of 5 dollar bills :"+ numberOf5);
		System.out.println("Number of 1 dollar bills :"+ numberOf1);
		
		sc.close();
		
	}

}
