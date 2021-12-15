package exam;
/**
 * Student Class
 * @author Rahul
 *
 */

public abstract  class Student {
	
	private String studentId;
	private String studentName;
	protected double tuition;
	/**
	 * Get Student Fn
	 * @return String id
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * Set StudnetID Fn
	 * @param studentId String
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * Get Student Name Fn
	 * @return  studnetName String
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * Fn to set Student Name
	 * @param studentName String
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * Fn to get Tuition Fee
	 * @return tuition DOuble
	 */
	public double getTuition() {
		return tuition;
	}
	/**
	 * Abstract Method for setTuition
	 */
	public abstract void setTuition();
	/**
	 * Constructor for Studnet
	 * @param studentId String
	 * @param studentName String
	 * @throws InvalidIDException Invalid Exception
	 */
	
	public Student(String studentId, String studentName) throws InvalidIDException {
		super();
		
		boolean status = true;
		
		
		for(int i=0;i<studentId.length();i++)
		{
			if(!Character.isDigit(studentId.charAt(i))) // For checking if ID contains any Letters
			{
				status = false;
				break;
			}
		}
		if(status == true)
		this.studentId = studentId;
		else
		{
			throw new InvalidIDException(); //Thros exception if id have any letters
		}
		this.studentName = studentName;
		
	}
	

}
