package exercise;

public class ArrayMethodDemo {
	
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8};
		
		display(array);
		reverse(array);
		sum(array);
		limit(array, 6);
		avg(array);
	}
	
	public static void display(int array[])
	{
		System.out.println("The entered array is :");
		for(int i : array) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
	
	public static void reverse(int array[])
	{
		System.out.println("The entered array in reverse :");
		
		for(int i = array.length ; i>0 ; i--)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
	
	public static void sum(int array[])
	{
		int sum=0;
		
		
		for(int i : array) {
			sum += i;
		}
		System.out.println("The sum of array is :"+sum);
	}
	
	public static void limit(int array[],float limit)
	{
		System.out.println("The entered numbers less than "+limit+" is :");
		for(int i : array) {
			if(i<limit)
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
	
	public static void avg(int array[]) {
		int sum=0;
		
		
		for(int i : array) {
			sum += i;
		}
		
		float avg = (float)sum/(array.length);
		limit(array, avg);
	}
			
	

}
