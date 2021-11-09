package exercise;

public abstract class Book {
	
	private String title;
	protected double price;
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public Book(String title) {
		
		this.title = title;
		
	}
	
	public abstract void setPrice();
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	

}
