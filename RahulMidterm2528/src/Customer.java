/**
 * Class Storing Customer Details
 * @author Rahul
 *
 */
public class Customer {
	
	private int id;
	private Person person;
	private float balance;
	/**
	 * Method to get ID
	 * @return int ID
	 */
	public int getId() {
		return id;
	}
	/**
	 * Method to get person object
	 * @return Person Person Object
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * Method to get Balance
	 * @return Float Balance
	 */
	public float getBalance() {
		return balance;
	}
	
	/**
	 * Constructor for Customer Object
	 * @param id ID
	 * @param person Person Object
	 * @param balance Balance
	 */
	public Customer(int id, Person person, float balance) {
		this.id = id;
		this.person = person;
		this.balance = balance;
	}
	
	

}
