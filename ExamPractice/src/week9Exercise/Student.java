package week9Exercise;

public class Student {
	int id;
	String grade;
	
	
	public Student(int id, String grade) throws GradeException {
		super();
		this.id = id;
		setGrade(grade);
	}
	
	public Student() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) throws GradeException {
		Boolean status = false;
		
		for(int i=0; i<GradeException.grades.length && !status; i++)
		{
			if(GradeException.grades[i].equals(grade) )
			{
				status = true;
			}
		}
		
		if(status == true)
		this.grade = grade;
		else
		{
			throw new GradeException();
		}
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", grade=" + grade + "]";
	}

}
