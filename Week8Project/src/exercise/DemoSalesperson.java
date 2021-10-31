package exercise;

public class DemoSalesperson {
	public static void main(String[] args) {
		Salesperson salesperson[] = new Salesperson[10];
		for(int i=0;i<10;i++) {
			salesperson[i] = new Salesperson(9999, 0);
			System.out.println("Salesperson "+ (i+1) + salesperson[i]);
		}
	}

}
