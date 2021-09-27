package exercise;

public class Patient {
	int id;
	int age;
	BloodData data;
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public BloodData getData() {
		return data;
	}
	
	public Patient()
	{
		id=0;
		age=0;
		data = new BloodData();
	}

	public Patient(int id, int age, BloodData data) {
		super();
		this.id = id;
		this.age = age;
		this.data = data;
	}

}
