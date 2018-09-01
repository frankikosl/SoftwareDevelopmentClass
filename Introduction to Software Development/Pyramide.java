public class Pyramide {
	public static void main(String [] args) {
		// BEGIN OF PROGRAM
		Out.print("\nPyramide");
		Out.print("\n========");
		
		
		// Zahl bis zu der Turm gedruckt werden soll
		Out.print("\nHoehe der Pyramide [0-9]: ");
		int hight = In.readInt();						// Einlesen der Hoehe

		while (hight<=0 || 9 <= hight) {
			Out.print("\nBitte eine Hoehe zwischen 0 und 9 eingeben! ");
			Out.print("\nHoehe der Pyramide [0-9]: ");
			hight = In.readInt();						// Einlesen der Hoehe
		} // end while
			
		// Ausgabe der Pyramide
		for (int line=0; line <= hight; line++) {
	
			// Ausgeben der Einrueckung
			for (int i = 1; i <= (hight-line); i++) {
					Out.print(" ");
			} // end for
		
			// Ausgeben der Zeile
			for (int i = 1; i <= line; i++) {
					Out.print(line+ " ");
			} // end for
				
			Out.print("\n");
			
			
		} // end for

		
		Out.print("\nEnd ---\n");
		// END OF PROGRAM
	} // end main
} // end class Pyramide