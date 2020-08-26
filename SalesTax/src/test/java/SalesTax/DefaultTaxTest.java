package SalesTax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DefaultTaxTest {

	@Test
	public void testGetPriceAfterTax(){
		
		Product item = new Product("book", 80.00);
		assertEquals(item.getName(), "book");
		assertTrue(Math.abs((item.getPrice() - 80.00)) < 0.001);
		
		
		Tax tax = new DefaultTax(item);
		System.out.println(tax.getPriceAfterTax());
		assertTrue(Math.abs((tax.getPriceAfterTax() - 80.00)) < 0.001);
	}
}
