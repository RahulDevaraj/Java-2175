package exercise;

public class ShowStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		
		student1.setCreditHours(3);
		student1.setId(123);
		student1.setPoints(11);
		student1.calcGpa();
		
		System.out.println(student1);

	}

}
