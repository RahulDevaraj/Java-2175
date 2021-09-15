import javax.swing.JOptionPane;

public class MileConversionsInteractive {
	final static int INCHES_IN_MILE = 63360;
	final static int FOOT_IN_MILE = 5280;
	final static int YARD_IN_MILE = 1760;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfMiles = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of Miles","Input Data"));
		
		JOptionPane.showMessageDialog(null, "The number of inches in "+numberOfMiles+" miles is "+ numberOfMiles*INCHES_IN_MILE);
		
		JOptionPane.showMessageDialog(null, "The number of foot in "+numberOfMiles+" miles is "+ numberOfMiles*FOOT_IN_MILE);
		
		JOptionPane.showMessageDialog(null, "The number of yards in "+numberOfMiles+" miles is "+ numberOfMiles*YARD_IN_MILE);
		

	}

}
