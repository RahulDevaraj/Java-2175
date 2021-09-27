package exercise;

public class BloodData {
	String bloodType;
	char rhFactor;
	
	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public char getRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(char rhFactor) {
		this.rhFactor = rhFactor;
	}

	public BloodData()
	{
		bloodType = "O";
		rhFactor = '+';
	}

	public BloodData(String bloodType, char rhFactor) {
		
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}

	@Override
	public String toString() {
		return "[bloodType=" + bloodType + ", rhFactor=" + rhFactor + "]";
	}
	

}
