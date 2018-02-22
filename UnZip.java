class UnZip {
	
	public static void main(String [] args) {
		/* BEGIN PROGRAM */
		
		Out.print("\nUnZip");
		Out.print("\n=====");
	
		// (1) TEXT EINGEBEN ---------------
		Out.print("\nGezippter Text: ");		// E.g. Input: a3b4X2c11d2ef4g2a3!3

		char c = In.read();					// Eingabe des Texts und erstes Zeichen fuer Verarbeitung daraus auslesen
		
		
		// (2) TEXT UNZIPPEN ------------------
		Out.print("\nUnZipped Text: ");		// E.g. Output: aaabbbbXXcccccccccccddeffffggaaa!!!
		char p = '\n';						// Vorgaengerzeichen
		
		while (c != '\n') {
			
			if ('0'<= c && c <= '9')	{ 	// Ziffer
				
				int repeat = (c-'0');				// aus Zahlenzeichen, Zahl machen
				for (int i = 1; (p!='\n' && i < repeat); i++) {	// Wiederholende Ausgabe des Vorgaengerzeichens
					Out.print(p);
				} // end for 
				
				
			} else {						// Nichtziffer
				Out.print(c);						// sofort einmal ausgeben 
			} // end if
			
			p = c;							// umspeichern des aktuellen Zeichens auf Vorgaengerzeichen
			c = In.read();					// naechstes Zeichen einlesen
		} // end while
	
		
		Out.print("\nEnd! ---");
		/* END PROGRAM */
	} // main
	
} // class Zip