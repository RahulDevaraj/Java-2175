package exercise;

import java.util.Scanner;

public class CellPhoneService {
	private int talkMinutes;
	private int textMessages;
	private int data;
	public int getTalkMinutes() {
		return talkMinutes;
	}
	public int getTextMessages() {
		return textMessages;
	}
	public int getData() {
		return data;
	}
	public CellPhoneService(int talkMinutes, int textMessages, int data) {
		this.talkMinutes = talkMinutes;
		this.textMessages = textMessages;
		this.data = data;
	}
	
	public String planSelect() {
		String plan = null;
		if(talkMinutes < 500 && textMessages ==0 && data ==0)
			plan = "Plan A at $49 a Month";
		else if(talkMinutes < 500 && textMessages > 0)
				plan = "Plan B at $55 a Month";
		else if(talkMinutes >= 500 && textMessages <=100 && data ==0)
				plan = "Plan C at $61 a Month";
		else if(talkMinutes >= 500 && textMessages <100 && data ==0)
				plan = "Plan C at $61 a Month";
		else if(talkMinutes >= 500 && textMessages >=100 && data ==0)
			plan = "Plan D at $70 a Month";
		else if(data < 3)
			plan = "Plan E at $79 a Month";
		else if(data >= 3)
			plan = "Plan F at $89 a Month";
		return plan;
			
	}
	public static void main(String[] args) {
		int talkTime,messages,data;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter talktime, messages and data needed per month :");
		talkTime = sc.nextInt();
		messages = sc.nextInt();
		data = sc.nextInt();
		
		CellPhoneService cellPhoneService = new CellPhoneService(talkTime, messages, data);
		System.out.println("The selected plan is : "+cellPhoneService.planSelect());
		
	}
	
	

}
