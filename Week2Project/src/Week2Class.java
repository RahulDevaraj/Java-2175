import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Week2Class
 * @author Rahul
 *
 */
public class Week2Class {
	/**
	 * 
	 * @param args of string type
	 * Void method
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hai");
		//JOptionPane.showMessageDialog(null, "Hello");
		
		int a = 3, b= 4;
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a +" "+ b);
		int x = '0';
		System.out.println("Connverted"+x);
		
		char f = 35;
		System.out.println("Connverted "+ f);
		
//		// User input
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter yor age ");
//		int age = sc.nextInt();
//		sc.nextLine()
//;		System.out.println("Enter yor name ");
//		String name =  sc.nextLine();
//		//String name2 =  sc.next();
//		
//		
//		System.out.println(name +" "+age);
		
		//GUI INput
//		String result = JOptionPane.showInputDialog(null, "Enter Course","Course",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, result);
		
		salDisplay();
		
		int sel = JOptionPane.showConfirmDialog(null, "Update?","Qn",JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(sel);
	}
	
	public static void salDisplay()
	{
		String result = JOptionPane.showInputDialog(null, "Enter sal","Sal",JOptionPane.QUESTION_MESSAGE);
		double total = Double.parseDouble(result);
		total += 350;
		JOptionPane.showMessageDialog(null, total);
		
	}

}
