class LnApprox {
	
	public static void main(String [] args) {
		/* BEGIN PROGRAM */
		
		Out.print("\nLN APPROX");
		Out.print("\n=========");
	
		// Eingabe der Zahl
		Out.print("\nx: ");
		double x = In.readDouble();
		while (!(0< x && x <1)) {
			Out.print("\nBitte x zwischen 0 und 1 angeben!");
			Out.print("\nx: ");
			x = In.readDouble();
		} // end while
		
		Out.print("\nepsilon: ");
		double epsilon = In.readDouble();			// Fehlerschranke
		while (!(0< epsilon && epsilon <1)) {
			Out.print("\nBitte epsilon zwischen 0 und 1 angeben!");
			Out.print("\nepsilon: ");
			x = In.readDouble();
		} // end while
		
		double ln = 0;				// Variable, welche den approximierten LN beinhaltet
		
		double a = x;				// oberhalb des Bruchstriches
		double b = 1;				// unterhalb des Bruchstriches
		
		double term = a / b;		// term als a / b
		int sign = 1;				// funktioniert als Vorzeichen
		// Alternative
		// ALT: int i = 1;
		
		// ALT: while (i <= 10);
		while (term >= epsilon) {			// t >= e ----> noch in der Approximation beruecksichtigen
			// weiteren Term zur Summe hinzuaddieren
			ln = ln + (sign * term);			// LN wird weiter verfeinert
			
			// zum naechsten Term	
			sign = sign * -1;					// Vorzeichen wechseln
			
			a = a * x;							// zum naechsten Teil oberhalb des Bruckstrichs des Terms
			b = b + 1;				       		// zum naechsten Teil unterhalb des Bruchstrichs des Terms
	
			term =  a / b;						// neuer Term (immer positiv)
			// ALT: si++;
		} // end while
		

		Out.print("\nLN(approx. E):   " + ln);			// approximierter 
		//ALT: Out.print("\nLN(approx. N):   " + ln);			// approximierter 
		Out.print("\nLN(Math.log):    " + Math.log(1+x));	// genauer Wert
	
		/* END PROGRAM */
	} // main()
	

} // class LnApprox