package exercise;

public class Apartment {
	private int apartmentNumber,numberOfBedRooms,nubberOfBaths;
	private float rent;
	public int getApartmentNumber() {
		return apartmentNumber;
	}
	public int getNumberOfBedRooms() {
		return numberOfBedRooms;
	}
	public int getNubberOfBaths() {
		return nubberOfBaths;
	}
	public float getRent() {
		return rent;
	}
	public Apartment()
	{
		
	}
	public Apartment(int apartmentNumber, int numberOfBedRooms, int nubberOfBaths, float rent) {

		this.apartmentNumber = apartmentNumber;
		this.numberOfBedRooms = numberOfBedRooms;
		this.nubberOfBaths = nubberOfBaths;
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "[apartmentNumber=" + apartmentNumber + ", numberOfBedRooms=" + numberOfBedRooms
				+ ", nubberOfBaths=" + nubberOfBaths + ", rent=" + rent + "]";
	}
	

}
