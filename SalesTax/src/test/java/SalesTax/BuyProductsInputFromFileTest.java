package SalesTax;

import org.junit.Test;


public class BuyProductsInputFromFileTest {

	@Test
	public void testGetProductsFromFileInput1() {
		Utility.getProductsFromFile("src/input1.txt");
	}

	@Test
	public void testGetProductsFromFileInput2() {
		Utility.getProductsFromFile("src/input2.txt");
	}
	
	@Test
	public void testGetProductsFromFileInput3() {
		Utility.getProductsFromFile("src/input3.txt");
	}
	
}
