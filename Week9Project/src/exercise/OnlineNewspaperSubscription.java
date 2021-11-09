package exercise;

public class OnlineNewspaperSubscription extends NewspaperSubscription{

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		boolean status = false;
		for(int i=0;i < address.length() && !status;i++)
		{
			if(address.charAt(i) == '@')			
			status = true;	
						
		}
		if(status)
		{
			rate = 9;
			this.address = address;
		}
		else {
			System.out.println("Error in address Fn 2");
			rate = 0;
		}
		
	}

}
