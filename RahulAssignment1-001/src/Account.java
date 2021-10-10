import java.time.LocalDate;

	/**
	 * Account Class Definition
	 * @author Rahul
	 *
	 */
public class Account {
	private long id;
	private float balance;
	private Client client;
	private LocalDate creationDate;
	
	/**
	 * Getter to get Account ID
	 * @return long
	 */
	public long getId() {
		return id;
	}
	/**
	 * Setter for setting Account id
	 * @param id Account id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Getter for Balance
	 * @return float
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * setter for Account balance
	 * @param balance Balance amount
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}
	/**
	 * Getter for Client object
	 * @return Client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * Setter for Client Object
	 * @param client Clinet Object
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * Getter for Creation Date
	 * @return LocalDate
	 */
	public LocalDate getCreationDate() {
		return creationDate;
	}
	/**
	 * Setter for creation Date
	 * @param creationDate Date of Creation
	 */
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
		/**
		 * Default Constructor for Account Class
		 */
	public Account() {
		
	}
	/**
	 * Parameterized Constructor for Account
	 * @param id Account id
	 * @param balance	Balance Amount
	 * @param client Client Details
	 */
	public Account(long id, float balance, Client client) {
		this.id = id;
		this.balance = balance;
		this.client = client;
		this.creationDate = LocalDate.now();
	}
	
	/**
	 * Function to Display the entire Details of particular account
	 */
	public void displayInfo() {
		System.out.println("Account holder information");
		getClient().displayInfo();
		System.out.println("id         : "+getId());
		System.out.println("balance    : "+getBalance());
		System.out.println("Date       : "+getCreationDate());
	}

}
