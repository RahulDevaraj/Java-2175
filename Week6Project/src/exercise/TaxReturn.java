package exercise;

public class TaxReturn {
	private long ssn;
	private String fName,lName,streetAddress, city,state;
	private long zip;
	private double annualIncome,taxLiability;
	private String maritalStatus;
	public TaxReturn(long ssn, String fName, String lName, String streetAddress, String city, String state, long zip,
			double annualIncome, String maritalStatus) {
		this.ssn = ssn;
		this.fName = fName;
		this.lName = lName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.annualIncome = annualIncome;
		this.maritalStatus = maritalStatus;
		
		if(annualIncome < 20000 && maritalStatus.equals("Single"))
			taxLiability = .15 * annualIncome;
		else if(annualIncome < 20000 && maritalStatus.equals("Married"))
				taxLiability = .14 * annualIncome;
		else if(annualIncome < 50000 && maritalStatus.equals("Single"))
					taxLiability = .22 * annualIncome;
		else if(annualIncome < 50000 && maritalStatus.equals("Married"))
			taxLiability = .20 * annualIncome;
		else if(annualIncome > 50000 && maritalStatus.equals("Single"))
			taxLiability = .3 * annualIncome;
		else if(annualIncome > 50000 && maritalStatus.equals("Married"))
			taxLiability = .28 * annualIncome;
				
	}
	@Override
	public String toString() {
		return "TaxReturn [ssn=" + ssn + ", fName=" + fName + ", lName=" + lName + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", annualIncome=" + annualIncome
				+ ", taxLiability=" + taxLiability + ", maritalStatus=" + maritalStatus + "]";
	}
	

}
