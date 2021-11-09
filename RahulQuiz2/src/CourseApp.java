import java.util.Scanner;
/**
 * CourseApp Definition
 * @author Rahul
 *
 */
public class CourseApp {
	/**
	 * Driver function
	 * @param args String
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course courses[] = new Course[6]; //Course Array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Creating 3 Undergrad courses");
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter undergrad course name");
			String courseName = sc.nextLine();
			courses[i] = new UndergradCourse(courseName);
		}
		
		
		
		System.out.println("Creating 3 grad courses");
		for(int i=3;i<6;i++)
		{
			System.out.println("Enter grad course name");
			String courseName = sc.nextLine();
			courses[i] = new GradCourse(courseName);
		}
		
		System.out.println("Unsorted Course list :");
		
		display(courses); //display unsorted array
		
		CourseSort(courses); //Sort funtion
		System.out.println("Sorted Course list :");
		display(courses);	//display sorted Array
		

	}
	/**
	 * Display course Array
	 * @param courses Course
	 */
	public static void display(Course courses[])
	{
		int length = courses.length;
		
		for(int i=0; i<length; i++)
		{
			Course course = courses[i];
			System.out.println("Course # "+course.getCourseName()+" Max enrollment "+course.getMaximumEnrollment());
		}
	}
	
	/**
	 * Sort Course Array
	 * @param courses Course
	 */
	public static void CourseSort(Course courses[])
	{
		int length = courses.length;
        
        for (int i = 0; i < length-1; i++)        	//Bubble Sorting
            for (int j = 0; j < length-i-1; j++)
            	
                if (courses[j].getCourseName().compareTo(courses[j+1].getCourseName()) > 0) //Condition
                {                   
                    Course temp = courses[j];
                    courses[j] = courses[j+1];
                    courses[j+1] = temp;
                }
	}

}
