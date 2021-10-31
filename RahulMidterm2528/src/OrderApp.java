
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Class with all Logic and Driver Function
 * @author Rahul
 *
 */
public class OrderApp {
	
	/**
	 * Writes Customer Details to file CustomerInformation.txt
	 * @param customer Customer Obj
	 * @throws IOException IO Exception
	 */
	public static void writeCustomerInformation(Customer customer ) throws IOException {
		
		FileWriter fileWriter = new FileWriter("CustomerInformation.txt",true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(customer.getPerson().getName()+"\t"+customer.getPerson().getAddress()+"\t"+
		customer.getBalance());
		
		printWriter.close();
		
	}
	
	/**
	 * Writes Customer ID to file CustomerIds.txt
	 * @param id ID
	 * @throws IOException IOException
	 */
	public static void writeCustomerId(int id ) throws IOException {
		
		FileWriter fileWriter = new FileWriter("CustomerIds.txt",true);
		PrintWriter pw = new PrintWriter(fileWriter);
		pw.println(id);
		
		pw.close();
		
	}
	/**
	 * Method to add customer details to both .txt files
	 * @throws IOException IOException
	 */
	public static void createRecord() throws IOException {
		
		int customerNumber;	
		while(true) //Loop untill valid input
		{
			customerNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of customers to add (Min 4) "));
			if(customerNumber<4) //Exit condition
				JOptionPane.showMessageDialog(null, "Enter a minimum value of 4","Wrning",JOptionPane.WARNING_MESSAGE);
			else
				break;
		}
		
		
		for(int i=0;i<customerNumber;i++) //Loops through the needed customer number
		{
			String name = JOptionPane.showInputDialog(null,"Enter Customer "+ (i+1)+" name");
			
			String address = JOptionPane.showInputDialog(null,"Enter Customer "+ (i+1)+" address");
			int id;
			while(true) //Loops Untill valid input
			{
				id = Integer
						.parseInt(JOptionPane.showInputDialog(null,"Enter Customer "+ (i+1)+" id"));
				if(id>=1001 && id<=9999) //Exit condition
					break;
				else
					JOptionPane.showMessageDialog(null, "ID should be between 1001 and 9999","Warning",JOptionPane.WARNING_MESSAGE);
			}
			
			float balance;
			
			while(true) //Loops Untill valid input
			{
				balance = Float
						.parseFloat(JOptionPane.showInputDialog(null,"Enter Customer "+ (i+1)+" balance"));
				if(balance < 90000) //Exit condition
					break;
				else
					JOptionPane.showMessageDialog(null, "Balance should be Less than 90000","Warning",JOptionPane.WARNING_MESSAGE);
			}
			writeCustomerInformation(new Customer(id, new Person(name, address), balance)); //Writes data to CustomerInformation.txt
			writeCustomerId(id); //Writes id to CustomerIds.txt
			
		}
	System.out.println("Customers profiles are created and saved in the database");	
		
	}
/**
 * Method to search through the text files
 * @param minBalance Balance
 * @throws IOException IOException
 */
	public static void readData(float minBalance) throws IOException {
		
		File file1 = new File("CustomerInformation.txt");
		File file2 = new File("CustomerIds.txt");
		
		Scanner sc1 = new Scanner(file1);
		Scanner sc2 = new Scanner(file2);
		int count =1;	//Count variable
		System.out.println("Sr.#\tCustomerId\tName\t\tAddress\t\t\tbalance");
		while(sc1.hasNext()) {
			
			int id = Integer.parseInt(sc2.nextLine());
			String token[] = sc1.nextLine().split("\\t");
						
			if(minBalance <= Float.parseFloat(token[2]))	//Balance Condition Check
			{
				System.out.print(count+"\t");
				System.out.print(id+"\t\t");
				System.out.print(token[0]+"\t\t");
				System.out.print(token[1]+"\t\t\t");
				System.out.print(token[2]);
				System.out.println(" ");
				count++;
			}
		}
		
		sc1.close();
		sc2.close();
	}
	/**
	 * Main Driver Function
	 * @param args Main Args
	 * @throws IOException IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		createRecord(); //Create Record
		System.out.println("Search customer by balance\r\n"
				+ "You are going to search customers having balance >= a specified balance");
		System.out.println("Enter balance:");
		float minBalance = sc.nextFloat();
	
		readData(minBalance);//Search Function
		
		
			
		
	}
}
