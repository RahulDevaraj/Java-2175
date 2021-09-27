package exercise;

import java.util.Scanner;

public class PaintCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float length, width, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length, Width and Height :");
		length = sc.nextFloat();
		width = sc.nextFloat();
		height = sc.nextFloat();
		
		float price = operation(length, width, height);
		
		System.out.println("the cost to paint "
				+ "a "+length+"-by-"+width+"-foot room with "+height+"-foot ceilings is $"+price+".");

	}
	
	public static float operation(float length, float width,float height)
	{
		float area = (height*width + height* length )*2;
		
		float gallonsNeeded = paintNeeded(area);
		
		System.out.println("The amount of gallons needed is "+gallonsNeeded);
		
		float price = (float)Math.ceil(gallonsNeeded) * 32;
		
		return price;
		
	}
	
	public static float paintNeeded(float  area)
	{
		//System.out.println("Area"+area);
		return (float)(area/350.0);
	}

}
