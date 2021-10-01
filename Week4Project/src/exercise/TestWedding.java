package exercise;

import java.time.LocalDate;

public class TestWedding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate weddingDate1 = LocalDate.of(2021, 1, 30);
		LocalDate weddingDate2 = LocalDate.of(2021, 4, 15);
		
		String location1 = "India";
		String location2 = "Canada";
		
		Person person1 = new Person("Kannan", "Raj", LocalDate.of(1993, 11, 17));
		Person person2 = new Person("Heera", "Vinod", LocalDate.of(1994, 01, 22));
		Person person3 = new Person("Andrew", "A", LocalDate.of(1991, 10, 10));
		Person person4 = new Person("Mary", "Cyriac", LocalDate.of(1992, 04, 04));
		
		Couple couple1 = new Couple(person1, person2);
		Couple couple2 = new Couple(person3, person4);
		
		Wedding wedding1 = new Wedding(weddingDate1, location1, couple1);
		Wedding wedding2 = new Wedding(weddingDate2, location2, couple2);
		
		System.out.println(wedding1);
		System.out.println(wedding2);

	}

}
