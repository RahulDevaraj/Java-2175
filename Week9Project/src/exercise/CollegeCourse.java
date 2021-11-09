package exercise;

public class CollegeCourse {
	
	private String deptName;
	private int courseNumber,credits;
	private float fees;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public CollegeCourse(String deptName, int courseNumber, int credits) {
		
		this.deptName = deptName;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.fees = 120 * getCredits();
	}
	public void display() {
		
	System.out.println("Course Number: "+getCourseNumber());	
	System.out.println("Credits "+ getCredits());
		System.out.println("Dept Name "+ getDeptName());
		System.out.println("Fees "+getFees());
		
	}
	
	
	
	

}
