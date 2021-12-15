package exam;
/**
 * InvalidID Exception Class
 * @author Rahul
 *
 */

public class InvalidIDException extends Exception {
	/**
	 * Constructor for Invalid ID Exception
	 */
	public InvalidIDException() {
		super("Student id is invalid");
	}

}
