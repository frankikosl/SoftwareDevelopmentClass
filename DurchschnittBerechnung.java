class DurchschnittBerechnung {

	public static void main(String [] args) {
		/* BEGIN PROGRAM */

		Out.print("\nDurchschnittsberechnung einer Zahlenfolge");
		Out.println("\n===============================");

		int sum = 0;
		int num = 1;
		int count = 1;
		int zahl = 0;
		int nichtCounted = 0;
		double counted = 0;
		while ((zahl != 0 || count == 1) && (zahl <= num || count == 2)){
  			if (num == zahl){
					nichtCounted++;
				}
				else{
					sum += zahl;
					counted++;
				}
			num = zahl;
			Out.print(count + ". Zahl: ");
			zahl = In.readInt();
			count++;
		}
		double durchschnitt = 0;
		durchschnitt = sum/ (counted - 1);
		Out.println("Durchschnitt der Zahlen: " + durchschnitt);

		Out.println("Summe: " + sum);

		Out.println("Es wurden " + nichtCounted +  " Zahlen bei der Berechnung nicht beruecksichtigt!");
		/* END PROGRAM */
	} // end main()

}
