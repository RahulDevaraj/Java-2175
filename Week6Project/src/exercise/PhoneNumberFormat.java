package exercise;

import java.util.Scanner;

public class PhoneNumberFormat {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		String input;
		do {
			System.out.println("Enter 10 digit Phone");
			input = sc.nextLine();
			if(input.equals("999")) 
				break;
			else 
				if(input.length() !=10) {
					System.out.println("Invalid Size");
				}
				else {
					stringBuilder.delete(0, stringBuilder.length());
					stringBuilder.append(input);
					stringBuilder.insert(0, "(");
					stringBuilder.insert(4, ")");
					stringBuilder.insert(5, " ");
					stringBuilder.insert(9, "-");
					System.out.println("Formatted Phone number is "+stringBuilder);
				}
			
			
		}while(!input.equals("999"));
		
		
	}

}
