package exercise;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int input;
		
		do {
			System.out.println("Enter an even number or 999 to stop:");
			input = sc.nextInt();
			if(input %2 !=0 && input!=999)
				System.out.println("Error!!!");
			else if(input % 2 == 0 )
				System.out.println("Good JOB!!");
				
		}while(input !=999);
		
		

	}

}
