package practiceQn;

import javax.swing.JOptionPane;

public class Person {
	
	String fname,lname,address,zip,phone;
	
	public void display() {
		System.out.print(fname + " "+lname + " "+address + " "+zip + " "+phone + " ");
	}
	
	public void setData() {
		fname = JOptionPane.showInputDialog(null, "Enter f name");
		lname = JOptionPane.showInputDialog(null, "Enter l name");
		address = JOptionPane.showInputDialog(null, "Enter adre");
		zip = JOptionPane.showInputDialog(null, "Enter zip");
		phone = JOptionPane.showInputDialog(null, "Enter phone");
	}

}
