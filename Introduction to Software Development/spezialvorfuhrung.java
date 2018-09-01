public class spezialvorfuhrung{
	
	public static void main(String [] args) {
        
        Out.println("Bitte verfugbare Sitzplatze eingeben: ");
        int sitzplaetze = In.readInt();
        Out.println("Bitte Zuschauer Anzahl eingeben: ");
        int zuschauer = In.readInt();
        Out.println("Bitte Vollzahler Anzahl eingeben: ");
        int vollzahler = In.readInt();

        
        if (zuschauer/sitzplaetze >= 0.6){
            if (vollzahler/zuschauer >= 0.3){
                Out.println("Es findet statt");
            }
            else{
                Out.println("Es findet nicht statt");
            }
        }
        else{
            Out.println("Es findet nicht statt");
        }
        
        
        
 
    
			
	}
	
}