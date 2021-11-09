package exercise;

public class DemoSubscriptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewspaperSubscription newspaperSubscription = new PhysicalNewspaperSubscription();
		newspaperSubscription.setName("Paper 1");
		newspaperSubscription.setAddress("asd1");
		System.out.println(newspaperSubscription);
		
		NewspaperSubscription newspaperSubscription2 = new PhysicalNewspaperSubscription();
		newspaperSubscription2.setName("Paper 2");
		newspaperSubscription2.setAddress("asd");
		System.out.println(newspaperSubscription2);
		
		NewspaperSubscription newspaperSubscription3 = new OnlineNewspaperSubscription();
		newspaperSubscription3.setName("Paper 3");
		newspaperSubscription3.setAddress("asd@");
		System.out.println(newspaperSubscription3);
		
		NewspaperSubscription newspaperSubscription4 = new OnlineNewspaperSubscription();
		newspaperSubscription4.setName("Paper 4");
		newspaperSubscription4.setAddress("asd");
		System.out.println(newspaperSubscription4);
		
		
		

	}

}
