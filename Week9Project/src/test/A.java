package test;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Demo Class
 * @author Rahul
 *
 */
public class A {
	/**
	 * Main Function
	 * @param args String
	 */
public static void main(String[] args) {
	
	ArrayList<Emp> arrayList = new ArrayList<Emp>();
	
	arrayList.add(new Emp(0,"A"));
	arrayList.add(new Emp(1,"AA"));
	arrayList.add(new Emp(2,"AAA"));
	arrayList.add(new Emp(3,"AAAA"));
	arrayList.add(new Emp(4,"AAAAA"));
	
	int length = arrayList.size();
//Sorting insertion sort
    for (int i = 1; i < length; i++)
    {
        Emp temp = arrayList.get(i);
        int j = i - 1;


        for (;j >= 0 && arrayList.get(j).getId() < temp.getId(); j--) 
        {
        	arrayList.set(j+1, arrayList.get(j));
            
        }
        arrayList.set(j+1, temp);
        
    }
    
	//for removing id=3
	int index = 0;
	for(;index < length; index++)
	{
		if(arrayList.get(index).getId() == 3)
			break;
	}
	
	arrayList.remove(index);
	
	for (Emp emp : arrayList) {
		System.out.println(emp);
	}
}

}
