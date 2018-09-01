public class triangle{
	
	public static void main(String [] args) {
       
		Out.println ("Pyramide\n==================\n");
		Out.println ("Nummer eingeben: ");
		
		int nummer = 0;
		while (!(nummer > 0 && nummer < 10)){
			nummer = In.readInt();
			if (nummer < 0 || nummer > 10){
				Out.println("Give a number BETWEEN 1 AND 9: ");
			}
		}	
		int sum = 1;
        for (int i = 1; i <= nummer; i++){
			for (int count = i; count >= 1; count--){
				if (count == i){
					for (int spacing = nummer; spacing > count; spacing--){
					Out.print(" ");
					}
				}
				
				Out.print(" "+ i + " ");
			}
			Out.println("\n");
		}
		Out.println ("\nEnd!");
	}
}