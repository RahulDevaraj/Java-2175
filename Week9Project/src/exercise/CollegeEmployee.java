package exercise;

public class CollegeEmployee extends Person{
	
	private int SSN;
	private float salary;
	private String deptName;
	
	
	public int getSSN() {
		return SSN;
	}


	public void setSSN(int sSN) {
		SSN = sSN;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	@Override
	public String toString() {
		return "CollegeEmployee [SSN=" + SSN + ", salary=" + salary + ", deptName=" + deptName + "]" + super.toString();
	}
	
	

}
