package exercise;

public class ElementArray {
public static void main(String[] args) {
	
	Element element[] = new Element[6];
	element[0] = new MetalElement("Cu", 29, 63.5);
	element[1] = new MetalElement("Fe", 26, 56.8);
	element[2] = new MetalElement("Pb", 82, 207.2);
	element[3] = new MetalElement("Ag", 47, 107.8);
	element[4] = new NonMetalElement("H", 1, 1);
	element[5] = new NonMetalElement("He", 2, 2);
	
	for (Element element2 : element) {
		element2.describeElement();
	}
	
}
}
