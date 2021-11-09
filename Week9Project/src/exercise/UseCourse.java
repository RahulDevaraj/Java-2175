package exercise;

import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		 String deptName;
		 int courseNumber,credits;
		
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter dept name");
		 deptName = sc.nextLine();
		 
		 System.out.println("Course Number");
		 courseNumber = sc.nextInt();
		 
		 System.out.println("Credits?");
		 credits = sc.nextInt();
		 
		 if(deptName.equals("BIO") || deptName.equals("CHM") || deptName.equals("CIS") || deptName.equals("PHY"))
		 {
			 LabCourse labCourse = new LabCourse(deptName, courseNumber, credits);
			 labCourse.display();
		 }
		 else
		 {
			 CollegeCourse collegeCourse = new CollegeCourse(deptName, courseNumber, credits);
			 collegeCourse.display();
		 }
	}
}
