class ReihenEntwicklung {

	public static void main(String [] args) {
		/* BEGIN PROGRAM */

		//Getting the input of the variables
		Out.print("\nBitte Startwert eingeben: ");
		double startWert = In.readDouble();
		while (!(-50 <= startWert && startWert <= 50)) {
			Out.print("\nBitte Startwert eingeben: ");
			startWert = In.readDouble();
		}
		Out.print("\nBitte Schrittweite eingeben: ");
		double weite = In.readDouble();

		Out.print("\nBitte Endwert eingeben: ");
		double endWert = In.readDouble();
		while (!(-50 <= endWert && endWert <= 50)) {
			Out.print("\nBitte Endwert eingeben: ");
			endWert = In.readDouble();
		}
		//definition of the näherung
		final double epsilon = 0.0000001;
		for (double i = startWert; i < endWert; i += weite){ //basically the whole program
			double cosE = cosApprox(i, epsilon); //first, gets the value
			printCosStars(cosE); //second, prints the starts
			Out.println("     " + cosE); //finally, prints the value
		}
	}

	static double cosApprox(double x, double e) {
		double cos = 0;
		double a = x;				//upper part of the term
		double b = 1;				//lower part of the term
		double term = 1;
		double factor = 1;
		int sign = 1; //for the 1 / -1 all the time

		while (term > e) {

			cos += (sign * term); //adds the term to the result

			sign = sign * -1;
			a =  x;
			for (double i = 1; i < (b+b); i++) {
				a *= x; //potency calculation
			}
			factor = 1;
			for (double i = 1; i <= (b+b); i++){
				factor *= i; //factor calculation
			}
			term =  a / factor;
			b++; //counter rises
		} // end while
		return cos;
	}


	static void printStar(int n){ //prints the number of stars demanded
		if(n > 0){
			Out.print("*");
			printStar(n-1);
		}
	}
	static void printCosStars(double n){ //checks how many stars should be printed depending on the cos value
		if(n <= -0.9){
			printStar(1);
		}
		else if(n <= -0.8){
			printStar(2);
		}
		else if(n <= -0.7){
			printStar(3);
		}
		else if(n <= -0.6){
			printStar(4);
		}
		else if(n <= -0.5){
			printStar(5);
		}
		else if(n <= -0.4){
			printStar(6);
		}
		else if(n <= -0.3){
			printStar(7);
		}
		else if(n <= -0.2){
			printStar(8);
		}
		else if(n <= -0.1){
			printStar(9);
		}
		else if(n < 0){
			printStar(10);
		}
		else if(n < 0.1){
			printStar(11);
		}
		else if(n < 0.2){
			printStar(12);
		}
		else if(n < 0.3){
			printStar(13);
		}
		else if(n < 0.4){
			printStar(14);
		}
		else if(n < 0.5){
			printStar(15);
		}
		else if(n < 0.6){
			printStar(16);
		}
		else if(n < 0.7){
			printStar(17);
		}
		else if(n < 0.8){
			printStar(18);
		}
		else if(n < 0.9){
			printStar(19);
		}
		else if(n < 1){
			printStar(20);
		}
		else if(n == 1){
			printStar(21);
		}
	}
}
