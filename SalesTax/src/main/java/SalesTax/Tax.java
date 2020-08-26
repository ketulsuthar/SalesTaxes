package SalesTax;

public interface Tax {

	Product getProduct();
	double getRate();
	double getPriceAfterTax();
	
	/*
	default double getPriceAfterTax() {
		
		double tax = getProduct().getPrice() * getRate();
		return  getProduct().getPrice() + tax;
	}
	*/
	
}
