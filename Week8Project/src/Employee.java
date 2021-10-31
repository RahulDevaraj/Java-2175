public class Employee {
	private int empNum;
	private double salary;
	
	public Employee(int n, double s) {
		empNum = n;
		salary = s;
	}
	
	public void setEmpNum(int e) {
		empNum = e;
	}
	
	public int getEmpNum() {
		return empNum;
	}
	
	
	public void setSalary(double s) {
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
}