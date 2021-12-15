package week9Exercise;

public class GradeException extends Exception{
	
	public static String[] grades = {"A","B","C","D","F","I"};
	
	public GradeException() {
		super("Invalid Grade");
	}
	

}
