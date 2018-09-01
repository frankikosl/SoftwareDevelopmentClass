package crafting;

import java.util.Iterator;

import inout.Out;

public class GridCombinedItem extends Item implements Iterable<Item> {
	private final Item[][] items;
	private final double price; 
	public GridCombinedItem(String name, Item[]... items) {
		super(name);
		this.items = new Item[items.length][items[0].length];
		for(int i = 0; i < items.length; i++) {
			for(int j = 0; j < items[i].length; j++) {
				this.items[i][j] = items[i][j];
			}
		}
		this.price = (sumPrice(items) * ((items.length + items[0].length) * 0.05 + 1));
	}
	
	double sumPrice(Item[][] items) {
		double sum = 0;
		for(int i = 0; i < items.length; i++) {
			for(int j = 0; j < items[i].length; j++) {
				if (items[i][j] != null && items[i][j] instanceof Resource) {
					Resource resource = (Resource) items[i][j];
					sum += resource.getPrice();
				}
				if (items[i][j] != null && items[i][j] instanceof ListCombinedItem) {
					ListCombinedItem listitem = (ListCombinedItem) items[i][j];
					sum += listitem.getPrice();
				}
				if (items[i][j] != null && items[i][j] instanceof GridCombinedItem) {
					GridCombinedItem griditem = (GridCombinedItem) items[i][j];
					sum += griditem.getPrice();
				}
			}
		}
		return sum;
	}
	
	public void print() {
		Out.print(this.getName());
		System.out.printf(" - %.2f Gold\n", price);
		int column = 0;
		for (int i = 0; i < items.length; i++) {
			column = 0;
			for (Item item: items[i]) {
				if (item != null) {
					Out.println("  [" + i + "," + column + "]");
					Out.print("  " + item.getName());
					System.out.printf(" - %.2f Gold\n", item.getPrice());
				}
				column++;
			}
		}
	}
	public void print(int indent) {
		for (int i = 0; i < indent; i++) {
			Out.print(" ");
		}
		Out.print(this.getName());
		System.out.printf(" - %.2f Gold\n", price);
		int column = 0;
		for (int i = 0; i < items.length; i++) {
			column = 0;
			for (Item item : items[i]) {
				if (item != null) {
					for (int k = 0; k < indent; k++) {
						Out.print(" ");
					}
					Out.println("  [" + i + "," + column + "]");
					for (int k = 0; k < indent; k++) {
						Out.print(" ");
					}
					Out.print("  " + item.getName());
					System.out.printf(" - %.2f Gold\n", item.getPrice());
				}
				column++;
			}
		}
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice() {
		return price;
	}
	
}
