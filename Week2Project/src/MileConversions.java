
public class MileConversions {
	final static int INCHES_IN_MILE = 63360;
	final static int FOOT_IN_MILE = 5280;
	final static int YARD_IN_MILE = 1760;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numberOfMiles = 20;
		
		System.out.println("The number of inches in "+numberOfMiles+" miles is "+ numberOfMiles*INCHES_IN_MILE);
		System.out.println("The number of foot in "+numberOfMiles+" miles is "+ numberOfMiles*FOOT_IN_MILE);
		System.out.println("The number of yards in "+numberOfMiles+" miles is "+ numberOfMiles*YARD_IN_MILE);

	}

}
