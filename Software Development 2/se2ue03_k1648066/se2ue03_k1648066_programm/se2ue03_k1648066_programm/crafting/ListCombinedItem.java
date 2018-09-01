package crafting;

import java.util.Iterator;

import inout.Out;

public class ListCombinedItem extends Item implements Iterable<Item>{
	private final Item [] items;
	private final double price;
	public ListCombinedItem(String name, Item... items) {
		super(name);
		this.items = new Item[items.length];
		int counter = 0;
		for(Item item: items) {
			this.items[counter] = item;
			counter++;
		}
		this.price = (sumPrice(items) + sumPrice(items) * 0.1);
	}
	
	
	private double sumPrice(Item[] items) {
		double sum = 0;
		for (Item item: items) {
			if (item instanceof Resource) {
				Resource resource = (Resource) item;
				sum += resource.getPrice();
			}
			if(item instanceof ListCombinedItem) {
				ListCombinedItem listitem = (ListCombinedItem) item;
				sum += listitem.getPrice();
			}
			if(item instanceof GridCombinedItem) {
				GridCombinedItem griditem = (GridCombinedItem) item;
				sum += griditem.getPrice();
			}
		}
		return sum;
	}
	
	public void print() {
		Out.print(this.getName());
		System.out.printf(" - %.2f Gold\n", price);
		for (Item item: items) {
			Out.print("  " + item.getName());
			System.out.printf(" - %.2f Gold\n", item.getPrice());
		}
	}
	public void print(int indent) {
		for (int i = 0; i < indent; i++) {
			Out.print(" ");
		}
		Out.print(this.getName());
		System.out.printf(" - %.2f Gold\n", price);
		for (Item item: items) {
			for (int i = 0; i < indent; i++) {
				Out.print(" ");
			}
			Out.print("  " + item.getName());
			System.out.printf(" - %.2f Gold\n", item.getPrice());
		}
	}


	@Override
	public Iterator<Item> iterator() {
		return null;
	}


	public double getPrice() {
		return price;
	}
	
}
