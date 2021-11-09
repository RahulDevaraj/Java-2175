
public class PracticeCode {
	
	//enum Month {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
	
	public static void main(String[] args) {
//		
//		Month month;
//		
//		month = Month.AUG;
//		
//		System.out.println(month.equals(Month.AUG));
//		
//		System.out.println(month.ordinal());
	
	
//	DinnerParty dinnerParty = new DinnerParty();
//	dinnerParty.setGuests(12);
//	dinnerParty.setDinnerChoice(1);
//	
////	System.out.println("No are " + dinnerParty.getGuests() + " Choice "+ dinnerParty.getDinnerChoice());
//	dinnerParty.display();
	
//	Party party = new Party();
//	party.display();
	
//	if(dinnerParty instanceof Party) {
//		System.out.println("Yes");
//	}
		
	Animal animal;

	animal = new Dog();
	animal.setName("Jacky");
	System.out.print(animal.getName()+" says ");
	animal.speak();
	
	Cow cow = new Cow();
	aMethod(cow);
	
	
	Animal animals[] = new Animal[3];
	animals[0] = new Cow();
	animals[0].setName("1");
	animals[1] = new Dog();
	animals[1].setName("2");
	animals[2] = new Snake();
	animals[2].setName("3");
	
	for (Animal animal2 : animals) {
		System.out.print(animal2.getName()+" ");
		animal2.speak();
	}
	
	
	Dog dog = new Dog();
	dog.setName("Simba");
	System.out.println(dog);

}
	
	public static void aMethod(Animal animal) {
		animal.setName("Johh");
		System.out.print(animal.getName()+" says ");
		animal.speak();
	}

}
