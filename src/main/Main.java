package main;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Informe o nome do produto:");
			String name = sc.nextLine();

			System.out.println("Informe o preço:");
			double price = sc.nextDouble();

			System.out.println("Informe a quantidade:");
			int quantity = sc.nextInt();

			Product product = new Product(name, price, quantity);

			product.addProduct(20);
			
			Product p2;
			
			p2 = product; //valor por referência! o p2 aponta para o HEAP que o product aponta!
			
			p2.addProduct(10);
			
			System.out.println(product);
			System.out.println(p2);
			
			p2.remProduct(5);
			
			if(args.length > 0) {
				System.out.println(args);
			}
			
		} catch (Exception e) {
			System.out.println("Houve um erro: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
