import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * BankApp class Definition
 * @author Rahul
 *
 */
public class BankApp {
	/**
	 * Function to calculate Loan Interest
	 * @param loan Loan amount
	 * @return float Returns calculated loan amount
	 */
	public static float calculateInterest(float loan)
	{
		return (float)(loan * .075); //7.5% of loan amount
	}
	
	/**
	 * Function to print Main Menu
	 */
	public static void displayMainMenu() {
		System.out.println("MAIN MENU\r\n"
				+ "1: Create a new Account\r\n"
				+ "2: Search\r\n"
				+ "3: Exit\r\n"
				+ "Enter a choice");
	}
	
	/**
	 * Function to print Sub Menu
	 */
	public static void displaySubMenu() {
		System.out.println("SUB MENU\r\n"
				+ "1: check balance\r\n"
				+ "2: account details\r\n"
				+ "3: calculate interest\r\n"
				+ "4: exit\r\n"
				+ "Enter a choice");
	}
	/**
	 * Function for getting only valid option for Main Menu
	 * @return int choice
	 */
	public static int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank App");
		int choice;
		while(true)
		{
			displayMainMenu();
			choice = sc.nextInt();
			sc.nextLine();
			if(choice>0 && choice<4)	//if valid option break, else print again
				break;
			else
				System.out.println("Enter Valid Option");
		}
		//sc.close();
		
		return choice;
	}
	/**
	 * Function for writing account object to File
	 * @param account Account Object
	 * @throws IOException For IO Exceptions
	 */
	public static void writeToFile(Account account) throws IOException {
		FileWriter fileWriter = new FileWriter("AccountDetails.txt",true);	//Appends the file
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println(account.getId()+"$$"+ account.getBalance()+"$$"+
				account.getCreationDate()+"$$" + account.getClient().getFirstName()+"$$"
				+ account.getClient().getLastName()+"$$"+ account.getClient().getDob());
		
		printWriter.close();
	}
	/**
	 * Function to search the File. If id exixts , it returns the object, else returns null
	 * @param idToFind Account id to find
	 * @return account 
	 * @throws IOException	For IO Exceptions
	 */
	public static Account searchById(long idToFind) throws IOException {
		
		File file = new File("AccountDetails.txt"); 
		Scanner scanner = new Scanner(file);
		
		Account account = null;
		while(scanner.hasNext()) {	//Read entire File
			
			String line = scanner.nextLine();
			
			String token[] = line.split("\\$\\$");	//$$ is the seperator used
			
			long id;	
			id = Long.parseLong(token[0]);
			
			if(id==idToFind) {	//If id exists
				
				String firstName,lastName;
				LocalDate dob,creationDate;
				float balance;
				
				balance = Float.parseFloat(token[1]);
				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-M-d");	//Date pattern 
				creationDate = LocalDate.parse(token[2], dateFormat);
				
				firstName = token[3];
				lastName = token[4];
				dob = LocalDate.parse(token[5], dateFormat);
				
				account = new Account();
				account.setClient(new Client(firstName, lastName, dob));
				account.setId(id);
				account.setCreationDate(creationDate);
				account.setBalance(balance);				
			}
		}
		
		scanner.close();
		return account;									//Returns account if id exists, else returns null
		
	}
	
	/**
	 * Function to create a new account
	 * @throws IOException For exceptions
	 */
	public static void createAccount() throws IOException {
		
		String firstName,lastName;
		LocalDate dob;
		long id;
		float balance;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account holder information");
		System.out.println("Enter first name");
		firstName = scan.nextLine();
		
		System.out.println("Enter last name");
		lastName = scan.nextLine();
		
		System.out.println("Enter date of birth (day/mon/year)");
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
		dob = LocalDate.parse(scan.nextLine(), dateFormat);
		
		while(true) {									// for checking valid id
			System.out.println("Enter account id");
			id = scan.nextLong();
			
			try {
				if(searchById(id)==null)			//If id is not in file
					break;
				else
				{
					System.out.println("ID exists already. Please enter new ID to proceed.");
				}
			} catch (FileNotFoundException e) {		//If file is not there, create a file
				// TODO: handle exception
				File  file = new File("AccountDetails.txt");
				PrintWriter printWriter = new PrintWriter(file);
				printWriter.close();
				break;
			}
			
		}
		System.out.println("Enter account initial balance");
		balance = scan.nextFloat();
		
		Account account = new Account(id, balance, new Client(firstName, lastName, dob));
		writeToFile(account);		//Writing new account details to file
		account.displayInfo();		//Display account details
	}
	/**
	 * Function for subMenu operations
	 * @param id Account ID
	 * @throws IOException For IO Exceptions
	 */
	public static void subMenu(long id) throws IOException {
		
		Account account = searchById(id);	//Account object fetched
		boolean exit = false;
		System.out.println(id + " : "+account.getClient().getFirstName()+" "+account.getClient().getLastName());
		int choice;
		Scanner sc =new Scanner(System.in);
		while(true) {		
			while(true) {
				displaySubMenu();	//Prints sub menu
				choice = sc.nextInt();
				if(choice>0 && choice <5)     //For valid inputs
					break;
				else {
					System.out.println("Invalid Choice!!! Enter Again");
				}								
			}
			switch(choice) {
			case 1:
				System.out.println("The balance is "+account.getBalance());
				break;
			case 2:
				account.displayInfo();
				break;
			case 3:
			{
				System.out.println("Enter loan amount");
				float loan = sc.nextFloat();
				System.out.println("The interest is "+calculateInterest(loan));
				break;
			}
			case 4:
				exit  = true;
				break;
			}
			
				if(exit == true)
				{
					System.out.println("Good bye!");
					System.exit(0);			//Exists from program
				}
			
			
		}
		
	}
	/**
	 * Function that calls the submenu if the entered ID exixts in File.
	 * @throws IOException For IO Exceptions
	 */
	public static void searchFn() throws IOException {
		System.out.println("Enter an ID");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();
		if(searchById(id)==null) {
			System.out.println("Account does not exist");
			System.out.println("---------------------------");
			return;
		}
			
		else
			subMenu(id);
	}
	/**
	 * The main driver function
	 * @throws IOException For IO Exceptions
	 */
	public static void driverFunction() throws IOException {
		int choice;
		while(true) {
			choice = mainMenu();	//Returns only valid choice for menu selection
			
			switch (choice) 
			{
			case 1:
				createAccount();
				break;
			case 2:
				searchFn();
				break;
			case 3:
				System.out.println("Good bye!");
				System.exit(0);		//Exits from program
				break;
			}
		}	
		}
	/**
	 * The main function
	 * @param args Arguments
	 * @throws IOException For IO Exceptions
	 */
	public static void main(String[] args) throws IOException {

		driverFunction();
		
	}
}
