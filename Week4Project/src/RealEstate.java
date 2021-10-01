
public class RealEstate {
	private int lNum;
	private double price;
	private HouseData houseData;
	
	public RealEstate(int lNum, double price,int sqFeet, String address) {
		
		this.lNum = lNum;
		this.price = price;
		houseData = new HouseData(sqFeet, address);
	}

	@Override
	public String toString() {
		return "RealEstate [lNum=" + lNum + ", price=" + price + " , Sq Feet="+houseData.sqFeet+", address = "+houseData.address+"]";
	}
	
	private class HouseData{
		private int sqFeet;
		private String address;
		public HouseData(int sqFeet, String address) {
			
			this.sqFeet = sqFeet;
			this.address = address;
		}
		
		
	}
}
