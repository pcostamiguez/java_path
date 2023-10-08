package entities;

import java.text.MessageFormat;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("Nome inválido.");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price != (double) price) {
	        throw new IllegalArgumentException("O preço deve ser um número.");
	    }
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void addProduct(int quantity) {
		if (quantity > 0) {
			this.quantity += quantity;
			System.out.println(this.toString());
		} else {
			throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
		}
	}

	public void remProduct(int quantity) {
		if ((quantity > 0) && (this.quantity > quantity)) {
			this.quantity -= quantity;
			System.out.println(this.toString());
		} else {
			throw new IllegalArgumentException("Quantidade inválida!");
		}
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, int quantity) {
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	public String toString() {
		return MessageFormat.format("Nome do produto: {0} que custa R$ {1} e possui {2} unidades.", name, price,
				quantity);
	}

}
