public class Ziegelsteine {
	
	public static void main(String [] args) {
		/* OBS: Funktioniert fuer die Feststellung der genauen UIeberbrueckbarkeit der Strecke mit der Annahme, dass der kleine Ziegelstein 1 lang ist. */
		
		Out.println("Vergleich von Zahlen - Verzweigung");
		Out.println("==================================");
		
		Out.print("Bitte die Laenge der Strecke eingeben: ");
		int strecke = In.readInt();
		
		Out.print("Bitte die Anzahl der kleinen Ziegelsteine eingeben: ");
		int klein = In.readInt();
		
		Out.print("Bitte die Anzahl der grossen Ziegelsteine eingeben: ");
		int gross = In.readInt();
		
		int maxGross = strecke/5;
		int anzahlGross = maxGross;
		if(gross<maxGross){
			anzahlGross = gross;
		}
		int rest = strecke - anzahlGross*5;
		
		if(rest>klein){
			Out.print("Vorhaben nicht moeglich!");
		} else {
			Out.print("Vorhaben moeglich!");
		} // end if
		
	} // end main() 
} // end class
