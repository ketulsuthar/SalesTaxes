package SalesTax;

public class TaxFactory {
	
	public Tax getTaxType(Product product) {
		
		if(product == null)
			return null;
		if(product.isImported() && !product.isExempt()) {
			return new SalesImportedTax(product);
		}
		if(product.isImported()) {
			return new ImportedTax(product);
		}
		if(!product.isExempt()) {
			return new SalesTax(product);
		}
		
		return new DefaultTax(product);
	}

}
