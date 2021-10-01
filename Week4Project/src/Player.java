
public class Player {
	private int number;
	private double average;
	private NameAndAddress nameAdd;
	private static int countPlayers = 0;
	private static final int SPORTS_CLUB_ID = 12345;
	

	
	public Player(int number, double average, String name,String address) {
		
		this.number = number;
		this.average = average;
		nameAdd = new NameAndAddress(name, address);
		countPlayers++;
	}
	
	public Player() {
		this(10, 12.2d,null,null);
	}
	
	public Player(double avg) {
		this(10, avg,null,null);
	}

	@Override
	public String toString() {
		return "Player [number=" + number + ", average=" + average + ", count= "+countPlayers+" ,name="+nameAdd+"]";
	}
	

}
