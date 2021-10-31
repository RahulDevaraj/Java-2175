import java.util.ArrayList;

public class PracticeCode {
	public static void main(String[] args) {
//		int[] numbers = new int[6];
//		
//		for(int i=0;i<numbers.length;i++)
//			numbers[i] = i;
//		
//		for(int num:numbers)
//			System.out.println(num);
		
		
		
		
		Employee employees[] = new Employee[5];
		
		for(int i = 0; i<employees.length ; i++) {
			employees[i] = new Employee(555 + i, 1500.2 * (i+1.99)*.99);
		}
		
		for( Employee employee:employees)
			System.out.println(employee.getEmpNum()+" "+employee.getSalary());
		
		bubbleEmployee(employees);
		System.out.println("After--------------------------------");
		for( Employee employee:employees)
			System.out.println(employee.getEmpNum()+" "+employee.getSalary());
		
		
//		String str[] = {"asdasd","asdwqwd","qweasdfasfa"};
//		
//		for(String st: str)
//			System.out.println(st.length());
		
		
		
		
		int values[] = {23,45,67,89,89,2,1};
		
		int value = 89;
		
		methodArray(values, value);
//		boolean isFound = false;
//		
//		for(int i=0;i < values.length && !isFound; i++)
//		{
//			if(values[i] ==  value)
//			{
//				System.out.println("Value found at index "+i);
//				isFound = true;
//			}
//				
//		}
		
		insertionSort(values);
		for(int val:values)
			System.out.println(val);
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kannan");
		names.add("Kim");
		names.add("Planki");
		
		for(String name:names)
			System.out.println(name);
		
		
		
	}
	
	public static void methodArray(int[] values,int value) {
		boolean isFound = false;
		
		for(int i=0;i < values.length && !isFound; i++)
		{
			if(values[i] ==  value)
			{
				System.out.println("Value found at index "+i);
				isFound = true;
			}
				
		}
		
	}
	
	public static void bubbleSort(int values[])
    {
        int length = values.length;
        
        for (int i = 0; i < length-1; i++)        	
            for (int j = 0; j < length-i-1; j++)
                if (values[j] > values[j+1])
                {                   
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
    }
	
	public static void bubbleEmployee(Employee[] employees)
	{
		int length = employees.length;
		for(int i=0; i< length-1;i++)
		{
			for(int j=0; j<length-1-i;j++)
			{
				Employee temp;
				
				if(employees[j].getSalary() < employees[j+1].getSalary())
				{
					temp = employees[j];
					employees[j] = employees[j+1];
					employees[j+1] = temp;
				}
			}
		}
	}
	
	public static void insertionSort(int array[])
    {
        int length = array.length;
        for (int i = 1; i < length; i++)
        {
            int temp = array[i];
            int j = i - 1;


            for (;j >= 0 && array[j] > temp; j--) 
            {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
 

}
