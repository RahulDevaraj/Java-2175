package exercise;

public class TestSandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich sand1 = new Sandwich();
		sand1.setBreadType("Wheat");
		sand1.setMainIncredient("Veggy");
		sand1.setPrice(4.50);
		
		System.out.println("BreadType is "+sand1.getBreadType());
		System.out.println("Main incredieant is "+sand1.getMainIncredient());
		System.out.println("Price is "+sand1.getPrice());

	}

}
