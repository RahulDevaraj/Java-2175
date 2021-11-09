/**
 * UndergradCourse Class Definition
 * @author Rahul
 *
 */
public class UndergradCourse extends Course {
	/**
	 * Constructor for UndergradCourse Class
	 * @param courseName String
	 */
	public UndergradCourse(String courseName) {
		super(courseName);
		setMaximumEnrollment();
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * max Enrollment Difinition in UndergradCourse
	 */
	public void setMaximumEnrollment() {
		// TODO Auto-generated method stub
		maximumEnrollment = 45; 
		
	}

}
