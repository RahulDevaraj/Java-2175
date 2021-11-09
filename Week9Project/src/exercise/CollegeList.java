package exercise;

public class CollegeList {
	public static void main(String[] args) {
		
		{
		
		CollegeEmployee collegeEmployee = new CollegeEmployee();
		collegeEmployee.setAddress("adr");
		collegeEmployee.setDeptName("CSA");
		collegeEmployee.setFname("FN");
		collegeEmployee.setLname("LN");		
		collegeEmployee.setPhone("8745965874");
		collegeEmployee.setSalary(123);
		collegeEmployee.setSSN(1);
		collegeEmployee.setZip("777");
		
		System.out.println(collegeEmployee);}
		
		
			Faculty faculty = new Faculty();
		
			faculty.setAddress("adr");
			faculty.setDeptName("CSA");
			faculty.setFname("FN");
			faculty.setLname("LN");		
			faculty.setPhone("8745965874");
			faculty.setSalary(123);
			faculty.setSSN(1);
			faculty.setZip("777");
			faculty.setTenure(true);
			
			System.out.println(faculty);
			
			
				Student student = new Student();
				
				student.setAddress("adr");
				student.setFieldStudy("Sdtuy");
				student.setGPA(3.3f);
				student.setFname("FN");
				student.setLname("LN");		
				student.setPhone("8745965874");
				student.setZip("777");
				
				
				
				System.out.println(student);
			
		
	}

}
