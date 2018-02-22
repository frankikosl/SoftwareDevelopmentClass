public class faktorial{
	
	public static void main(String [] args) {
       
		Out.println ("Ganzzahldurschnitt\n==================\n");
		Out.println ("Nummer eingeben: ");
		int nummer = In.readInt();
		int sum = 1;
        for (int i = nummer; i >= 1; i--){
			Out.print(i + " * ");
			sum = sum * i;
		}
		Out.print(" =" + sum);
		Out.println ("\nEnd!");
	}
}