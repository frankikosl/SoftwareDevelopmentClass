
class ZahlenRunden {

	public static void main(String [] args) {
		//first, option check
		char option = 'a';
		while (option != 'x'){
			Out.print("\nGanzzahl oder Gleitkommazahl [i=Ganzzahl, d=Gleitkommazahl, x=EXIT]: ");
			option = In.readChar();
			while (!(option == 'x' || option == 'i' || option == 'd')){
				Out.print("\nUngültige Option! [i=Ganzzahl, d=Gleitkommazahl, x=EXIT]: ");
				option = In.readChar();
			}
			if (option == 'x'){
				return;
			}
			//now inputting the numbers
			else if (option == 'd'){
				Out.print("\nBitte Gleitkommazahl: ");
				double nummer = In.readDouble();
				Out.print("\nBitte Rundungstelle: ");
				int rundung =   In.readInt();
				Out.print("\nGerundete Zahl: ");
				Out.print(Runden(nummer, rundung));
			}
			else if (option == 'i'){
				Out.print("\nBitte Ganzzahl: ");
				int nummer = In.readInt();
				Out.print("\nBitte Rundungstelle: ");
				int rundung =   In.readInt();
				Out.print("\nGerundete Zahl: ");
				Out.print(Runden(nummer, rundung));
			}
		}
	} // end readNumber()
	static double power(double number, double power) { //function needed for the rounding
		double sum = number;
		for (int i = 1; i < power; i++) {
			sum = sum * number;
		}
		return sum;

	}
	static int Runden (int nummer, int stellen){
		int count = 0;
		int numStellen = 0;
		int numTest = nummer;
		while (numTest > 0){ //checks if the number of stellen to be rounded is bigger than the number itself
			numTest /= 10;
			numStellen++;
		}
		if (stellen > numStellen || stellen <= 1){ //checks if the number of stellen is appropriate - less than one just returns the number back
			return nummer;
		}
		double aufrundenNummer = nummer % power(10, stellen -1); //this is the number we wanna round
		double gerundeteNummer = nummer % power(10, stellen - 2); //this is the number before the wanna we wanna round that will be turned into 0
		if (gerundeteNummer < 5) { //pretty straightforward, bigger than 5 increases, less stays the same
			gerundeteNummer = 0;
			for (int i = 0; i < stellen - 1; i++){
				nummer /= 10;
			}
			for (int i = 0; i < stellen - 1; i++){
				nummer *= 10;
			}
			//the whole dividing by 10 and multiplying again is to make sure everything before the stelle to
			//be rounded turns to 0
		}
		else{
			aufrundenNummer++;
			for (int i = 0; i < stellen - 1; i++){
				nummer /= 10;
			}
			nummer++; //increases the number at the spot to be rounded
			for (int i = 0; i < stellen - 1; i++){
				nummer *= 10;
			}
		}
		return nummer;
	}
	static double Runden (double nummer, int stellen){ //same thing but for the double
		int count = 0;
		int numStellen = 0;
		int numTest = (int)(nummer);
		while (numTest > 0){
			numTest /= 10;
			numStellen++;
		}
		if (stellen > numStellen || stellen <= 0){
			return nummer;
		}
		if (stellen == 1){ //will basically check if the stelle is 1,
			//which is where the numbers beyond the comma make a difference
			if (nummer%1<0.5){
				return ((double)((int)(nummer)));
			}
			else{ //if yes, do the necessary rounding
				return ((double)((int)(++nummer)));
			}
		}
		//otherwise, it will turn it into int to make the post comma into 0 and then later return to double
		//since the comma will be 0, you can just make the normal int rounding
		nummer = Runden(((int)(nummer)), stellen);
		return ((double)(nummer));
	}
}
