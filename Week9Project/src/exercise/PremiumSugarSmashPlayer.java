package exercise;

import java.util.Arrays;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer{
	private int[] scores = new int[50];
	
	public int getScores(int position) {
		if(position >48)
		{
			System.out.println("Error!! Invalid");
			return -1;
		}
		else
			return scores[position];
	}
	
	public void setScores(int score,int position) {
		if(position == 0)
			scores[0] = score;
		else
		{
		if(scores[position -1] >=100)
		scores[position] = score;
		else
			System.out.println("Cannot Set");
		}
	}

	public PremiumSugarSmashPlayer(int id, String name) {
		super(id, name);
	}

	@Override
	public String toString() {
		return "PremiumSugarSmashPlayer [id=" + getId() + ", name=" + getName() + ",scores= [" + Arrays.toString(scores) + "]";
	}
	
	
}
