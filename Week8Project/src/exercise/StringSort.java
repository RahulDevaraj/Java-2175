package exercise;

import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {
		
		String string[] = {"aa","az","xs","xc","df","vfd","gd","sdf","dfs"};
		int length = string.length;
		for(int i=0; i<length-1; i++)
		{
			for(int j=0; j< length-i-1; j++)
			{
				
				if(string[j].compareTo(string[j+1]) > 0)
				{
					String temp = string[j];
					string[j] = string[j+1];
					string[j+1] = temp;
				}
			}
		}
		
		//Arrays.sort(string);
		for (String str : string) {
			System.out.println(str);
		}
	}

}
