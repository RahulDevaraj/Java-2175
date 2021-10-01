package exercise;

import java.time.LocalDate;

public class Person {
	String fName,lName;
	LocalDate bDay;
	
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public LocalDate getbDay() {
		return bDay;
	}
	public Person(String fName, String lName, LocalDate bDay) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.bDay = bDay;
	}
	@Override
	public String toString() {
		return "[fName=" + fName + ", lName=" + lName + ", bDay=" + bDay+"] ";
	}
	
	
}
