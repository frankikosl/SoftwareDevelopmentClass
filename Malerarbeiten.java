public class Malerarbeiten {
	
	public static void main(String [] args) {
		/* OBS: Die Masse werden in ganzen Metern eingegeben. */
		
		Out.println("Malerarbeiten");
		Out.println("=============");
		
		Out.print("Bitte die Laenge des Raumes eingeben: ");
		int laenge = In.readInt();
		
		Out.print("Bitte die Breite des Raumes eingeben: ");
		int breite = In.readInt();
		
		Out.print("Bitte die Hoehe des Raumes eingeben: ");
		int hoehe = In.readInt();
		
		int wandflaeche = (laenge * hoehe * 2) + (breite * hoehe * 2);
		int deckenflache = breite * laenge;
		
		int kostenwand = wandflaeche * 5;
		
		int kostendecke=0;
		if(hoehe>=3){
			kostendecke = deckenflache * (5 + 2);
		} else {
			kostendecke = deckenflache * 5;
		} // end if
		
	
		int gesamtkosten = (kostenwand+kostendecke);
		
		Out.println("Die Kosten betragen: "+gesamtkosten);
		
	} // end main()
	
 } // end class
