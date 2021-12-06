package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
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
			String msAccessDB = "D:\\Documents\\MS Access DB\\Employee.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccessDB;
			
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			
		//	String insertSql = "INSERT INTO EMPLOYEE (ENAME,SALARY) VALUES ('gOK',123456)";
		//	statement.executeUpdate(insertSql);
			
//			String updateSql = "UPDATE EMPLOYEE SET SALARY = 11111 WHERE ENAME='gOK'";
//			statement.executeUpdate(updateSql);
			
			String deleteSql = "DELETE FROM EMPLOYEE WHERE ENAME='gOK'";
			statement.executeUpdate(deleteSql);
			
			resultSet = statement.executeQuery("SELECT * FROM Employee");
			int id;
			String name;
			double salary;
			while(resultSet.next())
			{
				id = resultSet.getInt(1);
				name = resultSet.getString(2);
				salary  = resultSet.getDouble(3);
				
				System.out.println(id+" "+name+" "+salary);
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

}
