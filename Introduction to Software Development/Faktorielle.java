public class Faktorielle {
	public static void main(String [] args) {
		// BEGIN OF PROGRAM
		Out.print("\nFaktorielle");
		Out.print("\n===========");
		
		
		// Zahl bis zu der Turm gedruckt werden soll
		Out.print("\nBerechnung der Faktoriellen von: ");
		int n = In.readInt();						// Einlesen der Zahl fuer welche die Faktorielle berechnet werden soll

		while (n<=0) {
			Out.print("\nBitte eine Zahl > 0 eingeben! ");
			Out.print("\nBerechnung der Faktoriellen von: ");
			n = In.readInt();						// Einlesen der Zahl fuer welche die Faktorielle berechnet werden soll
		} // end while
			
		
		long faculty = 1;							// Faktorielle, die es zu berechnen gilt
		
		// Berechnen der Faktorielle
		for (int i = 1; i <= n; i++) {
				faculty = faculty * i;
		} // end for
			
		Out.print("Faktorielle von " + n + " ist " + faculty + ".\n");

		
		Out.print("\nEnd ---\n");
		// END OF PROGRAM
	} // end main
} // end class Faktorielle