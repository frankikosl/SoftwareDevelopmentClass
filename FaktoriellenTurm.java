public class FaktoriellenTurm {
	public static void main(String [] args) {
		// BEGIN OF PROGRAM
		Out.print("\nFaktoriellen-Turm");
		Out.print("\n=================");
		
		
		// Zahl bis zu der Turm gedruckt werden soll
		Out.print("\nHoehe des Faktoriellen-Turms: ");
		int hight = In.readInt();						// Einlesen der Zahl fuer welche die Faktorielle berechnet werden soll

		while (hight<=0) {
			Out.print("\nBitte eine Zahl > 0 eingeben! ");
			Out.print("\nBerechnung der Faktoriellen von: ");
			hight = In.readInt();						// Einlesen der Zahl fuer welche die Faktorielle berechnet werden soll
		} // end while
			
		// Wiederholung fuer die unterschiedlichen n
		int line = 1;
		while (line <= hight) {
			int n = line;
			long faculty = 1;							// Faktorielle, die es zu berechnen gilt
			
			// Berechnen der Faktoriellen
			Out.print("\n" + n);
			
			faculty = n;
			for (int i = n-1; i > 1; i--) {
					Out.print(" * "+i);
					faculty = faculty * i;
			} // end for
			
			if (line > 1) {								// * 1 bei der ersten Zeile nicht ausgeben
				Out.print(" * 1");
			}
			Out.print(" = " + faculty);
			
			line++;
		} // end while

		
		Out.print("\nEnd ---\n");
		// END OF PROGRAM
	} // end main
} // end class FaktoriellenTurm