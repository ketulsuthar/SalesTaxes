package SalesTax;


public class ImportedTax implements Tax {

	final double taxRate =  0.05;
	private Product product;
	
	public ImportedTax(Product product) {
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
