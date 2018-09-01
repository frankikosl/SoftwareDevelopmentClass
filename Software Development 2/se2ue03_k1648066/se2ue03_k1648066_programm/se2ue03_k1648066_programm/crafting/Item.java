package crafting;

import inout.Out;

public abstract class Item {
	private final String name;
	Item(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public abstract void print();
	public abstract void print(int indent);
	public abstract double getPrice();
}
