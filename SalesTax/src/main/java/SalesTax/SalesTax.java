package SalesTax;

public class SalesTax implements Tax{

	private Product product;
	final double taxRate =  0.1;
	
	public SalesTax(Product product) {
		this.product = product;
	}

	public double getRate() {
		return taxRate;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	
	public double getPriceAfterTax() {
		double tax = Utility.nearestPrice(this.product.getPrice() * this.getRate());
		return Utility.roundProductPrice(this.product.getPrice() + tax); 
	} 
	 
}
