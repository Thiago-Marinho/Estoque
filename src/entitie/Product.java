package entitie;

import java.util.Date;

public class Product {

	private String name;
	private double price;
	private int quantity;
	private Date date;
	//Construtor e Sobrecarga
	
	public Product () {}
	
	public Product(String name, double price, int quantity, Date date) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.date = date;
	}
	
	

	public Product(String name, double price) {
		this.name = name;
		this.price = price;		
	}
	//encapsulamento
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
