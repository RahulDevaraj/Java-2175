package exercise;

public class TestAutomobiles {
	public static void main(String[] args) {
		Automobile automobile1 = new Automobile(-25, "Germany", "Gt", "Red", 2011, 12f);
		Automobile automobile2 = new Automobile(26, "US", "GK", "Violet", 2004, 9f);
		Automobile automobile3 = new Automobile(50, "UK", "BK", "Yellow", 2015, 65f);
		
		System.out.println(automobile1);
		System.out.println(automobile2);
		System.out.println(automobile3);
	}

}
