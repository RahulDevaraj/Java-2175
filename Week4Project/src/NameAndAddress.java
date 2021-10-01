
public class NameAndAddress {
	
	private String name;
	private String address;
	
	
	
	public NameAndAddress(String name, String address) {
		
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "NameAndAddress [name=" + name + ", address=" + address + "]";
	}
	

}
