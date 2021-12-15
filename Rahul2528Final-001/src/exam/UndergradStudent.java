package exam;
/**
 * UndergradStudent Class Def
 * @author Rahul
 *
 */

public class UndergradStudent extends Student{
/**
 * UndergradStudent Constructor
 * @param studentId String
 * @param studentName String
 * @throws InvalidIDException Exception
 */
	public UndergradStudent(String studentId, String studentName) throws InvalidIDException {
		super(studentId, studentName);
		setTuition();
		// TODO Auto-generated constructor stub
	}
/**
 * setTuition Function
 */
	@Override
	public void setTuition() {
		// TODO Auto-generated method stub
		this.tuition = 6000;
		
	}
	
	

}
