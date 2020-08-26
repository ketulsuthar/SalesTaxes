package SalesTax;

public class Product{
	
	private String name;
	private boolean isImported = false;
	private boolean isExempt = false;
	private double price;

	public Product() {}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isImported() {
		return isImported;
	}
	
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	public boolean isExempt() {
		return isExempt;
	}

	public void setExempt(boolean isExempt) {
		this.isExempt = isExempt;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
    public String toString() { 
        return String.format(name + " " + price); 
    } 

}
