package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Product;

public class Program {

	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many products do you want to register?");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		int quantity;
		
		for(int i=0; i < n; i++) {		
		System.out.println("\nEnter product data:");
		
		System.out.print("Name: ");
		String name=sc.next();	
		System.out.print("Price: ");
		double price=sc.nextDouble();
		System.out.print("Quantity: ");
		quantity=sc.nextInt();
		
		Product pdt = new Product(name, price , quantity);
		
		list.add(pdt);
		}		
		
		for (Product pdt : list) {
		System.out.println("_______________________________________________________________________");
		System.out.println("\nProduct data: "+ pdt);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		
		quantity = sc.nextInt();
		pdt.addProduct(quantity);
		
		System.out.println("\nUpdated data: "+ pdt);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		
		quantity = sc.nextInt();
		pdt.removeProduct(quantity);
		
		System.out.println("\nUpdated data: "+ pdt);
		}
		
		sc.close();
	}
	
	

}
