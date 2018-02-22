class Caesar {
	
	public static void main(String [] args) {
		/* BEGIN PROGRAM */ 
		
		Out.print("\nCaesar-Chiffre");
		Out.print("\n==============");
	
		// /(1) SCHLUESSEL EINLESEN -----------------
		Out.print("\nSchluessel: ");					
		char key = In.readChar();					// Schluessel fuer verschiebung a wird zu key
		
		while (key < 'a' || 'z' < key) {				// solange kein Kleinbuchstabe
			Out.print("\nAls Schluessel sind nur Kleinbuchstaben erlaubt!");

			Out.print("\nSchluessel: ");					// erneute Eingabe des Schluessels
			key = In.readChar();
		} // end while
		
	
		// (2) TEXT EINLESEN --------------------------
		Out.print("\nText             : ");
		char c = In.read();						// Eingabe des gesamten Texts und 1. Zeichen davon auslesen auf c
		
	
		// (3) TEXT CHIFFRIERT AUSGEBEN ----------------
		Out.print("\nChiffrierter Text: ");
		int offset = (key - 'a');				// Schluessel bestimmt Versatz im Alphabet relativ zu 'a'

		while (c != '\n') {						// Fuer alle Zeichen; '\n' ist letztes Zeichen
			
			// DO SOMETHING
		
			// chiffriere Zeichen
			char cc = c;
			if ('a' <= c && c <= 'z'){			// nur Kleinbuchstaben chiffrieren
				// chiffrieren
				cc = (char) (c + offset);			// chiffrieren
				if (cc > 'z') {						// falls Zeichen ausserhalb des Alphabeths, wieder von vorne
					cc = (char) (cc - 26);
				} // end if
			} // end if
		
			Out.print(cc);						// Ausgabe des chiffrierten Zeichens
			
			// Naechstes Zeichen aus Buffer lesen
			c = In.read();						// naechstes Zeichen fuer die Verarbeitung
		} // while
		
		Out.print("\nEnd ---");
		/* END PROGRAM */
	} // end main()

} // end class Ceasar