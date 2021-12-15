package week9Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetIDAndAge {
	public static void main(String[] args) {
		int id=-1,age=-1;
		Scanner sc = new Scanner(System.in);
		
		while(id!=0 && age!=0)
		{
			System.out.println("Enter id and age");
			try {
				id=sc.nextInt();
				if(id<0 || id>999)
					throw new DataEntryException();
				age = sc.nextInt();
				if(age<0 || age>119)
					throw new DataEntryException();
			}
			catch (DataEntryException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Invalid Data");
				System.exit(0);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Final");
			}
		}
		
		System.out.println(id+" "+age);
		

	}
	
}
