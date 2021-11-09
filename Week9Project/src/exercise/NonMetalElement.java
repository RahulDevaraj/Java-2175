package exercise;

public class NonMetalElement extends Element {

	public NonMetalElement(String symbol, int atmNo, double weight) {
		super(symbol, atmNo, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describeElement() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + " Non Conductor" );
	}

}
