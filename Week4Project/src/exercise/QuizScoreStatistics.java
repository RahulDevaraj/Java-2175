package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizScoreStatistics {
	
	public static int sumOfArray(ArrayList<Integer> arrayList)
	{
		int sum=0;
		for(int i=0;i<arrayList.size();i++)
		{
			sum+=arrayList.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		int score;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter a score between 0 and 10 (99 to exit):");
			score = sc.nextInt();
			if(score == 99)
				break;
			else
			if(score < 0 || score > 10)
			{
				System.out.println("Invalid  Score");
			}
			else
				scores.add(score);
			
		}while(true);
		
		float avg = (sumOfArray(scores) / (float)scores.size());
		
		System.out.println("The number of scores entered are "+scores.size());
		System.out.println("The highest score entered is "+Collections.max(scores));
		System.out.println("The minimum score entered is "+Collections.min(scores));
		System.out.println("The average of scores entered is "+avg);
		
		
		

	}

}
