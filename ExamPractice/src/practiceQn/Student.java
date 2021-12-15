package practiceQn;

import javax.swing.JOptionPane;

public class Student extends Person {
	
	String major;
	double gpa;
	
	public void setData() {
		super.setData();
		major = JOptionPane.showInputDialog(null, "Enter major");
		gpa =  Double.parseDouble(JOptionPane.showInputDialog(null, "Enter gpa"));
		
	}
	
	public void display() {
		super.display();
		System.out.print(major + " "+gpa );
	}

}
