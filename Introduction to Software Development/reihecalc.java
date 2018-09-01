public class reihecalc{
	
	public static void main(String [] args) {
       
		Out.println ("Reihenausgabe\n==================\n");
	    Out.println ("Ende der Reihe bei: ");	
        int nummer = In.readInt();
		int n = 1;
		Out.println ("\nReihe: ");
		int i = 1;
        while(n <= nummer){
			Out.print(n + " ");
			if ((i%2)==0) {
				n = n - i;
			}
			else {
				n = n + i;
			}
			i++;
        }
		Out.println ("\nEnd!");
	}
}