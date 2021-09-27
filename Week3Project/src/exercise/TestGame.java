package exercise;

public class TestGame {
	
	public static void displayData(Game game)
	{
		System.out.println("Game Details as Follows :");
		System.out.println("Team 1 :"+ game.getTeam1());
		System.out.println("Team 2 :"+ game.getTeam2());
		System.out.println("Game Time :"+ game.getTime());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team team1 = new Team("Roosevelt High","Girls’ Basketball","Dolphins");
		Team team2 = new Team("Theodore High","Girls’ baseball","Wolves");
		
		String time = "7 AM";
		
		
		Game game1 = new Game(team1,team2,time);
		
		displayData(game1);
		
		

	}

}
