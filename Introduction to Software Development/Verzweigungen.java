class Verzweigungen {
		public static void main(String[] arg) {

		Out.println("Vergleich von Zahlen - Verzweigung");
		Out.println("==================================");
		
		Out.print("x: ");
		int x = In.readInt();
		
		Out.print("y: ");
		int y = In.readInt();
		
		Out.print("z: ");
		int z = In.readInt();

		
		Out.println("\nDie Werte " + x + ", " + y + ", " + z);
		
		// if (!((x == y) && (y == z)))  {
		if ((x != y) || (y != z))  {
			Out.println("Nicht alle Werte sind gleich.");
		} // end if
		
		if ((x != y) && (x != z) && (y != z)) {
			Out.println("Alle Werte sind voneinander verschieden.");
		} // end if
		
		if ((x == y) || (x == z) || (y == z)) {
			Out.println("Mindestens zwei Werte sind gleich.");
		} // end if
		
		
	} // end main() 
} // end if