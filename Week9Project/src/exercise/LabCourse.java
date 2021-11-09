package exercise;

public class LabCourse extends CollegeCourse{

	public LabCourse(String deptName, int courseNumber, int credits) {
		super(deptName, courseNumber, credits);
		super.setFees(getFees()+50);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Lab Course");
		super.display();
	}

}
