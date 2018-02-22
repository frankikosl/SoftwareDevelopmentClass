class Reihen {
	
	public static void main(String [] args) {
		/* BEGIN PROGRAM */
		
		Out.print("\nReihenausgabe");
		Out.print("\n=============");
		
		
		// EINGABE DES MAX. WERTS
		Out.print("\nEnde der Reihe bei: ");				// Ende der Reihe, falls auszugebender Wert groesser als end ist
		int end = In.readInt();
		/* optional */
		while (end <= 0) {
			Out.print("\nBitte eine Zahl groesser 0 waehlen! ");
			Out.print("\nEnde der Reihe bei: ");
			end = In.readInt();
		}
		/* optional end */
		
		// INITIALISIERUNG
		int x = 1;
		int currentNumber = 1;		// set to start at 1
		
		
		
		// Reihe A: 1 3 5 7 9 ...
		// Werte werden um 2 erhoeht
		Out.print("\nReihe: 1 3 5 7 9 ...");
		
		
		
		/*
		//Reihe B: 1 2 4 8 16 32 64 128 256 512 ...
		// Werte werden verdoppelt
		Out.print("\nReihe B");
		Out.print("\nReihe: 1 2 4 8 16 32 64 128 256 512 ...");
		*/
		
		
		/*
		//Reihe C: 2 4 16 256  ...
		// Werte sind Produkt der Vorgaengerzahl
		Out.print("\nReihe C");
		Out.print("\nReihe: 2 4 16 256  ...);
		currentNumber=2;						// Start bei 2!
		*/
	
		
		/*
		// Reihe D 
		// Wert erhoeht sich um den jeweiligen Schritt
		Out.print("\nReihe D");
		Out.print("\nReihe: 1 2 4 7 11 16 22 29  ...");
		
		int i = 1;								// Schrittzaehler
		*/
		
		
		/*
		// Reihe E -------------
		// Wert erhoeht/vermindert sich alternierend um den jeweiligen Schritt
		// Alternative Realisierung mit % moeglich
		Out.print("\nReihe E");
		Out.print("\nReihe: 1 2 0 3 -1 4 -2 5 -3 6 -4 ...");
		int i = 1;								// Schrittzaehler
		// Alternative (a)
		boolean subtract=false;					// true wenn SubtraktInnsschritt
		// Alternative (c)
		int sign = 1;
		*/
		
		/*
		//Reihe F -------------
		// Wert ergibt sich aus den beiden vorangegangenen Werten
		Out.print("\nReihe F");
		Out.print("\nReihe: 1 2 3 5 8 13 21 34 ...");
		
		int prevNumber1 = 1; 					// direkt vorangegangener Wert
		int prevNumber2 = 0; 					// Wert 2 Schritte zuvor
		*/
		
		/*
		//Reihe G -------------
		// Wert ergibt sich aus dem Produkt der beiden vorangegangenen Werten
		Out.print("\nReihe G");
		Out.print("\nReihe: 1 2 2 4 8 32 256 8192 ...");
		
		int prevNumber1 = 1; 					// direkt vorangegangener Wert
		int prevNumber2 = 2; 					// Wert 2 Schritte zuvor
		*/
		
		/*
		// Reihe H
		// Wert ergibt sich aus den 3 vorangegangenen Werten
		Out.print("\nReihe H");
		Out.print("\nReihe: 1 2 4 7 13 24 44 81 ...");
		
		int prevNumber1 = 1; 					// direkt vorangegangener Wert
		int prevNumber2 = 0; 					// Wert 2 Schritte zuvor
		int prevNumber3 = 0; 					// Wert 3 Schritte zuvor
		*/
		
		
		// AUSGABE DER REIHE
		Out.print("\nReihe:");
		
		while (currentNumber <= end){		// interation condition
			
			// AUSGABE DES WERTES
			Out.print(" " + currentNumber);
			
			
			// BERECHNUNG DES NEUEN WERTES
			
			
			// Reihe A: 1 3 5 7 9 11 13 15 ...
			currentNumber = currentNumber + 2;		// assign next number to be 2 greater
			
			
			/*
			//Reihe B: 1 2 4 8 16 32 64 128 256 512...
			currentNumber = currentNumber + currentNumber; 
			*/
			
			/*
			//Reihe C: 2 4 16 256  ...
			currentNumber = currentNumber * currentNumber; 
			// OBS: Werteueberlauf bei Zahlen jenseits von 65536 -> Endlosschleife
			*/
		
			/*
			//Reihe D: 1 2 4 7 11 16 22 29  ...
			currentNumber = currentNumber + i;
			i++;
			*/

			/*
			//Reihe E: 1 2 0 3 -1 4 -2 5 -3 6 -4 ...
			// Alternative (a)
			if (subtract) {
				currentNumber = currentNumber - i;
			} else {
				currentNumber = currentNumber + i;
			}
			subtract=!subtract;
			// Alternative (b)
			if ((i%2)==0) {
				currentNumber = currentNumber - i;
			} else {
				currentNumber = currentNumber + i;
			}
			// Alternative (c)
			currentNumber = currentNumber + (sign*i);
			sign=sign*-1;
			i++;
			*/
		
			
			/*
			//Reihe F: 1 2 3 5 8 13 21 34  ...
			prevNumber2 = prevNumber1;
			prevNumber1 = currentNumber;
			currentNumber = prevNumber1 + prevNumber2;
			*/
			
			
			/*
			//Reihe G: 1 2 2 4 8 32 256 8192 ...
			currentNumber = prevNumber1 * prevNumber2;
			prevNumber2 = prevNumber1;  
			prevNumber1 = currentNumber;
			*/
			
			/*
			//Reihe H:  1 2 4 7 13 24 44 81 ...
			prevNumber3 = prevNumber2;
			prevNumber2 = prevNumber1;
			prevNumber1 = currentNumber;
			currentNumber = prevNumber1 + prevNumber2 + prevNumber3;
			*/
			

		} // end while	
	
	
	
		Out.print("\n\nEnd! --- \n");
		/* END PROGRAM */
	} // end main()
} // end calss Reihen