package exercise;

public class Faculty extends CollegeEmployee{
	
	boolean tenure;

	public boolean isTenure() {
		return tenure;
	}

	public void setTenure(boolean tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "Faculty [tenure=" + tenure + "]" + super.toString();
	}
	
	

}
