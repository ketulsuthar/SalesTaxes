package SalesTax;

public class DefaultTax implements Tax {

	private Product product;
	final double taxRate = 0.0;

	public DefaultTax(Product product) {
		this.product = product;
	}

	public double getRate() {
		return taxRate;
	}

	public Product getProduct() {
		return this.product;
	}
	
	public double getPriceAfterTax() {
		return Utility.roundProductPrice(this.product.getPrice());  
	} 
	 
}
