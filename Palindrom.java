public class Palindrom {
	public static void main(String [] args) {
			
		Out.println("Palindrom");
		Out.println("==========");
		
		Out.print("Bitte die Zahl eingeben: ");
		int zahl = In.readInt();
		
		while (zahl<=0) {
			Out.print("Bitte positive Zahl eingeben!");
			Out.print("\nBitte die Zahl eingeben: ");
			zahl = In.readInt();
		} // while
		
		// Bestimmen der Laenge der Zahl
		int z = zahl;
		int anzahlStellen = 0;
		int teiler = 1;
		
		while (z>0) {
			anzahlStellen++;
			z = z / 10;
			teiler = teiler * 10;
		} // end while
		teiler = teiler / 10;
			
		
		// Bestimmen ob Palindrom
		// vordere Stelle rechnen
		int vZahl = zahl;
		int vorne = vZahl / teiler;
		
		// hintere Stelle rechnen
		int hZahl = zahl;
		int hinten = hZahl % 10;
		
		int i=1;
		
		while ((i <= (anzahlStellen/2)) && (vorne == hinten)) {
			// vordere Stelle rechnen
			vZahl = vZahl % teiler;
			teiler = teiler / 10;
			vorne = vZahl / teiler;
			
			// hintere Stelle rechnen				
			hZahl = hZahl / 10;
			hinten = hZahl % 10;
			i++;
			
			
		} // end while
		
		if (vorne == hinten) {				// letzte Stelle auch noch gleich
			Out.print("\nIst ein Palindrom!");
		} else {
			Out.print("\nIst KEIN Palindrom!");
		} // end if
	
		
	} // end main() 
 } // end close
