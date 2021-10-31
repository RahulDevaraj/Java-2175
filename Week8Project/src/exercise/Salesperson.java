package exercise;

public class Salesperson {
	
	int id;
	double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Salesperson(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", amount=" + amount + "]";
	}

}
