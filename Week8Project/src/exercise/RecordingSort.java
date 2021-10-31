package exercise;

import java.util.Scanner;

public class RecordingSort {
	
	public static void main(String[] args) {
		Recording records[] = new Recording[5]; 
		
		records[0] = new Recording("Kann","ASD",300);
		records[1] = new Recording("ASC","Ds",310);
		records[2] = new Recording("ASDcxz","Qzz",500);
		records[3] = new Recording("ZXC","ljm",600);
		records[4] = new Recording("sew","wr",100);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sort data by options (1-3)");
		int choice = sc.nextInt();
		if(choice == 3)
			sortByPlayTime(records);
		else
			sortByString(records, choice);
		
		for (Recording recording : records) {
			System.out.println(recording);
		}
		
	}
	
	public static void sortByPlayTime(Recording[] recordings)
	{
		int length = recordings.length;
		for(int i=0; i<length-1; i++)
		{
			for(int j=0; j < length-i-1; j++)
			{
				
				if(recordings[j].getPlayTime() > recordings[j+1].getPlayTime())
				{
					Recording temp = recordings[j];
					recordings[j] = recordings[j+1];
					recordings[j+1] = temp;
				}
			}
		}
	}
	
	public static void sortByString(Recording[] recordings,int choice)
	{
		int length = recordings.length;
		for(int i=0; i<length-1; i++)
		{
			for(int j=0; j < length-i-1; j++)
			{
				
				if(choice == 1)
				{
					if(recordings[j].getTitle().compareTo(recordings[j+1].getTitle()) > 0)
					{
						Recording temp = recordings[j];
						recordings[j] = recordings[j+1];
						recordings[j+1] = temp;
					}
				}
				
				else
				{
					if(recordings[j].getArtist().compareTo(recordings[j+1].getArtist()) > 0)
					{
						Recording temp = recordings[j];
						recordings[j] = recordings[j+1];
						recordings[j+1] = temp;
					}
					
				}
				
				
			}
		}
	}

}
