package exercise;

public class Purchase {
	private int invoice;
	private double amount,tax;
	public void setInvoice(int invoice) {
		this.invoice = invoice;
	}
	public void setAmount(double amount) {
		this.amount = amount;
		tax = .05 * amount;
	}
	
	public void display() {
		System.out.println("Sale  Details:");
		System.out.println("Invoice number "+invoice+" ,Sale amount = "+amount+" , and tax = "+tax);
	}
	public Purchase(int invoice, double amount) {
		setInvoice(invoice);
		setAmount(amount);
	}

	

}
