package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Product;

public class Program {

	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many products do you want to register?");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		int quantity;
		
		for(int i=0; i < vect.length; i++) {		
		System.out.println("\nEnter product data:");
		
		System.out.print("Name: ");
		String name=sc.next();	
		System.out.print("Price: ");
		double price=sc.nextDouble();
		System.out.print("Quantity: ");
		quantity=sc.nextInt();
		
		vect[i] = new Product(name, price , quantity);
		
		}		
		
		for (int i=0; i < vect.length; i++) {
		System.out.println("_______________________________________________________________________");
		System.out.println("\nProduct data: "+ vect[i].toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		
		quantity = sc.nextInt();
		vect[i].addProduct(quantity);
		
		System.out.println("\nUpdated data: "+ vect[i].toString());
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		
		quantity = sc.nextInt();
		vect[i].removeProduct(quantity);
		
		System.out.println("\nUpdated data: "+ vect[i].toString());
		}
		
		sc.close();
	}

}
