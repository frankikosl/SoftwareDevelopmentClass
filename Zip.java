class Zip {
	
	public static void main(String [] args) {
		/* BEGIN PROGRAM */
		Out.print("\nZipper");
		Out.print("\n======");
		
	
		// (1) TEXT EINGEBEN ---------------
		Out.print("\nText: ");		
		char c = In.read();			// Eingabe des Texts und erstes Zeichen fuer Verarbeitung daraus auslesen
		char p='\n';				// Vorgaengerzeichen; '\n' (kann nicht innerhalb der Schleife als aktuelles Zeichen auftreten)
		
		// (2) TEXT ZIPPEN ------------------
		Out.print("\nZipped Text: ");
		int equalCnt=1;				// zaehlt die aufeinanderfolgenden gleichen Zeichen
		
		while (c != '\n') {
			// DO SOMETHING
			
			if(c==p) {				// 2 aufeinanderfolgende gleiche Zeichen erkannt
				// GLEICH
				// IN Gruppe
				equalCnt++;
			} else { 				// 2 aufeinanderfolgende ungleiche Zeichen erkannt
				// UNGLEICH	
				// ENDE ALTE Gruppe
				if (equalCnt>1) Out.print(equalCnt);			// Zaehler ausgeben, falls notwendig 
															// (vermeidet auch Zaehler fuer erstes Zeichen)
				// BEGINN NEUE Gruppe
				Out.print(c);		// ausgabe des (neuen) Zeichens
				equalCnt=1;			// Zaehlung beginnt wieder bei von vorne
			} // if
					
			p = c;					// aktuelles Zeichen wird nun Vorgaengerzeichen
			c = In.read();			// naechstes Zeichen lesen
		} // while
		
		// Falls noch Mehrfache gezaehlt wurden, deren Anzahl abschliessend ausgeben
		if (equalCnt>1) Out.print(equalCnt);
		
		Out.print("\nEnd! ---");
		/* END PROGRAM */
	} // end main
	
} // class Zip