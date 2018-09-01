public class Mastermind {
	public static void main(String [] args) {
		/* OBS: Eingabe von 4-stelligen Zahlen ist nicht abgesichert! */
		
		Out.println("Mastermind");
		Out.println("==========");

		Out.print("Bitte die gesuchte Zahl eingeben: ");
		int zahl = In.readInt();
		
		Out.print("Bitte die Vergleichszahl eingeben: ");
		int tipp = In.readInt();
		
		// Ziffern der Zahl zerlegen
		int zahlZ4 = zahl%10;
		int zahlZ3 = (zahl/10)%10;
		int zahlZ2 = (zahl/100)%10;
		int zahlZ1 = (zahl/1000)%10;

		// Ziffern des Tipps zerlegen
		int tippZ4 = tipp%10;
		int tippZ3 = (tipp/10)%10;
		int tippZ2 = (tipp/100)%10;
		int tippZ1 = (tipp/1000)%10;
				
		int anzahlRichtige = 0;						// Anzahl der gleichen auf gleichem Platz
		
		if (zahlZ1==tippZ1) anzahlRichtige++;
		if (zahlZ2==tippZ2) anzahlRichtige++;
		if (zahlZ3==tippZ3) anzahlRichtige++;
		if (zahlZ4==tippZ4) anzahlRichtige++;
		
		Out.println("\n" + anzahlRichtige + " Richtige an der richtigen Stelle");
		
	} // end main() 
 } // end close
