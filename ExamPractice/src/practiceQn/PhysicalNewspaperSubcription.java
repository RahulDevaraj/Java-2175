package practiceQn;

public class PhysicalNewspaperSubcription extends NewspaperSubsciption{

	

	String subscriptionType;
	public PhysicalNewspaperSubcription(String sName) throws InvalidNameException {
		super(sName);
		subscriptionType = "PhysicalSUB";
		
	}
	@Override
	public String toString() {
		return "PhysicalNewspaperSubcription [subscriptionType=" + subscriptionType + ", sName=" + sName + ", rate="
				+ rate + "]";
	}
	
	

}
