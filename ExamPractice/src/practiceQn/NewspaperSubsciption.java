package practiceQn;

public class NewspaperSubsciption implements RateConstants {
	
	String sName;
	double rate;
	public NewspaperSubsciption(String sName) throws InvalidNameException {
		super();
		this.rate = SubscriptionRate;
		
		
		for(int i=0;i<sName.length();i++)
		{
			if(Character.isDigit(sName.charAt(i)))
				throw new InvalidNameException();
				
		}
		this.sName = sName;
		 
	}
	
	

}
