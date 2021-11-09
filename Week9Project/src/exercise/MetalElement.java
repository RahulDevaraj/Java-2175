package exercise;

public class MetalElement extends Element {

	public MetalElement(String symbol, int atmNo, double weight) {
		super(symbol, atmNo, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describeElement() {
		// TODO Auto-generated method stub
		
		System.out.println(super.toString() + " Conductor " );
		
	}

}
