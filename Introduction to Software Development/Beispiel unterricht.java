public class Hotel{
	
	public static void main(String [] args) {

        int x = 3;
        int y = 4;
        int z = 5;
        
        if (x != y || y != z || x != z){
            Out.println("Nicht lauter gleiche Werte");
        }
        if (x != y && y != z && x != z){
            Out.println("Lauter unterschiedliche Werte");
        }
        if (x==y || x==z || y == z){
            Out.println("Es gibt gleiche werte")
        }
        if (x==y && x==z && y == z){
            Out.println("Alle Werte sind gleich")
        }

        
        
 
    
			
	}
	
}