package SalesTax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ImportedTaxTest {

	
	@Test
	public void testGetPriceAfterTax(){
		
		Product item = new Product("Book", 80.00);
		assertEquals(item.getName(), "Book");
		assertTrue(Math.abs((item.getPrice() - 80.00)) < 0.001);
		
		
		Tax tax = new ImportedTax(item);
		System.out.println(tax.getPriceAfterTax());
		assertTrue(Math.abs((tax.getPriceAfterTax() - 84.00)) < 0.001);
	}
}
