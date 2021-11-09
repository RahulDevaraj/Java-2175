package exercise;

public class Blanket {
	
	 String size ="Twin",color ="white", material="cotton";
	 float price = 30f;
	public void setSize(String size) {
		this.size = size;
		if(size.equals("double"))
			price += 10;
		else if(size.equals("queen"))
			price +=25;
		else if(size.equals("king"))
			price +=40;
		else
			price = 30;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaterial(String material) {
		this.material = material;
		
		if(material.equals("wool"))
			price += 20;
		else if(material.equals("cashmere"))
			price +=45;
		else price = 30;
		
	}
	@Override
	public String toString() {
		return " Blanket [size=" + size + ", color=" + color + ", material=" + material + ", price=" + price + "]";
	}
	
	
	

}
