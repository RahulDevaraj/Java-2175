package package1;


public abstract class Animal {

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract void speak();


	@Override
	public String toString() {
		return "name= " + name ;
	}
	
	
}