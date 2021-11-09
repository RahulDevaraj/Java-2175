package exercise;

public class DemoBlankets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricBlanket electricBlankets[] = new ElectricBlanket[4];
		{
		electricBlankets[0] = new ElectricBlanket();
		electricBlankets[0].setColor("red");
		electricBlankets[0].setFeature(true);
		electricBlankets[0].setMaterial("cashmere");
		electricBlankets[0].setSettings(2);
		electricBlankets[0].setSize("king");
		
		System.out.println(electricBlankets[0]);
		}
		
		{
			electricBlankets[1] = new ElectricBlanket();
			//electricBlankets[1].setColor("red");
			electricBlankets[1].setFeature(false);
			electricBlankets[1].setMaterial("wool");
			electricBlankets[1].setSettings(-2);
			electricBlankets[1].setSize("double");
			
			System.out.println(electricBlankets[1]);
			}

	}

}
