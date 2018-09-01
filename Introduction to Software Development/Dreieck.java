public class Dreieck {
	public static void main(String [] args) {
		// BEGIN OF PROGRAM
		Out.print("\nDreieck");
		Out.print("\n=======");
		
		
		// Zahl bis zu der das Dreieck gedruckt werden soll
		Out.print("\nHoehe der Dreiecks [0-9]: ");
		int hight = In.readInt();						// Einlesen der Hoehe

		while (hight<=0 || 9 <= hight) {
			Out.print("\nBitte eine Hoehe zwischen 0 und 9 eingeben! ");
			Out.print("\nHoehe des Dreiecks [0-9]: ");
			hight = In.readInt();						// Einlesen der Hoehe
		} // end while
			
		// Ausgabe des Dreiecks
		for (int line=0; line <= hight; line++) {

			// Ausgeben der Zeile
			for (int i = 1; i <= line; i++) {
					Out.print(line+ " ");
			} // end for
				
			Out.print("\n");
			
			
		} // end for

		
		Out.print("\nEnd ---\n");
		// END OF PROGRAM
	} // end main
} // end class Dreieck