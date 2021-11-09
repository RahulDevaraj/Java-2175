package exercise;

import java.util.Arrays;

public class SugarSmashPlayer {
	
	private int id;
	private String name;
	private int[] scores = new int[10];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScores(int position) {
		if(position >9)
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
	public SugarSmashPlayer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "SugarSmashPlayer [id=" + id + ", name=" + name + ", scores=" + Arrays.toString(scores) + "]";
	}
	
	
	
}

