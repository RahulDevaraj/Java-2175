package practiceQn;

public class Purchase {
	
	int invoice;
	double amountOfSales,amountOfSalesTax;
	public void setInvoice(int invoice) {
		this.invoice = invoice;
	}
	public void setAmountOfSales(double amountOfSales) {
		this.amountOfSales = amountOfSales;
		this.amountOfSalesTax = .05*amountOfSales;
	}
	@Override
	public String toString() {
		return "Purchase [invoice=" + invoice + ", amountOfSales=" + amountOfSales + ", amountOfSalesTax="
				+ amountOfSalesTax + "]";
	}
	
	
	

}
