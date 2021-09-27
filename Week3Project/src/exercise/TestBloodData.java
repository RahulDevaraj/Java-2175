package exercise;

public class TestBloodData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BloodData data1 = new BloodData();
		System.out.println("Default Construtor :"+data1);
		
		BloodData data2 = new BloodData("AB",'-');
		System.out.println("Parameterised Construtor :"+data2);
		
		data2.setBloodType("A");
		data2.setRhFactor('+');
		System.out.println("After Set methods Construtor :"+data2);
		

	}

}
