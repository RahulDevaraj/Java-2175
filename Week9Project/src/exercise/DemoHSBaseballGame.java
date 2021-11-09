package exercise;

import java.util.Arrays;

public class DemoHSBaseballGame {
public static void main(String[] args) {
	HighSchoolBaseballGame baseballGame = new HighSchoolBaseballGame("team1", "TEAM@");
	baseballGame.setTeam1Score(2, 5);
	baseballGame.setTeam1Score(1, 5);
	baseballGame.setTeam1Score(2, 5);
	baseballGame.setTeam1Score(3, 5);
	baseballGame.setTeam1Score(4, 5);
	baseballGame.setTeam1Score(5, 99);
	baseballGame.setTeam1Score(6, 99);
	baseballGame.setTeam1Score(7, 99);
	
	
	baseballGame.setTeam2Score(2, 5);
	baseballGame.setTeam2Score(1, 5);
	baseballGame.setTeam2Score(2, 5);
	baseballGame.setTeam2Score(3, 5);
	baseballGame.setTeam2Score(4, 15);
	baseballGame.setTeam2Score(5, 98);
	baseballGame.setTeam2Score(6, 99);
	baseballGame.setTeam2Score(7, 99);
	
	baseballGame.winner();
	
	System.out.println(Arrays.toString(baseballGame.getTeam1Score()));
	
}
}
