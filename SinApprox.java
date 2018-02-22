class SinApprox {

	public static void main(String [] args) {
		/* BEGIN PROGRAM */

		Out.print("\nSIN APPROX");
		Out.print("\n==========");

		// Eingabe der Zahl
		Out.print("\nx: ");
		double x = In.readDouble();
 // end while

		final double epsilon = 0.00001;				// Fehlerschranke, OBS: bei kleinem x wird Fehlerschranke in wenigen Schritten erreicht.
		double sinE = sinApprox(x, epsilon);		// Sinus-Naeherung mit Ende epsilon
		int n = 5;
		double sinN = sinApprox(x, n);				// Sinus-Naeherung mit 10 Schritten

		Out.print("\nSIN(approx. E):   " + sinE);			// approximierter
		Out.print("\nSIN(approx. N="+n+"): " + sinN);		// approximierter Wert
		Out.print("\nSIN(Math.sin):    " + Math.sin(x));	// genauer Wert

		/* END PROGRAM */
	} // main()

	// METHODS ==========================================================================

	// sinApprox() ----------------------------------------------------------------------
	// OBS: Methoden-Ueberladen sinApprox(double, int) vs. sinApprox(double, double)
	static double sinApprox(double x, double e) {
		// fuer x muss gelten: 0<x<1
		// fuer e muss gelten: 0<e<1

		double sin = 0;				// Variable, welche den approximierten Sinus beinhaltet

		double a = x;				// oberhalb des Bruchstriches
		double b = 1;				// unterhalb des Bruchstriches

		double term = a / b;		// term als a / b
		int sign = 1;				// funktioniert als Vorzeichen

		int i = 2;					// Variable fuer Fakultaetsberechnung


		while (term >= e) {			// t >= e ----> noch in der Approximation beruecksichtigen
			// weiteren Term zur Summe hinzuaddieren
			//Out.print("\n");
			//System.out.format("%30.29f", term);

			sin = sin + (sign * term);			// Sinus wird weiter verfeinert

			// zum naechsten Term
			sign = sign * -1;					// Vorzeichen wechseln

			a = a * (x * x);						// zum naechsten Teil oberhalb des Bruckstrichs des Terms
			b = b * (i * (i+1));				// zum naechsten Teil unterhalb des Bruchstrichs des Terms
			i = i + 2;							// Variable fuer Fakultaetsberechnung um 2 weitersetzen

			term =  a / b;						// neuer Term (immer positiv)

		} // end while

		return sin;
	} // end sinApprox()
	// sinApprox() -----------------------------------------------------------------------


	// sinApprox() ------------------------------------------------------------------------
	// OBS: Methoden-Ueberladen sinApprox(double, int) vs. sinApprox(double, double)
	static double sinApprox(double x, int n) {
		// fuer x muss gelten: 0<x<1
		// Naeherung mit 10 Schritten

		double sin = 0;				// Variable, welche den approximierten Sinus beinhaltet

		double a = x;				// oberhalb des Bruchstriches
		double b = 1;				// unterhalb des Bruchstriches

		double term = a / b;		// term als a / b
		int sign = 1;				// funktioniert als Vorzeichen

		int i = 2;					// Variable fuer Fakultaetsberechnung

		int step=1;					// Schrittzaehler

		while (step<=n) {			// Schritt noch in der Annaeherung zu beruecksichtigen
			// weiteren Term zur Summe hinzuaddieren

			sin = sin + (sign * term);			// Sinus wird weiter verfeinert

			// zum naechsten Term
			sign = sign * -1;					// Vorzeichen wechseln

			a = a * (x * x);						// zum naechsten Teil oberhalb des Bruckstrichs des Terms
			b = b * (i * (i+1));				// zum naechsten Teil unterhalb des Bruchstrichs des Terms
			i = i + 2;							// Variable fuer Fakultaetsberechnung um 2 weitersetzen

			term =  a / b;						// neuer Term (immer positiv)
			step++;

		} // end while

		return sin;
	} // end sinApprox()
	// sinApprox() ----------------------------------------------------------------------


}
