public class durchschnitt{
	
	public static void main(String [] args) {
       
		Out.println ("Ganzzahldurschnitt\n==================\n");	
		int nummer = 0;
		int sum = 0;
		int counter = 0;
        do{
			Out.println("\n" + (counter+1)+". Zahl: ");
			nummer = In.readInt();
			sum = sum + nummer;
			counter++;
		}while(nummer != 0);
		if (counter == 1){
			Out.println ("Durchschnitt: " + (sum/(counter)));
		}
		else{	
		Out.println ("Durchschnitt: " + (sum/(counter-1)));
		}
		Out.println ("\nEnd!");
	}
}