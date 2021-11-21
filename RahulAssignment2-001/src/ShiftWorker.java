import java.time.LocalDate;

/**
 * ShiftWorker class Definiton. Extends Worker Class
 * @author Rahul
 *
 */
public class ShiftWorker extends Worker {
	


	private int shift;
	private double payRate;	
	/**
	 * Get method for Shift
	 */
	public int getShift() {
		return shift;
	}
	/**
	 * Set method for Shift
	 * @param shift int
	 * @throws InvalidShiftException InvalidShiftException
	 */
	public void setShift(int shift) throws InvalidShiftException {
		if(shift!=1 && shift!=2 )	//If invalid shift, throw exception
			throw new InvalidShiftException();
		this.shift = shift;
	}
	/**
	 * Get method for Payrate
	 */
	public double getPayRate() {
		return payRate;
	}
	/**
	 * Set method for Payrate
	 * @param payRate double
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
/**
 * Parameterised constructor for ShiftWorker
 * @param name String
 * @param id String
 * @param hireDate Date
 * @param industry Industry
 * @param shift int
 * @param payRate double
 * @throws InvalidNameException  InvalidNameException
 * @throws InvalidShiftException InvalidShiftException
 */
	public ShiftWorker(String name, String id, LocalDate hireDate, Industry industry,int shift,double payRate) throws InvalidNameException, InvalidShiftException {
		super(name, id, hireDate, industry);
		
		
		setShift(shift);;
		this.payRate = payRate;
		
		// TODO Auto-generated constructor stub
	}
	/**
	 * Default Constructor for ShiftWorker
	 */
	public ShiftWorker() {}
	
	
	


}
