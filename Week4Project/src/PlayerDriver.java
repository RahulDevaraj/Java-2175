import java.time.LocalDate;

public class PlayerDriver {

	public static void main(String[] args) {
		
		Player player = new Player(222,5.5,"Dac","Van");
		System.out.println(player);
		
		Player player2 = new Player(22,15.5,"John","BNY");
		System.out.println(player2);
		
		
		LocalDate today = LocalDate.now();
		
		LocalDate graduationDate = LocalDate.of(2021, 04, 17);
		
		System.out.println(graduationDate);
		
		System.out.println(today.getYear());
		System.out.println(graduationDate.getMonth());
	}

}
