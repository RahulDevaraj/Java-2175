package funct;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setEmpNum(123);
		emp1.empCount++;
		emp2.setEmpNum(666);
		emp2.empCount++;
		
		System.out.println(Employee.empCount);
		System.out.println(emp1.getEmpNum());
		System.out.println(emp2.getEmpNum());
		
		System.out.println(emp1.getEmpName());
	}

}
