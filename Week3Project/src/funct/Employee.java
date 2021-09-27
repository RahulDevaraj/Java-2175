package funct;

public class Employee {
	
	private int empNum;
	private String empName;
	private double salary;
	public static int empCount =0;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setEmpNum(int en) {
		empNum = en;
		}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpName(String name) {
		empName = name;
		}
	
	public String getEmpName()
	{
		return empName;
	}
public Employee()
{
	empNum = 999;
	empName = "XYZ";
	salary = 0.0;
}
}
