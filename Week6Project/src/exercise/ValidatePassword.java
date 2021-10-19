package exercise;

import java.util.Scanner;

public class ValidatePassword {
	
	public static boolean validate(String a) {
		
		int upperCase = 0, lowerCase = 0, digits = 0 , size = a.length();
				
		for(int i=0; i < a.length(); i++)
		{
			char c = a.charAt(i);
			
			if(Character.isUpperCase(c))
				upperCase++;
			if(Character.isLowerCase(c))
				lowerCase++;
			if(Character.isDigit(c))
				digits++;
		}
		if(upperCase >=2 && lowerCase >=3 && digits >=1)
		{System.out.println("Valid Password");
		return true;

		}
					
		else
		{
			if(upperCase<2)
				System.out.println("Not enough UpperCase Letters");
			if(lowerCase < 3)
				System.out.println("Not enough LowerCase Letters");
			if(digits < 1)
				System.out.println("Not enough Digits");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean status = false;
		String a;
		
		while(!status) {
			System.out.println("Enter password that contains at least\r\n"
					+ "two uppercase letters, at least three lowercase letters, and at least one digit : ");
			a = sc.nextLine();
			status = validate(a);
			
		}

	}

}
