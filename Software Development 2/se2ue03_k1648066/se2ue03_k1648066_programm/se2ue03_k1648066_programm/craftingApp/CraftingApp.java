package craftingApp;
import crafting.*;
import inout.Out;

public class CraftingApp {
	public static void main(String[] args) {
		Resource iron = new Resource("Eisen", 2);
		Resource bronze = new Resource("Bronze", 1.5);
		Resource wood = new Resource("Holz", 1);
		Resource rock = new Resource("Stein", 0.5);
		Resource sulfur = new Resource("Schwefel", 1);
		Resource charcoal = new Resource("Holzkohle", 1);
		Resource saltpeter = new Resource("Salpeter", 1);
		Resource flesh = new Resource("Fleisch", 0.5);
		ListCombinedItem gunpowder = new ListCombinedItem("Schieﬂpulver", sulfur, charcoal, saltpeter);
		ListCombinedItem bullet = new ListCombinedItem("Kugel", iron, gunpowder);
		Item[][] pickaxeItems = new Item[][] {{iron, iron, iron}, {null, wood, null}, {null, wood, null}, {null, wood, null}};
		GridCombinedItem pickaxe = new GridCombinedItem("Spitzhacke", pickaxeItems);
		ListCombinedItem board = new ListCombinedItem("Brett", wood, wood, wood);
		Item[][] swordIngredients = new Item[][] {{null , bronze, null}, {null, bronze, null}, {null, wood, null}};
		Item[][] spearIngredients = new Item[][] {{bronze}, {wood}, {wood}, {wood}};
		Item[][] helmetIngredients = new Item[][] {{bronze , bronze, bronze}, {bronze, null, bronze}};
		GridCombinedItem sword = new GridCombinedItem("Schwert", swordIngredients);
		GridCombinedItem spear = new GridCombinedItem("Speer", swordIngredients);
		GridCombinedItem helmet = new GridCombinedItem("Helm", helmetIngredients);
		ListCombinedItem greaves = new ListCombinedItem("Grieben", bronze, bronze, bronze);
		ListCombinedItem bracelet = new ListCombinedItem("Armband", bronze, bronze);
		Item[][] spartanParts = new Item[][] {{null, helmet, null}, {flesh, flesh, flesh}, {bracelet, flesh, bracelet}, {spear, flesh, sword}, {greaves, null, greaves}, {flesh, null, flesh}};
		GridCombinedItem spartanWarrior = new GridCombinedItem("Spartaner", spartanParts);
		Out.println("Item die zumindest aus 12 anderen zusammensetzt: ");
		spartanWarrior.print();
		Out.println("Items ohne Ident");
		board.print();
		gunpowder.print();
		bullet.print();
		wood.print();
		pickaxe.print();
		sword.print();
		helmet.print();
		spear.print();
		greaves.print();
		bracelet.print();
		Out.println("\nItems mit Ident");
		
		board.print(1);
		gunpowder.print(2);
		bullet.print(3);
		pickaxe.print(4);
		sword.print(5);
	}
}
