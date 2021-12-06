package practice;

public class Customer {
	int number;
	String name;
	char location;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getLocation() {
		return location;
	}
	public void setLocation(char location) {
		location = Character.toUpperCase(location);
		this.location = location;
	}
	public Customer(int number, String name, char location) {
		super();
		this.number = number;
		this.name = name;
		this.location = Character.toUpperCase(location);
	}
	
	public Customer() {
		
	}
		
		

}
