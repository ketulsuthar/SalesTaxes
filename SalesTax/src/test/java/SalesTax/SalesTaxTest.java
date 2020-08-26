package SalesTax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class SalesTaxTest {

	@Test
	public void testGetPriceAfterTax(){
		
		Product item = new Product("music CD", 80.00);
		assertEquals(item.getName(), "music CD");
		assertTrue(Math.abs((item.getPrice() - 80.00)) < 0.001);
		
		
		Tax tax = new SalesTax(item);
		System.out.println(tax.getPriceAfterTax());
		assertTrue(Math.abs((tax.getPriceAfterTax() - 88.00)) < 0.001);
	}
}
