public class reihecalc{
	
	public static void main(String [] args) {
       
		Out.println ("Reihenausgabe\n==================\n");
	    Out.println ("Ende der Reihe bei: ");	
        int nummer = In.readInt();
		int counter = 1;
		Out.println ("\nReihe: ");
        while (counter <= nummer){
			Out.println (counter);
			counter *= 2;
        }
		Out.println ("\nEnd!");
}