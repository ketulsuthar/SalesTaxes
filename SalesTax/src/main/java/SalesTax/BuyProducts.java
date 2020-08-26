package SalesTax;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Set;

public class BuyProducts {

	private final LinkedHashMap<Tax,Integer> productMap=new LinkedHashMap<Tax,Integer>(); 
	
	DecimalFormat df = new DecimalFormat("###.00");
	
	public void displayOrder() {
		System.out.println("Input: ");
		for ( Tax prod : productMap.keySet() ){
			System.out.println(productMap.get(prod) + " " + prod.getProduct().getName() + " at " + df.format(prod.getProduct().getPrice()));
		}	
		System.out.println();
	}
	
	public void add (Product prod, int count){

		TaxFactory taxFact = new TaxFactory();
		Tax prodTax = taxFact.getTaxType(prod);
		Integer i = this.productMap.get(prod); 
		if ( i!= null) count += i;
		this.productMap.put(prodTax, count);
	}
	
	public int getQuantity(Product prod){
		return productMap.get(prod);	
	}
	
	public double getTotalTax() {
		double taxtotal = 0;
		for (Tax prod : productMap.keySet()){			
			double totalProdPrice = prod.getProduct().getPrice() * productMap.get(prod);
			taxtotal += prod.getPriceAfterTax() - totalProdPrice;
		}
		return taxtotal;
	}

	public double getTotalPrice() {
		double total = 0;
		for (Tax prod : productMap.keySet()){		
			double subTotal = prod.getProduct().getPrice() * productMap.get(prod);
			total += subTotal;
		}
		return Utility.roundProductPrice(total);
	}
	
	public void displayOrdered() {	
		double taxtotal = 0;
		double total = 0;
		System.out.println("Output: ");
		Set<Tax> taxedItems = productMap.keySet();
		for (Tax prod : taxedItems){		
			double taxPerProduct = prod.getPriceAfterTax() * productMap.get(prod);
			double totalProdPrice = prod.getProduct().getPrice() * productMap.get(prod);
			taxtotal += prod.getPriceAfterTax() - totalProdPrice;
			total +=  taxPerProduct;
			System.out.println(productMap.get(prod) + " " + prod.getProduct().getName() + ": " +df.format(taxPerProduct));
		}
		total = Utility.roundProductPrice(total);
		System.out.print("Sales Taxes: "+df.format(taxtotal));
		System.out.print("  Total: "+df.format(total));
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		if(args.length > 0) { 
			for(String filename : args)
				Utility.getProductsFromFile(filename);
		} else
			System.out.println("Invalid Arguments!!");
		
	}
}
