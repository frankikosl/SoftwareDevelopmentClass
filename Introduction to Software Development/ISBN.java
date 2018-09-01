class ISBN {

	public static void main(String [] args) {
		/* BEGIN PROGRAM */

		Out.print("\nISBN Pruefung");
		Out.print("\n==============");

		// /(1) ISBN EINLESEN -----------------
		Out.print("\nISBN: ");
		char isbn = In.read();					// liest den ISBN

		int sum = 0;
		int num = 0;
		int count = 1;
		char actualNr = '\n';
		boolean ungueltig = false;
		while (isbn != '\n') {						// Fuer alle Zeichen; '\n' ist letztes Zeichen

			// DO SOMETHING
			actualNr = isbn; //Welche Nummer gewählt war
			num = actualNr - '0'; //char zu Nummer
			if (count < 10){
				sum = sum + (num * count);
			}
			count++;
			if (((isbn <= '9' && '0' <= isbn) || (count == 11 && isbn == 'X'))) {				// muss ein nummer oder X am Ende sein
				ungueltig = false;
			}
			else{
				ungueltig = true; //
				break;
			}

			isbn = In.read();						// naechstes Zeichen fuer die Verarbeitung
		} // while
		if (ungueltig || count != 11){ //muss Gueltig sein und richtige Länge haben
			Out.print("\nKeine Gueltige ISBN!"); //wenn nicht gueltig ist
		}
		else if ((sum%11) == num || ((sum%11) == 10 && actualNr == 'X')){ //wenn die Nummer genau der Rechnung ist
			Out.print("\nISBN ist korrekt!");
		}
		else{
			Out.print("\nISBN nicht korrekt!"); //Wenn die Rechnung nicht stimmt
		}
		/* END PROGRAM */
	} // end main()

}
