package exercise;

public class ElectricBlanket extends Blanket {
 int settings = 1;
 boolean feature = false;;
 public int getSettings() {
	return settings;
}
public void setSettings(int settings) {
	if(settings >=1 && settings<=5)
	this.settings = settings;
	else
		this.settings = 1;
}
public boolean isFeature() {
	return feature;
}
public void setFeature(boolean feature) {
	this.feature = feature;
	
	if(feature == true)
		price +=5.75;
}
@Override
public String toString() {
	return "ElectricBlanket [settings=" + settings + ", feature=" + feature + super.toString()+"]";
}
 

 
}
