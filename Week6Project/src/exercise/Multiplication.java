package exercise;

public class Multiplication {
	
	public static int mult(int base,int number) {
		if(number == 1)
			return base;
		else
			return base+mult(base,number-1);
	}
public static void main(String[] args) {
	System.out.println(mult(5, 4));
}
}
