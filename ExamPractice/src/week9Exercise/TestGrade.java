package week9Exercise;

import java.util.Scanner;

public class TestGrade {
	public static void main(String[] args) throws GradeException {
		Student students[] = new Student[8];
		
		Scanner sc = new Scanner(System.in)
;		
		for(int i=0;i<8;i++)
		{
			students[i] = new Student();
			students[i].setId(i);
			
			try {
				System.out.println("Enter for Student "+(i+1)+" : ");
				students[i].setGrade(sc.next());
			} catch (GradeException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				
				students[i].setGrade("I");
			}
					
						
		}
		
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
