/**
 * Course Class Definition
 * @author Rahul
 *
 */
public abstract class Course {
	
	private String courseName;
	protected int maximumEnrollment;
	/**
	 * Course Class Constructor
	 * @param courseName String
	 */
	public Course(String courseName) {
		
		this.courseName = courseName;
	}
	/**
	 * Getter for CourseName
	 * @return String courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * Setter for CourseName
	 * @param courseName String
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * Getter for max enrollment
	 * @return maximumEnrollment Integer
	 */
	public int getMaximumEnrollment() {
		return maximumEnrollment;
	}
	/**
	 * Abstract method for Setting MaxEnrollment
	 */
	public abstract void setMaximumEnrollment();
	
	
	

}
