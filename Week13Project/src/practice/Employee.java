package practice;

public class Employee {
	
	String name;
	int hours;
	
	public Employee() {
		
	}
	public Employee(String name, int hours) {
		
		this.name = name;
		this.hours = hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double getGrossPay(double pay)
	{
		return pay * 150;
	}
	
	public double getSocialTaxesDeduction(double pay)
	{
		return getGrossPay(pay)*0.0785;
	}
	
	public double getFederalTaxesDeduction(double pay)
	{
		return getGrossPay(pay)*0.0575;
	}
	
	public double getNetIncome(double pay)
	{
		return getGrossPay(pay) - getFederalTaxesDeduction(pay) - getSocialTaxesDeduction(pay);
	}
	
	
	
	

}
