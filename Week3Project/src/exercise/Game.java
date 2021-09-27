package exercise;

public class Game {
	
	private Team team1,team2;
	private String time;
	public Game(Team team1, Team team2, String time) {
		
		this.team1 = team1;
		this.team2 = team2;
		this.time = time;
	}
	
	public Game() {
		
	}

	public Team getTeam1() {
		return team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public String getTime() {
		return time;
	}
	

}
