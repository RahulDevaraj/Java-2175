package exercise;

public abstract class Element {
	
	String symbol;
	int atmNo;
	double weight;
	public String getSymbol() {
		return symbol;
	}
	public int getAtmNo() {
		return atmNo;
	}
	public double getWeight() {
		return weight;
	}
	public Element(String symbol, int atmNo, double weight) {
		super();
		this.symbol = symbol;
		this.atmNo = atmNo;
		this.weight = weight;
	}
	
	public abstract void describeElement();
	@Override
	public String toString() {
		return "Element [symbol=" + symbol + ", atmNo=" + atmNo + ", weight=" + weight + "]";
	}
	

}
