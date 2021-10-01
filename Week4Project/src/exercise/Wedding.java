package exercise;

import java.time.LocalDate;

public class Wedding {
	
	LocalDate weddingDate;
	String location;
	Couple couple;
	public LocalDate getWeddingDate() {
		return weddingDate;
	}
	public String getLocation() {
		return location;
	}
	public Couple getCouple() {
		return couple;
	}
	public Wedding(LocalDate weddingDate, String location, Couple couple) {
		super();
		this.weddingDate = weddingDate;
		this.location = location;
		this.couple = couple;
	}
	@Override
	public String toString() {
		return "Wedding [weddingDate=" + weddingDate + ", location=" + location + ", couple=" + couple + "]";
	}
	
	

}
