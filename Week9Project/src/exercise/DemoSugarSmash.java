package exercise;

public class DemoSugarSmash {
	
	public static void main(String[] args) {
		
		SugarSmashPlayer smashPlayer = new SugarSmashPlayer(1, "Kann");
		smashPlayer.setScores(1, 2);
		smashPlayer.setScores(10, 0);
		smashPlayer.setScores(10, 1);
		smashPlayer.setScores(100, 0);
		smashPlayer.setScores(10, 1);
		System.out.println(smashPlayer);
		System.out.println(smashPlayer.getScores(10));
		System.out.println("-----------------------------");
		PremiumSugarSmashPlayer premiumSugarSmashPlayer = new PremiumSugarSmashPlayer(2, "test");
		premiumSugarSmashPlayer.setScores(1, 10);
		premiumSugarSmashPlayer.setScores(1000, 0);
		premiumSugarSmashPlayer.setScores(10, 1);
		premiumSugarSmashPlayer.getScores(50);
		System.out.println(premiumSugarSmashPlayer);
	}

}
