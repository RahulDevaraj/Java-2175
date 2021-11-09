package exercise;

public class Student extends Person {
	
	float GPA;
	String fieldStudy;
	public float getGPA() {
		return GPA;
	}
	public void setGPA(float gPA) {
		GPA = gPA;
	}
	public String getFieldStudy() {
		return fieldStudy;
	}
	public void setFieldStudy(String fieldStudy) {
		this.fieldStudy = fieldStudy;
	}
	@Override
	public String toString() {
		return "Student [GPA=" + GPA + ", fieldStudy=" + fieldStudy + "]"+ super.toString();
	}
	
	

}
