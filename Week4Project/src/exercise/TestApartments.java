package exercise;

import java.util.Scanner;

public class TestApartments {
public static void main(String[] args) {
	boolean status = false;
	Apartment apartment[] = new Apartment[5];
	apartment[0] = new Apartment(1, 3, 2, 400);
	apartment[1] = new Apartment(5, 4, 3, 700);
	apartment[2] = new Apartment(10, 6, 5, 1100);
	apartment[3] = new Apartment(15, 8, 7, 1800);
	apartment[4] = new Apartment(20, 10, 10, 2500);
	
	System.out.println("Enter minimum number of bedrooms, bathrooms and Maximum affordable rent :");
	Scanner sc = new Scanner(System.in);
	int bedroom = sc.nextInt();
	int bathroom = sc.nextInt();
	float rent  = sc.nextFloat();
	
	for(int i=0;i<5;i++)
	{
		if(apartment[i].getNubberOfBaths()>=bathroom && apartment[i].getNumberOfBedRooms()>=bedroom && apartment[i].getRent() <= rent)
		{
			System.out.println(apartment[i]);
			status = true;
		}
	}
	if(status == false)
		System.out.println("No apartments are available");

}
}
