package entitie;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public double totalValue() {
		return (price * quantity);
	}
	public void addProduct(int quantity) {
		this.quantity+=quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity-=quantity;
	}
	
    public String toString(){
    	return name +", $"+ price +", Total: $"+ totalValue();
    }
}
