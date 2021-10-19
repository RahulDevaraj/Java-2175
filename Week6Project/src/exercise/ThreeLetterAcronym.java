package exercise;

import java.util.Scanner;

public class ThreeLetterAcronym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		String string = sc.nextLine();
		
		String token[] = string.split(" |-");
		
		for(int i=0;i<3;i++)
		{
			stringBuilder.append(Character.toUpperCase(token[i].charAt(0)));
		}
		System.out.println(stringBuilder);
	}

}
