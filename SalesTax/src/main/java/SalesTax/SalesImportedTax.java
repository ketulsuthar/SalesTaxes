package SalesTax;

public class SalesImportedTax implements Tax {

		final double taxRate =  0.05 + 0.1;
		private Product product;
		
		public SalesImportedTax(Product product) {
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
