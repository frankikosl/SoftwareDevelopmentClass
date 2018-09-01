class Archimedes {	
	/* Die Klasse Archimedes demonstriert, wie die neue Klasse Circle funktioniert. 
	   Es koennte sich hier zum Beispiel um den Code handeln, der eine 
	   Kreis-Verwaltungsanwendugn realisiert. */
	   
	public static void main(String [] args) {
		// BEGINN des Programms
		
		Circle c;					// neue lokale Variable, die eine Adresse eines Kreis-Objekts speichern kann
		c = new Circle();			// neues Kreis-Objekt wird durch den Konstruktor ohne Parameter erzeugt; desses Adresse wird auf die lokale Variable c gespeichert.
		
		Out.print("\nneuer Kreis erstellt: " + c);				// c wird "im Kontext eines Strings verwendet", daher wird automatisch in Java, falls vorhanden 
																// die toString()-Methode aufgerufen. Ist die Methode toString() nicht fuer Kreise definiert, wird 
																// anstelle die Adresse der Objekts ausgegeben.
		// Out.print("\nneuer Kreis erstellt: " + c.toString()); 	// equivalent mit Zeile zuvor, wobei hier vorausgesetzt wird, dass eine Methode toString() existiert.
		
		Circle c2 = new Circle(2.0);		// neues Objekt mit Radius 2.0
		
		if (c.lessThan(c2)) {
			Out.print("\n" + c + " kann " + c2 + " aufnehmen");
		} else {
			Out.print("\n" + c + " kann " + c2 + " nicht aufnehmen!");
		} // if
		
		Circle [] circles = new Circle[4];			// Array von 4 slots, die Adresses auf Kreise aufnehmen kann
		
		circles[0] = c;
		circles[1] = c2;
		circles[2] = new Circle(3.0);
		
		for (int i = 0; i < circles.length; i++) {
			if (circles[i] != null) {
				Out.print("\n"+i+ ": "+circles[i]
					+ " Umfang: " + circles[i].circumvent() 
					+ " Flaeche: " + circles[i].area());
			} // if	
		} // end for
		
		
		
		
	} // end main()

} // end Archimedes