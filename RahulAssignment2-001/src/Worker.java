import java.time.LocalDate;
/**
 * Class Worker Definition
 * @author Rahul
 *
 */
public abstract class Worker {
	private String name;
	private String id;
	private LocalDate hireDate;
	private Industry industry;
	/**
	 * Get fn for name
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set fn for name
	 * @param name String
	 * @throws InvalidNameException InvalidNameException
	 */
	public void setName(String name) throws InvalidNameException {
		
		boolean nameStatus = true;
		for(int i=0 ;i<name.length() && nameStatus; i++) {	//If name contains digits
			if(Character.isDigit(name.charAt(i)))
				nameStatus = false;
		}
		if(!nameStatus)
			throw new InvalidNameException();
		
		this.name = name;
	}
	/**
	 * Get fn for id
	 * @return String
	 */
	public String getId() {
		return id;
	}
	/**
	 * Set fn for id
	 * @param id String
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Get fn for HireDate
	 * @return Date
	 */
	public LocalDate getHireDate() {
		return hireDate;
	}
	/**
	 * Set fn for HireDate
	 * @param hireDate Date
	 */
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * Set fn for industry enum
	 * @return enum
	 */
	public Industry getIndustry() {
		return industry;
	}
	/**
	 * Set fn for Industry enum
	 * @param industry enum
	 */
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	/**
	 * parameterised constructor  for Worker Class
	 * @param name String
	 * @param id String
	 * @param hireDate Date
	 * @param industry industry
	 * @throws InvalidNameException InvalidNameException
	 */
	public Worker(String name, String id, LocalDate hireDate, Industry industry) throws InvalidNameException {
			
		setName(name);		
		this.id = id;
		this.hireDate = hireDate;
		this.industry = industry;
	}
	/**
	 * Default Constructor for Worker
	 */
	public Worker() {}
	/**
	 * Abstract method to get Shift
	 * @return int
	 */
	public abstract int getShift();
	/**
	 * Abstract method to get PayRate
	 * @return Double
	 */
	public abstract double getPayRate();
	
	

}
