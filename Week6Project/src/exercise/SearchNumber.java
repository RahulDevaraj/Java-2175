package exercise;

public class SearchNumber {
	public static boolean search(int a[],int num, int index) {
		if(index == a.length)
			return false;
		else
		if(a[index] == num)
			return true;
		else
			return (false || search(a, num, index + 1));
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,9};
		
		for(int i=0;i<10;i++) {
			System.out.println(i+":  "+search(a, i, 0));
			}
		

	}

}
