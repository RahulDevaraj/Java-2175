package practiceQn;

public class InvalidNameException extends Exception{
	public InvalidNameException() {
		super("Name cannot contain any digits");
	}

}
