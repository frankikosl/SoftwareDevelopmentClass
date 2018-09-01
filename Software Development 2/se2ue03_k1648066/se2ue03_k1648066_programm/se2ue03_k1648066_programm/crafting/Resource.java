package crafting;

import inout.Out;

public class Resource extends Item {
	private final double price;
	public Resource(String name, double price) {
		super(name);
		this.price = price;
	}
	public void print() {
		Out.print(this.getName());
		System.out.printf(" - %.2f Gold\n", price);
	}
	public void print(int indent) {
		for (int i = 0; i < indent; i++) {
			Out.print(" ");
		}
		Out.print(this.getName());
		System.out.printf(" - %.2f Gold\n", price);
	}
	public double getPrice() {
		return price;
	}


		
}
