package exercise;
/**
 * 
 * @author Rahul
 *
 */
public class Power {
	
	public static int pow(int x, int y) {
		if(y == 1)
			return x;
		else
			return x*pow(x, y-1);
	}
	
	public static void main(String[] args) {
		System.out.println(pow(5, 3));
	}

}
