import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Files {

	public static void writeFile() throws IOException
	{
		PrintWriter printWriter = new PrintWriter("Student.txt");
		
		printWriter.println("Kannan 300 CSIS");
		printWriter.println("Heera");
		printWriter.println("Rahul");
		
		printWriter.close();
		
		System.out.println("Successful");
	}
	
	public static void appendFile() throws IOException
	{
		FileWriter fileWriter = new FileWriter("Student.txt",true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println("Appended");
		
		System.out.println("Successful");
		
		printWriter.close();
		

	}
	
	public static void readFile() throws IOException
	{
		File file = new File("Student.txt");
		Scanner scanner = new Scanner(file);
		
		String line = scanner.nextLine();
		System.out.println(line);
		
		scanner.close();
	}
	
	public static void readFullFile() throws IOException
	{
		File file = new File("Student.txt");
		Scanner scanner = new Scanner(file);
		
		String line;
		while(scanner.hasNext())
		{
			line = scanner.nextLine();
			System.out.println(line);
		}
		
		
		scanner.close();
	}
	
	public static void testing() {
		 DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter date (d/m/yyyy):");
		 
		LocalDate localDate = LocalDate.parse(sc.nextLine(), dateFormat);
		
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getYear());
		System.out.println(localDate);
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
	//	writeFile();
	//	appendFile();
		
	//readFullFile();
		
		testing();


	}

}
