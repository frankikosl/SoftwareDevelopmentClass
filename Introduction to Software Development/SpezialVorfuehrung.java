public class SpezialVorfuehrung {
	
	public static void main(String [] args) {
		Out.println("Spezialvorfuehrung");
		Out.println("==================");

		Out.print("Bitte die Anzahl der moeglichen Sitzplaetze eingeben: ");
		int plaetze = In.readInt();
		
		Out.print("Bitte die Anzahl der Zuschauer eingeben (gesamt): ");
		int zuschauer = In.readInt();
		
		Out.print("Bitte die Anzahl der Vollzahler eingeben: ");
		int vollzahler = In.readInt();
		
		if ((zuschauer*100)/plaetze >= 60) {				// 60% der Plaetze besetzt
			Out.println("Vorstellung findet statt");
		} else {
			if ((vollzahler*100)/plaetze >= 30){		    // 30% Vollzahler
				Out.println("Vorstellung findet statt");
			} else {
				Out.println("Vorstellung findet NICHT statt");
			} // end if
		} // end if
		
		/* Alternative Realisierung 
		if (((zuschauer*100)/plaetze >= 60) || ((vollzahler*100)/plaetze >= 30)) {
			Out.println("Vorstellung findet statt");
		} else {
			Out.println("Vorstellung findet NICHT statt");
		} // end if
		*/
		
	} // end main()
	
 } // end class
