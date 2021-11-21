package package1;

public class WorkingDog extends Dog implements Worker{
	int hoursTraining;

	public WorkingDog(String name) {
		super.setName(name);
	}
	
	public int getHoursTraining() {
		return hoursTraining;
	}


	public void setHoursTraining(int hoursTraining) {
		this.hoursTraining = hoursTraining;
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		System.out.println(super.getName());
		System.out.println("Dog is trianed for "+hoursTraining);
	}
}
