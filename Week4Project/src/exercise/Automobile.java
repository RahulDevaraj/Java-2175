package exercise;

public class Automobile {
	private int id;
	private String make;
	private String model;
	private String color;
	private int year;
	private float milesPerGallon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<0 || id>9999)
			id = 0;
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year <2005 || year > 2019)
			year = 0;
		this.year = year;
	}
	public float getMilesPerGallon() {
		return milesPerGallon;
	}
	public void setMilesPerGallon(float milesPerGallon) {
		if(milesPerGallon < 10 || milesPerGallon>60)
			milesPerGallon = 0;
		this.milesPerGallon = milesPerGallon;
	}
	public Automobile(int id, String make, String model, String color, int year, float milesPerGallon) {
	
		setId(id);;
		setMake(make);;
		setMake(make);;
		setColor(color);;
		setYear(year);;
		setMilesPerGallon(milesPerGallon);;
	}
	@Override
	public String toString() {
		return "Automobile [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", year=" + year
				+ ", milesPerGallon=" + milesPerGallon + "]";
	}
	
	
	
	
	
}
