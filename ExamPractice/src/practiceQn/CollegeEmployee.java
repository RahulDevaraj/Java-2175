package practiceQn;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person{
	int ssn;
	double annualSalary;
	String deptName;
	
	public void setData() {
		super.setData();
		ssn = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ssn")) ;
		annualSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter annual sal")) ;
		deptName = JOptionPane.showInputDialog(null, "Enter deptName");
		
	}
	
	public void display() {
		super.display();
		System.out.print(ssn+" "+annualSalary+" "+deptName);
	}
}
