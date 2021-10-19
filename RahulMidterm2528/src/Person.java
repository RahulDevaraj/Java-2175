/**
 * Class Storing Person Details
 * @author Rahul
 *
 */
public class Person {
	
	private String name;
	private String address;
	/**
	 * Method to Get Person name
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	/**
	 * method to Get address 
	 * @return String address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Constructor to initialise Person Object
	 * @param name Person Name
	 * @param address Address 
	 */
	public Person(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	

}
