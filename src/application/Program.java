package application;

import java.util.Scanner;

import entitie.Product;

public class Program {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name=sc.next();	
		System.out.print("Price: ");
		double price=sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity=sc.nextInt();
		
		Product pd = new Product(name, price , quantity);
		
		System.out.println("\nProduct data: "+ pd.toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		
		quantity = sc.nextInt();
		pd.addProduct(quantity);
		
		System.out.println("\nUpdated data: "+ pd.toString());
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		
		quantity = sc.nextInt();
		pd.removeProduct(quantity);
		
		System.out.println("\nUpdated data: "+ pd.toString());
		
		sc.close();
	}

}
