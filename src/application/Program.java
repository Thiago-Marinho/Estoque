package application;

import java.util.Scanner;

import entitie.Product;

public class Program {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		pd.name=sc.next();	
		System.out.print("Price: ");
		pd.price=sc.nextDouble();
		System.out.print("Quantity: ");
		pd.quantity=sc.nextInt();
		
		System.out.println("\nProduct data: "+ pd.toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int Q = sc.nextInt();
		pd.addProduct(Q);
		System.out.println("\nUpdated data: "+ pd.toString());
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		Q = sc.nextInt();
		pd.removeProduct(Q);
		System.out.println("\nUpdated data: "+ pd.toString());
		
		sc.close();
	}

}
