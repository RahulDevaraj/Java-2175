
public class Practice {

	public static void main(String[] args) {
		//count(5);
//		System.out.println(factorial(5));
//		
//		int a[] = {1,2,3,4,5,6,7};
//		
//		System.out.println(sumArray(a,3,5));
//		
//		System.out.println(fibonacci(5));
		
		String a = "ASDY" , b = "ASDZ", test = "Kannan";
		System.out.println(test.subSequence(3, 5));
		
		String str1 = "abcde", str2 = "asdwbcd";
		
		System.out.println(str1.regionMatches(true,1, str2, 4, 3));
		System.out.println("Index "+b.indexOf('Z'));
	//	System.out.println(a.equals(b))	;
		System.out.println(a.compareTo(b));
		char ch = 'c';
		System.out.println(Character.isUpperCase(ch));
		
		
		StringBuilder stringBuilder = new StringBuilder("Kanna");
		System.out.println(stringBuilder.capacity()); // !6 character buffer allocaed .. So 16+5 =21
		stringBuilder.delete(0, stringBuilder.length());
		stringBuilder.append("Goku");
		System.out.println(stringBuilder
				);
		
	}
	
	public static void count(int n) {
		if(n > 0) {
			System.out.println(n);
			count(n-1);
		}
			
	}
	
	public static int factorial(int n)
	{
		if(n>0) {
			return n*factorial(n-1);
		}
		else
			return 1;
	}

	public static int sumArray(int a[],int start, int end)
	{
		if(start > end)
			return 0;
		else
			return (a[start] + sumArray(a, start+1, end));
	}
	
	public static int fibonacci(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)		
			return 1;
		
		else
		{
			return fibonacci(n-1)+ fibonacci(n-2);
		}
	}
	
	public static int gcd(int x,int y)
	{
		if(x % y == 0)
			return y;
		else
			return gcd(y, x % y);
	}
	
//	public static int binarySearch(int a[],int start,int end)
//	{
//		
//	}
}
