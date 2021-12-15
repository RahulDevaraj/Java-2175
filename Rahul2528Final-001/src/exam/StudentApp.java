package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 * StudentApp Class Definition
 * @author Rahul
 *
 */
public class StudentApp {
	/**
	 * Driver Function
	 * @param args String
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String option;
		boolean quit = false;
		while(!quit)
		{
			System.out.print("Do you want to (A)dd or (D)elete or (P)rint records or (Q)uit >>");
			
			option = sc.nextLine();
			
			if(option.equals("Q") || option.equals("q")) //For exiting App
			{
				System.out.println("Goodbye!!!");
				quit = true;
			}
			
			else if(option.equals("A")|| option.equals("a")) //Adding to DB
			{
			System.out.println("Enter student id");
			String id = sc.nextLine();
			
			boolean status = findInDB(id); //To check if id in DB
			if(status == true)
			{
				System.out.println("Id already exist");
				
			}
			else {
				
				System.out.println("Enter student name");
				String name = sc.nextLine();
				
				try {
					UndergradStudent undergradStudent = new UndergradStudent(id, name); 
					addToDB(undergradStudent); //Adding to DB
				} catch (InvalidIDException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
					System.out.println("Account Not Generated");
				} catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				
			}
			
			}
			
			else if(option.equals("D")|| option.equals("d")) //For deletion from DB
			{
				System.out.println("Enter Student id to delete >>");
				String id = sc.nextLine();
				
				boolean status = findInDB(id); //To check id in DB
				
				if(status == false)
				{
					System.out.println("Id does not exist");
					
				}
				else
				{
					deleteFromDB(id); //Delete from DB Function
				}
			}
			
			else if(option.equals("P")|| option.equals("p")) //To Print
			{
				showDB(); //Print from DB Function
			}
		}
	}
	/**
	 * Function to Print from DB
	 */
	public static void showDB() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		

		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String msAccessDB = "StudentDatabase.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String sql = "Select * from Student";
			
			resultSet = statement.executeQuery(sql);
			
			
			
			
			while(resultSet.next())
			{
				System.out.println("Student Id "+resultSet.getString(1)+ " name "+resultSet.getString(2)+ " tuition "+resultSet.getDouble(3));
				
							
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				if(connection!=null) {
					resultSet.close();
					statement.close();
					connection.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
			
				
		}
	}
	
	/**
	 * Function to Delete from DB
	 * @param id String
	 */
	public static void deleteFromDB(String id)
	{
		Connection connection = null;
		Statement statement = null;
		
		
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String msAccessDB = "StudentDatabase.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			
			String deleteSql = "DELETE FROM Student WHERE STUDENTID = '"+id+"'";;
			int result = statement.executeUpdate(deleteSql);
			if(result >= 1)
				System.out.println("Successfully Deleted");
			
			

		
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				if(connection!=null) {
					
					statement.close();
					connection.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
	}
	}
	
	/**
	 * Function to check if record in DB
	 * @param id String
	 * @return result Boolean
	 */
	public static boolean findInDB(String id)
	{

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		boolean result = false;;

		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String msAccessDB = "StudentDatabase.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String sql = "Select * from Student";
			
			resultSet = statement.executeQuery(sql);
					
			
			
			while(resultSet.next())
			{
				
				String data = resultSet.getString(1);
				if(id.equals(data))
				{
					result = true;
					break;
				}
					
							
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				if(connection!=null) {
					resultSet.close();
					statement.close();
					connection.close();
					
					
					
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
			
				
		}
		return result;
	}

	/**
	 * Function to Add to DB
	 * @param undergradStudent UndergradStudent
	 */
	public static void addToDB(UndergradStudent undergradStudent) {
		Connection connection = null;
		Statement statement = null;
		
		
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			String msAccessDB = "StudentDatabase.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
			String insertSql = "INSERT INTO Student VALUES ('"+undergradStudent.getStudentId()+
					"','"+undergradStudent.getStudentName()+"',"+undergradStudent.getTuition()+")";
			statement.executeUpdate(insertSql);
			
			System.out.println("Successfully inserted");

		
			
		} catch (SQLException e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				if(connection!=null) {
					
					statement.close();
					connection.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
	}
		
	}
}
