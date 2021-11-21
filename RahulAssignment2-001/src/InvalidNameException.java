/**
 * Custom Exception InvalidNameException Definition
 * @author Rahul
 *
 */
public class InvalidNameException extends Exception {
	/**
	 * InvalidNameException Constructor
	 */
	public InvalidNameException() {
		super("Invalid Name!! Name cannot contain digits");
	}

}
