package SalesTax;

import org.junit.Test;


import static org.junit.Assert.*;


public class TaxFactoryTest {

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
