package exercise;

public class NonFiction extends Book {

	public NonFiction(String title) {
		super(title);
		setPrice();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		price = 37.99;
	}

}
