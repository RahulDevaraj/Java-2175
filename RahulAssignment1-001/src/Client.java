import java.time.LocalDate;
/**
 * Client Class Definition
 * @author Rahul
 *
 */
public class Client {
	
	private String firstName;	
	private String lastName;
	private LocalDate dob;
	/**
	 * Getter to get Client First Name
	 * @return String
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * Getter to get Client Last Name
	 * @return String
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Getter to get Client Date of Birth
	 * @return LocalDate
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * Constructor for initializing Client Class
	 * @param firstName First Name
	 * @param lastName Last Name
	 * @param dob Date of Birth
	 */
	public Client(String firstName, String lastName, LocalDate dob) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	/**
	 * Function to display Client Details
	 * 
	 * 	 */
	public void displayInfo() {
		System.out.println("first name : "+firstName);
		System.out.println("last name  : "+lastName);
		System.out.println("DOB        : "+dob);
	}
	
	

}
