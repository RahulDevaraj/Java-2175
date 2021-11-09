package exercise;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		boolean status = false;
		for(int i=0;i < address.length() && !status;i++)
		{
			if(Character.isDigit(address.charAt(i)))			
				status = true;
			}
		
		if(status)
		{
			rate = 15;
			this.address = address;
		}
		else {
			System.out.println("Error in address");
			rate = 0;
		}
		
	}

}
