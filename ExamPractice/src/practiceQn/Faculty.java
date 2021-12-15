package practiceQn;

import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee {
	
	Boolean isTenured;
	
	public void setData() {
		super.setData();
		
		isTenured =  Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Enter Tenured")) ;
		
	}
	
	public void display() {
		super.display();
		System.out.print(isTenured);
	}

}
