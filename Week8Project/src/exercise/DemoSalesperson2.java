package exercise;

public class DemoSalesperson2 {
public static void main(String[] args) {
	
	Salesperson salesperson[] = new Salesperson[10];
	for(int i=0;i<10;i++) {
		salesperson[i] = new Salesperson(111 + i, 25000 + (5000 * i));
		System.out.println("Salesperson "+ (i+1) + salesperson[i]);
	}
	
}
}
