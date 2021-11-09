
public class Party {

	private int guests;

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}
	
	public void display() {
		System.out.println("Parent");
	}
	
	
	public Party() {
		System.out.println("Parent Cons");
	}
}
