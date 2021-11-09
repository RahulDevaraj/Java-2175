package test;
/**
 * Employee class
 * @author Rahul
 *
 */
public class Emp {
	
	int id;
	String name;
	/**
	 * GetID Function
	 * @return  id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Setid fn
	 * @param id int
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * GetName function
	 * @return String Name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setname Fn
	 * @param name  String
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Comstructor EMP
	 * @param id int
	 * @param name String
	 */
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	

}
