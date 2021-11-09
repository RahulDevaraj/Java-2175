/**
 * GradCourse Class Definition
 * @author Rahul
 *
 */
public class GradCourse extends Course {
	/**
	 * Constructor for GradCourse Class
	 * @param courseName String
	 */
	public GradCourse(String courseName) {
		super(courseName);
		setMaximumEnrollment();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * max Enrollment Definition in GradCourse
	 */
	@Override
		public void setMaximumEnrollment() {
		// TODO Auto-generated method stub
		maximumEnrollment = 35;
		
	}

}
