class DurchschnittZahlenfolge {
	
	public static void main(String [] args) {
		/* BEGIN PROGRAM */
		
		Out.print("\nGanzzahliger Durchschnitt einer Zahlenreihe");
		Out.print("\n-------------------------------------------\n");
		
		
		/* Ganzzahl-Durchschnitt einer Zahlenreihe
		---------------------------------------
		Zahl: 3
		Zahl: 8
		Zahl: 2
		Zahl: -1
		Zahl: 0

		Durchschnitt: 3
		*/
		
		int sum = 0;
		int anz = 0;
		
		Out.print("Zahl: ");			// Eingabe
		int n = In.readInt();
		
		while (n != 0) {
			
			if (n > 0) {					// relevante Zahlen fuer Durchschnitt beruecksichtigen
				anz++;
				sum = sum + n;
			} // end if
		
			Out.print("Zahl: ");			// weitere Eingabe
			n = In.readInt();
		} // end while
		
		if (anz==0) {						// Verhindern von Division durch 0
			Out.print("Keine Zahlen");
		} else {
			double avg = (double) sum / anz;
			Out.print("AVG: "+avg);
		} 
	
		Out.print("\n\nEnd! --- \n");
		
	
		/* END PROGRAM */
	} // end main()
} // end class DurchschnittZahlenfolge