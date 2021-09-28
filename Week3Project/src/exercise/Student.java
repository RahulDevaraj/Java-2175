package exercise;
/**
 * Contains the data related to Student Class
 * 
 * @author Rahul
 *
 */

public class Student {
	private int id;
	private int creditHours;
	private int points;
	private float gpa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	/**
	 * Calculates GPA
	 * @return Calculated GPA
	 */
	public float calcGpa()
	{
		this.gpa = (float)(points/(float)creditHours);
		return gpa;
	}
	@Override
	public String toString() {
		return "Student Details : [id=" + id + ", creditHours=" + creditHours + ", points=" + points + ", gpa=" + gpa + "]";
	}
	/**
	 * Parameterized Constructor
	 * @param id
	 * @param creditHours
	 * @param points
	 */
	public Student(int id, int creditHours, int points) {
		super();
		this.id = id;
		this.creditHours = creditHours;
		this.points = points;
		this.gpa = calcGpa();
	}
	
	public Student() {
	}
	

}
