package exercise;

public class MaxElementInArray {
	
	public static int maxElement(int a[]) {
		return maxFunction(a, 0, 0);
	}
	
	public static int maxFunction(int a[], int index , int currentMax) {
		if(index == 0)
		{
			currentMax = a[0];
		}
		if(index == a.length)
			return currentMax;
		else
			if(a[index] > currentMax) {
				currentMax = a[index];				
			}
		return maxFunction(a, index + 1, currentMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,15,4,5};
		System.out.println(maxElement(a));
	}

}
