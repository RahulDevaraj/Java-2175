package exercise;

public class BaseballGame {
	
	private String team1, team2;
	
	private int[] team1Score;
	private int[] team2Score;
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public int[] getTeam1Score() {
		return team1Score;
	}

	public int[] getTeam2Score() {
		return team2Score;
	}
	
	
	public BaseballGame(String team1, String team2, int inningsNumber) {
		this.team1 = team1;
		this.team2 = team2;
		team1Score = new int[inningsNumber];
		team2Score = new int[inningsNumber];
		
		for(int i=0;i< inningsNumber; i++)
		{
			team1Score[i] = -1;
			team2Score[i] = -1;
		}
	}
	private int setArrayLength(int array[]) {
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == -1)
				return i;
		}
		
		return array.length;
	}
	
	public void setTeam1Score(int innings, int score) {
		if(setArrayLength(team1Score) >= innings -1)
			team1Score[innings -1] = score;
		
		else
			System.out.println("Error");
	}
	public void setTeam2Score(int innings, int score) {
		if(setArrayLength(team2Score) >= innings -1)
			team2Score[innings -1] = score;
		
		else
			System.out.println("Error");
	}
	
	public void winner()
	{
		if(team1Score.length == setArrayLength(team1Score) && team2Score.length == setArrayLength(team2Score))
		{
			int sum1=0,sum2=0;
			
			for(int i=0;i<team1Score.length;i++)
			{
				sum1+=team1Score[i];
				sum2+=team2Score[i];
			}
			
			if(sum1 > sum2)
				System.out.println("Team1");
			else if(sum2>sum1)
				System.out.println("Team2");
			else 
				System.out.println("Tie");
		}
		else
			System.out.println("Incomplete Game");
	}

	


}
