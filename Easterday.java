public class Easterday {
	
	public static void main(String [] args) {

	Out.println("\nOstersonntagsberechnung");
	Out.println("=======================");
    int i = 1;
    int j = 1;
    j = (i + 1)++;
    Out.println (j);
	/* Variante mit direkter Zuweisung des Jahres 
	int y = 2018;			// Jahr von dem Ostern bestimmt werden soll
	*/ 
	
	// Eingabe des Jahres durch Benutzer
	Out.print("\nBitte Jahr eingeben: ");
	int y = In.readInt();
	
	// Berechnen des Ostertags
	int a = (y % 19);		 						//a = y mod 19
	int b = (y % 4);								//b = y mod 4
	int c = (y % 7);								//c = y mod 7
	int k = y / 100;								//k = y div 100 (Ganzzahldivision)
	int p = k / 3;									//p = k div 3	(Ganzzahldivision)	
	int q = k / 4;									//q = k div 4	(Ganzzahldivision)
	int m = (15 + k - p - q);						//m = (15 + k – p – q) mod 30
	int n = (4 + k - q) % 7;						//n = (4 + k – q) mod 7
	int d = (((19*a) + m) % 30);					//d = (19a + m) mod 30
	int e = ((((2*b) + (4*c) + (6*d) + n)) % 7);	//e = (2b + 4c + 6d + n) mod 7
	
	// Ausgabe
	Out.println();
	Out.print("Im Jahr ");
	Out.print(y);
	Out.print(" ist Ostern am ");
	Out.print((22 + d + e));
	Out.println(". Maerz. ");
	
	
	/* Alternative Ausgabe 
	Out.print("\nIm Jahr " + y + " ist Ostern am " + (22 + d + e) +  ". Maerz. " + "\n");
	*/
			
	}
	
}