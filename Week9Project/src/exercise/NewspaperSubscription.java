package exercise;

public abstract class NewspaperSubscription {
	
	protected String name,address;
	protected double rate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public double getRate() {
		return rate;
	}
	
	public abstract void setAddress(String address);
	@Override
	public String toString() {
		return "NewspaperSubscription [name=" + name + ", address=" + address + ", rate=" + rate + "]";
	}
	
	
	
	

}
