package exercise;

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient = new Patient();
		System.out.println("Default Values are : ID: "+patient.getId()+", Age: "+patient.getAge()+", and BloodData :"+patient.getData());
		
		BloodData bloodData = new BloodData("AB",'-');
		Patient patient2 = new Patient(19,53,bloodData);
		System.out.println("Changed Values are : ID: "+patient2.getId()+", Age: "+patient2.getAge()+", and BloodData :"+patient2.getData());

	}

}
