
public class DinnerParty extends Party {
	
	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int dinnerChoice) {
		this.dinnerChoice = dinnerChoice;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Child");
	}
	
	public DinnerParty()
	{
		System.out.println("Child Constructor");
	}
	

}
