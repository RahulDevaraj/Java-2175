import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
/**
 * WorkerDatabase class Definition
 * @author Rahul
 *
 */
public class WorkerDatabase {
	/**
	 * Stores number of items  currently in array
	 */
	public static int currentLength = 0;	
	/**
	 * Max array length
	 */
	public static final int LENGTH = 20;	
	/**
	 * Array
	 */
	public static Worker workers[] = new Worker[LENGTH];	
	
	/**
	 * Main function
	 * @param args String
	 * @throws InvalidNameException InvalidNameException
	 * @throws InvalidShiftException InvalidShiftException
	 */
	public static void main(String[] args) throws InvalidNameException, InvalidShiftException {
		
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		
		initialiseDatabase();	//Initialise array elements
		 		
		while(!quit) {
			
			System.out.print("Do you want to (A)dd or (D)elete a record or (Q)uit >>");
			String choice = sc.nextLine();
			choice = choice.toUpperCase();	//Get choice case insensitive
			
			switch(choice) {
			case "A":
			{
				if(currentLength == LENGTH)	//If max size reached
				{
					System.out.println("Maximum Entries Reached. Database Full!!!");
					break;
				}
				else {
					
					System.out.println("Please Enter ID");
					String id = sc.nextLine();
					if(checkId(id) != -1)	//If id exists
					{
						System.out.println("Sorry -- ID already exists");

					}
					else
					{
						try {
							workers[currentLength] = getInputs(id); //Create  Object
							currentLength++;	//Increase current number

						} catch (InvalidShiftException e) {	//Incase of InvalidShiftException
							System.out.println(e.getMessage());
							System.out.println("Account is not generated");

						}
						
					}
					sortAll();	//Sort and display
					displayAll();
					
				}
				break;
			}
			
			case "D":
			{
				if(currentLength == 0)
					System.out.println("Database Empty!!! Cannot Delete");
				else {
					
					System.out.println("Please Enter ID");
					String id = sc.nextLine();
					int index = checkId(id);
					if(index == -1)	//Check if id exists or not
					{
						System.out.println("ID Does not Exist");
						sortAll();
						displayAll();
					}
					else
					{
						delete(index);	//Deleting item
						currentLength--;	//Reduce number of items
						
						System.out.println("Deletion Successfull!!!!!");
						if(currentLength > 0) {
							sortAll();
							displayAll();
						}
						else
							System.out.println("Database Empty");
						
					}
					
				}
				
				
				break;
			}
			case "Q":
			{
				System.out.println("Thank You!!!");
				quit = true;
				break;
			}
			
			default:
				System.out.println("Invalid Entry!! Try Again");
			}
			
		}
		
		
		

	}
	/**
	 * Fn to init Database
	 * @throws InvalidNameException InvalidNameException
	 * @throws InvalidShiftException InvalidShiftException
	 */
	public static void initialiseDatabase() throws InvalidNameException, InvalidShiftException {
		for(int i=0;i<LENGTH;i++) {
			workers[i] = new ShiftWorker();
	}
	}
	/**
	 * Fn to check if id exists
	 * @param id String
	 * @return int
	 */
	public static int checkId(String id) {
		int index = -1;
		for(int i=0; i<currentLength; i++)
		{
			if(workers[i].getId().equals(id))
				return i; //Returns i if item exists
		}
		
		return index;
	}
	/**
	 * Fn to get all inputs and create Object
	 * @param id String
	 * @return ShiftWorker
	 * @throws InvalidShiftException InvalidShiftException
	 */
	public static ShiftWorker getInputs(String id) throws InvalidShiftException {
		
		ShiftWorker shiftWorker = new ShiftWorker();
		Scanner sc = new Scanner(System.in);
		LocalDate dob = null;
		String name;
		Industry industry;
		
		shiftWorker.setId(id);
	
		boolean validName = true;
		while(validName) { //Enter name untill condition is satisfied
			System.out.print("Enter Employee Name >> ");
			name = sc.nextLine();
			try {
				shiftWorker.setName(name);
				validName = false;
			} catch (InvalidNameException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				
			}
		}
		
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
		
		boolean validDate = true;
		while(validDate) {//Enter Date untill condition is satisfied
			try {
			System.out.print("Enter hire Date :(day/mon/year) >> ");
			dob = LocalDate.parse(sc.nextLine(), dateFormat);
			validDate = false;
		} catch (DateTimeParseException e) {
			// TODO: handle exception
			System.out.println("Enter Date in Valid Format (day/mon/year)");
		}}
		
		shiftWorker.setHireDate(dob);
		
		
		
		System.out.print("Enter Industry (1-4) : \n 1.Construction \n 2.Mining \n 3.Agriculture \n 4.Fishing \n Enter Choice:");
		int industryChoice = sc.nextInt();
		while(industryChoice <=0 || industryChoice >=5) ////Enter choice untill condition is satisfied
		{
			System.out.print("Invalid Choice.. Enter Valid Option (1-4) >> ");
			industryChoice = sc.nextInt();
		}
		shiftWorker.setIndustry(Industry.values()[industryChoice - 1]);
		
		
		
		
			
			System.out.print("Enter shift: \n 1.Day \n 2.Night \nEnter Shift Choice >> ");
			shiftWorker.setShift(sc.nextInt());
			
		
		
		
		
		boolean validPay = true;		
		while(validPay) { //Enter pay untill condition is satisfied
			System.out.print("Enter Hourly Pay Rate >> ");
						
			try {
				shiftWorker.setPayRate(sc.nextDouble());
				validPay= false;
			} catch (Exception e) {
				
				System.out.println("Please Enter a Valid  Double value:");
			}
		}
		
		
		return shiftWorker; //Object returned
		
		
		
	}
	/**
	 * Display all objects in array
	 */
	public static void displayAll() {
		
		if(currentLength == 0)
			System.out.println("Database Empty");
		else
		{
		System.out.println("---------------------------------------------------");
		System.out.println("Current Database");
		System.out.println("---------------------------------------------------");
		
		for(int i=0; i<currentLength; i++)
		{
			System.out.println("Employee NUmber : "+workers[i].getId());
			System.out.println("Name : "+workers[i].getName());
			System.out.println("Hire Date : "+workers[i].getHireDate());
			System.out.println("Industry : "+workers[i].getIndustry());
			if(workers[i].getShift() == 2)
				System.out.println("Work : Night Shift");
			else
				System.out.println("Work : Day Shift");
			
			System.out.println("Hourly Pay Rate : "+workers[i].getPayRate());
			
			System.out.println("---------------------------------------------------");
		}
		}
		
	}
	/**
	 * Sort array elements
	 */
	public static void sortAll() {
		
		for(int i=0; i< currentLength -1; i++)
		{
			for(int j = 0; j < currentLength - 1 - i; j++)
			{
				if(workers[j].getId().compareTo(workers[j+1].getId())>0)
				 {                   
                    Worker temp = workers[j];
                    workers[j] = workers[j+1];
                    workers[j+1] = temp;
                }
			}
		}
	}
	/**
	 * Function to delete an object
	 * @param index int
	 */
	public static void delete(int index)
	{	
		for(int i=index; i<currentLength - 1;i++)
			{
				workers[i] = workers[i+1];
			}
		
	}
	
	

}
