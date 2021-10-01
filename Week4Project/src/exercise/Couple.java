package exercise;

public class Couple {
	
	Person person1,person2;

	public Person getPerson1() {
		return person1;
	}

	public Person getPerson2() {
		return person2;
	}

	public Couple(Person person1, Person person2) {
		super();
		this.person1 = person1;
		this.person2 = person2;
	}

	@Override
	public String toString() {
		return "{person1=" + person1 + ", person2=" + person2+"}";
	}
	

}
