
public class PractiseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15,b = 10;
		int smallNumber;
		
		if(a < b)
			smallNumber = a;
		else
			smallNumber = b;
		
		System.out.println("Small number is "+ smallNumber);
		
		smallNumber = (a < b)? a:b;
		System.out.println("Small number (Conditional Operator) is "+ smallNumber);
			

	}
	
	

}
