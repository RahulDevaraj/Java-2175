package aray;
/**
 * Class def 2
 * @author Rahul
 *
 */

public class test {
	/**
	 * Main
	 * @param args arg
	 */
	
	public static void main(String[] args) {
		String str[] = {"A","B","C","D","E"};
		
		for (String string : str) {
			System.out.println(string);
		}
		
		System.out.println("After");
		
		sorted(str);
		for (String string : str) {
			System.out.println(string);
		}
	}
	/**
	 * Sroting
	 * @param str String
	 */
	public static void sorted(String[] str)
	{
		for(int i=0;i<str.length - 1;i++)
		{
			for(int j=0; j<str.length -1-i;j++)
			{
				if(str[j].compareTo(str[j+1])<0)
				{
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
	}

}
